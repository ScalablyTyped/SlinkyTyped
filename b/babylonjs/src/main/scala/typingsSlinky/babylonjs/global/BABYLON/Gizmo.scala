package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.GizmoAxisCache
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends typingsSlinky.babylonjs.BABYLON.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer) = this()
}
/* static members */
object Gizmo {
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  @JSGlobal("BABYLON.Gizmo.GizmoAxisPointerObserver")
  @js.native
  def GizmoAxisPointerObserver(
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    gizmoAxisCache: Map[typingsSlinky.babylonjs.BABYLON.Mesh, GizmoAxisCache]
  ): typingsSlinky.babylonjs.BABYLON.Observer[typingsSlinky.babylonjs.BABYLON.PointerInfo] = js.native
}
