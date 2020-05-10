package typingsSlinky.jqueryFocusExit.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusElements extends js.Object {
  var gainedFocus: HTMLElement = js.native
  var lostFocus: js.UndefOr[HTMLElement] = js.native
}

object FocusElements {
  @scala.inline
  def apply(gainedFocus: HTMLElement): FocusElements = {
    val __obj = js.Dynamic.literal(gainedFocus = gainedFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusElements]
  }
  @scala.inline
  implicit class FocusElementsOps[Self <: FocusElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGainedFocus(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gainedFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLostFocus(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLostFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostFocus")(js.undefined)
        ret
    }
  }
  
}

