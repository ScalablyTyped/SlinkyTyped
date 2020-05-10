package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsEvents extends js.Object {
  var activate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.native
  var beforeActivate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.native
  var beforeLoad: js.UndefOr[TabsEvent[TabsBeforeLoadUIParams]] = js.native
  var create: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.native
  var load: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.native
}

object TabsEvents {
  @scala.inline
  def apply(): TabsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsEvents]
  }
  @scala.inline
  implicit class TabsEventsOps[Self <: TabsEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoad(value: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = {
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
    def withLoad(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
  }
  
}

