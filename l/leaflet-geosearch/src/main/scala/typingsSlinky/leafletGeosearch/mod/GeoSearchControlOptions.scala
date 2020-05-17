package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leafletGeosearch.anon.Button
import typingsSlinky.leafletGeosearch.anon.Query
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.bar
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GeoSearchControl
  */
@js.native
trait GeoSearchControlOptions extends js.Object {
  /** @default true */
  var animateZoom: js.UndefOr[Boolean] = js.native
  /** @default false */
  var autoClose: js.UndefOr[Boolean] = js.native
  /** @default true */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** @default 250 */
  var autoCompleteDelay: js.UndefOr[Double] = js.native
  /**
    * @default {
    *      container: 'leaflet-bar leaflet-control leaflet-control-geosearch';
    *      button: 'leaflet-bar-part leaflet-bar-part-single';
    *      resetButton: 'reset';
    *      msgbox: 'leaflet-bar message';
    *      form: '';
    *      input: '';
    * }
    */
  var classNames: js.UndefOr[Button] = js.native
  /** @default false */
  var keepResult: js.UndefOr[Boolean] = js.native
  /**
    *  @default {
    *      icon: new L.Icon.Default(),
    *      draggable: false,
    *  }
    */
  var marker: js.UndefOr[MarkerOptions] = js.native
  /** @default false */
  var maxMarkers: js.UndefOr[Double] = js.native
  /** @default 3000 */
  var messageHideDelay: js.UndefOr[Double] = js.native
  /** @default 'Sorry; that address could not be found.' */
  var notFoundMessage: js.UndefOr[String] = js.native
  /** @default ({ result }) => `${result.label}` */
  var popupFormat: js.UndefOr[js.Function1[/* hasQueryResult */ Query, String]] = js.native
  /** @default 'topleft' */
  var position: js.UndefOr[String] = js.native
  var provider: BaseProvider[js.Object, js.Object] = js.native
  /** @default false */
  var retainZoomLevel: js.UndefOr[Boolean] = js.native
  /** @default 'Enter address' */
  var searchLabel: js.UndefOr[String] = js.native
  /** @default true */
  var showMarker: js.UndefOr[Boolean] = js.native
  /** @default false */
  var showPopup: js.UndefOr[Boolean] = js.native
  /** @default 'button' */
  var style: js.UndefOr[button | bar] = js.native
  /** @default 18 */
  var zoomLevel: js.UndefOr[Double] = js.native
}

object GeoSearchControlOptions {
  @scala.inline
  def apply(provider: BaseProvider[js.Object, js.Object]): GeoSearchControlOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchControlOptions]
  }
  @scala.inline
  implicit class GeoSearchControlOptionsOps[Self <: GeoSearchControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: BaseProvider[js.Object, js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCompleteDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCompleteDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: Button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepResult")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMarkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupFormat(value: /* hasQueryResult */ Query => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainZoomLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: button | bar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
  }
  
}

