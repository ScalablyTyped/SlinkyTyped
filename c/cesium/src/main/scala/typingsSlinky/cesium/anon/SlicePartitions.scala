package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicePartitions extends js.Object {
  var radius: js.UndefOr[Double] = js.native
  var slicePartitions: js.UndefOr[Double] = js.native
  var stackPartitions: js.UndefOr[Double] = js.native
  var subdivisions: js.UndefOr[Double] = js.native
}

object SlicePartitions {
  @scala.inline
  def apply(): SlicePartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePartitions]
  }
  @scala.inline
  implicit class SlicePartitionsOps[Self <: SlicePartitions] (val x: Self) extends AnyVal {
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
    def withSubdivisions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(js.undefined)
        ret
    }
  }
  
}

