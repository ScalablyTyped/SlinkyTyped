package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendLayerProperties extends js.Object {
  /**
    * The id of the operational layer to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#layerId)
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The ids of the sublayers to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#subLayerIds)
    */
  var subLayerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The title of the feature layer. Use this property to modify feature layer name in the legend for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object LegendLayerProperties {
  @scala.inline
  def apply(): LegendLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayerProperties]
  }
  @scala.inline
  implicit class LegendLayerPropertiesOps[Self <: LegendLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubLayerIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLayerIds")(js.undefined)
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

