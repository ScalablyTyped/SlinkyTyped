package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.anon.MaxAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BoneIKController")
@js.native
class BoneIKController protected ()
  extends typingsSlinky.babylonjs.BABYLON.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the mesh to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    */
  def this(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh, bone: typingsSlinky.babylonjs.BABYLON.Bone) = this()
  def this(
    mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    bone: typingsSlinky.babylonjs.BABYLON.Bone,
    options: MaxAngle
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.BoneIKController")
@js.native
object BoneIKController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

