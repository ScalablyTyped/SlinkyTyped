package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.anon.BendAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BoneIKController")
@js.native
class BoneIKController protected ()
  extends typingsSlinky.babylonjs.legacyMod.BoneIKController {
  /**
    * Creates a new BoneIKController
    * @param mesh defines the mesh to control
    * @param bone defines the bone to control
    * @param options defines options to set up the controller
    */
  def this(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    bone: typingsSlinky.babylonjs.boneMod.Bone
  ) = this()
  def this(
    mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    bone: typingsSlinky.babylonjs.boneMod.Bone,
    options: BendAxis
  ) = this()
}

/* static members */
@JSImport("babylonjs", "BoneIKController")
@js.native
object BoneIKController extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

