package typingsSlinky.heredatalens.H.datalens.RawDataProvider

import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class used in the worker thread
  * This helper class provides convenience functions you can use in the worker thread
  */
@js.native
trait Helpers extends js.Object {
  /** Translates geographical coordinates (latitude, longitude) to world pixel coordinates. */
  var latLngToPixel: js.UndefOr[
    js.Function4[
      /* latitude */ Latitude, 
      /* longitude */ Longitude, 
      /* z */ Zoom, 
      /* tileSize */ TileSize, 
      PixelCoordinates
    ]
  ] = js.native
  /** Takes CSV data as input, parses it, and return the parsed result. */
  var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.native
  /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
  var pixelToLatLng: js.UndefOr[
    js.Function4[/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize, GeoCoordinates]
  ] = js.native
}

object Helpers {
  @scala.inline
  def apply(): Helpers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Helpers]
  }
  @scala.inline
  implicit class HelpersOps[Self <: Helpers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatLngToPixel(
      value: (/* latitude */ Latitude, /* longitude */ Longitude, /* z */ Zoom, /* tileSize */ TileSize) => PixelCoordinates
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLngToPixel")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutLatLngToPixel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLngToPixel")(js.undefined)
        ret
    }
    @scala.inline
    def withParseCSV(value: /* obj */ js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseCSV")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseCSV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseCSV")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelToLatLng(value: (/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize) => GeoCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelToLatLng")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPixelToLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelToLatLng")(js.undefined)
        ret
    }
  }
  
}

