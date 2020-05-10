package typingsSlinky.jqueryLeanmodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryLeanModalOption extends js.Object {
  var closeButton: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Double] = js.native
}

object JQueryLeanModalOption {
  @scala.inline
  def apply(): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
  @scala.inline
  implicit class JQueryLeanModalOptionOps[Self <: JQueryLeanModalOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

