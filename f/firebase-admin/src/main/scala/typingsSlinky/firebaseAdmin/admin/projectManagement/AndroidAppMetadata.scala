package typingsSlinky.firebaseAdmin.admin.projectManagement

import typingsSlinky.firebaseAdmin.admin.projectManagement.AppPlatform.ANDROID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a Firebase Android App.
  */
@js.native
trait AndroidAppMetadata extends AppMetadata {
  /**
    * The canonical package name of the Android App, as would appear in the Google Play Developer
    * Console.
    *
    * @example
    * ```javascript
    * var packageName = androidAppMetadata.packageName;
    * ```
    */
  var packageName: String = js.native
  @JSName("platform")
  var platform_AndroidAppMetadata: ANDROID = js.native
}

object AndroidAppMetadata {
  @scala.inline
  def apply(appId: String, packageName: String, platform: ANDROID, projectId: String, resourceName: String): AndroidAppMetadata = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidAppMetadata]
  }
  @scala.inline
  implicit class AndroidAppMetadataOps[Self <: AndroidAppMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: ANDROID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

