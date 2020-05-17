package typingsSlinky.nextNprogress.componentMod

import typingsSlinky.nextNprogress.anon.PartialNProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgressProps extends js.Object {
  var color: js.UndefOr[String] = js.native
  var options: js.UndefOr[PartialNProgressOptions] = js.native
  var showAfterMs: js.UndefOr[Double] = js.native
  var spinner: js.UndefOr[Boolean] = js.native
}

object NProgressProps {
  @scala.inline
  def apply(): NProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NProgressProps]
  }
  @scala.inline
  implicit class NProgressPropsOps[Self <: NProgressProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: PartialNProgressOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAfterMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAfterMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAfterMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAfterMs")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.undefined)
        ret
    }
  }
  
}

