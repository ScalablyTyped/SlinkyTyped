package typingsSlinky.reactIcons.iconsManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconManifest extends js.Object {
  var id: String = js.native
  var license: String = js.native
  var licenseUrl: String = js.native
  var name: String = js.native
  var projectUrl: String = js.native
}

object IconManifest {
  @scala.inline
  def apply(id: String, license: String, licenseUrl: String, name: String, projectUrl: String): IconManifest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseUrl = licenseUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectUrl = projectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconManifest]
  }
  @scala.inline
  implicit class IconManifestOps[Self <: IconManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

