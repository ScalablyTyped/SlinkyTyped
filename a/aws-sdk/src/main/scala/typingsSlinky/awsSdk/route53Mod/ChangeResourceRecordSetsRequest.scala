package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeResourceRecordSetsRequest extends js.Object {
  /**
    * A complex type that contains an optional comment and the Changes element.
    */
  var ChangeBatch: typingsSlinky.awsSdk.route53Mod.ChangeBatch = js.native
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to change.
    */
  var HostedZoneId: ResourceId = js.native
}

object ChangeResourceRecordSetsRequest {
  @scala.inline
  def apply(ChangeBatch: ChangeBatch, HostedZoneId: ResourceId): ChangeResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
  }
  @scala.inline
  implicit class ChangeResourceRecordSetsRequestOps[Self <: ChangeResourceRecordSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeBatch(value: ChangeBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedZoneId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

