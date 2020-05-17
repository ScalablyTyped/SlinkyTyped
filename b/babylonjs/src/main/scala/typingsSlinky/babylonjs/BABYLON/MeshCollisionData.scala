package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshCollisionData extends js.Object {
  var _checkCollisions: Boolean = js.native
  var _collider: Nullable[Collider] = js.native
  var _collisionGroup: Double = js.native
  var _collisionMask: Double = js.native
  var _diffPositionForCollisions: Vector3 = js.native
  var _oldPositionForCollisions: Vector3 = js.native
  var _onCollideObserver: Nullable[Observer[AbstractMesh]] = js.native
  var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]] = js.native
}

object MeshCollisionData {
  @scala.inline
  def apply(
    _checkCollisions: Boolean,
    _collisionGroup: Double,
    _collisionMask: Double,
    _diffPositionForCollisions: Vector3,
    _oldPositionForCollisions: Vector3
  ): MeshCollisionData = {
    val __obj = js.Dynamic.literal(_checkCollisions = _checkCollisions.asInstanceOf[js.Any], _collisionGroup = _collisionGroup.asInstanceOf[js.Any], _collisionMask = _collisionMask.asInstanceOf[js.Any], _diffPositionForCollisions = _diffPositionForCollisions.asInstanceOf[js.Any], _oldPositionForCollisions = _oldPositionForCollisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCollisionData]
  }
  @scala.inline
  implicit class MeshCollisionDataOps[Self <: MeshCollisionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_checkCollisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_checkCollisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_collisionGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collisionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_collisionMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collisionMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_diffPositionForCollisions(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diffPositionForCollisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_oldPositionForCollisions(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_oldPositionForCollisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_collider(value: Nullable[Collider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_colliderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collider")(null)
        ret
    }
    @scala.inline
    def with_onCollideObserver(value: Nullable[Observer[AbstractMesh]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onCollideObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onCollideObserverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onCollideObserver")(null)
        ret
    }
    @scala.inline
    def with_onCollisionPositionChangeObserver(value: Nullable[Observer[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onCollisionPositionChangeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onCollisionPositionChangeObserverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onCollisionPositionChangeObserver")(null)
        ret
    }
  }
  
}

