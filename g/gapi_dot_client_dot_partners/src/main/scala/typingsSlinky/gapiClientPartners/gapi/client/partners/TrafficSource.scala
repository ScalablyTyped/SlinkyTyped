package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficSource extends js.Object {
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSourceId: js.UndefOr[String] = js.native
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSubId: js.UndefOr[String] = js.native
}

object TrafficSource {
  @scala.inline
  def apply(): TrafficSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficSource]
  }
  @scala.inline
  implicit class TrafficSourceOps[Self <: TrafficSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficSubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSubId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficSubId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficSubId")(js.undefined)
        ret
    }
  }
  
}

