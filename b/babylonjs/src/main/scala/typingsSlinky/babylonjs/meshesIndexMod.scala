package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.DragAxis
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Behaviors/Meshes/index", JSImport.Namespace)
@js.native
object meshesIndexMod extends js.Object {
  
  @js.native
  class AttachToBoxBehavior protected ()
    extends typingsSlinky.babylonjs.attachToBoxBehaviorMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param ui The transform node that should be attched to the mesh
      */
    def this(ui: TransformNode) = this()
  }
  
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior ()
    extends typingsSlinky.babylonjs.fadeInOutBehaviorMod.FadeInOutBehavior
  
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  class MultiPointerScaleBehavior ()
    extends typingsSlinky.babylonjs.multiPointerScaleBehaviorMod.MultiPointerScaleBehavior
  
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    */
  class PointerDragBehavior ()
    extends typingsSlinky.babylonjs.pointerDragBehaviorMod.PointerDragBehavior {
    def this(options: DragAxis) = this()
  }
  /* static members */
  @js.native
  object PointerDragBehavior extends js.Object {
    
    var _AnyMouseID: js.Any = js.native
    
    var _planeScene: js.Any = js.native
  }
  
  @js.native
  /**
    * Instantiates a behavior that when attached to a mesh will allow the mesh to be dragged around based on directions and origin of the pointer's ray
    */
  class SixDofDragBehavior ()
    extends typingsSlinky.babylonjs.sixDofDragBehaviorMod.SixDofDragBehavior
  /* static members */
  @js.native
  object SixDofDragBehavior extends js.Object {
    
    var _virtualScene: js.Any = js.native
  }
}
