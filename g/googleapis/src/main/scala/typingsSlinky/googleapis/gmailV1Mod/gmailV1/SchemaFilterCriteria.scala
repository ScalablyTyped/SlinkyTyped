package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message matching criteria.
  */
@js.native
trait SchemaFilterCriteria extends StObject {
  
  /**
    * Whether the response should exclude chats.
    */
  var excludeChats: js.UndefOr[Boolean] = js.native
  
  /**
    * The sender&#39;s display name or email address.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * Whether the message has any attachment.
    */
  var hasAttachment: js.UndefOr[Boolean] = js.native
  
  /**
    * Only return messages not matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var negatedQuery: js.UndefOr[String] = js.native
  
  /**
    * Only return messages matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The size of the entire RFC822 message in bytes, including all headers and
    * attachments.
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * How the message size in bytes should be in relation to the size field.
    */
  var sizeComparison: js.UndefOr[String] = js.native
  
  /**
    * Case-insensitive phrase found in the message&#39;s subject. Trailing and
    * leading whitespace are be trimmed and adjacent spaces are collapsed.
    */
  var subject: js.UndefOr[String] = js.native
  
  /**
    * The recipient&#39;s display name or email address. Includes recipients in
    * the &quot;to&quot;, &quot;cc&quot;, and &quot;bcc&quot; header fields.
    * You can use simply the local part of the email address. For example,
    * &quot;example&quot; and &quot;example@&quot; both match
    * &quot;example@gmail.com&quot;. This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.native
}
object SchemaFilterCriteria {
  
  @scala.inline
  def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  
  @scala.inline
  implicit class SchemaFilterCriteriaMutableBuilder[Self <: SchemaFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeChats(value: Boolean): Self = StObject.set(x, "excludeChats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeChatsUndefined: Self = StObject.set(x, "excludeChats", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHasAttachment(value: Boolean): Self = StObject.set(x, "hasAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAttachmentUndefined: Self = StObject.set(x, "hasAttachment", js.undefined)
    
    @scala.inline
    def setNegatedQuery(value: String): Self = StObject.set(x, "negatedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegatedQueryUndefined: Self = StObject.set(x, "negatedQuery", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeComparison(value: String): Self = StObject.set(x, "sizeComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeComparisonUndefined: Self = StObject.set(x, "sizeComparison", js.undefined)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
