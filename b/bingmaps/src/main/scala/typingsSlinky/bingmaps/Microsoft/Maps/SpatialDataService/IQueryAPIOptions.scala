package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryAPIOptions extends js.Object {
  
  /** Specifies a conditional expression for a list of properties and values. */
  var filter: js.UndefOr[String | IFilter] = js.native
  
  /** Specifies whether or not to return a count of the results in the response. Default: false */
  var inlineCount: js.UndefOr[Boolean] = js.native
  
  /** Specifies to query the staged version of the data source instead of the published version. Default: false */
  var isStaging: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies one or more properties to use to sort the results of a query. 
    * You can specify up to three (3) properties. Results are sorted in ascending order.
    * Note: You cannot use the latitude and longitude properties to sort results. You can use the elevation property.
    */
  var orderBy: js.UndefOr[js.Array[String]] = js.native
  
  /** A queryurl containing the access id, data source name and the entity type name. */
  var queryUrl: String = js.native
  
  /**
    * Specifies the data source properties to return in the response. If the $select query option is not specified or
    * if it is set to "" ($select=), all data source properties are returned. Default: "*,_distance"
    */
  var select: js.UndefOr[js.Array[String]] = js.native
  
  /** Specifies to not return a specified number of query results. */
  var skip: js.UndefOr[Double] = js.native
  
  /** Spatial filter options to apply. */
  var spatialFilter: js.UndefOr[ISpatialFilterOptions | IFindNearRouteOptions] = js.native
  
  /** Specifies the maximum number of results to return in the query response. Default: 25 */
  var top: js.UndefOr[Double] = js.native
}
object IQueryAPIOptions {
  
  @scala.inline
  def apply(queryUrl: String): IQueryAPIOptions = {
    val __obj = js.Dynamic.literal(queryUrl = queryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryAPIOptions]
  }
  
  @scala.inline
  implicit class IQueryAPIOptionsOps[Self <: IQueryAPIOptions] (val x: Self) extends AnyVal {
    
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
    def setQueryUrl(value: String): Self = this.set("queryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String | IFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setInlineCount(value: Boolean): Self = this.set("inlineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineCount: Self = this.set("inlineCount", js.undefined)
    
    @scala.inline
    def setIsStaging(value: Boolean): Self = this.set("isStaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStaging: Self = this.set("isStaging", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: String*): Self = this.set("orderBy", js.Array(value :_*))
    
    @scala.inline
    def setOrderBy(value: js.Array[String]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setSelectVarargs(value: String*): Self = this.set("select", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: js.Array[String]): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSpatialFilter(value: ISpatialFilterOptions | IFindNearRouteOptions): Self = this.set("spatialFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialFilter: Self = this.set("spatialFilter", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
