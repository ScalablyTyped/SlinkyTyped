package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabs //////////////////////////////////////////////////
trait TabsOptions extends TabsEvents {
  var active: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var classes: js.UndefOr[TabClasses] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[js.Any] = js.undefined
   // boolean or []
  var event: js.UndefOr[String] = js.undefined
  var heightStyle: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var show: js.UndefOr[js.Any] = js.undefined
}

object TabsOptions {
  @scala.inline
  def apply(): TabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsOptions]
  }
  @scala.inline
  implicit class TabsOptionsOps[Self <: TabsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: js.Any): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setClasses(value: TabClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setDisabled(value: js.Any): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHeightStyle(value: String): Self = this.set("heightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightStyle: Self = this.set("heightStyle", js.undefined)
    @scala.inline
    def setHide(value: js.Any): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setShow(value: js.Any): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

