package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withQueryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String | IFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStaging")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialFilter(value: ISpatialFilterOptions | IFindNearRouteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

