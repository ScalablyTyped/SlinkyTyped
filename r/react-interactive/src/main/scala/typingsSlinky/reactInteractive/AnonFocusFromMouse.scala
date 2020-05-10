package typingsSlinky.reactInteractive

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusFromMouse extends FocusProps {
  var focusFromMouse: js.UndefOr[CSSProperties] = js.native
  var focusFromTab: js.UndefOr[CSSProperties] = js.native
  var focusFromTouch: js.UndefOr[CSSProperties] = js.native
}

object AnonFocusFromMouse {
  @scala.inline
  def apply(): AnonFocusFromMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFocusFromMouse]
  }
  @scala.inline
  implicit class AnonFocusFromMouseOps[Self <: AnonFocusFromMouse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusFromMouse(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusFromMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusFromTab(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusFromTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromTab")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusFromTouch(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusFromTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusFromTouch")(js.undefined)
        ret
    }
  }
  
}

