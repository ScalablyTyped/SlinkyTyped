package typingsSlinky.reactMapGl.components

import typingsSlinky.reactMapGl.mod.InteractiveMapProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InteractiveMap {
  
  @JSImport("react-map-gl", "InteractiveMap")
  @js.native
  object component extends js.Object
  
  def withProps(p: InteractiveMapProps): SharedBuilder_InteractiveMapProps_704888348[typingsSlinky.reactMapGl.mod.InteractiveMap] = new SharedBuilder_InteractiveMapProps_704888348[typingsSlinky.reactMapGl.mod.InteractiveMap](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(height: Double | String, width: Double | String): SharedBuilder_InteractiveMapProps_704888348[typingsSlinky.reactMapGl.mod.InteractiveMap] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_InteractiveMapProps_704888348[typingsSlinky.reactMapGl.mod.InteractiveMap](js.Array(this.component, __props.asInstanceOf[InteractiveMapProps]))
  }
}
