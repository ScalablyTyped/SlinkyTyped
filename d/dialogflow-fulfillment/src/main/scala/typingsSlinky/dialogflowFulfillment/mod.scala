package typingsSlinky.dialogflowFulfillment

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.mod.DialogflowConversation
import typingsSlinky.dialogflowFulfillment.anon.ImageUrl
import typingsSlinky.dialogflowFulfillment.anon.Lifespan
import typingsSlinky.dialogflowFulfillment.anon.RawPayload
import typingsSlinky.dialogflowFulfillment.anon.Request
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dialogflow-fulfillment", "Card")
  @js.native
  class Card protected () extends RichResponse {
    def this(card: String) = this()
    def this(card: js.Object) = this()
    
    /* private */ def getV1ResponseObject_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV2ResponseObject_(platform: Platforms): js.Object = js.native
    
    def setButton(button: typingsSlinky.dialogflowFulfillment.anon.Text): Card = js.native
    
    def setImage(imageUrl: String): Card = js.native
    
    def setText(text: String): Card = js.native
    
    def setTitle(title: String): Card = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "Image")
  @js.native
  class Image protected () extends RichResponse {
    def this(image: String) = this()
    def this(image: ImageUrl) = this()
    
    /* private */ def getV1ResponseObject_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV2ResponseObject_(platform: Platforms): js.Object = js.native
    
    def setImage(imageUrl: String): Image = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "Payload")
  @js.native
  class Payload protected () extends RichResponse {
    def this(platform: Platforms, payload: js.Any) = this()
    def this(platform: Platforms, payload: js.Any, options: RawPayload) = this()
    
    /* private */ def getPayload_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV1ResponseObject_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV2ResponseObject_(platform: Platforms): js.Object = js.native
    
    var payload: js.Any = js.native
    
    def setPayload(payload: String): Payload = js.native
  }
  
  @js.native
  sealed trait Platforms extends StObject
  @JSImport("dialogflow-fulfillment", "Platforms")
  @js.native
  object Platforms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Platforms with String] = js.native
    
    @js.native
    sealed trait ACTIONS_ON_GOOGLE extends Platforms
    /* "ACTIONS_ON_GOOGLE" */ val ACTIONS_ON_GOOGLE: typingsSlinky.dialogflowFulfillment.mod.Platforms.ACTIONS_ON_GOOGLE with String = js.native
    
    @js.native
    sealed trait FACEBOOK extends Platforms
    /* "FACEBOOK" */ val FACEBOOK: typingsSlinky.dialogflowFulfillment.mod.Platforms.FACEBOOK with String = js.native
    
    @js.native
    sealed trait KIK extends Platforms
    /* "KIK" */ val KIK: typingsSlinky.dialogflowFulfillment.mod.Platforms.KIK with String = js.native
    
    @js.native
    sealed trait LINE extends Platforms
    /* "LINE" */ val LINE: typingsSlinky.dialogflowFulfillment.mod.Platforms.LINE with String = js.native
    
    @js.native
    sealed trait SKYPE extends Platforms
    /* "SKYPE" */ val SKYPE: typingsSlinky.dialogflowFulfillment.mod.Platforms.SKYPE with String = js.native
    
    @js.native
    sealed trait SLACK extends Platforms
    /* "SLACK" */ val SLACK: typingsSlinky.dialogflowFulfillment.mod.Platforms.SLACK with String = js.native
    
    @js.native
    sealed trait TELEGRAM extends Platforms
    /* "TELEGRAM" */ val TELEGRAM: typingsSlinky.dialogflowFulfillment.mod.Platforms.TELEGRAM with String = js.native
    
    @js.native
    sealed trait UNSPECIFIED extends Platforms
    /* "PLATFORM_UNSPECIFIED" */ val UNSPECIFIED: typingsSlinky.dialogflowFulfillment.mod.Platforms.UNSPECIFIED with String = js.native
    
    @js.native
    sealed trait VIBER extends Platforms
    /* "VIBER" */ val VIBER: typingsSlinky.dialogflowFulfillment.mod.Platforms.VIBER with String = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "RichResponse")
  @js.native
  class RichResponse () extends StObject {
    
    var platform: Platforms = js.native
    
    def setPlatform(platform: Platforms): RichResponse = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "Suggestion")
  @js.native
  class Suggestion protected () extends RichResponse {
    def this(suggestion: String) = this()
    def this(suggestion: js.Object) = this()
    
    /* private */ def addReply_(reply: String): Unit = js.native
    
    /* private */ def getV1ResponseObject_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV2ResponseObject_(platform: Platforms): js.Object = js.native
    
    def setReply(reply: String): Suggestion = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "Text")
  @js.native
  class Text protected () extends RichResponse {
    def this(text: String) = this()
    def this(text: js.Object) = this()
    
    /* private */ def getV1ResponseObject_(platform: Platforms): js.Object = js.native
    
    /* private */ def getV2ResponseObject_(platform: Platforms): js.Object = js.native
    
    def setSsml(ssml: String): Text = js.native
    
    def setText(text: String): Text = js.native
  }
  
  @JSImport("dialogflow-fulfillment", "WebhookClient")
  @js.native
  class WebhookClient protected () extends StObject {
    def this(options: js.Object) = this()
    /**
      * Constructor for WebhookClient object To be used in the Dialogflow fulfillment webhook logic
      * @param options JSON configuration with { request: Express HTTP request object, response: Express HTTP response object }
      */
    def this(options: Request) = this()
    
    /** Dialogflow action or null if no value */
    val action: String = js.native
    
    def add(responses: String): Unit = js.native
    def add(responses: js.Array[RichResponse | String]): Unit = js.native
    def add(responses: DialogflowConversation[JsonObject, JsonObject, Contexts]): Unit = js.native
    /**
      * Add a response or list of responses to be sent to Dialogflow
      * @param responses (list) or single responses
      */
    def add(responses: RichResponse): Unit = js.native
    
    /* private */ def addResponse_(response: String): Unit = js.native
    /* private */ def addResponse_(response: RichResponse): Unit = js.native
    
    /** The agent version (v1 or v2) based on Dialogflow webhook request */
    val agentVersion: String = js.native
    
    /** List of alternative query results. Query results can be from other Dialogflow intents or Knowledge Connectors */
    val alternativeQueryResults: js.Object = js.native
    
    /**
      * Clear an existing outgoing context
      * @param context name of an existing outgoing context
      */
    def clearContext(context: String): WebhookClient = js.native
    
    /**
      * Clear all existing outgoing contexts
      */
    def clearOutgoingContexts(): WebhookClient = js.native
    
    /** List of messages defined in Dialogflow's console for the matched intent */
    val consoleMessages: js.Array[RichResponse] = js.native
    
    /** Dialogflow contexts included in the request or null if no value */
    val contexts: js.Array[Lifespan] = js.native
    
    /**
      * Get Actions on Google DialogflowConversation object
      */
    def conv(): DialogflowConversation[_, JsonObject, Contexts] = js.native
    
    def end(responses: String): Unit = js.native
    def end(responses: js.Array[RichResponse | String]): Unit = js.native
    /**
      * Add a response or list of responses to be sent to Dialogflow and end the conversation.
      * Note: Only supported on Dialogflow v2's telephony gateway, Google Assistant and Alexa integrations
      * @param responses (list) or single responses
      */
    def end(responses: RichResponse): Unit = js.native
    
    /* private */ def existingPayload_(platform: Platforms): Payload | Null = js.native
    
    /* private */ def existingSuggestion_(platform: Platforms): Suggestion | Null = js.native
    
    /**
      * Get an context from the Dialogflow webhook request
      * @param contextName name of an context present in the Dialogflow webhook request
      */
    def getContext(contextName: String): Lifespan = js.native
    
    def handleRequest(handler: js.Function1[/* agent */ this.type, Unit]): js.Promise[_] = js.native
    /**
      * Handles the incoming Dialogflow request using a handler or Map of handlers Each handler must be a function callback.
      * @param handler map of Dialogflow action name to handler function or function to handle all requests (regardless of Dialogflow action).
      */
    def handleRequest(handler: Map[String, js.Function1[/* agent */ this.type, Unit]]): js.Promise[_] = js.native
    
    /** Dialogflow intent name or null if no value */
    val intent: String = js.native
    
    /** Original request language code or locale (i.e. "en" or "en-US") */
    val locale: String = js.native
    
    /** Dialogflow original request object from detectIntent/query or platform integration (Google Assistant, Slack, etc.) in the request or null if no value */
    val originalRequest: js.Object = js.native
    
    /** Dialogflow parameters included in the request or null if no value */
    val parameters: StringDictionary[String] = js.native
    
    /** Original user query as indicated by Dialogflow or null if no value */
    val query: String = js.native
    
    /** Dialogflow source included in the request or null if no value  */
    val requestSource: String = js.native
    
    /* private */ def send_(): Unit = js.native
    
    /** Conversation session identifier of the format projects/{project}/agent/sessions/{session} or projects/{project}/agent/environments/{environment}/users/{user}/sessions/{session}  */
    val session: String = js.native
    
    /**
      * Set a new Dialogflow outgoing context
      * @param context name of context or an object representing a context
      */
    def setContext(context: String): WebhookClient = js.native
    def setContext(context: js.Object): WebhookClient = js.native
    
    /**
      * Set the followup event
      * @param event string with the name of the event or an event object
      */
    def setFollowupEvent(event: String): Unit = js.native
    def setFollowupEvent(event: js.Object): Unit = js.native
  }
}
