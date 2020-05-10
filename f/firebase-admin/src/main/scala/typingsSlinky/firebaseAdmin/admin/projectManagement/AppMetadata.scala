package typingsSlinky.firebaseAdmin.admin.projectManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase app.
  */
@js.native
trait AppMetadata extends js.Object {
  /**
    * The globally unique, Firebase-assigned identifier of the app.
    *
    * @example
    * ```javascript
    * var appId = appMetadata.appId;
    * ```
    */
  var appId: String = js.native
  /**
    * The optional user-assigned display name of the app.
    *
    * @example
    * ```javascript
    * var displayName = appMetadata.displayName;
    * ```
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The development platform of the app. Supporting Android and iOS app platforms.
    *
    * @example
    * ```javascript
    * var platform = AppPlatform.ANDROID;
    * ```
    */
  var platform: AppPlatform = js.native
  /**
    * The globally unique, user-assigned ID of the parent project for the app.
    *
    * @example
    * ```javascript
    * var projectId = appMetadata.projectId;
    * ```
    */
  var projectId: String = js.native
  /**
    * The fully-qualified resource name that identifies this app.
    *
    * This is useful when manually constructing requests for Firebase's public API.
    *
    * @example
    * ```javascript
    * var resourceName = androidAppMetadata.resourceName;
    * ```
    */
  var resourceName: String = js.native
}

object AppMetadata {
  @scala.inline
  def apply(appId: String, platform: AppPlatform, projectId: String, resourceName: String): AppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMetadata]
  }
  @scala.inline
  implicit class AppMetadataOps[Self <: AppMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: AppPlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

