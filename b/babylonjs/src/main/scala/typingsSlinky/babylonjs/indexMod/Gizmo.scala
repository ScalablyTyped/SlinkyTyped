package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.gizmoMod.GizmoAxisCache
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends typingsSlinky.babylonjs.gizmosIndexMod.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
object Gizmo {
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  @JSImport("babylonjs/index", "Gizmo.GizmoAxisPointerObserver")
  @js.native
  def GizmoAxisPointerObserver(
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    gizmoAxisCache: Map[typingsSlinky.babylonjs.meshMod.Mesh, GizmoAxisCache]
  ): typingsSlinky.babylonjs.observableMod.Observer[typingsSlinky.babylonjs.pointerEventsMod.PointerInfo] = js.native
}
