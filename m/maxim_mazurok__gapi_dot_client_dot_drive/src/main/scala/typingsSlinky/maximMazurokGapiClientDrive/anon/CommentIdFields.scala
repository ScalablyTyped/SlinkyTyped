package typingsSlinky.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentIdFields extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** The ID of the comment. */
  var commentId: String = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** The ID of the file. */
  var fileId: String = js.native
  
  /** Whether to return deleted replies. Deleted replies will not include their original content. */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** The ID of the reply. */
  var replyId: String = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object CommentIdFields {
  
  @scala.inline
  def apply(commentId: String, fileId: String, replyId: String): CommentIdFields = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], replyId = replyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentIdFields]
  }
  
  @scala.inline
  implicit class CommentIdFieldsMutableBuilder[Self <: CommentIdFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setReplyId(value: String): Self = StObject.set(x, "replyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
