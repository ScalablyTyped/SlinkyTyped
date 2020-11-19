package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.renderToLayerMod.RenderToLayerProps
import typingsSlinky.materialUi.renderToLayerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderToLayer {
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def componentClickAway(value: js.Function): this.type = set("componentClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RenderToLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(open: Boolean, render: js.Function): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RenderToLayerProps]))
  }
}
