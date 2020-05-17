package typingsSlinky.npmLicenseCrawler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseUrl extends js.Object {
  var licenseUrl: String = js.native
  var licenses: String = js.native
  var parents: String = js.native
  var repository: String = js.native
}

object LicenseUrl {
  @scala.inline
  def apply(licenseUrl: String, licenses: String, parents: String, repository: String): LicenseUrl = {
    val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseUrl]
  }
  @scala.inline
  implicit class LicenseUrlOps[Self <: LicenseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

