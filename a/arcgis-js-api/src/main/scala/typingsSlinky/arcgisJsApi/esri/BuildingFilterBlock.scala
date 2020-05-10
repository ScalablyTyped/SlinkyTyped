package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingFilterBlock extends Object {
  /**
    * The SQL where clause used to match features to this filter block. Only the features that satisfy the filter expression are displayed in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This property is evaluated on the client using the cached attributes and it only supports [standardized SQL](http://doc.arcgis.com/en/arcgis-online/reference/sql-agol.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterExpression: String = js.native
  /**
    * This object contains information about the filter mode of the filter block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterMode: js.UndefOr[BuildingFilterBlockFilterMode] = js.native
  /**
    * Title of the filter for display in UIs, for example when the filter block is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var title: js.UndefOr[String] = js.native
}

object BuildingFilterBlock {
  @scala.inline
  def apply(
    constructor: js.Function,
    filterExpression: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BuildingFilterBlock = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], filterExpression = filterExpression.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BuildingFilterBlock]
  }
  @scala.inline
  implicit class BuildingFilterBlockOps[Self <: BuildingFilterBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterMode(value: BuildingFilterBlockFilterMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

