package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramFacets extends js.Object {
  
  /** Optional. Specifies compensation field-based histogram requests. Duplicate values of CompensationHistogramRequest.type are not allowed. */
  var compensationHistogramFacets: js.UndefOr[js.Array[CompensationHistogramRequest]] = js.native
  
  /** Optional. Specifies the custom attributes histogram requests. Duplicate values of CustomAttributeHistogramRequest.key are not allowed. */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[CustomAttributeHistogramRequest]] = js.native
  
  /** Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.native
}
object HistogramFacets {
  
  @scala.inline
  def apply(): HistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramFacets]
  }
  
  @scala.inline
  implicit class HistogramFacetsOps[Self <: HistogramFacets] (val x: Self) extends AnyVal {
    
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
    def setCompensationHistogramFacetsVarargs(value: CompensationHistogramRequest*): Self = this.set("compensationHistogramFacets", js.Array(value :_*))
    
    @scala.inline
    def setCompensationHistogramFacets(value: js.Array[CompensationHistogramRequest]): Self = this.set("compensationHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompensationHistogramFacets: Self = this.set("compensationHistogramFacets", js.undefined)
    
    @scala.inline
    def setCustomAttributeHistogramFacetsVarargs(value: CustomAttributeHistogramRequest*): Self = this.set("customAttributeHistogramFacets", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributeHistogramFacets(value: js.Array[CustomAttributeHistogramRequest]): Self = this.set("customAttributeHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributeHistogramFacets: Self = this.set("customAttributeHistogramFacets", js.undefined)
    
    @scala.inline
    def setSimpleHistogramFacetsVarargs(value: String*): Self = this.set("simpleHistogramFacets", js.Array(value :_*))
    
    @scala.inline
    def setSimpleHistogramFacets(value: js.Array[String]): Self = this.set("simpleHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleHistogramFacets: Self = this.set("simpleHistogramFacets", js.undefined)
  }
}
