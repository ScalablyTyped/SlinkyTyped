package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined opentype.js.opentype.js.FontConstructorOptionsBase & std.Partial<opentype.js.opentype.js.FontOptions> & {  glyphs :std.Array<opentype.js.opentype.js.Glyph>} */
@js.native
trait FontConstructorOptions extends js.Object {
  
  var ascender: Double with js.UndefOr[Double] = js.native
  
  var copyright: js.UndefOr[String] = js.native
  
  var createdTimestamp: js.UndefOr[Double] = js.native
  
  var descender: Double with js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var designer: js.UndefOr[String] = js.native
  
  var designerURL: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var familyName: String with js.UndefOr[String] = js.native
  
  var fsSelection: js.UndefOr[String] = js.native
  
  var fullName: js.UndefOr[String] = js.native
  
  var glyphs: js.Array[Glyph] = js.native
  
  var license: js.UndefOr[String] = js.native
  
  var licenseURL: js.UndefOr[String] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var manufacturerURL: js.UndefOr[String] = js.native
  
  var postScriptName: js.UndefOr[String] = js.native
  
  var styleName: String with js.UndefOr[String] = js.native
  
  var trademark: js.UndefOr[String] = js.native
  
  var unitsPerEm: Double with js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var weightClass: js.UndefOr[String] = js.native
  
  var widthClass: js.UndefOr[String] = js.native
}
object FontConstructorOptions {
  
  @scala.inline
  def apply(
    ascender: Double with js.UndefOr[Double],
    descender: Double with js.UndefOr[Double],
    familyName: String with js.UndefOr[String],
    glyphs: js.Array[Glyph],
    styleName: String with js.UndefOr[String],
    unitsPerEm: Double with js.UndefOr[Double]
  ): FontConstructorOptions = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptions]
  }
  
  @scala.inline
  implicit class FontConstructorOptionsOps[Self <: FontConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAscender(value: Double with js.UndefOr[Double]): Self = this.set("ascender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescender(value: Double with js.UndefOr[Double]): Self = this.set("descender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String with js.UndefOr[String]): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphsVarargs(value: Glyph*): Self = this.set("glyphs", js.Array(value :_*))
    
    @scala.inline
    def setGlyphs(value: js.Array[Glyph]): Self = this.set("glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String with js.UndefOr[String]): Self = this.set("styleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsPerEm(value: Double with js.UndefOr[Double]): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Double): Self = this.set("createdTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("createdTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDesigner(value: String): Self = this.set("designer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesigner: Self = this.set("designer", js.undefined)
    
    @scala.inline
    def setDesignerURL(value: String): Self = this.set("designerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignerURL: Self = this.set("designerURL", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFsSelection(value: String): Self = this.set("fsSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsSelection: Self = this.set("fsSelection", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setLicenseURL(value: String): Self = this.set("licenseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseURL: Self = this.set("licenseURL", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setManufacturerURL(value: String): Self = this.set("manufacturerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerURL: Self = this.set("manufacturerURL", js.undefined)
    
    @scala.inline
    def setPostScriptName(value: String): Self = this.set("postScriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostScriptName: Self = this.set("postScriptName", js.undefined)
    
    @scala.inline
    def setTrademark(value: String): Self = this.set("trademark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrademark: Self = this.set("trademark", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWeightClass(value: String): Self = this.set("weightClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightClass: Self = this.set("weightClass", js.undefined)
    
    @scala.inline
    def setWidthClass(value: String): Self = this.set("widthClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthClass: Self = this.set("widthClass", js.undefined)
  }
}
