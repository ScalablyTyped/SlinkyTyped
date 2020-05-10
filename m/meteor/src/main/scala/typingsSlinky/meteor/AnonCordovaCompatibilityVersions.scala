package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCordovaCompatibilityVersions extends js.Object {
  var PUBLIC_SETTINGS: js.Any = js.native
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.native
  var format: String = js.native
  var manifest: js.Any = js.native
  var version: String = js.native
}

object AnonCordovaCompatibilityVersions {
  @scala.inline
  def apply(PUBLIC_SETTINGS: js.Any, format: String, manifest: js.Any, version: String): AnonCordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCordovaCompatibilityVersions]
  }
  @scala.inline
  implicit class AnonCordovaCompatibilityVersionsOps[Self <: AnonCordovaCompatibilityVersions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPUBLIC_SETTINGS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PUBLIC_SETTINGS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCordovaCompatibilityVersions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordovaCompatibilityVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCordovaCompatibilityVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordovaCompatibilityVersions")(js.undefined)
        ret
    }
  }
  
}

