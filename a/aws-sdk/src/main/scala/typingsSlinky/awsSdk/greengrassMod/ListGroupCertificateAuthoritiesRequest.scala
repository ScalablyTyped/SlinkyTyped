package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupCertificateAuthoritiesRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object ListGroupCertificateAuthoritiesRequest {
  @scala.inline
  def apply(GroupId: string): ListGroupCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesRequest]
  }
  @scala.inline
  implicit class ListGroupCertificateAuthoritiesRequestOps[Self <: ListGroupCertificateAuthoritiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

