package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFaceId extends js.Object {
  var faceId: Double = js.native
  var idx: Double = js.native
}

object AnonFaceId {
  @scala.inline
  def apply(faceId: Double, idx: Double): AnonFaceId = {
    val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFaceId]
  }
  @scala.inline
  implicit class AnonFaceIdOps[Self <: AnonFaceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

