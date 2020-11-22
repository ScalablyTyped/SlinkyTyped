package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSessionRequest extends js.Object {
  
  /**
    * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of this field.   If the value is text/plain; charset=utf-8, Amazon Lex returns text in the response.   If the value begins with audio/, Amazon Lex returns speech in the response. Amazon Lex uses Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify audio/mpeg as the value, Amazon Lex returns speech in the MPEG format.   If the value is audio/pcm, the speech is returned as audio/pcm in 16-bit, little endian format.   The following are the accepted values:    audio/mpeg     audio/ogg     audio/pcm     audio/ * (defaults to mpeg)    text/plain; charset=utf-8     
    */
  var accept: js.UndefOr[Accept] = js.native
  
  /**
    * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by including the context in the request, If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you specify an empty list, all contexts for the session are cleared.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.native
  
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias = js.native
  
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName = js.native
  
  /**
    * Sets the next action that the bot should take to fulfill the conversation.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  
  /**
    * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list. An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be valid for the bot. You must provide valid values for:    intentName    slot names    slotToElict    If you send the recentIntentSummaryView parameter in a PutSession request, the contents of the new summary view replaces the old summary view. For example, if a GetSession request returns three intents in the summary view and you call PutSession with one intent in the summary view, the next call to GetSession will only return one intent.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.native
  
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId = js.native
}
object PutSessionRequest {
  
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): PutSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSessionRequest]
  }
  
  @scala.inline
  implicit class PutSessionRequestOps[Self <: PutSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = this.set("botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept(value: Accept): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setActiveContextsVarargs(value: ActiveContext*): Self = this.set("activeContexts", js.Array(value :_*))
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsList): Self = this.set("activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveContexts: Self = this.set("activeContexts", js.undefined)
    
    @scala.inline
    def setDialogAction(value: DialogAction): Self = this.set("dialogAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogAction: Self = this.set("dialogAction", js.undefined)
    
    @scala.inline
    def setRecentIntentSummaryViewVarargs(value: IntentSummary*): Self = this.set("recentIntentSummaryView", js.Array(value :_*))
    
    @scala.inline
    def setRecentIntentSummaryView(value: IntentSummaryList): Self = this.set("recentIntentSummaryView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentIntentSummaryView: Self = this.set("recentIntentSummaryView", js.undefined)
    
    @scala.inline
    def setSessionAttributes(value: StringMap): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAttributes: Self = this.set("sessionAttributes", js.undefined)
  }
}
