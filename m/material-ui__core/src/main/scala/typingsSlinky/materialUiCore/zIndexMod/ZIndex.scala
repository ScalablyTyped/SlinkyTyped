package typingsSlinky.materialUiCore.zIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndex extends js.Object {
  var appBar: Double = js.native
  var drawer: Double = js.native
  var mobileStepper: Double = js.native
  var modal: Double = js.native
  var snackbar: Double = js.native
  var tooltip: Double = js.native
}

object ZIndex {
  @scala.inline
  def apply(
    appBar: Double,
    drawer: Double,
    mobileStepper: Double,
    modal: Double,
    snackbar: Double,
    tooltip: Double
  ): ZIndex = {
    val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], mobileStepper = mobileStepper.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  @scala.inline
  implicit class ZIndexOps[Self <: ZIndex] (val x: Self) extends AnyVal {
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
    def withDrawer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileStepper(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileStepper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnackbar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

