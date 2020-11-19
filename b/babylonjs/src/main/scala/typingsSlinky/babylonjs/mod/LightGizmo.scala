package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LightGizmo")
@js.native
/**
  * Creates a LightGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class LightGizmo ()
  extends typingsSlinky.babylonjs.legacyMod.LightGizmo {
  def this(gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
@JSImport("babylonjs", "LightGizmo")
@js.native
object LightGizmo extends js.Object {
  
  var _CreateDirectionalLightMesh: js.Any = js.native
  
  var _CreateHemisphericLightMesh: js.Any = js.native
  
  /**
    * Creates the lines for a light mesh
    */
  var _CreateLightLines: js.Any = js.native
  
  var _CreatePointLightMesh: js.Any = js.native
  
  var _CreateSpotLightMesh: js.Any = js.native
  
  var _Scale: js.Any = js.native
}
