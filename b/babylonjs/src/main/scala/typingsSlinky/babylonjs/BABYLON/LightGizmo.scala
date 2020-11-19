package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightGizmo extends Gizmo {
  
  var _attachedMeshParent: js.Any = js.native
  
  var _cachedForward: js.Any = js.native
  
  var _cachedPosition: js.Any = js.native
  
  var _light: js.Any = js.native
  
  var _lightMesh: js.Any = js.native
  
  var _material: js.Any = js.native
  
  def light: Nullable[Light] = js.native
  /**
    * The light that the gizmo is attached to
    */
  def light_=(light: Nullable[Light]): Unit = js.native
  
  /**
    * Gets the material used to render the light gizmo
    */
  def material: StandardMaterial = js.native
}
