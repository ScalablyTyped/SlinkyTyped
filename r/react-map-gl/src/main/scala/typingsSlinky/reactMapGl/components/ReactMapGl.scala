package typingsSlinky.reactMapGl.components

import typingsSlinky.reactMapGl.mod.InteractiveMapProps
import typingsSlinky.reactMapGl.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMapGl {
  
  @JSImport("react-map-gl", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: InteractiveMapProps): SharedBuilder_InteractiveMapProps_704888348[default] = new SharedBuilder_InteractiveMapProps_704888348[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(height: Double | String, width: Double | String): SharedBuilder_InteractiveMapProps_704888348[default] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_InteractiveMapProps_704888348[default](js.Array(this.component, __props.asInstanceOf[InteractiveMapProps]))
  }
}
