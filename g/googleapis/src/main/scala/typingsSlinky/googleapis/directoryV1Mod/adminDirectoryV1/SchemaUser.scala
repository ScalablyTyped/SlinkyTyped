package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for User object in Directory API.
  */
@js.native
trait SchemaUser extends js.Object {
  var addresses: js.UndefOr[js.Any] = js.native
  /**
    * Indicates if user has agreed to terms (Read-only)
    */
  var agreedToTerms: js.UndefOr[Boolean] = js.native
  /**
    * List of aliases (Read-only)
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates if user is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating if the user should change password in next login
    */
  var changePasswordAtNextLogin: js.UndefOr[Boolean] = js.native
  /**
    * User&#39;s G Suite account creation time. (Read-only)
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Custom fields of the user.
    */
  var customSchemas: js.UndefOr[StringDictionary[SchemaUserCustomProperties]] = js.native
  /**
    * CustomerId of User (Read-only)
    */
  var customerId: js.UndefOr[String] = js.native
  var deletionTime: js.UndefOr[String] = js.native
  var emails: js.UndefOr[js.Any] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  var externalIds: js.UndefOr[js.Any] = js.native
  var gender: js.UndefOr[js.Any] = js.native
  /**
    * Hash function name for password. Supported are MD5, SHA-1 and crypt
    */
  var hashFunction: js.UndefOr[String] = js.native
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  var ims: js.UndefOr[js.Any] = js.native
  /**
    * Boolean indicating if user is included in Global Address List
    */
  var includeInGlobalAddressList: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating if ip is whitelisted
    */
  var ipWhitelisted: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating if the user is admin (Read-only)
    */
  var isAdmin: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating if the user is delegated admin (Read-only)
    */
  var isDelegatedAdmin: js.UndefOr[Boolean] = js.native
  /**
    * Is 2-step verification enforced (Read-only)
    */
  var isEnforcedIn2Sv: js.UndefOr[Boolean] = js.native
  /**
    * Is enrolled in 2-step verification (Read-only)
    */
  var isEnrolledIn2Sv: js.UndefOr[Boolean] = js.native
  /**
    * Is mailbox setup (Read-only)
    */
  var isMailboxSetup: js.UndefOr[Boolean] = js.native
  var keywords: js.UndefOr[js.Any] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  var languages: js.UndefOr[js.Any] = js.native
  /**
    * User&#39;s last login time. (Read-only)
    */
  var lastLoginTime: js.UndefOr[String] = js.native
  var locations: js.UndefOr[js.Any] = js.native
  /**
    * User&#39;s name
    */
  var name: js.UndefOr[SchemaUserName] = js.native
  /**
    * List of non editable aliases (Read-only)
    */
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.native
  var notes: js.UndefOr[js.Any] = js.native
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  var organizations: js.UndefOr[js.Any] = js.native
  /**
    * User&#39;s password
    */
  var password: js.UndefOr[String] = js.native
  var phones: js.UndefOr[js.Any] = js.native
  var posixAccounts: js.UndefOr[js.Any] = js.native
  /**
    * username of User
    */
  var primaryEmail: js.UndefOr[String] = js.native
  var relations: js.UndefOr[js.Any] = js.native
  var sshPublicKeys: js.UndefOr[js.Any] = js.native
  /**
    * Indicates if user is suspended.
    */
  var suspended: js.UndefOr[Boolean] = js.native
  /**
    * Suspension reason if user is suspended (Read-only)
    */
  var suspensionReason: js.UndefOr[String] = js.native
  /**
    * ETag of the user&#39;s photo (Read-only)
    */
  var thumbnailPhotoEtag: js.UndefOr[String] = js.native
  /**
    * Photo Url of the user (Read-only)
    */
  var thumbnailPhotoUrl: js.UndefOr[String] = js.native
  var websites: js.UndefOr[js.Any] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAgreedToTerms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreedToTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgreedToTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreedToTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withChangePasswordAtNextLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePasswordAtNextLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangePasswordAtNextLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePasswordAtNextLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSchemas(value: StringDictionary[SchemaUserCustomProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEmails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withHashFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ims")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInGlobalAddressList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInGlobalAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInGlobalAddressList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInGlobalAddressList")(js.undefined)
        ret
    }
    @scala.inline
    def withIpWhitelisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipWhitelisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpWhitelisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipWhitelisted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdmin")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDelegatedAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDelegatedAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDelegatedAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDelegatedAdmin")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnforcedIn2Sv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnforcedIn2Sv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnforcedIn2Sv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnforcedIn2Sv")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnrolledIn2Sv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnrolledIn2Sv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnrolledIn2Sv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnrolledIn2Sv")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMailboxSetup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMailboxSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMailboxSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMailboxSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguages(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withLastLoginTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastLoginTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SchemaUserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonEditableAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEditableAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonEditableAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEditableAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPhones(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(js.undefined)
        ret
    }
    @scala.inline
    def withPosixAccounts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRelations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailPhotoEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPhotoEtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailPhotoEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPhotoEtag")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPhotoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailPhotoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsites(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(js.undefined)
        ret
    }
  }
  
}

