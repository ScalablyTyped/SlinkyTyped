package typingsSlinky.googleapis.driveV3Mod.driveV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRevisionsGet extends StandardParameters {
  
  /**
    * Whether the user is acknowledging the risk of downloading known malware
    * or other abusive files. This is only applicable when alt=media.
    */
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the revision.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object ParamsResourceRevisionsGet {
  
  @scala.inline
  def apply(): ParamsResourceRevisionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRevisionsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceRevisionsGetOps[Self <: ParamsResourceRevisionsGet] (val x: Self) extends AnyVal {
    
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
    def setAcknowledgeAbuse(value: Boolean): Self = this.set("acknowledgeAbuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledgeAbuse: Self = this.set("acknowledgeAbuse", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
