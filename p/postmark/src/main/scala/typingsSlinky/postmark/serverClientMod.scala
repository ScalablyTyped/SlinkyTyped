package typingsSlinky.postmark

import typingsSlinky.postmark.bounceMod.Bounce
import typingsSlinky.postmark.bounceMod.BounceActivationResponse
import typingsSlinky.postmark.bounceMod.BounceDump
import typingsSlinky.postmark.bounceMod.Bounces
import typingsSlinky.postmark.bounceMod.DeliveryStatistics
import typingsSlinky.postmark.callbackMod.Callback
import typingsSlinky.postmark.defaultResponseMod.DefaultResponse
import typingsSlinky.postmark.inboundMessageMod.InboundMessageDetails
import typingsSlinky.postmark.inboundMessageMod.InboundMessages
import typingsSlinky.postmark.inboundRuleMod.InboundRule
import typingsSlinky.postmark.inboundRuleMod.InboundRules
import typingsSlinky.postmark.messageMod.MessageSendingResponse
import typingsSlinky.postmark.messageStreamMod.MessageStream
import typingsSlinky.postmark.messageStreamMod.MessageStreamArchiveResponse
import typingsSlinky.postmark.messageStreamMod.MessageStreamUnarchiveResponse
import typingsSlinky.postmark.messageStreamMod.MessageStreams
import typingsSlinky.postmark.modelsMod.BounceFilteringParameters
import typingsSlinky.postmark.modelsMod.ClientOptions.Configuration
import typingsSlinky.postmark.modelsMod.CreateInboundRuleRequest
import typingsSlinky.postmark.modelsMod.CreateMessageStreamRequest
import typingsSlinky.postmark.modelsMod.CreateTemplateRequest
import typingsSlinky.postmark.modelsMod.CreateWebhookRequest
import typingsSlinky.postmark.modelsMod.FilteringParameters
import typingsSlinky.postmark.modelsMod.InboundMessagesFilteringParameters
import typingsSlinky.postmark.modelsMod.Message
import typingsSlinky.postmark.modelsMod.MessageStreamsFilteringParameters
import typingsSlinky.postmark.modelsMod.OutboundMessageClicksFilteringParameters
import typingsSlinky.postmark.modelsMod.OutboundMessageOpensFilteringParameters
import typingsSlinky.postmark.modelsMod.OutboundMessagesFilteringParameters
import typingsSlinky.postmark.modelsMod.StatisticsFilteringParameters
import typingsSlinky.postmark.modelsMod.TemplateFilteringParameters
import typingsSlinky.postmark.modelsMod.TemplateValidationOptions
import typingsSlinky.postmark.modelsMod.TemplatedMessage
import typingsSlinky.postmark.modelsMod.UpdateMessageStreamRequest
import typingsSlinky.postmark.modelsMod.UpdateServerRequest
import typingsSlinky.postmark.modelsMod.UpdateTemplateRequest
import typingsSlinky.postmark.modelsMod.UpdateWebhookRequest
import typingsSlinky.postmark.modelsMod.WebhookFilteringParameters
import typingsSlinky.postmark.outboundMessageClickMod.OutboundMessageClicks
import typingsSlinky.postmark.outboundMessageMod.OutboundMessageDetails
import typingsSlinky.postmark.outboundMessageMod.OutboundMessageDump
import typingsSlinky.postmark.outboundMessageMod.OutboundMessages
import typingsSlinky.postmark.outboundMessageOpenMod.OutboundMessageOpens
import typingsSlinky.postmark.serverMod.Server
import typingsSlinky.postmark.statsMod.BounceCounts
import typingsSlinky.postmark.statsMod.BrowserUsageCounts
import typingsSlinky.postmark.statsMod.ClickCounts
import typingsSlinky.postmark.statsMod.ClickLocationCounts
import typingsSlinky.postmark.statsMod.ClickPlaformUsageCounts
import typingsSlinky.postmark.statsMod.EmailClientUsageCounts
import typingsSlinky.postmark.statsMod.EmailPlaformUsageCounts
import typingsSlinky.postmark.statsMod.EmailReadTimesCounts
import typingsSlinky.postmark.statsMod.OpenCounts
import typingsSlinky.postmark.statsMod.OutboundStatistics
import typingsSlinky.postmark.statsMod.SentCounts
import typingsSlinky.postmark.statsMod.SpamCounts
import typingsSlinky.postmark.statsMod.TrackedEmailCounts
import typingsSlinky.postmark.suppressionMod.CreateSuppressionsRequest
import typingsSlinky.postmark.suppressionMod.DeleteSuppressionsRequest
import typingsSlinky.postmark.suppressionMod.SuppressionStatuses
import typingsSlinky.postmark.suppressionMod.Suppressions
import typingsSlinky.postmark.templateMod.Template
import typingsSlinky.postmark.templateMod.TemplateValidation
import typingsSlinky.postmark.templateMod.Templates
import typingsSlinky.postmark.webhookMod.Webhook
import typingsSlinky.postmark.webhooksMod.Webhooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverClientMod {
  
  @JSImport("postmark/dist/client/ServerClient", JSImport.Default)
  @js.native
  class default protected () extends ServerClient {
    /**
      * Create a client.
      *
      * @param serverToken - The token for the server that you wish to interact with.
      * @param configOptions - Options to customize the behavior of the this client.
      */
    def this(serverToken: String) = this()
    def this(serverToken: String, configOptions: Configuration) = this()
  }
  
  @js.native
  trait ServerClient
    extends typingsSlinky.postmark.baseClientMod.default {
    
    /**
      * Activate email address that was deactivated due to a Bounce.
      *
      * @param id - The ID of the Bounce for which you wish to activate the associated email.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def activateBounce(id: Double): js.Promise[BounceActivationResponse] = js.native
    def activateBounce(id: Double, callback: Callback[BounceActivationResponse]): js.Promise[BounceActivationResponse] = js.native
    
    /**
      * Archive a message stream on the associated server.
      *
      * @param options - Configuration options to be used when creating message stream on the server.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def archiveMessageStream(id: String): js.Promise[MessageStreamArchiveResponse] = js.native
    def archiveMessageStream(id: String, callback: Callback[MessageStreamArchiveResponse]): js.Promise[MessageStreamArchiveResponse] = js.native
    
    /**
      * Cause an Inbound Message to bypass filtering rules defined on this Client's associated Server.
      *
      * @param messageId - The ID of the Inbound Message for which you wish to bypass the filtering rules.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def bypassBlockedInboundMessage(messageId: String): js.Promise[DefaultResponse] = js.native
    def bypassBlockedInboundMessage(messageId: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Create an Inbound Rule Trigger.
      *
      * @param options - Configuration options to be used when creating this Trigger.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createInboundRuleTrigger(options: CreateInboundRuleRequest): js.Promise[InboundRule] = js.native
    def createInboundRuleTrigger(options: CreateInboundRuleRequest, callback: Callback[InboundRule]): js.Promise[InboundRule] = js.native
    
    /**
      * Create a message stream on the associated server.
      *
      * @param options - Configuration options to be used when creating message stream on the server.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createMessageStream(options: CreateMessageStreamRequest): js.Promise[MessageStream] = js.native
    def createMessageStream(options: CreateMessageStreamRequest, callback: Callback[MessageStream]): js.Promise[MessageStream] = js.native
    
    /**
      * Add email addresses to a suppressions list on a message stream on a server.
      *
      * @param messageStream - Select message stream
      * @param options - Suppressions you wish to add.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createSuppressions(messageStream: String, options: CreateSuppressionsRequest): js.Promise[SuppressionStatuses] = js.native
    def createSuppressions(messageStream: String, options: CreateSuppressionsRequest, callback: Callback[SuppressionStatuses]): js.Promise[SuppressionStatuses] = js.native
    
    /**
      * Create a new template on the associated server.
      *
      * @param options - Configuration options to be used to create the Template.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createTemplate(options: CreateTemplateRequest): js.Promise[Template] = js.native
    def createTemplate(options: CreateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    
    /**
      * Create a Webhook on the associated server.
      *
      * @param options - Configuration options to be used when creating Webhook trigger.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createWebhook(options: CreateWebhookRequest): js.Promise[Webhook] = js.native
    def createWebhook(options: CreateWebhookRequest, callback: Callback[Webhook]): js.Promise[Webhook] = js.native
    
    /**
      * Delete an Inbound Rule Trigger.
      *
      * @param id - The ID of the Inbound Rule Trigger you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteInboundRuleTrigger(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteInboundRuleTrigger(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Delete email addresses from a suppressions list on a message stream on a server.
      *
      * @param messageStream - Select message stream
      * @param options - Suppressions you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteSuppressions(messageStream: String, options: DeleteSuppressionsRequest): js.Promise[SuppressionStatuses] = js.native
    def deleteSuppressions(messageStream: String, options: DeleteSuppressionsRequest, callback: Callback[SuppressionStatuses]): js.Promise[SuppressionStatuses] = js.native
    
    def deleteTemplate(idOrAlias: String): js.Promise[DefaultResponse] = js.native
    def deleteTemplate(idOrAlias: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /**
      * Delete a template associated with this server.
      *
      * @param idOrAlias - ID or template alias you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteTemplate(idOrAlias: Double): js.Promise[DefaultResponse] = js.native
    def deleteTemplate(idOrAlias: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Delete an existing Webhook.
      *
      * @param id - The ID of the Webhook you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteWebhook(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteWebhook(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Update message stream on the associated server.
      *
      * @param id - Id of the webhook you wish to update.
      * @param options - Webhook options you wish to update.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editMessageStream(id: String, options: UpdateMessageStreamRequest): js.Promise[MessageStream] = js.native
    def editMessageStream(id: String, options: UpdateMessageStreamRequest, callback: Callback[MessageStream]): js.Promise[MessageStream] = js.native
    
    /**
      * Modify the Server associated with this Client.
      *
      * @param options - The options you wish to modify.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editServer(options: UpdateServerRequest): js.Promise[Server] = js.native
    def editServer(options: UpdateServerRequest, callback: Callback[Server]): js.Promise[Server] = js.native
    
    def editTemplate(idOrAlias: String, options: UpdateTemplateRequest): js.Promise[Template] = js.native
    def editTemplate(idOrAlias: String, options: UpdateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Update a template on the associated server.
      *
      * @param idOrAlias - Id or alias of the template you wish to update.
      * @param options - Template options you wish to update.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editTemplate(idOrAlias: Double, options: UpdateTemplateRequest): js.Promise[Template] = js.native
    def editTemplate(idOrAlias: Double, options: UpdateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    
    /**
      * Update Webhook on the associated server.
      *
      * @param id - Id of the webhook you wish to update.
      * @param options - Webhook options you wish to update.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editWebhook(id: Double, options: UpdateWebhookRequest): js.Promise[Webhook] = js.native
    def editWebhook(id: Double, options: UpdateWebhookRequest, callback: Callback[Webhook]): js.Promise[Webhook] = js.native
    
    /**
      * Get details for a specific Bounce.
      *
      * @param id - The ID of the Bounce you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounce(id: Double): js.Promise[Bounce] = js.native
    def getBounce(id: Double, callback: Callback[Bounce]): js.Promise[Bounce] = js.native
    
    /**
      * Get statistiscs on emails that bounced after being sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounceCounts(): js.Promise[BounceCounts] = js.native
    def getBounceCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[BounceCounts]): js.Promise[BounceCounts] = js.native
    def getBounceCounts(filter: StatisticsFilteringParameters): js.Promise[BounceCounts] = js.native
    def getBounceCounts(filter: StatisticsFilteringParameters, callback: Callback[BounceCounts]): js.Promise[BounceCounts] = js.native
    
    /**
      * Get a Bounce Dump for a specific Bounce.
      *
      * @param id - The ID of the Bounce for which you wish to retrieve Bounce Dump.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounceDump(id: Double): js.Promise[BounceDump] = js.native
    def getBounceDump(id: Double, callback: Callback[BounceDump]): js.Promise[BounceDump] = js.native
    
    /**
      * Get a batch of bounces.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounces(): js.Promise[Bounces] = js.native
    def getBounces(filter: js.UndefOr[scala.Nothing], callback: Callback[Bounces]): js.Promise[Bounces] = js.native
    def getBounces(filter: BounceFilteringParameters): js.Promise[Bounces] = js.native
    def getBounces(filter: BounceFilteringParameters, callback: Callback[Bounces]): js.Promise[Bounces] = js.native
    
    /**
      * Get browser family statistics for tracked links for messages sent from the Server associated with this Client.
      * @param filter Optional filtering parameters.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickBrowserUsage(): js.Promise[BrowserUsageCounts] = js.native
    def getClickBrowserUsage(filter: js.UndefOr[scala.Nothing], callback: Callback[BrowserUsageCounts]): js.Promise[BrowserUsageCounts] = js.native
    def getClickBrowserUsage(filter: StatisticsFilteringParameters): js.Promise[BrowserUsageCounts] = js.native
    def getClickBrowserUsage(filter: StatisticsFilteringParameters, callback: Callback[BrowserUsageCounts]): js.Promise[BrowserUsageCounts] = js.native
    
    /**
      * Get total clicks statistics for tracked links for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickCounts(): js.Promise[ClickCounts] = js.native
    def getClickCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[ClickCounts]): js.Promise[ClickCounts] = js.native
    def getClickCounts(filter: StatisticsFilteringParameters): js.Promise[ClickCounts] = js.native
    def getClickCounts(filter: StatisticsFilteringParameters, callback: Callback[ClickCounts]): js.Promise[ClickCounts] = js.native
    
    /**
      * Get click location (in HTML or Text body of the email) statistics for tracked links for messages sent
      * from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickLocation(): js.Promise[ClickLocationCounts] = js.native
    def getClickLocation(filter: js.UndefOr[scala.Nothing], callback: Callback[ClickLocationCounts]): js.Promise[ClickLocationCounts] = js.native
    def getClickLocation(filter: StatisticsFilteringParameters): js.Promise[ClickLocationCounts] = js.native
    def getClickLocation(filter: StatisticsFilteringParameters, callback: Callback[ClickLocationCounts]): js.Promise[ClickLocationCounts] = js.native
    
    /**
      * Get browser platform statistics for tracked links for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickPlatformUsage(): js.Promise[ClickPlaformUsageCounts] = js.native
    def getClickPlatformUsage(filter: js.UndefOr[scala.Nothing], callback: Callback[ClickPlaformUsageCounts]): js.Promise[ClickPlaformUsageCounts] = js.native
    def getClickPlatformUsage(filter: StatisticsFilteringParameters): js.Promise[ClickPlaformUsageCounts] = js.native
    def getClickPlatformUsage(filter: StatisticsFilteringParameters, callback: Callback[ClickPlaformUsageCounts]): js.Promise[ClickPlaformUsageCounts] = js.native
    
    /**
      * Get bounce statistic information for the associated Server.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getDeliveryStatistics(): js.Promise[DeliveryStatistics] = js.native
    def getDeliveryStatistics(callback: Callback[DeliveryStatistics]): js.Promise[DeliveryStatistics] = js.native
    
    /**
      * Get statistics on which Email Clients were used to open messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenClientUsage(): js.Promise[EmailClientUsageCounts] = js.native
    def getEmailOpenClientUsage(filter: js.UndefOr[scala.Nothing], callback: Callback[EmailClientUsageCounts]): js.Promise[EmailClientUsageCounts] = js.native
    def getEmailOpenClientUsage(filter: StatisticsFilteringParameters): js.Promise[EmailClientUsageCounts] = js.native
    def getEmailOpenClientUsage(filter: StatisticsFilteringParameters, callback: Callback[EmailClientUsageCounts]): js.Promise[EmailClientUsageCounts] = js.native
    
    /**
      * Get Open statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenCounts(): js.Promise[OpenCounts] = js.native
    def getEmailOpenCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[OpenCounts]): js.Promise[OpenCounts] = js.native
    def getEmailOpenCounts(filter: StatisticsFilteringParameters): js.Promise[OpenCounts] = js.native
    def getEmailOpenCounts(filter: StatisticsFilteringParameters, callback: Callback[OpenCounts]): js.Promise[OpenCounts] = js.native
    
    /**
      * Get Email Client Platform statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenPlatformUsage(): js.Promise[EmailPlaformUsageCounts] = js.native
    def getEmailOpenPlatformUsage(filter: js.UndefOr[scala.Nothing], callback: Callback[EmailPlaformUsageCounts]): js.Promise[EmailPlaformUsageCounts] = js.native
    def getEmailOpenPlatformUsage(filter: StatisticsFilteringParameters): js.Promise[EmailPlaformUsageCounts] = js.native
    def getEmailOpenPlatformUsage(filter: StatisticsFilteringParameters, callback: Callback[EmailPlaformUsageCounts]): js.Promise[EmailPlaformUsageCounts] = js.native
    
    /**
      * Get Read Time statistics for messages sent from the Server associated with this Client.
      * @param filter Optional filtering parameters.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenReadTimes(): js.Promise[EmailReadTimesCounts] = js.native
    def getEmailOpenReadTimes(filter: js.UndefOr[scala.Nothing], callback: Callback[EmailReadTimesCounts]): js.Promise[EmailReadTimesCounts] = js.native
    def getEmailOpenReadTimes(filter: StatisticsFilteringParameters): js.Promise[EmailReadTimesCounts] = js.native
    def getEmailOpenReadTimes(filter: StatisticsFilteringParameters, callback: Callback[EmailReadTimesCounts]): js.Promise[EmailReadTimesCounts] = js.native
    
    /**
      * Get details for a specific Inbound Message.
      *
      * @param messageId - The ID of the Inbound Message you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundMessageDetails(messageId: String): js.Promise[InboundMessageDetails] = js.native
    def getInboundMessageDetails(messageId: String, callback: Callback[InboundMessageDetails]): js.Promise[InboundMessageDetails] = js.native
    
    /**
      * Get a batch of Inbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundMessages(): js.Promise[InboundMessages] = js.native
    def getInboundMessages(filter: js.UndefOr[scala.Nothing], callback: Callback[InboundMessages]): js.Promise[InboundMessages] = js.native
    def getInboundMessages(filter: InboundMessagesFilteringParameters): js.Promise[InboundMessages] = js.native
    def getInboundMessages(filter: InboundMessagesFilteringParameters, callback: Callback[InboundMessages]): js.Promise[InboundMessages] = js.native
    
    /**
      * Get a list of Inbound Rule Triggers.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundRuleTriggers(): js.Promise[InboundRules] = js.native
    def getInboundRuleTriggers(filter: js.UndefOr[scala.Nothing], callback: Callback[InboundRules]): js.Promise[InboundRules] = js.native
    def getInboundRuleTriggers(filter: FilteringParameters): js.Promise[InboundRules] = js.native
    def getInboundRuleTriggers(filter: FilteringParameters, callback: Callback[InboundRules]): js.Promise[InboundRules] = js.native
    
    /**
      * Get the Clicks for Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageClicks(): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicks(filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundMessageClicks]): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicks(filter: OutboundMessageClicksFilteringParameters): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicks(filter: OutboundMessageClicksFilteringParameters, callback: Callback[OutboundMessageClicks]): js.Promise[OutboundMessageClicks] = js.native
    
    /**
      * Get Click information for a single Outbound Message.
      *
      * @param messageId - The MessageID for which clicks should be retrieved.
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageClicksForSingleMessage(messageId: String): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicksForSingleMessage(messageId: String, filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundMessageClicks]): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicksForSingleMessage(messageId: String, filter: OutboundMessageClicksFilteringParameters): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicksForSingleMessage(
      messageId: String,
      filter: OutboundMessageClicksFilteringParameters,
      callback: Callback[OutboundMessageClicks]
    ): js.Promise[OutboundMessageClicks] = js.native
    
    /**
      * Get the Opens for Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageOpens(): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpens(filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundMessageOpens]): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpens(filter: OutboundMessageOpensFilteringParameters): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpens(filter: OutboundMessageOpensFilteringParameters, callback: Callback[OutboundMessageOpens]): js.Promise[OutboundMessageOpens] = js.native
    
    /**
      * Get details of Opens for specific Outbound Message.
      *
      * @param messageId - Message ID of the message for which you wish to retrieve Opens.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageOpensForSingleMessage(messageId: String): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpensForSingleMessage(messageId: String, filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundMessageOpens]): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpensForSingleMessage(messageId: String, filter: OutboundMessageOpensFilteringParameters): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpensForSingleMessage(
      messageId: String,
      filter: OutboundMessageOpensFilteringParameters,
      callback: Callback[OutboundMessageOpens]
    ): js.Promise[OutboundMessageOpens] = js.native
    
    /**
      * Get details for a specific message stream on a server.
      *
      * @param id - The ID of the message stream you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageStream(id: String): js.Promise[MessageStream] = js.native
    def getMessageStream(id: String, callback: Callback[MessageStream]): js.Promise[MessageStream] = js.native
    
    /**
      * Get the list of message streams on a server.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageStreams(): js.Promise[MessageStreams] = js.native
    def getMessageStreams(filter: js.UndefOr[scala.Nothing], callback: Callback[MessageStreams]): js.Promise[MessageStreams] = js.native
    def getMessageStreams(filter: MessageStreamsFilteringParameters): js.Promise[MessageStreams] = js.native
    def getMessageStreams(filter: MessageStreamsFilteringParameters, callback: Callback[MessageStreams]): js.Promise[MessageStreams] = js.native
    
    /**
      * Get details for a specific Outbound Message.
      *
      * @param messageId - The ID of the OutboundMessage you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessageDetails(messageId: String): js.Promise[OutboundMessageDetails] = js.native
    def getOutboundMessageDetails(messageId: String, callback: Callback[OutboundMessageDetails]): js.Promise[OutboundMessageDetails] = js.native
    
    /**
      * Get details for a specific Outbound Message.
      *
      * @param messageId - The ID of the OutboundMessage you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessageDump(messageId: String): js.Promise[OutboundMessageDump] = js.native
    def getOutboundMessageDump(messageId: String, callback: Callback[OutboundMessageDump]): js.Promise[OutboundMessageDump] = js.native
    
    /**
      * Get a batch of Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessages(): js.Promise[OutboundMessages] = js.native
    def getOutboundMessages(filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundMessages]): js.Promise[OutboundMessages] = js.native
    def getOutboundMessages(filter: OutboundMessagesFilteringParameters): js.Promise[OutboundMessages] = js.native
    def getOutboundMessages(filter: OutboundMessagesFilteringParameters, callback: Callback[OutboundMessages]): js.Promise[OutboundMessages] = js.native
    
    /**
      * Get overview statistics on Outbound Messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundOverview(): js.Promise[OutboundStatistics] = js.native
    def getOutboundOverview(filter: js.UndefOr[scala.Nothing], callback: Callback[OutboundStatistics]): js.Promise[OutboundStatistics] = js.native
    def getOutboundOverview(filter: StatisticsFilteringParameters): js.Promise[OutboundStatistics] = js.native
    def getOutboundOverview(filter: StatisticsFilteringParameters, callback: Callback[OutboundStatistics]): js.Promise[OutboundStatistics] = js.native
    
    /**
      * Get statistics on email sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSentCounts(): js.Promise[SentCounts] = js.native
    def getSentCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[SentCounts]): js.Promise[SentCounts] = js.native
    def getSentCounts(filter: StatisticsFilteringParameters): js.Promise[SentCounts] = js.native
    def getSentCounts(filter: StatisticsFilteringParameters, callback: Callback[SentCounts]): js.Promise[SentCounts] = js.native
    
    /**
      * Get the information for the Server associated with this Client.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getServer(): js.Promise[Server] = js.native
    def getServer(callback: Callback[Server]): js.Promise[Server] = js.native
    
    /**
      * Get SPAM complaint statistics for email sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSpamComplaintsCounts(): js.Promise[SpamCounts] = js.native
    def getSpamComplaintsCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[SpamCounts]): js.Promise[SpamCounts] = js.native
    def getSpamComplaintsCounts(filter: StatisticsFilteringParameters): js.Promise[SpamCounts] = js.native
    def getSpamComplaintsCounts(filter: StatisticsFilteringParameters, callback: Callback[SpamCounts]): js.Promise[SpamCounts] = js.native
    
    /**
      * Get the list of suppressions for a message stream on a server.
      *
      * @param messageStream - Select message stream
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSuppressions(messageStream: String): js.Promise[Suppressions] = js.native
    def getSuppressions(messageStream: String, callback: Callback[Suppressions]): js.Promise[Suppressions] = js.native
    
    def getTemplate(idOrAlias: String): js.Promise[Template] = js.native
    def getTemplate(idOrAlias: String, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Get the a specific template associated with this server.
      *
      * @param idOrAlias - ID or alias for the template you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTemplate(idOrAlias: Double): js.Promise[Template] = js.native
    def getTemplate(idOrAlias: Double, callback: Callback[Template]): js.Promise[Template] = js.native
    
    /**
      * Get the list of templates associated with this server.
      *
      * @param filter - Optional filtering options.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTemplates(): js.Promise[Templates] = js.native
    def getTemplates(filter: js.UndefOr[scala.Nothing], callback: Callback[Templates]): js.Promise[Templates] = js.native
    def getTemplates(filter: TemplateFilteringParameters): js.Promise[Templates] = js.native
    def getTemplates(filter: TemplateFilteringParameters, callback: Callback[Templates]): js.Promise[Templates] = js.native
    
    /**
      * Get email tracking statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTrackedEmailCounts(): js.Promise[TrackedEmailCounts] = js.native
    def getTrackedEmailCounts(filter: js.UndefOr[scala.Nothing], callback: Callback[TrackedEmailCounts]): js.Promise[TrackedEmailCounts] = js.native
    def getTrackedEmailCounts(filter: StatisticsFilteringParameters): js.Promise[TrackedEmailCounts] = js.native
    def getTrackedEmailCounts(filter: StatisticsFilteringParameters, callback: Callback[TrackedEmailCounts]): js.Promise[TrackedEmailCounts] = js.native
    
    /**
      * Get details for a specific Webhook.
      *
      * @param id - The ID of the Webhook you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getWebhook(id: Double): js.Promise[Webhook] = js.native
    def getWebhook(id: Double, callback: Callback[Webhook]): js.Promise[Webhook] = js.native
    
    /**
      * Get the list of Webhooks for specific server.
      *
      * @param filter - Optional filtering parameters
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getWebhooks(): js.Promise[Webhooks] = js.native
    def getWebhooks(filter: js.UndefOr[scala.Nothing], callback: Callback[Webhooks]): js.Promise[Webhooks] = js.native
    def getWebhooks(filter: WebhookFilteringParameters): js.Promise[Webhooks] = js.native
    def getWebhooks(filter: WebhookFilteringParameters, callback: Callback[Webhooks]): js.Promise[Webhooks] = js.native
    
    /**
      * Request that Postmark retry POSTing to the Inbound Hook for the specified message.
      *
      * @param messageId - The ID of the Inbound Message for which you wish to retry the inbound hook.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def retryInboundHookForMessage(messageId: String): js.Promise[DefaultResponse] = js.native
    def retryInboundHookForMessage(messageId: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /** Send a single email message.
      *
      * @param email - Email message to send.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmail(email: Message): js.Promise[MessageSendingResponse] = js.native
    def sendEmail(email: Message, callback: Callback[MessageSendingResponse]): js.Promise[MessageSendingResponse] = js.native
    
    /**
      * Send a batch of email messages.
      *
      * @param emails - An array of messages to send.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailBatch(emails: js.Array[Message]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    def sendEmailBatch(emails: js.Array[Message], callback: Callback[js.Array[MessageSendingResponse]]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    
    /**
      * Send a batch of template email messages.
      *
      * @param templates - An array of templated messages you wish to send using this Client.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailBatchWithTemplates(templates: js.Array[TemplatedMessage]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    def sendEmailBatchWithTemplates(templates: js.Array[TemplatedMessage], callback: Callback[js.Array[MessageSendingResponse]]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    
    /**
      * Send a message using a template.
      *
      * @param template - Message you wish to send.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailWithTemplate(template: TemplatedMessage): js.Promise[MessageSendingResponse] = js.native
    def sendEmailWithTemplate(template: TemplatedMessage, callback: Callback[MessageSendingResponse]): js.Promise[MessageSendingResponse] = js.native
    
    /**
      * Unrchive a message stream on the associated server.
      *
      * @param options - Configuration options to be used when creating message stream on the server.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def unarchiveMessageStream(id: String): js.Promise[MessageStreamUnarchiveResponse] = js.native
    def unarchiveMessageStream(id: String, callback: Callback[MessageStreamUnarchiveResponse]): js.Promise[MessageStreamUnarchiveResponse] = js.native
    
    /**
      * Validate template markup to verify that it will be parsed. Also provides a recommended template
      * model to be used when sending using the specified template content.
      *
      * @param options - The template content you wish to validate.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def validateTemplate(options: TemplateValidationOptions): js.Promise[TemplateValidation] = js.native
    def validateTemplate(options: TemplateValidationOptions, callback: Callback[TemplateValidation]): js.Promise[TemplateValidation] = js.native
  }
}
