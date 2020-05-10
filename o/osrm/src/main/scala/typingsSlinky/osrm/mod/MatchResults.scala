package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchResults extends js.Object {
  var matchings: js.Array[MatchRoute] = js.native
  var tracepoints: js.Array[MatchWaypoint] = js.native
}

object MatchResults {
  @scala.inline
  def apply(matchings: js.Array[MatchRoute], tracepoints: js.Array[MatchWaypoint]): MatchResults = {
    val __obj = js.Dynamic.literal(matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResults]
  }
  @scala.inline
  implicit class MatchResultsOps[Self <: MatchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchings(value: js.Array[MatchRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracepoints(value: js.Array[MatchWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracepoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

