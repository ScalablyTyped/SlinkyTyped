package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DefaultCollisionCoordinator")
@js.native
class DefaultCollisionCoordinator ()
  extends typingsSlinky.babylonjs.BABYLON.DefaultCollisionCoordinator {
  /* CompleteClass */
  override var _collideWithWorld: js.Any = js.native
  /* CompleteClass */
  override var _finalPosition: js.Any = js.native
  /* CompleteClass */
  override var _scaledPosition: js.Any = js.native
  /* CompleteClass */
  override var _scaledVelocity: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /* CompleteClass */
  override def createCollider(): typingsSlinky.babylonjs.BABYLON.Collider = js.native
  /* CompleteClass */
  override def getNewPosition(
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    displacement: typingsSlinky.babylonjs.BABYLON.Vector3,
    collider: typingsSlinky.babylonjs.BABYLON.Collider,
    maximumRetry: Double,
    excludedMesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ typingsSlinky.babylonjs.BABYLON.Vector3, 
      /* collidedMesh */ Nullable[typingsSlinky.babylonjs.BABYLON.AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
  /* CompleteClass */
  override def getNewPosition(
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    displacement: typingsSlinky.babylonjs.BABYLON.Vector3,
    collider: typingsSlinky.babylonjs.BABYLON.Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[typingsSlinky.babylonjs.BABYLON.AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ typingsSlinky.babylonjs.BABYLON.Vector3, 
      /* collidedMesh */ Nullable[typingsSlinky.babylonjs.BABYLON.AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
  /* CompleteClass */
  override def init(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}

