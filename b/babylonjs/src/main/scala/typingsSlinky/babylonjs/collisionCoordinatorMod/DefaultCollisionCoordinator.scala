package typingsSlinky.babylonjs.collisionCoordinatorMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.colliderMod.Collider
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Collisions/collisionCoordinator", "DefaultCollisionCoordinator")
@js.native
class DefaultCollisionCoordinator () extends ICollisionCoordinator {
  var _collideWithWorld: js.Any = js.native
  var _finalPosition: js.Any = js.native
  var _scaledPosition: js.Any = js.native
  var _scaledVelocity: js.Any = js.native
  var _scene: js.Any = js.native
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: Double,
    excludedMesh: AbstractMesh,
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
}

