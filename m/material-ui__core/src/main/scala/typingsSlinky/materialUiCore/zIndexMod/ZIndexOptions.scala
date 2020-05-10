package typingsSlinky.materialUiCore.zIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/zIndex.ZIndex> */
@js.native
trait ZIndexOptions extends js.Object {
  var appBar: js.UndefOr[Double] = js.native
  var drawer: js.UndefOr[Double] = js.native
  var mobileStepper: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Double] = js.native
  var snackbar: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[Double] = js.native
}

object ZIndexOptions {
  @scala.inline
  def apply(): ZIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexOptions]
  }
  @scala.inline
  implicit class ZIndexOptionsOps[Self <: ZIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBar")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileStepper(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileStepper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileStepper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileStepper")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withSnackbar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnackbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

