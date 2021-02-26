package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEmailEntry extends StObject {
  
  /**
    * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a destination email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. 
    */
  var Destination: typingsSlinky.awsSdk.sesv2Mod.Destination = js.native
  
  /**
    * The ReplacementEmailContent associated with a BulkEmailEntry.
    */
  var ReplacementEmailContent: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ReplacementEmailContent] = js.native
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendBulkTemplatedEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.native
}
object BulkEmailEntry {
  
  @scala.inline
  def apply(Destination: Destination): BulkEmailEntry = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailEntry]
  }
  
  @scala.inline
  implicit class BulkEmailEntryMutableBuilder[Self <: BulkEmailEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementEmailContent(value: ReplacementEmailContent): Self = StObject.set(x, "ReplacementEmailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementEmailContentUndefined: Self = StObject.set(x, "ReplacementEmailContent", js.undefined)
    
    @scala.inline
    def setReplacementTags(value: MessageTagList): Self = StObject.set(x, "ReplacementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTagsUndefined: Self = StObject.set(x, "ReplacementTags", js.undefined)
    
    @scala.inline
    def setReplacementTagsVarargs(value: MessageTag*): Self = StObject.set(x, "ReplacementTags", js.Array(value :_*))
  }
}
