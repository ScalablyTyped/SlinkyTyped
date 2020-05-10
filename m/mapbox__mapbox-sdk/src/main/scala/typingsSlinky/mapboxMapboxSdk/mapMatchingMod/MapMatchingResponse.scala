package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingResponse extends js.Object {
  /**
    * A string depicting the state of the response; see below for options
    */
  var code: String = js.native
  /**
    * An array of Match objects.
    */
  var matchings: js.Array[Matching] = js.native
  /**
    * An array of Tracepoint objects representing the location an input point was matched with.
    * Array of Waypoint objects representing all input points of the trace in the order they were matched.
    * If a trace point is omitted by map matching because it is an outlier, the entry will be null.
    */
  var tracepoints: js.Array[Tracepoint] = js.native
}

object MapMatchingResponse {
  @scala.inline
  def apply(code: String, matchings: js.Array[Matching], tracepoints: js.Array[Tracepoint]): MapMatchingResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingResponse]
  }
  @scala.inline
  implicit class MapMatchingResponseOps[Self <: MapMatchingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchings(value: js.Array[Matching]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracepoints(value: js.Array[Tracepoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracepoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

