package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contacts extends StObject {
  
  /**
    * The cloud service that provided the contact. Valid values are:
    *
    * - `rooms`
    * - `docusignCore` (default)
    *
    * <!-- Future:
    *
    * - `Box`
    * - `GoogleDrive`
    * - `Dropbox`
    * - `SalesForce`
    * - `SkyDrive`
    *
    * -->
    */
  var cloudProvider: js.UndefOr[String] = js.native
  
  /**
    * The id of the container at the cloud provider. For example, this might be the room id for a DocuSign Transaction Room.
    */
  var cloudProviderContainerId: js.UndefOr[String] = js.native
  
  /**
    * The id of a contact person in the account's address book.
    */
  var contactId: js.UndefOr[String] = js.native
  
  /**
    * A list of the contact's phone numbers.
    *
    * **Note**: The phone numbers associated with shared contacts do not display to users other than the user who added the contact. Additionally, in the following scenarios,
    * the phone number of a shared contact does not populate automatically for anyone other than the user who added the contact:
    *
    * - Sending an envelope by using SMS
    * - Using phone authentication
    *
    * You must ask the user who added the contact for the phone number and then manually enter it into the authentication box.
    */
  var contactPhoneNumbers: js.UndefOr[
    js.Array[
      /* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber
    ]
  ] = js.native
  
  /**
    * The URI for retrieving information about the contact.
    */
  var contactUri: js.UndefOr[String] = js.native
  
  /**
    * The email address or addresses associated with the contact.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * When **true**, the current user is the owner of the contact.
    */
  var isOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the contact.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of the contact's organization.
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the contact is shared. For more information, see [Shared Contacts](https://support.docusign.com/guides/ndse-user-guide-manage-contacts).
    *
    * **Note**: The phone numbers associated with shared contacts do not display to users other than the user who added the contact. Additionally, in the following scenarios,
    * the phone number of a shared contact does not populate automatically for anyone other than the user who added the contact:
    *
    * - Sending an envelope by using SMS
    * - Using phone authentication
    *
    * You must ask the user who added the contact for the phone number and then manually enter it into the authentication box.
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * If the contact belongs to a signing group, this property contains the `signingGroupId`.
    */
  var signingGroup: js.UndefOr[String] = js.native
  
  /**
    * The name of the signing group that the contact belongs to.
    */
  var signingGroupName: js.UndefOr[String] = js.native
}
object Contacts {
  
  @scala.inline
  def apply(): Contacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contacts]
  }
  
  @scala.inline
  implicit class ContactsMutableBuilder[Self <: Contacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudProvider(value: String): Self = StObject.set(x, "cloudProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudProviderContainerId(value: String): Self = StObject.set(x, "cloudProviderContainerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudProviderContainerIdUndefined: Self = StObject.set(x, "cloudProviderContainerId", js.undefined)
    
    @scala.inline
    def setCloudProviderUndefined: Self = StObject.set(x, "cloudProvider", js.undefined)
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
    
    @scala.inline
    def setContactPhoneNumbers(
      value: js.Array[
          /* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber
        ]
    ): Self = StObject.set(x, "contactPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPhoneNumbersUndefined: Self = StObject.set(x, "contactPhoneNumbers", js.undefined)
    
    @scala.inline
    def setContactPhoneNumbersVarargs(
      value: (/* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber)*
    ): Self = StObject.set(x, "contactPhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setContactUri(value: String): Self = StObject.set(x, "contactUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUriUndefined: Self = StObject.set(x, "contactUri", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSigningGroup(value: String): Self = StObject.set(x, "signingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupName(value: String): Self = StObject.set(x, "signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupNameUndefined: Self = StObject.set(x, "signingGroupName", js.undefined)
    
    @scala.inline
    def setSigningGroupUndefined: Self = StObject.set(x, "signingGroup", js.undefined)
  }
}
