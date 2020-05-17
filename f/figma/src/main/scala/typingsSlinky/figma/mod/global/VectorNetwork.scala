package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorNetwork extends js.Object {
  val regions: js.UndefOr[js.Array[VectorRegion]] = js.native
  val segments: js.Array[VectorSegment] = js.native
  val vertices: js.Array[VectorVertex] = js.native
}

object VectorNetwork {
  @scala.inline
  def apply(segments: js.Array[VectorSegment], vertices: js.Array[VectorVertex]): VectorNetwork = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorNetwork]
  }
  @scala.inline
  implicit class VectorNetworkOps[Self <: VectorNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegments(value: js.Array[VectorSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[VectorVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[VectorRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

