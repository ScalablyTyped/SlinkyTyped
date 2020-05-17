package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingFilter extends JSONSupport {
  /**
    * Description of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#description)
    */
  var description: String = js.native
  /**
    * Filter blocks define which features should be visible in the affected [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) and how the filtered features are drawn. A filter should contain at least one filter block.  The order of filter blocks influences the order in which the filter blocks are applied. For example, if a filter block using a `wire-frame` mode precedes a `solid` filter block in the collection, elements that match either filter block will be drawn as wireframe.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks)
    */
  var filterBlocks: Collection[BuildingFilterBlock] = js.native
  /**
    * Unique filter id. Assign this id to [BuildingSceneLayer.activeFilterId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId) to activate the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id)
    */
  val id: String = js.native
  /**
    * Name of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#name)
    */
  var name: String = js.native
}

object BuildingFilter {
  @scala.inline
  def apply(
    description: String,
    filterBlocks: Collection[BuildingFilterBlock],
    id: String,
    name: String,
    toJSON: () => js.Any
  ): BuildingFilter = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filterBlocks = filterBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[BuildingFilter]
  }
  @scala.inline
  implicit class BuildingFilterOps[Self <: BuildingFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterBlocks(value: Collection[BuildingFilterBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

