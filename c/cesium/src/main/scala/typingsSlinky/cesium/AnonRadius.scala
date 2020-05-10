package typingsSlinky.cesium

import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRadius extends js.Object {
  var radius: js.UndefOr[Double] = js.native
  var slicePartitions: js.UndefOr[Double] = js.native
  var stackPartitions: js.UndefOr[Double] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object AnonRadius {
  @scala.inline
  def apply(): AnonRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRadius]
  }
  @scala.inline
  implicit class AnonRadiusOps[Self <: AnonRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicePartitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicePartitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicePartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicePartitions")(js.undefined)
        ret
    }
    @scala.inline
    def withStackPartitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackPartitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackPartitions")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexFormat(value: VertexFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(js.undefined)
        ret
    }
  }
  
}

