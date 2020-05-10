package typingsSlinky.ionicCore.headerUtilsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderIndex extends js.Object {
  var el: HTMLElement = js.native
  var toolbars: js.Array[js.Any | ToolbarIndex] = js.native
}

object HeaderIndex {
  @scala.inline
  def apply(el: HTMLElement, toolbars: js.Array[js.Any | ToolbarIndex]): HeaderIndex = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], toolbars = toolbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderIndex]
  }
  @scala.inline
  implicit class HeaderIndexOps[Self <: HeaderIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbars(value: js.Array[js.Any | ToolbarIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

