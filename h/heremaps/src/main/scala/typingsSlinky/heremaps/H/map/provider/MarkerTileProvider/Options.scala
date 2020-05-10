package typingsSlinky.heremaps.H.map.provider.MarkerTileProvider

import typingsSlinky.heremaps.H.map.AbstractMarker
import typingsSlinky.heremaps.H.util.ICancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the MarkerTileProvider object.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property requestData {function(number, number, number, function(Array<H.map.AbstractMarker>), Function): H.util.ICancelable} - function that fetches marker data and creates array
  * of H.map.AbstractMarker that is passed success callback, if function fails to fetch data onError callback must be called
  * @property providesDomMarkers {boolean=} - indicates if markers provided are of type H.map.DomMarker or H.map.Marker, default is H.map.Marker
  */
@js.native
trait Options extends js.Object {
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var providesDomMarkers: js.UndefOr[Boolean] = js.native
  def requestData(
    n1: Double,
    n2: Double,
    n3: Double,
    markerCallback: js.Function1[/* markers */ js.Array[AbstractMarker], Unit],
    f: js.Function0[Unit]
  ): ICancelable = js.native
}

object Options {
  @scala.inline
  def apply(
    requestData: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
  ): Options = {
    val __obj = js.Dynamic.literal(requestData = js.Any.fromFunction5(requestData))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestData(
      value: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestData")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidesDomMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesDomMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidesDomMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesDomMarkers")(js.undefined)
        ret
    }
  }
  
}

