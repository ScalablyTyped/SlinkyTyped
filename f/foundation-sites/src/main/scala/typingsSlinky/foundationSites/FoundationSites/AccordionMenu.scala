package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/accordion-menu.html#javascript-reference
@js.native
trait AccordionMenu extends js.Object {
  def destroy(): Unit = js.native
  def down($target: JQuery, firstTime: Boolean): Unit = js.native
  def hideAll(): Unit = js.native
  def toggle($target: JQuery): Unit = js.native
  def up($target: JQuery): Unit = js.native
}

object AccordionMenu {
  @scala.inline
  def apply(
    destroy: () => Unit,
    down: (JQuery, Boolean) => Unit,
    hideAll: () => Unit,
    toggle: JQuery => Unit,
    up: JQuery => Unit
  ): AccordionMenu = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), hideAll = js.Any.fromFunction0(hideAll), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[AccordionMenu]
  }
  @scala.inline
  implicit class AccordionMenuOps[Self <: AccordionMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDown(value: (JQuery, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUp(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

