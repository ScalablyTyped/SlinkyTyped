package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventSelectorsResponse extends js.Object {
  /**
    * The event selectors that are configured for the trail.
    */
  var EventSelectors: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.EventSelectors] = js.native
  /**
    * The specified trail ARN that has the event selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object GetEventSelectorsResponse {
  @scala.inline
  def apply(): GetEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventSelectorsResponse]
  }
  @scala.inline
  implicit class GetEventSelectorsResponseOps[Self <: GetEventSelectorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSelectors(value: EventSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(js.undefined)
        ret
    }
  }
  
}

