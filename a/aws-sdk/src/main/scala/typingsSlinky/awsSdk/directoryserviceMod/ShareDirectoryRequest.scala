package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDirectoryRequest extends js.Object {
  
  /**
    * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a directory sharing request (HANDSHAKE).
    */
  var ShareMethod: typingsSlinky.awsSdk.directoryserviceMod.ShareMethod = js.native
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  
  /**
    * Identifier for the directory consumer account with whom the directory is to be shared.
    */
  var ShareTarget: typingsSlinky.awsSdk.directoryserviceMod.ShareTarget = js.native
}
object ShareDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, ShareMethod: ShareMethod, ShareTarget: ShareTarget): ShareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], ShareMethod = ShareMethod.asInstanceOf[js.Any], ShareTarget = ShareTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDirectoryRequest]
  }
  
  @scala.inline
  implicit class ShareDirectoryRequestOps[Self <: ShareDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareMethod(value: ShareMethod): Self = this.set("ShareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTarget(value: ShareTarget): Self = this.set("ShareTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareNotes(value: Notes): Self = this.set("ShareNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareNotes: Self = this.set("ShareNotes", js.undefined)
  }
}
