package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hide
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingGroupSublayerProperties extends BuildingSublayerProperties {
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. The possible values are listed below.
    *
    * Value | Description
    * ------|------------
    *  show | The layer is visible in the table of contents.
    *  hide | The layer is hidden in the table of contents.
    *  hide-children | Hide the children layers from the table of contents.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#listMode)
    *
    * @default show
    */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.native
}

object BuildingGroupSublayerProperties {
  @scala.inline
  def apply(): BuildingGroupSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingGroupSublayerProperties]
  }
  @scala.inline
  implicit class BuildingGroupSublayerPropertiesOps[Self <: BuildingGroupSublayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListMode(value: show | hide | `hide-children`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(js.undefined)
        ret
    }
  }
  
}

