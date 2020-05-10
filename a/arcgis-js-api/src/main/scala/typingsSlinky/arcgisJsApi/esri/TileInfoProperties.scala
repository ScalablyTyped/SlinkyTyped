package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dib
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.emf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lerc
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mixed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png24
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ps
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svgz
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileInfoProperties extends js.Object {
  /**
    * The dots per inch (DPI) of the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.native
  /**
    * Image format of the cached tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: js.UndefOr[
    png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc
  ] = js.native
  /**
    * Indicates if the tiling scheme supports wrap around.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#isWrappable)
    */
  var isWrappable: js.UndefOr[Boolean] = js.native
  /**
    * An array of levels of detail that define the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods)
    */
  var lods: js.UndefOr[js.Array[LODProperties]] = js.native
  /**
    * The tiling scheme origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#origin)
    */
  var origin: js.UndefOr[PointProperties] = js.native
  /**
    * Size of tiles in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The spatial reference of the tiling schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
}

object TileInfoProperties {
  @scala.inline
  def apply(): TileInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileInfoProperties]
  }
  @scala.inline
  implicit class TileInfoPropertiesOps[Self <: TileInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWrappable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWrappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWrappable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWrappable")(js.undefined)
        ret
    }
    @scala.inline
    def withLods(value: js.Array[LODProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
  }
  
}

