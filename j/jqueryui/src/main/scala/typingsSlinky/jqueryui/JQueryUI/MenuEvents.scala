package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuEvents extends js.Object {
  var blur: js.UndefOr[MenuEvent] = js.native
  var create: js.UndefOr[MenuEvent] = js.native
  var focus: js.UndefOr[MenuEvent] = js.native
  var select: js.UndefOr[MenuEvent] = js.native
}

object MenuEvents {
  @scala.inline
  def apply(): MenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuEvents]
  }
  @scala.inline
  implicit class MenuEventsOps[Self <: MenuEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

