package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingOptions extends StObject {
  
  /**
    * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
    */
  var CustomRedirectDomain: js.UndefOr[typingsSlinky.awsSdk.sesMod.CustomRedirectDomain] = js.native
}
object TrackingOptions {
  
  @scala.inline
  def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  
  @scala.inline
  implicit class TrackingOptionsMutableBuilder[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomRedirectDomain(value: CustomRedirectDomain): Self = StObject.set(x, "CustomRedirectDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRedirectDomainUndefined: Self = StObject.set(x, "CustomRedirectDomain", js.undefined)
  }
}
