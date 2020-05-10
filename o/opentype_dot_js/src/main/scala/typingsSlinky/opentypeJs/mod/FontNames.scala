package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontNames extends js.Object {
  var copyright: LocalizedName = js.native
  var description: LocalizedName = js.native
  var designer: LocalizedName = js.native
  var designerURL: LocalizedName = js.native
  var fontFamily: LocalizedName = js.native
  var fontSubfamily: LocalizedName = js.native
  var fullName: LocalizedName = js.native
  var license: LocalizedName = js.native
  var licenseURL: LocalizedName = js.native
  var manufacturer: LocalizedName = js.native
  var manufacturerURL: LocalizedName = js.native
  var postScriptName: LocalizedName = js.native
  var trademark: LocalizedName = js.native
  var version: LocalizedName = js.native
}

object FontNames {
  @scala.inline
  def apply(
    copyright: LocalizedName,
    description: LocalizedName,
    designer: LocalizedName,
    designerURL: LocalizedName,
    fontFamily: LocalizedName,
    fontSubfamily: LocalizedName,
    fullName: LocalizedName,
    license: LocalizedName,
    licenseURL: LocalizedName,
    manufacturer: LocalizedName,
    manufacturerURL: LocalizedName,
    postScriptName: LocalizedName,
    trademark: LocalizedName,
    version: LocalizedName
  ): FontNames = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], designer = designer.asInstanceOf[js.Any], designerURL = designerURL.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSubfamily = fontSubfamily.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseURL = licenseURL.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], manufacturerURL = manufacturerURL.asInstanceOf[js.Any], postScriptName = postScriptName.asInstanceOf[js.Any], trademark = trademark.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontNames]
  }
  @scala.inline
  implicit class FontNamesOps[Self <: FontNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesigner(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesignerURL(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSubfamily(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSubfamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseURL(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerURL(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostScriptName(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postScriptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrademark(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trademark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: LocalizedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

