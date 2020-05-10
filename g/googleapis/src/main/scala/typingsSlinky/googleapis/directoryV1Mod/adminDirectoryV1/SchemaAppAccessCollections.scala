package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for App Access Collections Resource object in Directory API.
  */
@js.native
trait SchemaAppAccessCollections extends js.Object {
  /**
    * List of blocked api access buckets.
    */
  var blockedApiAccessBuckets: js.UndefOr[js.Array[String]] = js.native
  /**
    * Boolean to indicate whether to enforce app access settings on Android
    * Drive or not.
    */
  var enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.native
  /**
    * Error message provided by the Admin that will be shown to the user when
    * an app is blocked.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as an app access collection. Value:
    * admin#directory#appaccesscollection
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Unique ID of app access collection. (Readonly)
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Resource name given by the customer while creating/updating. Should be
    * unique under given customer.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Boolean that indicates whether to trust domain owned apps.
    */
  var trustDomainOwnedApps: js.UndefOr[Boolean] = js.native
}

object SchemaAppAccessCollections {
  @scala.inline
  def apply(): SchemaAppAccessCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppAccessCollections]
  }
  @scala.inline
  implicit class SchemaAppAccessCollectionsOps[Self <: SchemaAppAccessCollections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedApiAccessBuckets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedApiAccessBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedApiAccessBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedApiAccessBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceSettingsForAndroidDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceSettingsForAndroidDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceSettingsForAndroidDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceSettingsForAndroidDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
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
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustDomainOwnedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustDomainOwnedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustDomainOwnedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustDomainOwnedApps")(js.undefined)
        ret
    }
  }
  
}

