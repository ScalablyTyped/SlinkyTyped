package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableResults extends js.Object {
  var destinations: js.Array[Waypoint] = js.native
  var durations: js.Array[js.Array[Duration]] = js.native
  var sources: js.Array[Waypoint] = js.native
}

object TableResults {
  @scala.inline
  def apply(
    destinations: js.Array[Waypoint],
    durations: js.Array[js.Array[Duration]],
    sources: js.Array[Waypoint]
  ): TableResults = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], durations = durations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResults]
  }
  @scala.inline
  implicit class TableResultsOps[Self <: TableResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: js.Array[Waypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurations(value: js.Array[js.Array[Duration]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Waypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

