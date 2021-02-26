package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.SnapDistance
import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.pointerDragBehaviorMod.PointerDragBehavior
import typingsSlinky.babylonjs.rotationGizmoMod.RotationGizmo
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeRotationGizmoMod {
  
  @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
  @js.native
  class PlaneRotationGizmo protected () extends Gizmo {
    /**
      * Creates a PlaneRotationGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
      * @param color The color of the gizmo
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      */
    def this(
      planeNormal: Vector3,
      color: js.UndefOr[Color3],
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      parent: js.UndefOr[Nullable[RotationGizmo]],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double]
    ) = this()
    
    var _coloredMaterial: js.Any = js.native
    
    /** Create Geometry for Gizmo */
    var _createGizmoMesh: js.Any = js.native
    
    var _disableMaterial: js.Any = js.native
    
    var _dragging: js.Any = js.native
    
    var _gizmoMesh: js.Any = js.native
    
    var _hoverMaterial: js.Any = js.native
    
    var _isEnabled: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    var _pointerObserver: js.Any = js.native
    
    var _rotationCircle: js.Any = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    var setupRotationCircle: js.Any = js.native
    
    /**
      * Rotation distance in radians that the gizmo will snap to (Default: 0)
      */
    var snapDistance: Double = js.native
    
    var updateRotationCircle: js.Any = js.native
    
    var updateRotationPath: js.Any = js.native
  }
  /* static members */
  object PlaneRotationGizmo {
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo._CircleConstants")
    @js.native
    def _CircleConstants: js.Any = js.native
    @scala.inline
    def _CircleConstants_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CircleConstants")(x.asInstanceOf[js.Any])
  }
}
