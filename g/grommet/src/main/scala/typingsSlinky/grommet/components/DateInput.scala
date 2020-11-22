package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Target
import typingsSlinky.grommet.buttonMod.ButtonType
import typingsSlinky.grommet.calendarMod.CalendarType
import typingsSlinky.grommet.dateInputMod.DateInputProps
import typingsSlinky.grommet.dropMod.DropType
import typingsSlinky.grommet.maskedInputMod.MaskedInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateInput {
  
  @JSImport("grommet/es6", "DateInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def buttonProps(value: ButtonType): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarProps(value: CalendarType): this.type = set("calendarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropProps(value: DropType): this.type = set("dropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: MaskedInputType): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* event */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: String | js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DateInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
