package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/offcanvas.html#optional-javascript-configuration
@js.native
trait OffCanvasOptions extends js.Object {
  var close_on_click: js.UndefOr[Boolean] = js.native
  var open_method: js.UndefOr[String] = js.native
}

object OffCanvasOptions {
  @scala.inline
  def apply(): OffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffCanvasOptions]
  }
  @scala.inline
  implicit class OffCanvasOptionsOps[Self <: OffCanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose_on_click(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_on_click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose_on_click: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_on_click")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_method")(js.undefined)
        ret
    }
  }
  
}

