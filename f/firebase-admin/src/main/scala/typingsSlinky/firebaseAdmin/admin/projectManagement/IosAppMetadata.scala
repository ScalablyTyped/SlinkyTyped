package typingsSlinky.firebaseAdmin.admin.projectManagement

import typingsSlinky.firebaseAdmin.admin.projectManagement.AppPlatform.IOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase iOS App.
  */
@js.native
trait IosAppMetadata extends AppMetadata {
  /**
    * The canonical bundle ID of the iOS App as it would appear in the iOS App Store.
    *
    * @example
    * ```javascript
    * var bundleId = iosAppMetadata.bundleId;
    *```
    */
  var bundleId: String = js.native
  @JSName("platform")
  var platform_IosAppMetadata: IOS = js.native
}

object IosAppMetadata {
  @scala.inline
  def apply(appId: String, bundleId: String, platform: IOS, projectId: String, resourceName: String): IosAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosAppMetadata]
  }
  @scala.inline
  implicit class IosAppMetadataOps[Self <: IosAppMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: IOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

