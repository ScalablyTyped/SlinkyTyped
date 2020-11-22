package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramResult extends js.Object {
  
  /** The Histogram search filters. */
  var searchType: js.UndefOr[String] = js.native
  
  /**
    * A map from the values of field to the number of jobs with that value in this search result. Key: search type (filter names, such as the companyName). Values: the count of jobs that
    * match the filter for this search.
    */
  var values: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typingsSlinky.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramResult with TopLevel[js.Any]
  ] = js.native
}
object HistogramResult {
  
  @scala.inline
  def apply(): HistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramResult]
  }
  
  @scala.inline
  implicit class HistogramResultOps[Self <: HistogramResult] (val x: Self) extends AnyVal {
    
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
    def setSearchType(value: String): Self = this.set("searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    
    @scala.inline
    def setValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typingsSlinky.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramResult with TopLevel[js.Any]
    ): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
