package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import typingsSlinky.babylonjs.BABYLON.Bone
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAngle extends js.Object {
  var bendAxis: js.UndefOr[Vector3] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var poleAngle: js.UndefOr[Double] = js.native
  var poleTargetBone: js.UndefOr[Bone] = js.native
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.native
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.native
  var slerpAmount: js.UndefOr[Double] = js.native
  var targetMesh: js.UndefOr[AbstractMesh] = js.native
}

object AnonMaxAngle {
  @scala.inline
  def apply(): AnonMaxAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAngle]
  }
  @scala.inline
  implicit class AnonMaxAngleOps[Self <: AnonMaxAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBendAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bendAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBendAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bendAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPoleAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPoleTargetBone(value: Bone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetBone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoleTargetBone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetBone")(js.undefined)
        ret
    }
    @scala.inline
    def withPoleTargetLocalOffset(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetLocalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoleTargetLocalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetLocalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPoleTargetMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoleTargetMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poleTargetMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withSlerpAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slerpAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlerpAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slerpAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMesh")(js.undefined)
        ret
    }
  }
  
}

