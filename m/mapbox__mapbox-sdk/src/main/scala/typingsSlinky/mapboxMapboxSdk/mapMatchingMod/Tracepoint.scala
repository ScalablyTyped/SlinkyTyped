package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracepoint extends js.Object {
  /**
    * Number of probable alternative matchings for this trace point. A value of zero indicates that this point was matched unambiguously.
    * Split the trace at these points for incremental map matching.
    */
  var alternatives_count: Double = js.native
  var location: js.Array[Double] = js.native
  /**
    * Index to the match object in matchings the sub-trace was matched to.
    */
  var matchings_index: Double = js.native
  var name: String = js.native
  /**
    * Index of the waypoint inside the matched route.
    */
  var waypoint_index: Double = js.native
}

object Tracepoint {
  @scala.inline
  def apply(
    alternatives_count: Double,
    location: js.Array[Double],
    matchings_index: Double,
    name: String,
    waypoint_index: Double
  ): Tracepoint = {
    val __obj = js.Dynamic.literal(alternatives_count = alternatives_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchings_index = matchings_index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracepoint]
  }
  @scala.inline
  implicit class TracepointOps[Self <: Tracepoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchings_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchings_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoint_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoint_index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

