package typingsSlinky.pulumiAws.inputMod.lex

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentRejectionStatement extends js.Object {
  
  /**
    * A set of messages, each of which provides a message string and its type.
    * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    * Attributes are documented under message. Must contain between 1 and 15 messages.
    */
  var messages: Input[js.Array[Input[IntentRejectionStatementMessage]]] = js.native
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[Input[String]] = js.native
}
object IntentRejectionStatement {
  
  @scala.inline
  def apply(messages: Input[js.Array[Input[IntentRejectionStatementMessage]]]): IntentRejectionStatement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRejectionStatement]
  }
  
  @scala.inline
  implicit class IntentRejectionStatementOps[Self <: IntentRejectionStatement] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: Input[IntentRejectionStatementMessage]*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: Input[js.Array[Input[IntentRejectionStatementMessage]]]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCard(value: Input[String]): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
  }
}
