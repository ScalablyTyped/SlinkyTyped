package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLicenseConfigurationsRequest extends js.Object {
  
  /**
    * Filters to scope the results. The following filters and logical operators are supported:    licenseCountingType - The dimension on which licenses are counted. Possible values are vCPU | Instance | Core | Socket. Logical operators are EQUALS | NOT_EQUALS.    enforceLicenseCount - A Boolean value that indicates whether hard license enforcement is used. Logical operators are EQUALS | NOT_EQUALS.    usagelimitExceeded - A Boolean value that indicates whether the available licenses have been exceeded. Logical operators are EQUALS | NOT_EQUALS.  
    */
  var Filters: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.Filters] = js.native
  
  /**
    * Amazon Resource Names (ARN) of the license configurations.
    */
  var LicenseConfigurationArns: js.UndefOr[StringList] = js.native
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListLicenseConfigurationsRequest {
  
  @scala.inline
  def apply(): ListLicenseConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListLicenseConfigurationsRequestOps[Self <: ListLicenseConfigurationsRequest] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: String*): Self = this.set("LicenseConfigurationArns", js.Array(value :_*))
    
    @scala.inline
    def setLicenseConfigurationArns(value: StringList): Self = this.set("LicenseConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseConfigurationArns: Self = this.set("LicenseConfigurationArns", js.undefined)
    
    @scala.inline
    def setMaxResults(value: BoxInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
