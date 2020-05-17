package typingsSlinky.jqueryui.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selecting extends js.Object {
  var selecting: js.UndefOr[Element] = js.native
}

object Selecting {
  @scala.inline
  def apply(): Selecting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selecting]
  }
  @scala.inline
  implicit class SelectingOps[Self <: Selecting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelecting(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selecting")(js.undefined)
        ret
    }
  }
  
}

