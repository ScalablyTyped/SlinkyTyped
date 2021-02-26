package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.radioMod.RadioGroupOverrides
import typingsSlinky.baseui.radioMod.RadioOverrides
import typingsSlinky.baseui.radioMod.State
import typingsSlinky.baseui.radioMod.StatefulRadioGroupProps
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulRadioGroup {
  
  @JSImport("baseui/radio", "StatefulRadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: horizontal | vertical): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: RadioOverrides with RadioGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatefulRadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatefulRadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
