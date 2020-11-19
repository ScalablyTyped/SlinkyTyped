package typingsSlinky.appBuilderLib.licenseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseFile extends js.Object {
  
  var file: String = js.native
  
  var lang: String = js.native
  
  var langName: String = js.native
  
  var langWithRegion: String = js.native
}
object LicenseFile {
  
  @scala.inline
  def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseFile]
  }
  
  @scala.inline
  implicit class LicenseFileOps[Self <: LicenseFile] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangName(value: String): Self = this.set("langName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangWithRegion(value: String): Self = this.set("langWithRegion", value.asInstanceOf[js.Any])
  }
}
