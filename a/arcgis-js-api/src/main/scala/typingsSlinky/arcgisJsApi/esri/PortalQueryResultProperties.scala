package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalQueryResultProperties extends js.Object {
  /**
    * The query parameters for the next set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#nextQueryParams)
    */
  var nextQueryParams: js.UndefOr[PortalQueryParamsProperties] = js.native
  /**
    * The query parameters for the first set of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#queryParams)
    */
  var queryParams: js.UndefOr[PortalQueryParamsProperties] = js.native
  /**
    * An array of result item objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results)
    */
  var results: js.UndefOr[js.Array[_]] = js.native
  /**
    * The total number of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#total)
    */
  var total: js.UndefOr[Double] = js.native
}

object PortalQueryResultProperties {
  @scala.inline
  def apply(): PortalQueryResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalQueryResultProperties]
  }
  @scala.inline
  implicit class PortalQueryResultPropertiesOps[Self <: PortalQueryResultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextQueryParams(value: PortalQueryParamsProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextQueryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: PortalQueryParamsProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

