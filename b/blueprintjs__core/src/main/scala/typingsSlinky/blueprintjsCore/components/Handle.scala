package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.handleMod.IInternalHandleProps
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handle {
  
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    stepSize: Double,
    tickSize: Double,
    tickSizeRatio: Double,
    value: Double,
    vertical: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInternalHandleProps]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.handleMod.Handle] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement | String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* newValue */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRelease(value: /* newValue */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def trackStyleAfter(value: CSSProperties): this.type = set("trackStyleAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyleBefore(value: CSSProperties): this.type = set("trackStyleBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInternalHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
