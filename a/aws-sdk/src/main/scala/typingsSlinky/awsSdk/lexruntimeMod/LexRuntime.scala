package typingsSlinky.awsSdk.lexruntimeMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexRuntime extends Service {
  
  @JSName("config")
  var config_LexRuntime: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Removes session information for a specified bot, alias, and user ID. 
    */
  def deleteSession(): Request[DeleteSessionResponse, AWSError] = js.native
  def deleteSession(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSessionResponse, Unit]): Request[DeleteSessionResponse, AWSError] = js.native
  /**
    * Removes session information for a specified bot, alias, and user ID. 
    */
  def deleteSession(params: DeleteSessionRequest): Request[DeleteSessionResponse, AWSError] = js.native
  def deleteSession(
    params: DeleteSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSessionResponse, Unit]
  ): Request[DeleteSessionResponse, AWSError] = js.native
  
  /**
    * Returns session information for a specified bot, alias, and user ID.
    */
  def getSession(): Request[GetSessionResponse, AWSError] = js.native
  def getSession(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]): Request[GetSessionResponse, AWSError] = js.native
  /**
    * Returns session information for a specified bot, alias, and user ID.
    */
  def getSession(params: GetSessionRequest): Request[GetSessionResponse, AWSError] = js.native
  def getSession(
    params: GetSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]
  ): Request[GetSessionResponse, AWSError] = js.native
  
  /**
    *  Sends user input (text or speech) to Amazon Lex. Clients use this API to send text and audio requests to Amazon Lex at runtime. Amazon Lex interprets the user input using the machine learning model that it built for the bot.  The PostContent operation supports audio input at 8kHz and 16kHz. You can use 8kHz audio to achieve higher speech recognition accuracy in telephone audio applications.   In response, Amazon Lex returns the next message to convey to the user. Consider the following example messages:     For a user input "I would like a pizza," Amazon Lex might return a response with a message eliciting slot data (for example, PizzaSize): "What size pizza would you like?".     After the user provides all of the pizza order information, Amazon Lex might return a response with a message to get user confirmation: "Order the pizza?".     After the user replies "Yes" to the confirmation prompt, Amazon Lex might return a conclusion statement: "Thank you, your cheese pizza has been ordered.".     Not all Amazon Lex messages require a response from the user. For example, conclusion statements do not require a response. Some messages require only a yes or no response. In addition to the message, Amazon Lex provides additional context about the message in the response that you can use to enhance client behavior, such as displaying the appropriate client user interface. Consider the following examples:     If the message is to elicit slot data, Amazon Lex returns the following context information:     x-amz-lex-dialog-state header set to ElicitSlot     x-amz-lex-intent-name header set to the intent name in the current context     x-amz-lex-slot-to-elicit header set to the slot name for which the message is eliciting information     x-amz-lex-slots header set to a map of slots configured for the intent with their current values       If the message is a confirmation prompt, the x-amz-lex-dialog-state header is set to Confirmation and the x-amz-lex-slot-to-elicit header is omitted.     If the message is a clarification prompt configured for the intent, indicating that the user intent is not understood, the x-amz-dialog-state header is set to ElicitIntent and the x-amz-slot-to-elicit header is omitted.     In addition, Amazon Lex also returns your application-specific sessionAttributes. For more information, see Managing Conversation Context. 
    */
  def postContent(): Request[PostContentResponse, AWSError] = js.native
  def postContent(callback: js.Function2[/* err */ AWSError, /* data */ PostContentResponse, Unit]): Request[PostContentResponse, AWSError] = js.native
  /**
    *  Sends user input (text or speech) to Amazon Lex. Clients use this API to send text and audio requests to Amazon Lex at runtime. Amazon Lex interprets the user input using the machine learning model that it built for the bot.  The PostContent operation supports audio input at 8kHz and 16kHz. You can use 8kHz audio to achieve higher speech recognition accuracy in telephone audio applications.   In response, Amazon Lex returns the next message to convey to the user. Consider the following example messages:     For a user input "I would like a pizza," Amazon Lex might return a response with a message eliciting slot data (for example, PizzaSize): "What size pizza would you like?".     After the user provides all of the pizza order information, Amazon Lex might return a response with a message to get user confirmation: "Order the pizza?".     After the user replies "Yes" to the confirmation prompt, Amazon Lex might return a conclusion statement: "Thank you, your cheese pizza has been ordered.".     Not all Amazon Lex messages require a response from the user. For example, conclusion statements do not require a response. Some messages require only a yes or no response. In addition to the message, Amazon Lex provides additional context about the message in the response that you can use to enhance client behavior, such as displaying the appropriate client user interface. Consider the following examples:     If the message is to elicit slot data, Amazon Lex returns the following context information:     x-amz-lex-dialog-state header set to ElicitSlot     x-amz-lex-intent-name header set to the intent name in the current context     x-amz-lex-slot-to-elicit header set to the slot name for which the message is eliciting information     x-amz-lex-slots header set to a map of slots configured for the intent with their current values       If the message is a confirmation prompt, the x-amz-lex-dialog-state header is set to Confirmation and the x-amz-lex-slot-to-elicit header is omitted.     If the message is a clarification prompt configured for the intent, indicating that the user intent is not understood, the x-amz-dialog-state header is set to ElicitIntent and the x-amz-slot-to-elicit header is omitted.     In addition, Amazon Lex also returns your application-specific sessionAttributes. For more information, see Managing Conversation Context. 
    */
  def postContent(params: PostContentRequest): Request[PostContentResponse, AWSError] = js.native
  def postContent(
    params: PostContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PostContentResponse, Unit]
  ): Request[PostContentResponse, AWSError] = js.native
  
  /**
    * Sends user input to Amazon Lex. Client applications can use this API to send requests to Amazon Lex at runtime. Amazon Lex then interprets the user input using the machine learning model it built for the bot.   In response, Amazon Lex returns the next message to convey to the user an optional responseCard to display. Consider the following example messages:     For a user input "I would like a pizza", Amazon Lex might return a response with a message eliciting slot data (for example, PizzaSize): "What size pizza would you like?"     After the user provides all of the pizza order information, Amazon Lex might return a response with a message to obtain user confirmation "Proceed with the pizza order?".     After the user replies to a confirmation prompt with a "yes", Amazon Lex might return a conclusion statement: "Thank you, your cheese pizza has been ordered.".     Not all Amazon Lex messages require a user response. For example, a conclusion statement does not require a response. Some messages require only a "yes" or "no" user response. In addition to the message, Amazon Lex provides additional context about the message in the response that you might use to enhance client behavior, for example, to display the appropriate client user interface. These are the slotToElicit, dialogState, intentName, and slots fields in the response. Consider the following examples:    If the message is to elicit slot data, Amazon Lex returns the following context information:    dialogState set to ElicitSlot     intentName set to the intent name in the current context     slotToElicit set to the slot name for which the message is eliciting information     slots set to a map of slots, configured for the intent, with currently known values       If the message is a confirmation prompt, the dialogState is set to ConfirmIntent and SlotToElicit is set to null.    If the message is a clarification prompt (configured for the intent) that indicates that user intent is not understood, the dialogState is set to ElicitIntent and slotToElicit is set to null.     In addition, Amazon Lex also returns your application-specific sessionAttributes. For more information, see Managing Conversation Context. 
    */
  def postText(): Request[PostTextResponse, AWSError] = js.native
  def postText(callback: js.Function2[/* err */ AWSError, /* data */ PostTextResponse, Unit]): Request[PostTextResponse, AWSError] = js.native
  /**
    * Sends user input to Amazon Lex. Client applications can use this API to send requests to Amazon Lex at runtime. Amazon Lex then interprets the user input using the machine learning model it built for the bot.   In response, Amazon Lex returns the next message to convey to the user an optional responseCard to display. Consider the following example messages:     For a user input "I would like a pizza", Amazon Lex might return a response with a message eliciting slot data (for example, PizzaSize): "What size pizza would you like?"     After the user provides all of the pizza order information, Amazon Lex might return a response with a message to obtain user confirmation "Proceed with the pizza order?".     After the user replies to a confirmation prompt with a "yes", Amazon Lex might return a conclusion statement: "Thank you, your cheese pizza has been ordered.".     Not all Amazon Lex messages require a user response. For example, a conclusion statement does not require a response. Some messages require only a "yes" or "no" user response. In addition to the message, Amazon Lex provides additional context about the message in the response that you might use to enhance client behavior, for example, to display the appropriate client user interface. These are the slotToElicit, dialogState, intentName, and slots fields in the response. Consider the following examples:    If the message is to elicit slot data, Amazon Lex returns the following context information:    dialogState set to ElicitSlot     intentName set to the intent name in the current context     slotToElicit set to the slot name for which the message is eliciting information     slots set to a map of slots, configured for the intent, with currently known values       If the message is a confirmation prompt, the dialogState is set to ConfirmIntent and SlotToElicit is set to null.    If the message is a clarification prompt (configured for the intent) that indicates that user intent is not understood, the dialogState is set to ElicitIntent and slotToElicit is set to null.     In addition, Amazon Lex also returns your application-specific sessionAttributes. For more information, see Managing Conversation Context. 
    */
  def postText(params: PostTextRequest): Request[PostTextResponse, AWSError] = js.native
  def postText(
    params: PostTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PostTextResponse, Unit]
  ): Request[PostTextResponse, AWSError] = js.native
  
  /**
    * Creates a new session or modifies an existing session with an Amazon Lex bot. Use this operation to enable your application to set the state of the bot. For more information, see Managing Sessions.
    */
  def putSession(): Request[PutSessionResponse, AWSError] = js.native
  def putSession(callback: js.Function2[/* err */ AWSError, /* data */ PutSessionResponse, Unit]): Request[PutSessionResponse, AWSError] = js.native
  /**
    * Creates a new session or modifies an existing session with an Amazon Lex bot. Use this operation to enable your application to set the state of the bot. For more information, see Managing Sessions.
    */
  def putSession(params: PutSessionRequest): Request[PutSessionResponse, AWSError] = js.native
  def putSession(
    params: PutSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSessionResponse, Unit]
  ): Request[PutSessionResponse, AWSError] = js.native
}
