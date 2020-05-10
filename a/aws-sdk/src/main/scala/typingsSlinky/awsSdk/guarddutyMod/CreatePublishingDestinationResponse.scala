package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublishingDestinationResponse extends js.Object {
  /**
    * The ID of the publishing destination created.
    */
  var DestinationId: String = js.native
}

object CreatePublishingDestinationResponse {
  @scala.inline
  def apply(DestinationId: String): CreatePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationResponse]
  }
  @scala.inline
  implicit class CreatePublishingDestinationResponseOps[Self <: CreatePublishingDestinationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

