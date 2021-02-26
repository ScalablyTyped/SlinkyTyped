package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimePicker {
  
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateTimePicker] {
    
    @scala.inline
    def canClearSelection(value: Boolean): this.type = set("canClearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datePickerProps(value: IDatePickerProps): this.type = set("datePickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def timePickerProps(value: ITimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: DateTimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
