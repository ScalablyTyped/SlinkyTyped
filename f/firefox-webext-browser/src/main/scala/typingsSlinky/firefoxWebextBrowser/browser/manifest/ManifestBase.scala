package typingsSlinky.firefoxWebextBrowser.browser.manifest

import typingsSlinky.firefoxWebextBrowser.anon.Edge
import typingsSlinky.firefoxWebextBrowser.anon.Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common properties for all manifest.json files */
@js.native
trait ManifestBase extends js.Object {
  
  var applications: js.UndefOr[Gecko] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var browser_specific_settings: js.UndefOr[Edge] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var homepage_url: js.UndefOr[String] = js.native
  
  var manifest_version: Double = js.native
  
  var name: String = js.native
  
  var short_name: js.UndefOr[String] = js.native
  
  var version: String = js.native
}
object ManifestBase {
  
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): ManifestBase = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestBase]
  }
  
  @scala.inline
  implicit class ManifestBaseOps[Self <: ManifestBase] (val x: Self) extends AnyVal {
    
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
    def setManifest_version(value: Double): Self = this.set("manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplications(value: Gecko): Self = this.set("applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: Edge): Self = this.set("browser_specific_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_specific_settings: Self = this.set("browser_specific_settings", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHomepage_url(value: String): Self = this.set("homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage_url: Self = this.set("homepage_url", js.undefined)
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
  }
}
