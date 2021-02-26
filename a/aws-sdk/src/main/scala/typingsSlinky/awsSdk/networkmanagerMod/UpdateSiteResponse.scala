package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSiteResponse extends StObject {
  
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Site] = js.native
}
object UpdateSiteResponse {
  
  @scala.inline
  def apply(): UpdateSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSiteResponse]
  }
  
  @scala.inline
  implicit class UpdateSiteResponseMutableBuilder[Self <: UpdateSiteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
