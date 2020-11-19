package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPercentilesRequest extends js.Object {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The percentile groups returned.
    */
  var percents: js.UndefOr[PercentList] = js.native
  
  /**
    * The query string.
    */
  var queryString: QueryString = js.native
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}
object GetPercentilesRequest {
  
  @scala.inline
  def apply(queryString: QueryString): GetPercentilesRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPercentilesRequest]
  }
  
  @scala.inline
  implicit class GetPercentilesRequestOps[Self <: GetPercentilesRequest] (val x: Self) extends AnyVal {
    
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
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationField(value: AggregationField): Self = this.set("aggregationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationField: Self = this.set("aggregationField", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
    
    @scala.inline
    def setPercentsVarargs(value: Percent*): Self = this.set("percents", js.Array(value :_*))
    
    @scala.inline
    def setPercents(value: PercentList): Self = this.set("percents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercents: Self = this.set("percents", js.undefined)
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = this.set("queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryVersion: Self = this.set("queryVersion", js.undefined)
  }
}
