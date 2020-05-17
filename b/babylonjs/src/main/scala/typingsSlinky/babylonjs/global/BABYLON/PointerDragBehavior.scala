package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.anon.DragAxisDragPlaneNormal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior ()
  extends typingsSlinky.babylonjs.BABYLON.PointerDragBehavior {
  def this(options: DragAxisDragPlaneNormal) = this()
}

/* static members */
@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  var _AnyMouseID: js.Any = js.native
  var _planeScene: js.Any = js.native
}

