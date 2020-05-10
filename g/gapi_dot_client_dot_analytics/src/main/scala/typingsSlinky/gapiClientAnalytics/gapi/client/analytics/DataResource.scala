package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataResource extends js.Object {
  var ga: GaResource = js.native
  var mcf: McfResource = js.native
  var realtime: RealtimeResource = js.native
}

object DataResource {
  @scala.inline
  def apply(ga: GaResource, mcf: McfResource, realtime: RealtimeResource): DataResource = {
    val __obj = js.Dynamic.literal(ga = ga.asInstanceOf[js.Any], mcf = mcf.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResource]
  }
  @scala.inline
  implicit class DataResourceOps[Self <: DataResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGa(value: GaResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ga")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMcf(value: McfResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealtime(value: RealtimeResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

