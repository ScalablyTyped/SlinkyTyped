package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The unique ID of the publishing destination.
    */
  var DestinationId: String = js.native
  /**
    * The type of resource used for the publishing destination. Currently, only S3 is supported.
    */
  var DestinationType: typingsSlinky.awsSdk.guarddutyMod.DestinationType = js.native
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}

object Destination {
  @scala.inline
  def apply(DestinationId: String, DestinationType: DestinationType, Status: PublishingStatus): Destination = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDestinationType(value: DestinationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PublishingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

