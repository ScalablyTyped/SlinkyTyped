package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultCollisionCoordinator extends ICollisionCoordinator {
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

object DefaultCollisionCoordinator {
  @scala.inline
  def apply(
    _collideWithWorld: js.Any,
    _finalPosition: js.Any,
    _scaledPosition: js.Any,
    _scaledVelocity: js.Any,
    _scene: js.Any,
    createCollider: () => Collider,
    getNewPosition: (Vector3, Vector3, Collider, Double, AbstractMesh, js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Unit,
    init: Scene => Unit
  ): DefaultCollisionCoordinator = {
    val __obj = js.Dynamic.literal(_collideWithWorld = _collideWithWorld.asInstanceOf[js.Any], _finalPosition = _finalPosition.asInstanceOf[js.Any], _scaledPosition = _scaledPosition.asInstanceOf[js.Any], _scaledVelocity = _scaledVelocity.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], createCollider = js.Any.fromFunction0(createCollider), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[DefaultCollisionCoordinator]
  }
  @scala.inline
  implicit class DefaultCollisionCoordinatorOps[Self <: DefaultCollisionCoordinator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_collideWithWorld(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collideWithWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_finalPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_finalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scaledPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scaledPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scaledVelocity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scaledVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNewPosition(
      value: (Vector3, Vector3, Collider, Double, AbstractMesh, js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewPosition")(js.Any.fromFunction7(value))
        ret
    }
  }
  
}

