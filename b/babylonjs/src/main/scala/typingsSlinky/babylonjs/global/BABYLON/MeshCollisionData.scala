package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON._MeshCollisionData")
@js.native
class MeshCollisionData ()
  extends typingsSlinky.babylonjs.BABYLON.MeshCollisionData {
  /* CompleteClass */
  override var _checkCollisions: Boolean = js.native
  /* CompleteClass */
  override var _collider: Nullable[typingsSlinky.babylonjs.BABYLON.Collider] = js.native
  /* CompleteClass */
  override var _collisionGroup: Double = js.native
  /* CompleteClass */
  override var _collisionMask: Double = js.native
  /* CompleteClass */
  override var _diffPositionForCollisions: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var _oldPositionForCollisions: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var _onCollideObserver: Nullable[
    typingsSlinky.babylonjs.BABYLON.Observer[typingsSlinky.babylonjs.BABYLON.AbstractMesh]
  ] = js.native
  /* CompleteClass */
  override var _onCollisionPositionChangeObserver: Nullable[
    typingsSlinky.babylonjs.BABYLON.Observer[typingsSlinky.babylonjs.BABYLON.Vector3]
  ] = js.native
}

