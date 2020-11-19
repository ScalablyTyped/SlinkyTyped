package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePackComplianceRequest extends js.Object {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  
  /**
    * A ConformancePackComplianceFilters object.
    */
  var Filters: js.UndefOr[ConformancePackComplianceFilters] = js.native
  
  /**
    * The maximum number of AWS Config rules within a conformance pack are returned on each page.
    */
  var Limit: js.UndefOr[DescribeConformancePackComplianceLimit] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeConformancePackComplianceRequest {
  
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): DescribeConformancePackComplianceRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceRequest]
  }
  
  @scala.inline
  implicit class DescribeConformancePackComplianceRequestOps[Self <: DescribeConformancePackComplianceRequest] (val x: Self) extends AnyVal {
    
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
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: ConformancePackComplianceFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeConformancePackComplianceLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
