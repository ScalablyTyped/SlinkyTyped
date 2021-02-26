package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.propsMod.IOptionProps
import typingsSlinky.blueprintjsCore.radioGroupMod.IRadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  @scala.inline
  def apply(onChange: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[IRadioGroupProps]))
  }
  
  @JSImport("@blueprintjs/core", "RadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.RadioGroup] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Array[IOptionProps]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsVarargs(value: IOptionProps*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def selectedValue(value: String | Double): this.type = set("selectedValue", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IRadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
