package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSiteResponse extends js.Object {
  
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Site] = js.native
}
object CreateSiteResponse {
  
  @scala.inline
  def apply(): CreateSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSiteResponse]
  }
  
  @scala.inline
  implicit class CreateSiteResponseOps[Self <: CreateSiteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSite(value: Site): Self = this.set("Site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("Site", js.undefined)
  }
}
