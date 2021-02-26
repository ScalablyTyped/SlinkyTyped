package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SealSign extends StObject {
  
  /**
    * Not applicable.
    */
  var accessCode: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var accessCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var addAccessCodeToEmail: js.UndefOr[String] = js.native
  
  var allowSystemOverrideForLockedRecipient: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var clientUserId: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var completedCount: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var customFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Not applicable.
    */
  var declinedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var declinedReason: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var deliveredDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethod: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethodMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var designatorId: js.UndefOr[String] = js.native
  
  var designatorIdGuid: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
  
  /**
    * Not applicable.
    */
  var emailNotification: js.UndefOr[RecipientEmailNotification] = js.native
  
  /**
    * Not applicable.
    */
  var embeddedRecipientStartURL: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumber: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckConfigurationName: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckConfigurationNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckInformationInput: js.UndefOr[
    /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
  ] = js.native
  
  /**
    * Not applicable.
    */
  var inheritEmailNotificationConfiguration: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientPhoneAuthEditable: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientSmsEditable: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var noteMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.native
  
  /**
    * Not applicable.
    */
  var recipientAttachments: js.UndefOr[js.Array[RecipientAttachment]] = js.native
  
  /**
    * Not applicable.
    */
  var recipientAuthenticationStatus: js.UndefOr[
    /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
  ] = js.native
  
  /**
    * Metadata about the features that are supported for the recipient type. Read only.
    */
  var recipientFeatureMetadata: js.UndefOr[js.Array[FeatureAvailableMetadata]] = js.native
  
  /**
    * (Required) The `recipientId` used when the envelope or template was created.
    *
    * This is a local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * (Required) Indicates which electronic seal to apply on documents when creating an envelope.
    */
  var recipientSignatureProviders: js.UndefOr[js.Array[RecipientSignatureProvider]] = js.native
  
  /**
    * The recipient type, as specified by the following values:
    * - `agent`: Agent recipients can add name and email information for recipients that appear after the agent in routing order.
    * - `carbonCopy`: Carbon copy recipients get a copy of the envelope but don't need to sign, initial, date, or add information to any of the documents.
    * This type of recipient can be used in any routing order.
    * - `certifiedDelivery`: Certified delivery recipients must receive the completed documents for the envelope to be completed. They don't need to sign, initial,
    * date, or add information to any of the documents.
    * - `editor`: Editors have the same management and access rights for the envelope as the sender. Editors can add name and email information, add or change the
    * routing order, set authentication options, and can edit signature/initial tabs and data fields for the remaining recipients.
    * - `inPersonSigner`: In-person recipients are DocuSign users who act as signing hosts in the same physical location as the signer.
    * - `intermediaries`: Intermediary recipients can optionally add name and email information for recipients at the same or subsequent level in the routing order.
    * - `seal`: Electronic seal recipients represent legal entities.
    * - `signer`: Signers are recipients who must sign, initial, date, or add data to form fields on the documents in the envelope.
    * - `witness`: Witnesses are recipients whose signatures affirm that the identified signers have signed the documents in the envelope.
    */
  var recipientType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientType` property is editable. Read only.
    */
  var recipientTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var requireIdLookup: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var requireIdLookupMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Optional element. Specifies the role name associated with the recipient.<br/><br/>This property is required when you are working with template recipients.
    */
  var roleName: js.UndefOr[String] = js.native
  
  /**
    * (Optional, default: 1)
    * Specifies the routing order of the electronic seal in the envelope.
    * The routing order assigned to your electronic seal cannot be shared with another recipient.
    * It is recommended that you set a routing order for your electronic seals.
    *
    */
  var routingOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `routingOrder` property is editable. Read only.
    */
  var routingOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var signedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var smsAuthentication: js.UndefOr[RecipientSMSAuthentication] = js.native
  
  /**
    * Deprecated.
    */
  var socialAuthentications: js.UndefOr[js.Array[SocialAuthentication]] = js.native
  
  /**
    * The recipient's status. Read only.
    *
    * Possible values:
    *
    * - `autoresponded`: The recipient's email system auto-responded to the email from DocuSign. This status is used in the web console to inform senders
    * about the bounced-back email. This recipient status is only used if **Send-on-behalf-of** is turned off for the account.
    * - `completed`: The recipient has completed their actions (signing or other required actions if not a signer) for an envelope.
    * - `created`: The recipient is in a draft state. This value is only associated with draft envelopes (envelopes that have a status of `created`).
    * - `declined`: The recipient declined to sign the document(s) in the envelope.
    * - `delivered`: The recipient has viewed the document(s) in an envelope through the DocuSign signing website. This is not an email delivery of the documents in an envelope.
    * - `faxPending`: The recipient has finished signing and the system is waiting for a fax attachment from the recipient before completing their signing step.
    * - `sent`: The recipient has been sent an email notification that it is their turn to sign an envelope.
    * - `signed`: The recipient has completed (signed) all required tags in an envelope. This is a temporary state during processing,
    * after which the recipient's status automatically switches to `completed`.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The code associated with the recipient's status. Read only.
    */
  var statusCode: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var suppressEmails: js.UndefOr[String] = js.native
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var totalTabCount: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var userId: js.UndefOr[String] = js.native
}
object SealSign {
  
  @scala.inline
  def apply(): SealSign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SealSign]
  }
  
  @scala.inline
  implicit class SealSignMutableBuilder[Self <: SealSign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "accessCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeMetadataUndefined: Self = StObject.set(x, "accessCodeMetadata", js.undefined)
    
    @scala.inline
    def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
    
    @scala.inline
    def setAddAccessCodeToEmail(value: String): Self = StObject.set(x, "addAccessCodeToEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAccessCodeToEmailUndefined: Self = StObject.set(x, "addAccessCodeToEmail", js.undefined)
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipient(value: String): Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipientUndefined: Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: String): Self = StObject.set(x, "completedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedCountUndefined: Self = StObject.set(x, "completedCount", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Array[String]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: String*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDeclinedDateTime(value: String): Self = StObject.set(x, "declinedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedDateTimeUndefined: Self = StObject.set(x, "declinedDateTime", js.undefined)
    
    @scala.inline
    def setDeclinedReason(value: String): Self = StObject.set(x, "declinedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedReasonUndefined: Self = StObject.set(x, "declinedReason", js.undefined)
    
    @scala.inline
    def setDeliveredDateTime(value: String): Self = StObject.set(x, "deliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveredDateTimeUndefined: Self = StObject.set(x, "deliveredDateTime", js.undefined)
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = StObject.set(x, "deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "deliveryMethodMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodMetadataUndefined: Self = StObject.set(x, "deliveryMethodMetadata", js.undefined)
    
    @scala.inline
    def setDeliveryMethodUndefined: Self = StObject.set(x, "deliveryMethod", js.undefined)
    
    @scala.inline
    def setDesignatorId(value: String): Self = StObject.set(x, "designatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignatorIdGuid(value: String): Self = StObject.set(x, "designatorIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignatorIdGuidUndefined: Self = StObject.set(x, "designatorIdGuid", js.undefined)
    
    @scala.inline
    def setDesignatorIdUndefined: Self = StObject.set(x, "designatorId", js.undefined)
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = StObject.set(x, "documentVisibility", js.Array(value :_*))
    
    @scala.inline
    def setEmailNotification(value: RecipientEmailNotification): Self = StObject.set(x, "emailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationUndefined: Self = StObject.set(x, "emailNotification", js.undefined)
    
    @scala.inline
    def setEmbeddedRecipientStartURL(value: String): Self = StObject.set(x, "embeddedRecipientStartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedRecipientStartURLUndefined: Self = StObject.set(x, "embeddedRecipientStartURL", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "faxNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberMetadataUndefined: Self = StObject.set(x, "faxNumberMetadata", js.undefined)
    
    @scala.inline
    def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationName(value: String): Self = StObject.set(x, "idCheckConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckConfigurationNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "idCheckConfigurationNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckConfigurationNameMetadataUndefined: Self = StObject.set(x, "idCheckConfigurationNameMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationNameUndefined: Self = StObject.set(x, "idCheckConfigurationName", js.undefined)
    
    @scala.inline
    def setIdCheckInformationInput(
      value: /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
    ): Self = StObject.set(x, "idCheckInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckInformationInputUndefined: Self = StObject.set(x, "idCheckInformationInput", js.undefined)
    
    @scala.inline
    def setInheritEmailNotificationConfiguration(value: String): Self = StObject.set(x, "inheritEmailNotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritEmailNotificationConfigurationUndefined: Self = StObject.set(x, "inheritEmailNotificationConfiguration", js.undefined)
    
    @scala.inline
    def setLockedRecipientPhoneAuthEditable(value: String): Self = StObject.set(x, "lockedRecipientPhoneAuthEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedRecipientPhoneAuthEditableUndefined: Self = StObject.set(x, "lockedRecipientPhoneAuthEditable", js.undefined)
    
    @scala.inline
    def setLockedRecipientSmsEditable(value: String): Self = StObject.set(x, "lockedRecipientSmsEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedRecipientSmsEditableUndefined: Self = StObject.set(x, "lockedRecipientSmsEditable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "noteMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteMetadataUndefined: Self = StObject.set(x, "noteMetadata", js.undefined)
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPhoneAuthentication(value: RecipientPhoneAuthentication): Self = StObject.set(x, "phoneAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneAuthenticationUndefined: Self = StObject.set(x, "phoneAuthentication", js.undefined)
    
    @scala.inline
    def setRecipientAttachments(value: js.Array[RecipientAttachment]): Self = StObject.set(x, "recipientAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAttachmentsUndefined: Self = StObject.set(x, "recipientAttachments", js.undefined)
    
    @scala.inline
    def setRecipientAttachmentsVarargs(value: RecipientAttachment*): Self = StObject.set(x, "recipientAttachments", js.Array(value :_*))
    
    @scala.inline
    def setRecipientAuthenticationStatus(
      value: /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
    ): Self = StObject.set(x, "recipientAuthenticationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAuthenticationStatusUndefined: Self = StObject.set(x, "recipientAuthenticationStatus", js.undefined)
    
    @scala.inline
    def setRecipientFeatureMetadata(value: js.Array[FeatureAvailableMetadata]): Self = StObject.set(x, "recipientFeatureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientFeatureMetadataUndefined: Self = StObject.set(x, "recipientFeatureMetadata", js.undefined)
    
    @scala.inline
    def setRecipientFeatureMetadataVarargs(value: FeatureAvailableMetadata*): Self = StObject.set(x, "recipientFeatureMetadata", js.Array(value :_*))
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviders(value: js.Array[RecipientSignatureProvider]): Self = StObject.set(x, "recipientSignatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSignatureProvidersUndefined: Self = StObject.set(x, "recipientSignatureProviders", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProvidersVarargs(value: RecipientSignatureProvider*): Self = StObject.set(x, "recipientSignatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setRecipientType(value: String): Self = StObject.set(x, "recipientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientTypeMetadataUndefined: Self = StObject.set(x, "recipientTypeMetadata", js.undefined)
    
    @scala.inline
    def setRecipientTypeUndefined: Self = StObject.set(x, "recipientType", js.undefined)
    
    @scala.inline
    def setRequireIdLookup(value: String): Self = StObject.set(x, "requireIdLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireIdLookupMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireIdLookupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireIdLookupMetadataUndefined: Self = StObject.set(x, "requireIdLookupMetadata", js.undefined)
    
    @scala.inline
    def setRequireIdLookupUndefined: Self = StObject.set(x, "requireIdLookup", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setRoutingOrder(value: String): Self = StObject.set(x, "routingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "routingOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingOrderMetadataUndefined: Self = StObject.set(x, "routingOrderMetadata", js.undefined)
    
    @scala.inline
    def setRoutingOrderUndefined: Self = StObject.set(x, "routingOrder", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    @scala.inline
    def setSignedDateTime(value: String): Self = StObject.set(x, "signedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDateTimeUndefined: Self = StObject.set(x, "signedDateTime", js.undefined)
    
    @scala.inline
    def setSmsAuthentication(value: RecipientSMSAuthentication): Self = StObject.set(x, "smsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsAuthenticationUndefined: Self = StObject.set(x, "smsAuthentication", js.undefined)
    
    @scala.inline
    def setSocialAuthentications(value: js.Array[SocialAuthentication]): Self = StObject.set(x, "socialAuthentications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialAuthenticationsUndefined: Self = StObject.set(x, "socialAuthentications", js.undefined)
    
    @scala.inline
    def setSocialAuthenticationsVarargs(value: SocialAuthentication*): Self = StObject.set(x, "socialAuthentications", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuppressEmails(value: String): Self = StObject.set(x, "suppressEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressEmailsUndefined: Self = StObject.set(x, "suppressEmails", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setTotalTabCount(value: String): Self = StObject.set(x, "totalTabCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTabCountUndefined: Self = StObject.set(x, "totalTabCount", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
