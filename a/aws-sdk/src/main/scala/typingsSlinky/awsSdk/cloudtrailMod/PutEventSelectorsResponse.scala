package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventSelectorsResponse extends js.Object {
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.EventSelectors] = js.native
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object PutEventSelectorsResponse {
  @scala.inline
  def apply(): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
  @scala.inline
  implicit class PutEventSelectorsResponseOps[Self <: PutEventSelectorsResponse] (val x: Self) extends AnyVal {
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

