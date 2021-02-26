package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSettingsInformation extends StObject {
  
  /**
    * Describes which account management capabilities a user has.
    */
  var accountManagementGranular: js.UndefOr[
    /* Describes which account management capabilities a user has. */ UserAccountManagementGranularInformation
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var adminOnly: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var adminOnlyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the API returns suggested tabs for documents for this user.
    */
  var allowAutoTagging: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, this user can participate in envelope transfers on the account.
    */
  var allowEnvelopeTransferTo: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var allowEnvelopeTransferToMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can create [electronic seal recipients][eseal].
    *
    * [eseal]: /esign/restapi//Envelopes/EnvelopeRecipients#seal-recipient
    */
  var allowEsealRecipients: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `allowEsealRecipientsMetadata` property.
    */
  var allowEsealRecipientsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true** and this user is an administrator, they can view all of the envelopes generated from PowerForms. The default value is **false**.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata` property.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can set the language used in the standard email format for a recipient when creating an envelope.
    */
  var allowRecipientLanguageSelection: js.UndefOr[String] = js.native
  
  /**
    * Metadata for allowRecipientLanguageSelection.
    */
  var allowRecipientLanguageSelectionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can send envelopes "on behalf of" other users through the API.
    */
  var allowSendOnBehalfOf: js.UndefOr[String] = js.native
  
  /**
    * Metadata for allowSendOnBehalfOf.
    */
  var allowSendOnBehalfOfMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can include supplemental documents.
    */
  var allowSupplementalDocuments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSupplementalDocuments` property is editable.
    */
  var allowSupplementalDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var anchorTagVersionedPlacementEnabled: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates that this user can send envelope-specific API requests on the account.
    */
  var apiAccountWideAccess: js.UndefOr[String] = js.native
  
  /**
    * Metadata for apiAccountWideAccess.
    */
  var apiAccountWideAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can export authoritative copy for the account.
    */
  var apiCanExportAC: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `apiCanExportACMetadata` property.
    */
  var apiCanExportACMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can use the bulk send feature for the account.
    */
  var bulkSend: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bulkSend` property is editable.
    *
    */
  var bulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canChargeAccount: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canChargeAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When true, this user can edit the shared address book for the account.
    */
  var canEditSharedAddressbook: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canEditSharedAddressbookMetadata` property.
    */
  var canEditSharedAddressbookMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can lock envelopes.
    */
  var canLockEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canLockEnvelopes` property.
    */
  var canLockEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user is an administrator for the account.
    */
  var canManageAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageAccountMetadata` property.
    */
  var canManageAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canManageDistributor: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageDistributor` property.
    */
  var canManageDistributorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can manage templates for the account.
    */
  var canManageTemplates: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageTemplates` property.
    */
  var canManageTemplatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can send API requests on the account.
    */
  var canSendAPIRequests: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSendAPIRequests` property.
    */
  var canSendAPIRequestsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can send envelopes on the account.
    */
  var canSendEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSendEnvelope` property.
    */
  var canSendEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can sign envelopes.
    */
  var canSignEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSignEnvelope` property.
    */
  var canSignEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can use a scratchpad to edit information.
    */
  var canUseScratchpad: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canUseScratchpad` property.
    */
  var canUseScratchpadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canUseSmartContracts: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canUseSmartContractsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user is prohibited from uploading documents during sending.
    */
  var disableDocumentUpload: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableDocumentUpload` property is editable.
    *
    */
  var disableDocumentUploadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can access the **Other Actions** menu.
    */
  var disableOtherActions: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableOtherActions` property is editable.
    *
    */
  var disableOtherActionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableDSPro: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableDSPro` property is editable.
    *
    */
  var enableDSProMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can define the routing
    * order of recipients for envelopes sent by using the DocuSign API.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enableSequentialSigningAPI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningAPI` property is editable.
    *
    */
  var enableSequentialSigningAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can define the routing order
    * of recipients for envelopes sent by using the DocuSign application.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var enableSequentialSigningUI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningUI` property is editable.
    *
    */
  var enableSequentialSigningUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a user can override the default default account setting for the Sign on Paper option, which specifies whether signers can sign
    * documents on paper as an option to signing electronically.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignOnPaperOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignOnPaperOverride` property is editable.
    *
    */
  var enableSignOnPaperOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can use the signing attachments feature.
    */
  var enableSignerAttachments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignerAttachments` property is editable.
    *
    */
  var enableSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPoint: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, Vaulting is enabled for the account.
    */
  var enableVaulting: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableVaulting` property is editable.
    *
    */
  var enableVaultingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **false**, this user can apply tabs to documents during the sending experience.
    */
  var expressSendOnly: js.UndefOr[String] = js.native
  
  /**
    * The user's locale code. Valid values are:
    * - `zh_CN`
    * - `zh_TW`
    * - `nl`
    * - `en`
    * - `fr`
    * - `de`
    * - `it`
    * - `ja`
    * - `ko`
    * - `pt`
    * - `pt_BR`
    * - `ru`
    * - `es`
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `locale` property.
    */
  var localeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var localePolicy: js.UndefOr[LocalePolicy] = js.native
  
  /**
    * When set to **true**, this user can create and manage [Clickwraps](https://developers.docusign.com/click-api).
    */
  var manageClickwrapsMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `manageClickwrapsMode` property.
    */
  var manageClickwrapsModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The user id (GUID) of the user who last modified this user record.
    */
  var modifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedBy` property.
    */
  var modifiedByMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The date on which this user record was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedDate` property.
    */
  var modifiedDateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Note referencing the page that modified this user record.
    */
  var modifiedPage: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedPage` property.
    */
  var modifiedPageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var newSendUI: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `newSendUI` property.
    */
  var newSendUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Indicates the Power Form mode setting for the user:
    * - `none`
    * - `admin`
    * - `user`
    */
  var powerFormMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `powerFormMode` property.
    */
  var powerFormModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user receives notifications when envelopes are viewed.
    */
  var recipientViewedNotification: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `recipientViewedNotification` property.
    */
  var recipientViewedNotificationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Information about the seals associated with this user.
    */
  var sealIdentifiers: js.UndefOr[js.Array[SealIdentifier]] = js.native
  
  /**
    * Sets how self-signed documents are presented to the email recipients.
    * Valid values are:
    *
    * - `include_pdf`: A PDF of the completed document is attached to the email.
    * - `include_link`: A secure link to the self-signed documents is included
    *    in the email.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var selfSignedRecipientEmailDocument: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `selfSignedRecipientEmailDocument` property is editable.
    *
    */
  var selfSignedRecipientEmailDocumentMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    *
    * An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user will receive those types of email notifications from DocuSign.
    *
    * The user inherits the default account sender email notification settings when the user is created. The email notifications are:
    *
    * * envelopeComplete
    * * changedSigner
    * * senderEnvelopeDeclined
    * * withdrawnConsent
    * * recipientViewed
    * * deliveryFailed
    *
    */
  var senderEmailNotifications: js.UndefOr[
    /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
  ] = js.native
  
  /**
    * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */
  var signerEmailNotifications: js.UndefOr[
    /* An array of email notifications that specifies the email the user receives when they are a sender.
    When the specific email notification is set to true, the user receives those types of email notifications from DocuSign.
    The user inherits the default account sender email notification settings when the user is created. */ SignerEmailNotifications
  ] = js.native
  
  /**
    * When **true**, this user gets supplemental documents when downloading documents.
    */
  var supplementalDocumentIncludeInDownload: js.UndefOr[String] = js.native
  
  /**
    * When **true**, this user must accept supplemental documents.
    */
  var supplementalDocumentsMustAccept: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustAccept` property is editable.
    *
    */
  var supplementalDocumentsMustAcceptMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user must both view and accept supplemental documents.
    */
  var supplementalDocumentsMustRead: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustRead` property is editable.
    *
    */
  var supplementalDocumentsMustReadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user must view supplemental documents.
    */
  var supplementalDocumentsMustView: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustView` property is editable.
    *
    */
  var supplementalDocumentsMustViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a new template is created each time the user sends an envelope.
    */
  var templateActiveCreation: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateActiveCreation` property.
    */
  var templateActiveCreationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the system notifies this user before applying a matching template.
    */
  var templateApplyNotify: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateApplyNotify` property.
    */
  var templateApplyNotifyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the system automatically applies a matching template to a document if only one template matches.
    * If there are multiple matches, it displays a list of matches to select from.
    */
  var templateAutoMatching: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateAutoMatching` property.
    */
  var templateAutoMatchingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Percentage used when matching templates.
    */
  var templateMatchingSensitivity: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `tempalteMatchingSensitivity` property.
    */
  var templateMatchingSensitivityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users see template matching functionality.
    */
  var templatePageLevelMatching: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templatePageLevelMatching` property.
    */
  var templatePageLevelMatchingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When true, daylight savings time is in effect for this user's time zone.
    */
  var timezoneDST: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneDST` property.
    */
  var timezoneDSTMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The custom DateTime format setting for this user.
    */
  var timezoneMask: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneMask` property.
    */
  var timezoneMaskMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The timezone offset for the user. Valid values:
    * - `tz_01_afghanistan`
    * - `tz_02_alaskan`
    * - `tz_03_arab`
    * - `tz_04_arabian`
    * - `tz_05_arabic`
    * - `tz_06_argentina`
    * - `tz_07_atlantic`
    * - `tz_08_aus_central`
    * - `tz_09_aus_eastern`
    * - `tz_10_azerbaijan`
    * - `tz_11_azores`
    * - `tz_12_bangladesh`
    * - `tz_13_canada_central`
    * - `tz_14_cape_verde`
    * - `tz_15_caucasus`
    * - `tz_16_central_australia`
    * - `tz_17_central_america`
    * - `tz_18_central_asia`
    * - `tz_19_central_brazilian`
    * - `tz_20_central_europe`
    * - `tz_21_central_european`
    * - `tz_22_central_pacific`
    * - `tz_23_central`
    * - `tz_24_central_mexico`
    * - `tz_25_china`
    * - `tz_26_dateline`
    * - `tz_27_east_africa`
    * - `tz_28_east_australia`
    * - `tz_29_east_europe`
    * - `tz_30_east_south_america`
    * - `tz_31_eastern`
    * - `tz_32_egypt`
    * - `tz_33_ekaterinburg`
    * - `tz_34_fiji`
    * - `tz_35_fli`
    * - `tz_36_georgian`
    * - `tz_37_gmt`
    * - `tz_38_greenland`
    * - `tz_39_greenwich`
    * - `tz_40_gtb`
    * - `tz_41_hawaiian`
    * - `tz_42_india`
    * - `tz_43_iran`
    * - `tz_44_israel`
    * - `tz_45_jordan`
    * - `tz_46_kaliningrad`
    * - `tz_47_kamchatka`
    * - `tz_48_korea`
    * - `tz_49_magadan`
    * - `tz_50_mauritius`
    * - `tz_51_mid_atlantic`
    * - `tz_52_middle_east`
    * - `tz_53_montevideo`
    * - `tz_54_morocco`
    * - `tz_55_mountain`
    * - `tz_56_mountain_mexico`
    * - `tz_57_myanmar`
    * - `tz_58_north_central_asia`
    * - `tz_59_namibia`
    * - `tz_60_nepal`
    * - `tz_61_new_zealand`
    * - `tz_62_new_foundland`
    * - `tz_63_north_asia_east`
    * - `tz_64_north_asia`
    * - `tz_65_pacific_sa`
    * - `tz_66_pacific`
    * - `tz_67_pacific_mexico`
    * - `tz_68_pakistan`
    * - `tz_69_paraguay`
    * - `tz_70_romance`
    * - `tz_71_russian`
    * - `tz_72_sa_eastern`
    * - `tz_73_sa_pacific`
    * - `tz_74_sa_western`
    * - `tz_75_samoa`
    * - `tz_76_se_asia`
    * - `tz_77_singapore`
    * - `tz_78_south_africa`
    * - `tz_79_sriLanka`
    * - `tz_80_syria`
    * - `tz_81_taipei`
    * - `tz_82_tasmania`
    * - `tz_83_tokyo`
    * - `tz_84_tonga`
    * - `tz_85_turkey`
    * - `tz_86_ulaanbaatar`
    * - `tz_87_us_eastern`
    * - `tz_88_us_mountain`
    * - `tz_89_venezuela`
    * - `tz_90_vladivostok`
    * - `tz_91_west_australia`
    * - `tz_92_west_central_africa`
    * - `tz_93_west_europe`
    * - `tz_94_west_asia`
    * - `tz_95_west_pacific`
    * - `tz_96_yakutsk`
    */
  var timezoneOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneOffset` property.
    */
  var timezoneOffsetMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSendingPref: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSendingPrefMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSigningPref: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSigningPrefMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointSiteNameURL: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointSiteNameURLMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointUserName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointUserNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Indicates the specified Vaulting mode:
    * - `none`
    * - `estored`
    * - `electronic_original`
    */
  var vaultingMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `vaultingMode` property.
    */
  var vaultingModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object UserSettingsInformation {
  
  @scala.inline
  def apply(): UserSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettingsInformation]
  }
  
  @scala.inline
  implicit class UserSettingsInformationMutableBuilder[Self <: UserSettingsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountManagementGranular(
      value: /* Describes which account management capabilities a user has. */ UserAccountManagementGranularInformation
    ): Self = StObject.set(x, "accountManagementGranular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountManagementGranularUndefined: Self = StObject.set(x, "accountManagementGranular", js.undefined)
    
    @scala.inline
    def setAdminOnly(value: String): Self = StObject.set(x, "adminOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminOnlyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "adminOnlyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminOnlyMetadataUndefined: Self = StObject.set(x, "adminOnlyMetadata", js.undefined)
    
    @scala.inline
    def setAdminOnlyUndefined: Self = StObject.set(x, "adminOnly", js.undefined)
    
    @scala.inline
    def setAllowAutoTagging(value: String): Self = StObject.set(x, "allowAutoTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAutoTaggingUndefined: Self = StObject.set(x, "allowAutoTagging", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeTransferTo(value: String): Self = StObject.set(x, "allowEnvelopeTransferTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEnvelopeTransferToMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeTransferToMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEnvelopeTransferToMetadataUndefined: Self = StObject.set(x, "allowEnvelopeTransferToMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeTransferToUndefined: Self = StObject.set(x, "allowEnvelopeTransferTo", js.undefined)
    
    @scala.inline
    def setAllowEsealRecipients(value: String): Self = StObject.set(x, "allowEsealRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEsealRecipientsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEsealRecipientsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEsealRecipientsMetadataUndefined: Self = StObject.set(x, "allowEsealRecipientsMetadata", js.undefined)
    
    @scala.inline
    def setAllowEsealRecipientsUndefined: Self = StObject.set(x, "allowEsealRecipients", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelope(value: String): Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadataUndefined: Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeUndefined: Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelope", js.undefined)
    
    @scala.inline
    def setAllowRecipientLanguageSelection(value: String): Self = StObject.set(x, "allowRecipientLanguageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRecipientLanguageSelectionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowRecipientLanguageSelectionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRecipientLanguageSelectionMetadataUndefined: Self = StObject.set(x, "allowRecipientLanguageSelectionMetadata", js.undefined)
    
    @scala.inline
    def setAllowRecipientLanguageSelectionUndefined: Self = StObject.set(x, "allowRecipientLanguageSelection", js.undefined)
    
    @scala.inline
    def setAllowSendOnBehalfOf(value: String): Self = StObject.set(x, "allowSendOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSendOnBehalfOfMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSendOnBehalfOfMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSendOnBehalfOfMetadataUndefined: Self = StObject.set(x, "allowSendOnBehalfOfMetadata", js.undefined)
    
    @scala.inline
    def setAllowSendOnBehalfOfUndefined: Self = StObject.set(x, "allowSendOnBehalfOf", js.undefined)
    
    @scala.inline
    def setAllowSupplementalDocuments(value: String): Self = StObject.set(x, "allowSupplementalDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSupplementalDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSupplementalDocumentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSupplementalDocumentsMetadataUndefined: Self = StObject.set(x, "allowSupplementalDocumentsMetadata", js.undefined)
    
    @scala.inline
    def setAllowSupplementalDocumentsUndefined: Self = StObject.set(x, "allowSupplementalDocuments", js.undefined)
    
    @scala.inline
    def setAnchorTagVersionedPlacementEnabled(value: String): Self = StObject.set(x, "anchorTagVersionedPlacementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTagVersionedPlacementEnabledUndefined: Self = StObject.set(x, "anchorTagVersionedPlacementEnabled", js.undefined)
    
    @scala.inline
    def setApiAccountWideAccess(value: String): Self = StObject.set(x, "apiAccountWideAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiAccountWideAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "apiAccountWideAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiAccountWideAccessMetadataUndefined: Self = StObject.set(x, "apiAccountWideAccessMetadata", js.undefined)
    
    @scala.inline
    def setApiAccountWideAccessUndefined: Self = StObject.set(x, "apiAccountWideAccess", js.undefined)
    
    @scala.inline
    def setApiCanExportAC(value: String): Self = StObject.set(x, "apiCanExportAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCanExportACMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "apiCanExportACMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCanExportACMetadataUndefined: Self = StObject.set(x, "apiCanExportACMetadata", js.undefined)
    
    @scala.inline
    def setApiCanExportACUndefined: Self = StObject.set(x, "apiCanExportAC", js.undefined)
    
    @scala.inline
    def setBulkSend(value: String): Self = StObject.set(x, "bulkSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "bulkSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkSendMetadataUndefined: Self = StObject.set(x, "bulkSendMetadata", js.undefined)
    
    @scala.inline
    def setBulkSendUndefined: Self = StObject.set(x, "bulkSend", js.undefined)
    
    @scala.inline
    def setCanChargeAccount(value: String): Self = StObject.set(x, "canChargeAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChargeAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canChargeAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChargeAccountMetadataUndefined: Self = StObject.set(x, "canChargeAccountMetadata", js.undefined)
    
    @scala.inline
    def setCanChargeAccountUndefined: Self = StObject.set(x, "canChargeAccount", js.undefined)
    
    @scala.inline
    def setCanEditSharedAddressbook(value: String): Self = StObject.set(x, "canEditSharedAddressbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEditSharedAddressbookMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canEditSharedAddressbookMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEditSharedAddressbookMetadataUndefined: Self = StObject.set(x, "canEditSharedAddressbookMetadata", js.undefined)
    
    @scala.inline
    def setCanEditSharedAddressbookUndefined: Self = StObject.set(x, "canEditSharedAddressbook", js.undefined)
    
    @scala.inline
    def setCanLockEnvelopes(value: String): Self = StObject.set(x, "canLockEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanLockEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canLockEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanLockEnvelopesMetadataUndefined: Self = StObject.set(x, "canLockEnvelopesMetadata", js.undefined)
    
    @scala.inline
    def setCanLockEnvelopesUndefined: Self = StObject.set(x, "canLockEnvelopes", js.undefined)
    
    @scala.inline
    def setCanManageAccount(value: String): Self = StObject.set(x, "canManageAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageAccountMetadataUndefined: Self = StObject.set(x, "canManageAccountMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAccountUndefined: Self = StObject.set(x, "canManageAccount", js.undefined)
    
    @scala.inline
    def setCanManageDistributor(value: String): Self = StObject.set(x, "canManageDistributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageDistributorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageDistributorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageDistributorMetadataUndefined: Self = StObject.set(x, "canManageDistributorMetadata", js.undefined)
    
    @scala.inline
    def setCanManageDistributorUndefined: Self = StObject.set(x, "canManageDistributor", js.undefined)
    
    @scala.inline
    def setCanManageTemplates(value: String): Self = StObject.set(x, "canManageTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageTemplatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canManageTemplatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageTemplatesMetadataUndefined: Self = StObject.set(x, "canManageTemplatesMetadata", js.undefined)
    
    @scala.inline
    def setCanManageTemplatesUndefined: Self = StObject.set(x, "canManageTemplates", js.undefined)
    
    @scala.inline
    def setCanSendAPIRequests(value: String): Self = StObject.set(x, "canSendAPIRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSendAPIRequestsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canSendAPIRequestsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSendAPIRequestsMetadataUndefined: Self = StObject.set(x, "canSendAPIRequestsMetadata", js.undefined)
    
    @scala.inline
    def setCanSendAPIRequestsUndefined: Self = StObject.set(x, "canSendAPIRequests", js.undefined)
    
    @scala.inline
    def setCanSendEnvelope(value: String): Self = StObject.set(x, "canSendEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSendEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canSendEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSendEnvelopeMetadataUndefined: Self = StObject.set(x, "canSendEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setCanSendEnvelopeUndefined: Self = StObject.set(x, "canSendEnvelope", js.undefined)
    
    @scala.inline
    def setCanSignEnvelope(value: String): Self = StObject.set(x, "canSignEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSignEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canSignEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSignEnvelopeMetadataUndefined: Self = StObject.set(x, "canSignEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setCanSignEnvelopeUndefined: Self = StObject.set(x, "canSignEnvelope", js.undefined)
    
    @scala.inline
    def setCanUseScratchpad(value: String): Self = StObject.set(x, "canUseScratchpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseScratchpadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canUseScratchpadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseScratchpadMetadataUndefined: Self = StObject.set(x, "canUseScratchpadMetadata", js.undefined)
    
    @scala.inline
    def setCanUseScratchpadUndefined: Self = StObject.set(x, "canUseScratchpad", js.undefined)
    
    @scala.inline
    def setCanUseSmartContracts(value: String): Self = StObject.set(x, "canUseSmartContracts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseSmartContractsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canUseSmartContractsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseSmartContractsMetadataUndefined: Self = StObject.set(x, "canUseSmartContractsMetadata", js.undefined)
    
    @scala.inline
    def setCanUseSmartContractsUndefined: Self = StObject.set(x, "canUseSmartContracts", js.undefined)
    
    @scala.inline
    def setDisableDocumentUpload(value: String): Self = StObject.set(x, "disableDocumentUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDocumentUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableDocumentUploadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDocumentUploadMetadataUndefined: Self = StObject.set(x, "disableDocumentUploadMetadata", js.undefined)
    
    @scala.inline
    def setDisableDocumentUploadUndefined: Self = StObject.set(x, "disableDocumentUpload", js.undefined)
    
    @scala.inline
    def setDisableOtherActions(value: String): Self = StObject.set(x, "disableOtherActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOtherActionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableOtherActionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOtherActionsMetadataUndefined: Self = StObject.set(x, "disableOtherActionsMetadata", js.undefined)
    
    @scala.inline
    def setDisableOtherActionsUndefined: Self = StObject.set(x, "disableOtherActions", js.undefined)
    
    @scala.inline
    def setEnableDSPro(value: String): Self = StObject.set(x, "enableDSPro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDSProMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableDSProMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDSProMetadataUndefined: Self = StObject.set(x, "enableDSProMetadata", js.undefined)
    
    @scala.inline
    def setEnableDSProUndefined: Self = StObject.set(x, "enableDSPro", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningAPI(value: String): Self = StObject.set(x, "enableSequentialSigningAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSequentialSigningAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSequentialSigningAPIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSequentialSigningAPIMetadataUndefined: Self = StObject.set(x, "enableSequentialSigningAPIMetadata", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningAPIUndefined: Self = StObject.set(x, "enableSequentialSigningAPI", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningUI(value: String): Self = StObject.set(x, "enableSequentialSigningUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSequentialSigningUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSequentialSigningUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSequentialSigningUIMetadataUndefined: Self = StObject.set(x, "enableSequentialSigningUIMetadata", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningUIUndefined: Self = StObject.set(x, "enableSequentialSigningUI", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaperOverride(value: String): Self = StObject.set(x, "enableSignOnPaperOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSignOnPaperOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignOnPaperOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSignOnPaperOverrideMetadataUndefined: Self = StObject.set(x, "enableSignOnPaperOverrideMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaperOverrideUndefined: Self = StObject.set(x, "enableSignOnPaperOverride", js.undefined)
    
    @scala.inline
    def setEnableSignerAttachments(value: String): Self = StObject.set(x, "enableSignerAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSignerAttachmentsMetadataUndefined: Self = StObject.set(x, "enableSignerAttachmentsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignerAttachmentsUndefined: Self = StObject.set(x, "enableSignerAttachments", js.undefined)
    
    @scala.inline
    def setEnableTransactionPoint(value: String): Self = StObject.set(x, "enableTransactionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTransactionPointMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableTransactionPointMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTransactionPointMetadataUndefined: Self = StObject.set(x, "enableTransactionPointMetadata", js.undefined)
    
    @scala.inline
    def setEnableTransactionPointUndefined: Self = StObject.set(x, "enableTransactionPoint", js.undefined)
    
    @scala.inline
    def setEnableVaulting(value: String): Self = StObject.set(x, "enableVaulting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVaultingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableVaultingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVaultingMetadataUndefined: Self = StObject.set(x, "enableVaultingMetadata", js.undefined)
    
    @scala.inline
    def setEnableVaultingUndefined: Self = StObject.set(x, "enableVaulting", js.undefined)
    
    @scala.inline
    def setExpressSendOnly(value: String): Self = StObject.set(x, "expressSendOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressSendOnlyUndefined: Self = StObject.set(x, "expressSendOnly", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "localeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMetadataUndefined: Self = StObject.set(x, "localeMetadata", js.undefined)
    
    @scala.inline
    def setLocalePolicy(value: LocalePolicy): Self = StObject.set(x, "localePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalePolicyUndefined: Self = StObject.set(x, "localePolicy", js.undefined)
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setManageClickwrapsMode(value: String): Self = StObject.set(x, "manageClickwrapsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageClickwrapsModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "manageClickwrapsModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageClickwrapsModeMetadataUndefined: Self = StObject.set(x, "manageClickwrapsModeMetadata", js.undefined)
    
    @scala.inline
    def setManageClickwrapsModeUndefined: Self = StObject.set(x, "manageClickwrapsMode", js.undefined)
    
    @scala.inline
    def setModifiedBy(value: String): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "modifiedByMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByMetadataUndefined: Self = StObject.set(x, "modifiedByMetadata", js.undefined)
    
    @scala.inline
    def setModifiedByUndefined: Self = StObject.set(x, "modifiedBy", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "modifiedDateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateMetadataUndefined: Self = StObject.set(x, "modifiedDateMetadata", js.undefined)
    
    @scala.inline
    def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    @scala.inline
    def setModifiedPage(value: String): Self = StObject.set(x, "modifiedPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedPageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "modifiedPageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedPageMetadataUndefined: Self = StObject.set(x, "modifiedPageMetadata", js.undefined)
    
    @scala.inline
    def setModifiedPageUndefined: Self = StObject.set(x, "modifiedPage", js.undefined)
    
    @scala.inline
    def setNewSendUI(value: String): Self = StObject.set(x, "newSendUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSendUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "newSendUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSendUIMetadataUndefined: Self = StObject.set(x, "newSendUIMetadata", js.undefined)
    
    @scala.inline
    def setNewSendUIUndefined: Self = StObject.set(x, "newSendUI", js.undefined)
    
    @scala.inline
    def setPowerFormMode(value: String): Self = StObject.set(x, "powerFormMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "powerFormModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormModeMetadataUndefined: Self = StObject.set(x, "powerFormModeMetadata", js.undefined)
    
    @scala.inline
    def setPowerFormModeUndefined: Self = StObject.set(x, "powerFormMode", js.undefined)
    
    @scala.inline
    def setRecipientViewedNotification(value: String): Self = StObject.set(x, "recipientViewedNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientViewedNotificationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "recipientViewedNotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientViewedNotificationMetadataUndefined: Self = StObject.set(x, "recipientViewedNotificationMetadata", js.undefined)
    
    @scala.inline
    def setRecipientViewedNotificationUndefined: Self = StObject.set(x, "recipientViewedNotification", js.undefined)
    
    @scala.inline
    def setSealIdentifiers(value: js.Array[SealIdentifier]): Self = StObject.set(x, "sealIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealIdentifiersUndefined: Self = StObject.set(x, "sealIdentifiers", js.undefined)
    
    @scala.inline
    def setSealIdentifiersVarargs(value: SealIdentifier*): Self = StObject.set(x, "sealIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setSelfSignedRecipientEmailDocument(value: String): Self = StObject.set(x, "selfSignedRecipientEmailDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "selfSignedRecipientEmailDocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentMetadataUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocumentMetadata", js.undefined)
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocument", js.undefined)
    
    @scala.inline
    def setSenderEmailNotifications(
      value: /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
    ): Self = StObject.set(x, "senderEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderEmailNotificationsUndefined: Self = StObject.set(x, "senderEmailNotifications", js.undefined)
    
    @scala.inline
    def setSignerEmailNotifications(
      value: /* An array of email notifications that specifies the email the user receives when they are a sender.
      When the specific email notification is set to true, the user receives those types of email notifications from DocuSign.
      The user inherits the default account sender email notification settings when the user is created. */ SignerEmailNotifications
    ): Self = StObject.set(x, "signerEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerEmailNotificationsUndefined: Self = StObject.set(x, "signerEmailNotifications", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentIncludeInDownload(value: String): Self = StObject.set(x, "supplementalDocumentIncludeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentIncludeInDownloadUndefined: Self = StObject.set(x, "supplementalDocumentIncludeInDownload", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustAccept(value: String): Self = StObject.set(x, "supplementalDocumentsMustAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustAcceptMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustAcceptMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustAcceptMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustAcceptMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustAcceptUndefined: Self = StObject.set(x, "supplementalDocumentsMustAccept", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustRead(value: String): Self = StObject.set(x, "supplementalDocumentsMustRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustReadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustReadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustReadMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustReadMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustReadUndefined: Self = StObject.set(x, "supplementalDocumentsMustRead", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustView(value: String): Self = StObject.set(x, "supplementalDocumentsMustView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustViewMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDocumentsMustViewMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustViewMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustViewUndefined: Self = StObject.set(x, "supplementalDocumentsMustView", js.undefined)
    
    @scala.inline
    def setTemplateActiveCreation(value: String): Self = StObject.set(x, "templateActiveCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateActiveCreationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "templateActiveCreationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateActiveCreationMetadataUndefined: Self = StObject.set(x, "templateActiveCreationMetadata", js.undefined)
    
    @scala.inline
    def setTemplateActiveCreationUndefined: Self = StObject.set(x, "templateActiveCreation", js.undefined)
    
    @scala.inline
    def setTemplateApplyNotify(value: String): Self = StObject.set(x, "templateApplyNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateApplyNotifyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "templateApplyNotifyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateApplyNotifyMetadataUndefined: Self = StObject.set(x, "templateApplyNotifyMetadata", js.undefined)
    
    @scala.inline
    def setTemplateApplyNotifyUndefined: Self = StObject.set(x, "templateApplyNotify", js.undefined)
    
    @scala.inline
    def setTemplateAutoMatching(value: String): Self = StObject.set(x, "templateAutoMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateAutoMatchingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "templateAutoMatchingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateAutoMatchingMetadataUndefined: Self = StObject.set(x, "templateAutoMatchingMetadata", js.undefined)
    
    @scala.inline
    def setTemplateAutoMatchingUndefined: Self = StObject.set(x, "templateAutoMatching", js.undefined)
    
    @scala.inline
    def setTemplateMatchingSensitivity(value: String): Self = StObject.set(x, "templateMatchingSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateMatchingSensitivityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "templateMatchingSensitivityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateMatchingSensitivityMetadataUndefined: Self = StObject.set(x, "templateMatchingSensitivityMetadata", js.undefined)
    
    @scala.inline
    def setTemplateMatchingSensitivityUndefined: Self = StObject.set(x, "templateMatchingSensitivity", js.undefined)
    
    @scala.inline
    def setTemplatePageLevelMatching(value: String): Self = StObject.set(x, "templatePageLevelMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatePageLevelMatchingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "templatePageLevelMatchingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatePageLevelMatchingMetadataUndefined: Self = StObject.set(x, "templatePageLevelMatchingMetadata", js.undefined)
    
    @scala.inline
    def setTemplatePageLevelMatchingUndefined: Self = StObject.set(x, "templatePageLevelMatching", js.undefined)
    
    @scala.inline
    def setTimezoneDST(value: String): Self = StObject.set(x, "timezoneDST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneDSTMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneDSTMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneDSTMetadataUndefined: Self = StObject.set(x, "timezoneDSTMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneDSTUndefined: Self = StObject.set(x, "timezoneDST", js.undefined)
    
    @scala.inline
    def setTimezoneMask(value: String): Self = StObject.set(x, "timezoneMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneMaskMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneMaskMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneMaskMetadataUndefined: Self = StObject.set(x, "timezoneMaskMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneMaskUndefined: Self = StObject.set(x, "timezoneMask", js.undefined)
    
    @scala.inline
    def setTimezoneOffset(value: String): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneOffsetMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneOffsetMetadataUndefined: Self = StObject.set(x, "timezoneOffsetMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
    
    @scala.inline
    def setTimezoneSendingPref(value: String): Self = StObject.set(x, "timezoneSendingPref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneSendingPrefMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneSendingPrefMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneSendingPrefMetadataUndefined: Self = StObject.set(x, "timezoneSendingPrefMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneSendingPrefUndefined: Self = StObject.set(x, "timezoneSendingPref", js.undefined)
    
    @scala.inline
    def setTimezoneSigningPref(value: String): Self = StObject.set(x, "timezoneSigningPref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneSigningPrefMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneSigningPrefMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneSigningPrefMetadataUndefined: Self = StObject.set(x, "timezoneSigningPrefMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneSigningPrefUndefined: Self = StObject.set(x, "timezoneSigningPref", js.undefined)
    
    @scala.inline
    def setTransactionPointSiteNameURL(value: String): Self = StObject.set(x, "transactionPointSiteNameURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionPointSiteNameURLMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "transactionPointSiteNameURLMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionPointSiteNameURLMetadataUndefined: Self = StObject.set(x, "transactionPointSiteNameURLMetadata", js.undefined)
    
    @scala.inline
    def setTransactionPointSiteNameURLUndefined: Self = StObject.set(x, "transactionPointSiteNameURL", js.undefined)
    
    @scala.inline
    def setTransactionPointUserName(value: String): Self = StObject.set(x, "transactionPointUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionPointUserNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "transactionPointUserNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionPointUserNameMetadataUndefined: Self = StObject.set(x, "transactionPointUserNameMetadata", js.undefined)
    
    @scala.inline
    def setTransactionPointUserNameUndefined: Self = StObject.set(x, "transactionPointUserName", js.undefined)
    
    @scala.inline
    def setVaultingMode(value: String): Self = StObject.set(x, "vaultingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultingModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "vaultingModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultingModeMetadataUndefined: Self = StObject.set(x, "vaultingModeMetadata", js.undefined)
    
    @scala.inline
    def setVaultingModeUndefined: Self = StObject.set(x, "vaultingMode", js.undefined)
  }
}
