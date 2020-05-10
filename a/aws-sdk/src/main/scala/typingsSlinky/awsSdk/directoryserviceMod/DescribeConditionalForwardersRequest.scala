package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersRequest extends js.Object {
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainNames] = js.native
}

object DescribeConditionalForwardersRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
  @scala.inline
  implicit class DescribeConditionalForwardersRequestOps[Self <: DescribeConditionalForwardersRequest] (val x: Self) extends AnyVal {
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
    def withRemoteDomainNames(value: RemoteDomainNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainNames")(js.undefined)
        ret
    }
  }
  
}

