package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseConfigurationsResponse extends StObject {
  
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurations: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfigurations] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListLicenseConfigurationsResponse {
  
  @scala.inline
  def apply(): ListLicenseConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListLicenseConfigurationsResponseMutableBuilder[Self <: ListLicenseConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurations(value: LicenseConfigurations): Self = StObject.set(x, "LicenseConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationsUndefined: Self = StObject.set(x, "LicenseConfigurations", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationsVarargs(value: LicenseConfiguration*): Self = StObject.set(x, "LicenseConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
