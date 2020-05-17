package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionInfo extends js.Object {
  var bu: Nullable[Double] = js.native
  var bv: Nullable[Double] = js.native
  var distance: Double = js.native
  var faceId: Double = js.native
  var subMeshId: Double = js.native
}

object IntersectionInfo {
  @scala.inline
  def apply(distance: Double, faceId: Double, subMeshId: Double): IntersectionInfo = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], subMeshId = subMeshId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionInfo]
  }
  @scala.inline
  implicit class IntersectionInfoOps[Self <: IntersectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMeshId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMeshId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBu(value: Nullable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bu")(null)
        ret
    }
    @scala.inline
    def withBv(value: Nullable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBvNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bv")(null)
        ret
    }
  }
  
}

