package typingsSlinky.licenseChecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleInfo extends js.Object {
  /**
    * Module description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Publisher e-mail
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Path to license file, if available
    */
  var licenseFile: js.UndefOr[String] = js.native
  /**
    * Whether the license is modified
    */
  var licenseModified: js.UndefOr[String] = js.native
  /**
    * Contents of the license
    */
  var licenseText: js.UndefOr[String] = js.native
  /**
    * Array of licenses
    */
  var licenses: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Module name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Publisher name
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Repository URL
    */
  var repository: js.UndefOr[String] = js.native
  /**
    * Publisher URL
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Module version
    */
  var version: js.UndefOr[String] = js.native
}

object ModuleInfo {
  @scala.inline
  def apply(): ModuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleInfo]
  }
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseText")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenses(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenses")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

