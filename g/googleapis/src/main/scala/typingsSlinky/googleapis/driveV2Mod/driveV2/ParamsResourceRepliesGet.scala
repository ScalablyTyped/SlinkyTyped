package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRepliesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * If set, this will succeed when retrieving a deleted reply.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.native
}
object ParamsResourceRepliesGet {
  
  @scala.inline
  def apply(): ParamsResourceRepliesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepliesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceRepliesGetMutableBuilder[Self <: ParamsResourceRepliesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    @scala.inline
    def setReplyId(value: String): Self = StObject.set(x, "replyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyIdUndefined: Self = StObject.set(x, "replyId", js.undefined)
  }
}
