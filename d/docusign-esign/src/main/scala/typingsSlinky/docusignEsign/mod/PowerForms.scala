package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerForms extends StObject {
  
  /**
    * The id of the user who created the PowerForm. This property is returned in a response only when you set the `include_created_by` query parameter to **true**.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the PowerForm was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * For a PowerForm that is sent by email, this is the body of the email message sent to the recipients.
    *
    * Maximum length: 10000 characters.
    */
  var emailBody: js.UndefOr[String] = js.native
  
  /**
    * Sets the envelope name for the envelopes that the PowerForm generates. One option is to make this property the same as the subject from the template.
    *
    * You can customize the subject line to include a recipient's name or email address by using merge fields. For information about adding merge fields to the email subject,
    * see [Template Email Subject Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * An array of envelope objects that contain information about the envelopes that are associated with the PowerForm.
    */
  var envelopes: js.UndefOr[js.Array[Envelope]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The instructions that display on the landing page for the first recipient. These instructions are important if the recipient
    * accesses the PowerForm by a method other than email. When you include instructions, they display as an introduction after the recipient accesses the PowerForm.
    */
  var instructions: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates that the PowerForm is active and can be sent to recipients. This is the default value.
    *
    *
    * When **false**, the PowerForm cannot be emailed or accessed by a recipient, even if they arrive at the PowerForm URL.
    *
    * If a recipient attempts to sign an inactive PowerForm, an error message informs the recipient that the document is not active and suggests that they contact the sender.
    */
  var isActive: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the PowerForm was last used.
    */
  var lastUsed: js.UndefOr[String] = js.native
  
  /**
    * The length of time before the same recipient can sign the same PowerForm again. This property is used in combination with the `limitUseIntervalUnits` property.
    */
  var limitUseInterval: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `limitUseInterval` is enabled.
    */
  var limitUseIntervalEnabled: js.UndefOr[String] = js.native
  
  /**
    * The units associated with the `limitUseInterval`. Valid values are:
    *
    * - `minutes`
    * - `hours`
    * - `days`
    * - `weeks`
    * - `months`
    *
    * For example, to limit a recipient to signing once per year, set the `limitUseInterval` to 365 and the `limitUseIntervalUnits` to `days`.
    *
    */
  var limitUseIntervalUnits: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, you can set a maximum number of uses for the PowerForm.
    */
  var maxUseEnabled: js.UndefOr[String] = js.native
  
  /**
    * The name of the PowerForm.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The id of the PowerForm.
    */
  var powerFormId: js.UndefOr[String] = js.native
  
  /**
    * The URL for the PowerForm.
    */
  var powerFormUrl: js.UndefOr[String] = js.native
  
  /**
    * An array of `powerFormRecipient` objects.
    *
    * **Note**: For self-service documents where you do not know who the recipients are in advance, you can enter generic information for the `role`
    * property and leave other details (such as `name` and `email`) blank.
    */
  var recipients: js.UndefOr[
    js.Array[
      /* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
    and omit personal details such as `email`. */ PowerFormRecipient
    ]
  ] = js.native
  
  /**
    * The name of the sender.
    *
    * **Note**: The default sender for a PowerForm is the PowerForm Administrator who created it.
    */
  var senderName: js.UndefOr[String] = js.native
  
  /**
    * The id of the sender.
    */
  var senderUserId: js.UndefOr[String] = js.native
  
  /**
    * The signing method to use. Valid values are:
    *
    * - `email`: This mode verifies the recipient's identity by using email authentication before the recipient can sign a document.
    *
    * - `direct`: This mode does not require any verification. We recommend that you use this signing method only when another form of authentication is in use.
    *
    * **Note**: In the account settings, `enablePowerFormDirect` must be **true** to use `direct` as the `signingMode`.
    *
    * For more information about signing modes, see the [overview of the Create method](https://developers.docusign.com/esign-rest-api/reference/PowerForms/PowerForms/create).
    */
  var signingMode: js.UndefOr[String] = js.native
  
  /**
    * The id of the template used to create the PowerForm.
    */
  var templateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the template used to create the PowerForm.
    */
  var templateName: js.UndefOr[String] = js.native
  
  /**
    * The number of times the PowerForm has been used.
    */
  var timesUsed: js.UndefOr[String] = js.native
  
  /**
    * The URI for the PowerForm.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * The number of times that the PowerForm can still be used. If no use limit is set, the value is `Unlimited`.
    */
  var usesRemaining: js.UndefOr[String] = js.native
}
object PowerForms {
  
  @scala.inline
  def apply(): PowerForms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerForms]
  }
  
  @scala.inline
  implicit class PowerFormsMutableBuilder[Self <: PowerForms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setEmailBody(value: String): Self = StObject.set(x, "emailBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailBodyUndefined: Self = StObject.set(x, "emailBody", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setEnvelopes(value: js.Array[Envelope]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    @scala.inline
    def setEnvelopesVarargs(value: Envelope*): Self = StObject.set(x, "envelopes", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setIsActive(value: String): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setLastUsed(value: String): Self = StObject.set(x, "lastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedUndefined: Self = StObject.set(x, "lastUsed", js.undefined)
    
    @scala.inline
    def setLimitUseInterval(value: String): Self = StObject.set(x, "limitUseInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUseIntervalEnabled(value: String): Self = StObject.set(x, "limitUseIntervalEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUseIntervalEnabledUndefined: Self = StObject.set(x, "limitUseIntervalEnabled", js.undefined)
    
    @scala.inline
    def setLimitUseIntervalUndefined: Self = StObject.set(x, "limitUseInterval", js.undefined)
    
    @scala.inline
    def setLimitUseIntervalUnits(value: String): Self = StObject.set(x, "limitUseIntervalUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUseIntervalUnitsUndefined: Self = StObject.set(x, "limitUseIntervalUnits", js.undefined)
    
    @scala.inline
    def setMaxUseEnabled(value: String): Self = StObject.set(x, "maxUseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUseEnabledUndefined: Self = StObject.set(x, "maxUseEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPowerFormId(value: String): Self = StObject.set(x, "powerFormId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormIdUndefined: Self = StObject.set(x, "powerFormId", js.undefined)
    
    @scala.inline
    def setPowerFormUrl(value: String): Self = StObject.set(x, "powerFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormUrlUndefined: Self = StObject.set(x, "powerFormUrl", js.undefined)
    
    @scala.inline
    def setRecipients(
      value: js.Array[
          /* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
      and omit personal details such as `email`. */ PowerFormRecipient
        ]
    ): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(
      value: (/* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
      and omit personal details such as `email`. */ PowerFormRecipient)*
    ): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setSenderName(value: String): Self = StObject.set(x, "senderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderNameUndefined: Self = StObject.set(x, "senderName", js.undefined)
    
    @scala.inline
    def setSenderUserId(value: String): Self = StObject.set(x, "senderUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUserIdUndefined: Self = StObject.set(x, "senderUserId", js.undefined)
    
    @scala.inline
    def setSigningMode(value: String): Self = StObject.set(x, "signingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningModeUndefined: Self = StObject.set(x, "signingMode", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    @scala.inline
    def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
    
    @scala.inline
    def setTimesUsed(value: String): Self = StObject.set(x, "timesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUsedUndefined: Self = StObject.set(x, "timesUsed", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUsesRemaining(value: String): Self = StObject.set(x, "usesRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesRemainingUndefined: Self = StObject.set(x, "usesRemaining", js.undefined)
  }
}
