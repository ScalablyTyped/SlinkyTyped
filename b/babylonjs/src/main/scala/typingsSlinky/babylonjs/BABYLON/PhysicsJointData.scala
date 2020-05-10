package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsJointData extends js.Object {
  /**
    * The collision of the joint
    */
  var collision: js.UndefOr[Boolean] = js.native
  /**
    * The connected axis of the joint
    */
  var connectedAxis: js.UndefOr[Vector3] = js.native
  /**
    * The connected pivot of the joint
    */
  var connectedPivot: js.UndefOr[Vector3] = js.native
  /**
    * The main axis of the joint
    */
  var mainAxis: js.UndefOr[Vector3] = js.native
  /**
    * The main pivot of the joint
    */
  var mainPivot: js.UndefOr[Vector3] = js.native
  /**
    * Native Oimo/Cannon/Energy data
    */
  var nativeParams: js.UndefOr[js.Any] = js.native
}

object PhysicsJointData {
  @scala.inline
  def apply(): PhysicsJointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsJointData]
  }
  @scala.inline
  implicit class PhysicsJointDataOps[Self <: PhysicsJointData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedPivot(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedPivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedPivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedPivot")(js.undefined)
        ret
    }
    @scala.inline
    def withMainAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withMainPivot(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainPivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPivot")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeParams")(js.undefined)
        ret
    }
  }
  
}

