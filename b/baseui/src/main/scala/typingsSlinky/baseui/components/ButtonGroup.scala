package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.checkbox
import typingsSlinky.baseui.baseuiStrings.circle
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.radio
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.tertiary
import typingsSlinky.baseui.buttonGroupMod.ButtonGroupOverrides
import typingsSlinky.baseui.buttonGroupMod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kind(value: primary | secondary | tertiary | minimal): this.type = set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: checkbox | radio): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLButtonElement], /* index */ Double) => _): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def overrides(value: ButtonGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Double | js.Array[Double]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVarargs(value: Double*): this.type = set("selected", js.Array(value :_*))
    
    @scala.inline
    def shape(value: pill | default_ | square | round | circle): this.type = set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: compact | default_ | large_ | mini): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ButtonGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
