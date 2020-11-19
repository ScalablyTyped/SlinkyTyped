package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationDefaultProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.materialUi.popoverAnimationDefaultMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverAnimationDefault {
  
  @JSImport("material-ui/Popover/PopoverAnimationDefault", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverAnimationDefaultProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverAnimationDefaultProps]))
  }
}
