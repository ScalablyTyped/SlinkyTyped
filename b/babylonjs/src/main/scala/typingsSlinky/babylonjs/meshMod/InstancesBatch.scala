package typingsSlinky.babylonjs.meshMod

import typingsSlinky.babylonjs.instancedMeshMod.InstancedMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/mesh", "_InstancesBatch")
@js.native
class InstancesBatch () extends js.Object {
  var hardwareInstancedRendering: js.Array[Boolean] = js.native
  var mustReturn: Boolean = js.native
  var renderSelf: js.Array[Boolean] = js.native
  var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]] = js.native
}

