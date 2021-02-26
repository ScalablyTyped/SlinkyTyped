package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prompt extends StObject {
  
  /**
    * The number of times to prompt the user for information.
    */
  var maxAttempts: PromptMaxAttempts = js.native
  
  /**
    * An array of objects, each of which provides a message string and its type. You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    */
  var messages: MessageList = js.native
  
  /**
    * A response card. Amazon Lex uses this prompt at runtime, in the PostText API response. It substitutes session attributes and slot values for placeholders in the response card. For more information, see ex-resp-card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
}
object Prompt {
  
  @scala.inline
  def apply(maxAttempts: PromptMaxAttempts, messages: MessageList): Prompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  
  @scala.inline
  implicit class PromptMutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAttempts(value: PromptMaxAttempts): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: MessageList): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
