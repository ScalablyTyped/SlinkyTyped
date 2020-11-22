package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionFilterClause extends js.Object {
  
  /** The repeated set of filters. They are logically combined based on the operator specified. */
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.native
  
  /** The operator for combining multiple dimension filters. If unspecified, it is treated as an `OR`. */
  var operator: js.UndefOr[String] = js.native
}
object DimensionFilterClause {
  
  @scala.inline
  def apply(): DimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionFilterClause]
  }
  
  @scala.inline
  implicit class DimensionFilterClauseOps[Self <: DimensionFilterClause] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: DimensionFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[DimensionFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
}
