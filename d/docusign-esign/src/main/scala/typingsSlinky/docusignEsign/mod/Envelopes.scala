package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Envelopes extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var accessControlListBase64: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, users can add comments to the documents in the envelope. For example, if a signer has a question about the text in the document,
    * they can add a comment to the document.
    */
  var allowComments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Document Markup feature is enabled.
    *
    * **Note**:  To use this feature, Document Markup must be enabled at both the account and envelope levels. Only Admin users can change this setting for at the account level.
    */
  var allowMarkup: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the recipient can redirect an envelope to a more appropriate recipient.
    */
  var allowReassign: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, recipients can view the history of the envelope.
    */
  var allowViewHistory: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. This feature has been replaced by signing groups.
    */
  var anySigner: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the envelope is queued for processing and the value of the `status` property is set to `Processing`. Additionally, GET status calls return
    * `Processing` until completed.
    *
    *
    * **Note**: A `transactionId` is required for this call to work correctly. When the envelope is created, the status is `Processing` and an `envelopeId`
    * is not returned in the response. To get the `envelopeId`, use a GET envelope query by using the
    * [transactionId](https://developers.docusign.com/esign-rest-api/reference/Envelopes/Envelopes/create/#envelopeDefinition) or by checking the Connect notification.
    */
  var asynchronous: js.UndefOr[String] = js.native
  
  /**
    * Contains a URL for retrieving the attachments that are associated with the envelope.
    */
  var attachmentsUri: js.UndefOr[String] = js.native
  
  /**
    * When **true**, marks all of the documents in the envelope as authoritative copies.
    *
    * **Note**: You can override this value for a specific document. For example, you can set the `authoritativeCopy` property to **true** at the envelope level,
    * but turn it off for a single document by setting the `authoritativeCopy` property for the document to **false**.
    */
  var authoritativeCopy: js.UndefOr[String] = js.native
  
  /**
    * The default `authoritativeCopy` setting for documents in this envelope that do not have `authoritativeCopy` set.
    * If this property is not set, each document defaults to the envelope's `authoritativeCopy`.
    */
  var authoritativeCopyDefault: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, autonavigation is set for the recipient.
    *
    */
  var autoNavigation: js.UndefOr[String] = js.native
  
  /**
    * The id of the brand.
    */
  var brandId: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `brandId` for the envelope is locked and senders cannot change the brand used for the envelope.
    */
  var brandLock: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving certificate information.
    */
  var certificateUri: js.UndefOr[String] = js.native
  
  /**
    * Specifies the date and time this item was completed.
    */
  var completedDateTime: js.UndefOr[String] = js.native
  
  var copyRecipientData: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status
    * but otherwise not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[
    /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators
    to group and manage envelopes.  */ AccountCustomFields
  ] = js.native
  
  /**
    * The URI for retrieving custom fields.
    */
  var customFieldsUri: js.UndefOr[String] = js.native
  
  /**
    * The date and time the recipient declined the document. Read only.
    */
  var declinedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deletedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was delivered to the recipient. Read only.
    */
  var deliveredDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, responsive documents are disabled for the envelope.
    */
  var disableResponsiveDocument: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving all of the documents associated with the envelope as a single PDF file.
    */
  var documentsCombinedUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving all of the documents associated with the envelope as separate files.
    */
  var documentsUri: js.UndefOr[String] = js.native
  
  /**
    * This is the same as the email body. If specified it is included in the email body for all envelope recipients.
    */
  var emailBlurb: js.UndefOr[String] = js.native
  
  /**
    * A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply
    * To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent.
    *
    * When the emailSettings information is used for an envelope, it only applies to that envelope.
    *
    * **IMPORTANT**: The `emailSettings` information is not returned in the GET method for envelope status. Use GET /email_settings to return information about the email settings.
    */
  var emailSettings: js.UndefOr[EmailSettings] = js.native
  
  /**
    * The subject line of the email message that is sent to all recipients.
    *
    * For information about adding merge field information to the email subject, see [Template Email Subject Merge
    * Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer is allowed to print the document and sign it on paper.
    */
  var enableWetSign: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, signers can only view the documents on which they have tabs. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or
    * informational role (Certified Deliveries or Carbon Copies) can always see all of the documents in an envelope, unless they are specifically excluded by using
    * this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded by using this
    * setting when an envelope is sent.
    *
    * **Note**: To use this functionality, [Document Visibility][docviz] must be enabled for the account by making the account setting `allowDocumentVisibility` **true**.
    *
    * [docviz]: /esign/restapi/Envelopes/EnvelopeDocumentVisibility
    */
  var enforceSignerVisibility: js.UndefOr[String] = js.native
  
  /**
    * An array of attachment objects that provide information about the attachments that are associated with the envelope.
    */
  var envelopeAttachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.native
  
  /**
    * An array containing information about the documents that are included in the envelope.
    */
  var envelopeDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.native
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, [Envelope ID Stamping](https://support.docusign.com/en/guides/ndse-user-guide-set-advanced-document-options) is enabled.
    * After a document or attachment is stamped with an Envelope ID,
    * the ID is seen by all recipients
    * and becomes a permanent part of the document
    * and cannot be removed.
    */
  var envelopeIdStamping: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var envelopeLocation: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `envelope` property is editable.
    *
    */
  var envelopeMetadata: js.UndefOr[EnvelopeMetadata] = js.native
  
  /**
    * The URI for retrieving the envelope or envelopes.
    */
  var envelopeUri: js.UndefOr[String] = js.native
  
  /**
    * An integer specifying the number of days that a sent envelope remains active before it expires. A negative number in a response indicates that the envelope has already expired.
    */
  var expireAfter: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope is set to expire.
    */
  var expireDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the envelope expires (is no longer available for signing) after the specified number of days after it is sent (`sentDateTime`).
    * Set  `expireAfter` to set the number of days until an envelope expires. When **false**, the account default setting is used.
    * If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
    */
  var expireEnabled: js.UndefOr[String] = js.native
  
  /**
    * May contain an external identifier for the envelope.
    */
  var externalEnvelopeId: js.UndefOr[String] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * When set to **true**, indicates that users have added comments to the envelope.
    */
  var hasComments: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the `EnvelopeFormData` associated with any forms in the envelope has changed.
    */
  var hasFormDataChanged: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that a .wav file used for voice authentication is included in the envelope.
    */
  var hasWavFile: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var holder: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope was initially sent.
    */
  var initialSentDateTime: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the envelope is a dynamic envelope.
    */
  var isDynamicEnvelope: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the envelope is a signature-provided envelope.
    */
  var isSignatureProviderEnvelope: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Provides lock information about an envelope that a user has locked.
    */
  var lockInformation: js.UndefOr[/* This section provides information about envelope locks. */ EnvelopeLocks] = js.native
  
  /**
    * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.
    *
    * Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.
    *
    * However, if the `messageLock` node is set to **true** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
    */
  var messageLock: js.UndefOr[String] = js.native
  
  /**
    * A complex element that specifies the notification options for the envelope. It consists of:
    *
    * * useAccountDefaults - When set to **true**, the account default notification settings are used for the envelope.
    * * reminders - A complex element that specifies reminder settings for the envelope. It consists of:
    *
    *    * reminderEnabled - When set to **true**, a reminder message is sent to the recipient.
    *    * reminderDelay - An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.
    *    * reminderFrequency - An interger that sets the interval, in days, between reminder emails.
    *
    * * expirations - A complex element that specifies the expiration settings for the envelope. It consists of:
    *
    *    * expireEnabled - When set to **true**, the envelope expires (is no longer available for signing) in the set number of days.
    * If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
    *    * expireAfter - An integer that sets the number of days the envelope is active.
    *    * expireWarn - An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero),
    * no warning email is sent.
    *
    */
  var notification: js.UndefOr[
    /* A complex element that specifies the notification settings for the envelope. */ Notification
  ] = js.native
  
  /**
    * The URI for retrieving notifications.
    */
  var notificationUri: js.UndefOr[String] = js.native
  
  /**
    * Information about any PowerForms that are included in the envelope.
    */
  var powerForm: js.UndefOr[/* Contains details about a PowerForm. */ PowerForm] = js.native
  
  /**
    * The date that a purge was completed.
    */
  var purgeCompletedDate: js.UndefOr[String] = js.native
  
  /**
    * The date that a purge was requested.
    */
  var purgeRequestDate: js.UndefOr[String] = js.native
  
  /**
    * Shows the current purge state for the envelope. The possible values are:
    *
    * * `unpurged`: There has been no successful request to purge documents.
    * * `documents_queued`: The envelope documents have been added to the purge queue, but have not been purged.
    * * `documents_dequeued`: The envelope documents have been taken out of the purge queue.
    * * `documents_and_metadata_queued`: The envelope documents and metadata have been added to the purge queue, but have not yet been purged.
    * * `documents_purged`: The envelope documents have been successfully purged.
    * * `documents_and_metadata_purged`: The envelope documents and metadata have been successfully purged.
    *
    *
    */
  var purgeState: js.UndefOr[String] = js.native
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.native
  
  /**
    * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
    */
  var recipientsLock: js.UndefOr[String] = js.native
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve the recipients.
    */
  var recipientsUri: js.UndefOr[String] = js.native
  
  /**
    * Information about the sender of the envelope.
    */
  var sender: js.UndefOr[UserInfo] = js.native
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, recipients can sign on a mobile device.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanSignOnMobile: js.UndefOr[String] = js.native
  
  /**
    * Specifies the physical location where the signing takes place. It can have two enumeration values; `inPerson` and `online`. The default value is `online`.
    */
  var signingLocation: js.UndefOr[String] = js.native
  
  /**
    * Indicates the envelope status. Valid values are:
    *
    * * `completed`: The envelope has been completed and all tags have been signed.
    * * `created`: The envelope is created as a draft. It can be modified and sent later.
    * * `declined`: The envelope has been declined by the recipients.
    * * `delivered`: The envelope has been delivered to the recipients.
    * * `sent`: The envelope is sent to the recipients.
    * * `signed`: The envelope has been signed by the recipients.
    * * `voided`: The envelope is no longer valid and recipients cannot access or sign the envelope.
    *
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The data and time that the status changed.
    */
  var statusChangedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The DateTime that the envelope changed status (i.e. was created or sent.)
    */
  var statusDateTime: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the templates.
    */
  var templatesUri: js.UndefOr[String] = js.native
  
  /**
    *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days.
    * It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times.
    * The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet
    * connection was lost before the envelope status was returned.
    */
  var transactionId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting.
    * When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.
    *
    * If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not
    * returned in responses when getting envelope information.
    */
  var useDisclosure: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope or template was voided.
    */
  var voidedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The reason the envelope or template was voided.
    */
  var voidedReason: js.UndefOr[String] = js.native
}
object Envelopes {
  
  @scala.inline
  def apply(): Envelopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Envelopes]
  }
  
  @scala.inline
  implicit class EnvelopesOps[Self <: Envelopes] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListBase64(value: String): Self = this.set("accessControlListBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlListBase64: Self = this.set("accessControlListBase64", js.undefined)
    
    @scala.inline
    def setAllowComments(value: String): Self = this.set("allowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowComments: Self = this.set("allowComments", js.undefined)
    
    @scala.inline
    def setAllowMarkup(value: String): Self = this.set("allowMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMarkup: Self = this.set("allowMarkup", js.undefined)
    
    @scala.inline
    def setAllowReassign(value: String): Self = this.set("allowReassign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReassign: Self = this.set("allowReassign", js.undefined)
    
    @scala.inline
    def setAllowViewHistory(value: String): Self = this.set("allowViewHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowViewHistory: Self = this.set("allowViewHistory", js.undefined)
    
    @scala.inline
    def setAnySigner(value: String): Self = this.set("anySigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnySigner: Self = this.set("anySigner", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: String): Self = this.set("asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsynchronous: Self = this.set("asynchronous", js.undefined)
    
    @scala.inline
    def setAttachmentsUri(value: String): Self = this.set("attachmentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsUri: Self = this.set("attachmentsUri", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopy(value: String): Self = this.set("authoritativeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoritativeCopy: Self = this.set("authoritativeCopy", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopyDefault(value: String): Self = this.set("authoritativeCopyDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoritativeCopyDefault: Self = this.set("authoritativeCopyDefault", js.undefined)
    
    @scala.inline
    def setAutoNavigation(value: String): Self = this.set("autoNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavigation: Self = this.set("autoNavigation", js.undefined)
    
    @scala.inline
    def setBrandId(value: String): Self = this.set("brandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandId: Self = this.set("brandId", js.undefined)
    
    @scala.inline
    def setBrandLock(value: String): Self = this.set("brandLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandLock: Self = this.set("brandLock", js.undefined)
    
    @scala.inline
    def setCertificateUri(value: String): Self = this.set("certificateUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateUri: Self = this.set("certificateUri", js.undefined)
    
    @scala.inline
    def setCompletedDateTime(value: String): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    
    @scala.inline
    def setCopyRecipientData(value: String): Self = this.set("copyRecipientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyRecipientData: Self = this.set("copyRecipientData", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomFields(
      value: /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators
      to group and manage envelopes.  */ AccountCustomFields
    ): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsUri(value: String): Self = this.set("customFieldsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFieldsUri: Self = this.set("customFieldsUri", js.undefined)
    
    @scala.inline
    def setDeclinedDateTime(value: String): Self = this.set("declinedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclinedDateTime: Self = this.set("declinedDateTime", js.undefined)
    
    @scala.inline
    def setDeletedDateTime(value: String): Self = this.set("deletedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedDateTime: Self = this.set("deletedDateTime", js.undefined)
    
    @scala.inline
    def setDeliveredDateTime(value: String): Self = this.set("deliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveredDateTime: Self = this.set("deliveredDateTime", js.undefined)
    
    @scala.inline
    def setDisableResponsiveDocument(value: String): Self = this.set("disableResponsiveDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableResponsiveDocument: Self = this.set("disableResponsiveDocument", js.undefined)
    
    @scala.inline
    def setDocumentsCombinedUri(value: String): Self = this.set("documentsCombinedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentsCombinedUri: Self = this.set("documentsCombinedUri", js.undefined)
    
    @scala.inline
    def setDocumentsUri(value: String): Self = this.set("documentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentsUri: Self = this.set("documentsUri", js.undefined)
    
    @scala.inline
    def setEmailBlurb(value: String): Self = this.set("emailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailBlurb: Self = this.set("emailBlurb", js.undefined)
    
    @scala.inline
    def setEmailSettings(value: EmailSettings): Self = this.set("emailSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSettings: Self = this.set("emailSettings", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setEnableWetSign(value: String): Self = this.set("enableWetSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWetSign: Self = this.set("enableWetSign", js.undefined)
    
    @scala.inline
    def setEnforceSignerVisibility(value: String): Self = this.set("enforceSignerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceSignerVisibility: Self = this.set("enforceSignerVisibility", js.undefined)
    
    @scala.inline
    def setEnvelopeAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = this.set("envelopeAttachments", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = this.set("envelopeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeAttachments: Self = this.set("envelopeAttachments", js.undefined)
    
    @scala.inline
    def setEnvelopeDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = this.set("envelopeDocuments", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = this.set("envelopeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeDocuments: Self = this.set("envelopeDocuments", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeIdStamping(value: String): Self = this.set("envelopeIdStamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIdStamping: Self = this.set("envelopeIdStamping", js.undefined)
    
    @scala.inline
    def setEnvelopeLocation(value: String): Self = this.set("envelopeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeLocation: Self = this.set("envelopeLocation", js.undefined)
    
    @scala.inline
    def setEnvelopeMetadata(value: EnvelopeMetadata): Self = this.set("envelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeMetadata: Self = this.set("envelopeMetadata", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = this.set("envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeUri: Self = this.set("envelopeUri", js.undefined)
    
    @scala.inline
    def setExpireAfter(value: String): Self = this.set("expireAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfter: Self = this.set("expireAfter", js.undefined)
    
    @scala.inline
    def setExpireDateTime(value: String): Self = this.set("expireDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireDateTime: Self = this.set("expireDateTime", js.undefined)
    
    @scala.inline
    def setExpireEnabled(value: String): Self = this.set("expireEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireEnabled: Self = this.set("expireEnabled", js.undefined)
    
    @scala.inline
    def setExternalEnvelopeId(value: String): Self = this.set("externalEnvelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalEnvelopeId: Self = this.set("externalEnvelopeId", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setHasComments(value: String): Self = this.set("hasComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasComments: Self = this.set("hasComments", js.undefined)
    
    @scala.inline
    def setHasFormDataChanged(value: String): Self = this.set("hasFormDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFormDataChanged: Self = this.set("hasFormDataChanged", js.undefined)
    
    @scala.inline
    def setHasWavFile(value: String): Self = this.set("hasWavFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasWavFile: Self = this.set("hasWavFile", js.undefined)
    
    @scala.inline
    def setHolder(value: String): Self = this.set("holder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolder: Self = this.set("holder", js.undefined)
    
    @scala.inline
    def setInitialSentDateTime(value: String): Self = this.set("initialSentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSentDateTime: Self = this.set("initialSentDateTime", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = this.set("is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs21CFRPart11: Self = this.set("is21CFRPart11", js.undefined)
    
    @scala.inline
    def setIsDynamicEnvelope(value: String): Self = this.set("isDynamicEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDynamicEnvelope: Self = this.set("isDynamicEnvelope", js.undefined)
    
    @scala.inline
    def setIsSignatureProviderEnvelope(value: String): Self = this.set("isSignatureProviderEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSignatureProviderEnvelope: Self = this.set("isSignatureProviderEnvelope", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLockInformation(value: /* This section provides information about envelope locks. */ EnvelopeLocks): Self = this.set("lockInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockInformation: Self = this.set("lockInformation", js.undefined)
    
    @scala.inline
    def setMessageLock(value: String): Self = this.set("messageLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageLock: Self = this.set("messageLock", js.undefined)
    
    @scala.inline
    def setNotification(
      value: /* A complex element that specifies the notification settings for the envelope. */ Notification
    ): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setNotificationUri(value: String): Self = this.set("notificationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationUri: Self = this.set("notificationUri", js.undefined)
    
    @scala.inline
    def setPowerForm(value: /* Contains details about a PowerForm. */ PowerForm): Self = this.set("powerForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerForm: Self = this.set("powerForm", js.undefined)
    
    @scala.inline
    def setPurgeCompletedDate(value: String): Self = this.set("purgeCompletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeCompletedDate: Self = this.set("purgeCompletedDate", js.undefined)
    
    @scala.inline
    def setPurgeRequestDate(value: String): Self = this.set("purgeRequestDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeRequestDate: Self = this.set("purgeRequestDate", js.undefined)
    
    @scala.inline
    def setPurgeState(value: String): Self = this.set("purgeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeState: Self = this.set("purgeState", js.undefined)
    
    @scala.inline
    def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setRecipientsLock(value: String): Self = this.set("recipientsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientsLock: Self = this.set("recipientsLock", js.undefined)
    
    @scala.inline
    def setRecipientsUri(value: String): Self = this.set("recipientsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientsUri: Self = this.set("recipientsUri", js.undefined)
    
    @scala.inline
    def setSender(value: UserInfo): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    
    @scala.inline
    def setSignerCanSignOnMobile(value: String): Self = this.set("signerCanSignOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerCanSignOnMobile: Self = this.set("signerCanSignOnMobile", js.undefined)
    
    @scala.inline
    def setSigningLocation(value: String): Self = this.set("signingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningLocation: Self = this.set("signingLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusChangedDateTime(value: String): Self = this.set("statusChangedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusChangedDateTime: Self = this.set("statusChangedDateTime", js.undefined)
    
    @scala.inline
    def setStatusDateTime(value: String): Self = this.set("statusDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDateTime: Self = this.set("statusDateTime", js.undefined)
    
    @scala.inline
    def setTemplatesUri(value: String): Self = this.set("templatesUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatesUri: Self = this.set("templatesUri", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    
    @scala.inline
    def setUseDisclosure(value: String): Self = this.set("useDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDisclosure: Self = this.set("useDisclosure", js.undefined)
    
    @scala.inline
    def setVoidedDateTime(value: String): Self = this.set("voidedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedDateTime: Self = this.set("voidedDateTime", js.undefined)
    
    @scala.inline
    def setVoidedReason(value: String): Self = this.set("voidedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedReason: Self = this.set("voidedReason", js.undefined)
  }
}
