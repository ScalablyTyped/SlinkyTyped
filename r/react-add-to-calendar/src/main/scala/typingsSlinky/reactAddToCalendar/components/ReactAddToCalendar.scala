package typingsSlinky.reactAddToCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAddToCalendar.mod.AddToCalendarEvent
import typingsSlinky.reactAddToCalendar.mod.AddToCalendarProps
import typingsSlinky.reactAddToCalendar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAddToCalendar {
  
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def buttonClassClosed(value: String): this.type = set("buttonClassClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonClassOpen(value: String): this.type = set("buttonClassOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonIconClass(value: String): this.type = set("buttonIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonLabel(value: String): this.type = set("buttonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonTemplate(value: js.Any): this.type = set("buttonTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonWrapperClass(value: String): this.type = set("buttonWrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayItemIcons(value: Boolean): this.type = set("displayItemIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownClass(value: String): this.type = set("dropdownClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listItemsVarargs(value: js.Any*): this.type = set("listItems", js.Array(value :_*))
    
    @scala.inline
    def listItems(value: js.Array[_]): this.type = set("listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsOpen(value: Boolean): this.type = set("optionsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClass(value: String): this.type = set("rootClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useFontAwesomeIcons(value: Boolean): this.type = set("useFontAwesomeIcons", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AddToCalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(event: AddToCalendarEvent): Builder = {
    val __props = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AddToCalendarProps]))
  }
}
