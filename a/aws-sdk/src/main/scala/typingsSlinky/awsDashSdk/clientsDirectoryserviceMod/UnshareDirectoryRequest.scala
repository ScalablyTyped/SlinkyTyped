package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareDirectoryRequest extends js.Object {
  /**
    * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
    */
  var DirectoryId: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * Identifier for the directory consumer account with whom the directory has to be unshared.
    */
  var UnshareTarget: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.UnshareTarget = js.native
}

object UnshareDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, UnshareTarget: UnshareTarget): UnshareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UnshareTarget = UnshareTarget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnshareDirectoryRequest]
  }
}

