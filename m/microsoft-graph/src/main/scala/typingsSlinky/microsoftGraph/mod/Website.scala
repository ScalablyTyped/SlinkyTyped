package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Website extends js.Object {
  
  // The URL of the website.
  var address: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name of the web site.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The possible values are: other, home, work, blog, profile.
  var `type`: js.UndefOr[NullableOption[WebsiteType]] = js.native
}
object Website {
  
  @scala.inline
  def apply(): Website = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Website]
  }
  
  @scala.inline
  implicit class WebsiteOps[Self <: Website] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: NullableOption[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setType(value: NullableOption[WebsiteType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
