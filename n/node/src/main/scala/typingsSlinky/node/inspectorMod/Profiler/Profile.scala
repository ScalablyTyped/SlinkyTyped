package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile.
  */
@js.native
trait Profile extends js.Object {
  /**
    * Profiling end timestamp in microseconds.
    */
  var endTime: Double = js.native
  /**
    * The list of profile nodes. First item is the root node.
    */
  var nodes: js.Array[ProfileNode] = js.native
  /**
    * Ids of samples top nodes.
    */
  var samples: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Profiling start timestamp in microseconds.
    */
  var startTime: Double = js.native
  /**
    * Time intervals between adjacent samples in microseconds. The first delta is relative to the profile startTime.
    */
  var timeDeltas: js.UndefOr[js.Array[Double]] = js.native
}

object Profile {
  @scala.inline
  def apply(endTime: Double, nodes: js.Array[ProfileNode], startTime: Double): Profile = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[ProfileNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamples(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samples")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDeltas(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDeltas")(js.undefined)
        ret
    }
  }
  
}

