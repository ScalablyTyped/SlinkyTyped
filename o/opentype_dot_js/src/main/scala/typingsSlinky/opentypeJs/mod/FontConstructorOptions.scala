package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined opentype.js.opentype.js.FontConstructorOptionsBase & std.Partial<opentype.js.opentype.js.FontOptions> & {  glyphs  :std.Array<opentype.js.opentype.js.Glyph>} */
@js.native
trait FontConstructorOptions extends js.Object {
  var ascender: js.UndefOr[Double] = js.native
  var copyright: js.UndefOr[String] = js.native
  var createdTimestamp: js.UndefOr[Double] = js.native
  var descender: js.UndefOr[Double] = js.native
  var description: js.UndefOr[String] = js.native
  var designer: js.UndefOr[String] = js.native
  var designerURL: js.UndefOr[String] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var familyName: js.UndefOr[String] = js.native
  var fsSelection: js.UndefOr[String] = js.native
  var fullName: js.UndefOr[String] = js.native
  var glyphs: js.Array[Glyph] = js.native
  var license: js.UndefOr[String] = js.native
  var licenseURL: js.UndefOr[String] = js.native
  var manufacturer: js.UndefOr[String] = js.native
  var manufacturerURL: js.UndefOr[String] = js.native
  var postScriptName: js.UndefOr[String] = js.native
  var styleName: js.UndefOr[String] = js.native
  var trademark: js.UndefOr[String] = js.native
  var unitsPerEm: js.UndefOr[Double] = js.native
  var version: js.UndefOr[String] = js.native
  var weightClass: js.UndefOr[String] = js.native
  var widthClass: js.UndefOr[String] = js.native
}

object FontConstructorOptions {
  @scala.inline
  def apply(glyphs: js.Array[Glyph]): FontConstructorOptions = {
    val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptions]
  }
  @scala.inline
  implicit class FontConstructorOptionsOps[Self <: FontConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlyphs(value: js.Array[Glyph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascender")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDescender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descender")(js.undefined)
        ret
    }
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
    def withDesigner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(js.undefined)
        ret
    }
    @scala.inline
    def withDesignerURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesignerURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designerURL")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFsSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturerURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerURL")(js.undefined)
        ret
    }
    @scala.inline
    def withPostScriptName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postScriptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostScriptName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postScriptName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrademark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trademark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrademark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trademark")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitsPerEm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitsPerEm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitsPerEm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitsPerEm")(js.undefined)
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
    @scala.inline
    def withWeightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthClass")(js.undefined)
        ret
    }
  }
  
}

