package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID for which you are deleting the conditional forwarder.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional forwarder.
    */
  var RemoteDomainName: typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName = js.native
}

object DeleteConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RemoteDomainName: RemoteDomainName): DeleteConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConditionalForwarderRequest]
  }
  @scala.inline
  implicit class DeleteConditionalForwarderRequestOps[Self <: DeleteConditionalForwarderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: RemoteDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

