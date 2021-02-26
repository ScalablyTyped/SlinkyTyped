package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingBoxGizmo")
@js.native
/**
  * Creates an BoundingBoxGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param color The color of the gizmo
  */
class BoundingBoxGizmo ()
  extends typingsSlinky.babylonjs.BABYLON.BoundingBoxGizmo {
  def this(color: typingsSlinky.babylonjs.BABYLON.Color3) = this()
  def this(color: js.UndefOr[scala.Nothing], gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
}
/* static members */
object BoundingBoxGizmo {
  
  /**
    * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
    * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
    * @returns the bounding box mesh with the passed in mesh as a child
    */
  @JSGlobal("BABYLON.BoundingBoxGizmo.MakeNotPickableAndWrapInBoundingBox")
  @js.native
  def MakeNotPickableAndWrapInBoundingBox(mesh: typingsSlinky.babylonjs.BABYLON.Mesh): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
}
