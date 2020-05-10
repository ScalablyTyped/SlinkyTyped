package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInnerRadii extends js.Object {
  var innerRadii: js.UndefOr[Cartesian3] = js.native
  var maximumClock: js.UndefOr[Double] = js.native
  var maximumCone: js.UndefOr[Double] = js.native
  var minimumClock: js.UndefOr[Double] = js.native
  var minimumCone: js.UndefOr[Double] = js.native
  var radii: js.UndefOr[Cartesian3] = js.native
  var slicePartitions: js.UndefOr[Double] = js.native
  var stackPartitions: js.UndefOr[Double] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object AnonInnerRadii {
  @scala.inline
  def apply(): AnonInnerRadii = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInnerRadii]
  }
  @scala.inline
  implicit class AnonInnerRadiiOps[Self <: AnonInnerRadii] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerRadii(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadii")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumClock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumClock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumClock")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumCone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumCone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumCone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumCone")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumClock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumClock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumClock")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumCone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumCone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCone")(js.undefined)
        ret
    }
    @scala.inline
    def withRadii(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(js.undefined)
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

