package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsAppearOn extends js.Object {
  
  var adsAppearOn: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var siteLanguage: js.UndefOr[String] = js.native
}
object AdsAppearOn {
  
  @scala.inline
  def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  
  @scala.inline
  implicit class AdsAppearOnOps[Self <: AdsAppearOn] (val x: Self) extends AnyVal {
    
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
    def setAdsAppearOn(value: String): Self = this.set("adsAppearOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsAppearOn: Self = this.set("adsAppearOn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSiteLanguage(value: String): Self = this.set("siteLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteLanguage: Self = this.set("siteLanguage", js.undefined)
  }
}
