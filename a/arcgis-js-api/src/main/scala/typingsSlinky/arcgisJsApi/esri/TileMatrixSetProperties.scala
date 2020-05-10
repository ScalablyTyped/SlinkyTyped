package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMatrixSetProperties extends js.Object {
  /**
    * The full extent of the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The unique ID assigned to the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
}

object TileMatrixSetProperties {
  @scala.inline
  def apply(): TileMatrixSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMatrixSetProperties]
  }
  @scala.inline
  implicit class TileMatrixSetPropertiesOps[Self <: TileMatrixSetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withTileInfo(value: TileInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(js.undefined)
        ret
    }
  }
  
}

