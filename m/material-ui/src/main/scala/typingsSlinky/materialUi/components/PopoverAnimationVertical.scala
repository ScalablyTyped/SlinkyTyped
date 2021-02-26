package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationVerticalProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverAnimationVertical {
  
  @scala.inline
  def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverAnimationVerticalProps]))
  }
  
  @JSImport("material-ui/Popover", "PopoverAnimationVertical")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.popoverMod.PopoverAnimationVertical] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverAnimationVerticalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
