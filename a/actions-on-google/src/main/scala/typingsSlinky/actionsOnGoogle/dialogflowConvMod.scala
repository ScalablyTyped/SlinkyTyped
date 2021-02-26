package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionssdkMod.Conversation
import typingsSlinky.actionsOnGoogle.anon.ProtoAnystringJsonObject
import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2EventInput
import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookResponse
import typingsSlinky.actionsOnGoogle.contextMod.ContextValues
import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.contextMod.Parameters
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import typingsSlinky.actionsOnGoogle.incomingMod.Incoming
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1FollowupEvent
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1WebhookRequest
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1WebhookResponse
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowConvMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/conv", "DialogflowConversation")
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] () extends Conversation[TUserStorage] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
    
    /** @hidden */
    var _followup: js.UndefOr[GoogleCloudDialogflowV2EventInput | DialogflowV1FollowupEvent] = js.native
    
    /** @hidden */
    @JSName("_init")
    var _init_DialogflowConversation: ConversationOptionsInit[TConvData, TUserStorage] = js.native
    
    /**
      * Get the current Dialogflow action name.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   const action = conv.action
      * })
      * ```
      *
      * @public
      */
    var action: String = js.native
    
    /** @public */
    var body: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest = js.native
    
    /** @public */
    var contexts: ContextValues[TContexts] = js.native
    
    /**
      * The session data in JSON format.
      * Stored using contexts.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.data.someProperty = 'someValue'
      * })
      * ```
      *
      * @public
      */
    var data: TConvData = js.native
    
    /**
      * Triggers an intent of your choosing by sending a followup event from the webhook.
      * Final response can theoretically include responses but these will not be handled
      * by Dialogflow. Dialogflow will not pass anything back to Google Assistant, therefore
      * Google Assistant specific information, most notably conv.user.storage, is ignored.
      *
      * @example
      * ```javascript
      *
      * const app = dialogflow()
      *
      * // Create a Dialogflow intent with event 'apply-for-license-event'
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.followup('apply-for-license-event', {
      *     date: new Date().toISOString(),
      *   })
      *   // The dialogflow intent with the 'apply-for-license-event' event
      *   // will be triggered with the given parameters `date`
      * })
      * ```
      *
      * @param event Name of the event
      * @param parameters Parameters to send with the event
      * @param lang The language of this query.
      *     See {@link https://dialogflow.com/docs/languages|Language Support}
      *     for a list of the currently supported language codes.
      *     Note that queries in the same session do not necessarily need to specify the same language.
      *     By default, it is the languageCode sent with Dialogflow's queryResult.languageCode
      * @public
      */
    def followup(event: String): this.type = js.native
    def followup(event: String, parameters: js.UndefOr[scala.Nothing], lang: String): this.type = js.native
    def followup(event: String, parameters: Parameters): this.type = js.native
    def followup(event: String, parameters: Parameters, lang: String): this.type = js.native
    
    /** @public */
    var incoming: Incoming = js.native
    
    /**
      * Get the current Dialogflow intent name.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   const intent = conv.intent // will be 'Default Welcome Intent'
      * })
      * ```
      *
      * @public
      */
    var intent: String = js.native
    
    /**
      * The Dialogflow parameters from the current intent.
      * Values will only be a string, an Object, or undefined if not included.
      *
      * Will also be sent via intent handler 3rd argument which is the encouraged method to retrieve.
      *
      * @example
      * ```javascript
      *
      * // Encouraged method through intent handler
      * app.intent('Tell Greeting', (conv, params) => {
      *   const color = params.color
      *   const num = params.num
      * })
      *
      * // Encouraged method through destructuring in intent handler
      * app.intent('Tell Greeting', (conv, { color, num }) => {
      *   // now use color and num as variables
      * }))
      *
      * // Using conv.parameters
      * app.intent('Tell Greeting', conv => {
      *   const parameters = conv.parameters
      *   // or destructed
      *   const { color, num } = conv.parameters
      * })
      * ```
      *
      * @public
      */
    var parameters: Parameters = js.native
    
    /**
      * The user's raw input query.
      *
      * @example
      * ```javascript
      *
      * app.intent('User Input', conv => {
      *   conv.close(`You said ${conv.query}`)
      * })
      * ```
      *
      * @public
      */
    var query: String = js.native
    
    /** @public */
    def serialize(): GoogleCloudDialogflowV2WebhookResponse | DialogflowV1WebhookResponse = js.native
    
    /** @public */
    var version: Double = js.native
  }
  
  @js.native
  trait DialogflowConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
    
    /** @public */
    var body: js.UndefOr[GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest] = js.native
  }
  object DialogflowConversationOptions {
    
    @scala.inline
    def apply[TConvData, TUserStorage](): DialogflowConversationOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
    }
    
    @scala.inline
    implicit class DialogflowConversationOptionsMutableBuilder[Self <: DialogflowConversationOptions[_, _], TConvData, TUserStorage] (val x: Self with (DialogflowConversationOptions[TConvData, TUserStorage])) extends AnyVal {
      
      @scala.inline
      def setBody(value: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    }
  }
  
  @js.native
  trait GoogleAssistantResponse extends StObject {
    
    var expectUserResponse: js.UndefOr[Boolean] = js.native
    
    var isSsml: js.UndefOr[Boolean] = js.native
    
    var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
    
    var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.native
    
    var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
    
    var systemIntent: js.UndefOr[SystemIntent] = js.native
    
    var userStorage: js.UndefOr[String] = js.native
  }
  object GoogleAssistantResponse {
    
    @scala.inline
    def apply(): GoogleAssistantResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAssistantResponse]
    }
    
    @scala.inline
    implicit class GoogleAssistantResponseMutableBuilder[Self <: GoogleAssistantResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpectUserResponse(value: Boolean): Self = StObject.set(x, "expectUserResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectUserResponseUndefined: Self = StObject.set(x, "expectUserResponse", js.undefined)
      
      @scala.inline
      def setIsSsml(value: Boolean): Self = StObject.set(x, "isSsml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSsmlUndefined: Self = StObject.set(x, "isSsml", js.undefined)
      
      @scala.inline
      def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
      
      @scala.inline
      def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value :_*))
      
      @scala.inline
      def setRichResponse(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichResponseUndefined: Self = StObject.set(x, "richResponse", js.undefined)
      
      @scala.inline
      def setSpeechBiasingHints(value: js.Array[String]): Self = StObject.set(x, "speechBiasingHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechBiasingHintsUndefined: Self = StObject.set(x, "speechBiasingHints", js.undefined)
      
      @scala.inline
      def setSpeechBiasingHintsVarargs(value: String*): Self = StObject.set(x, "speechBiasingHints", js.Array(value :_*))
      
      @scala.inline
      def setSystemIntent(value: SystemIntent): Self = StObject.set(x, "systemIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemIntentUndefined: Self = StObject.set(x, "systemIntent", js.undefined)
      
      @scala.inline
      def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserStorageUndefined: Self = StObject.set(x, "userStorage", js.undefined)
    }
  }
  
  @js.native
  trait PayloadGoogle extends StObject {
    
    var google: GoogleAssistantResponse = js.native
  }
  object PayloadGoogle {
    
    @scala.inline
    def apply(google: GoogleAssistantResponse): PayloadGoogle = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadGoogle]
    }
    
    @scala.inline
    implicit class PayloadGoogleMutableBuilder[Self <: PayloadGoogle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGoogle(value: GoogleAssistantResponse): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SystemIntent extends StObject {
    
    var data: ProtoAnystringJsonObject = js.native
    
    var intent: String = js.native
  }
  object SystemIntent {
    
    @scala.inline
    def apply(data: ProtoAnystringJsonObject, intent: String): SystemIntent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemIntent]
    }
    
    @scala.inline
    implicit class SystemIntentMutableBuilder[Self <: SystemIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ProtoAnystringJsonObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
}
