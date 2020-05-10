package typingsSlinky.reactInteractive

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocus extends FocusProps {
  var focus: js.UndefOr[CSSProperties] = js.native
}

object AnonFocus {
  @scala.inline
  def apply(): AnonFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFocus]
  }
  @scala.inline
  implicit class AnonFocusOps[Self <: AnonFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
  }
  
}

