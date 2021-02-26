package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leafletGeosearch.anon.Button
import typingsSlinky.leafletGeosearch.anon.Query
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.bar
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeoSearchControl
  */
@js.native
trait GeoSearchControlOptions extends StObject {
  
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
  implicit class GeoSearchControlOptionsMutableBuilder[Self <: GeoSearchControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateZoom(value: Boolean): Self = StObject.set(x, "animateZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateZoomUndefined: Self = StObject.set(x, "animateZoom", js.undefined)
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteDelay(value: Double): Self = StObject.set(x, "autoCompleteDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteDelayUndefined: Self = StObject.set(x, "autoCompleteDelay", js.undefined)
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setClassNames(value: Button): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setKeepResult(value: Boolean): Self = StObject.set(x, "keepResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepResultUndefined: Self = StObject.set(x, "keepResult", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMaxMarkers(value: Double): Self = StObject.set(x, "maxMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMarkersUndefined: Self = StObject.set(x, "maxMarkers", js.undefined)
    
    @scala.inline
    def setMessageHideDelay(value: Double): Self = StObject.set(x, "messageHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHideDelayUndefined: Self = StObject.set(x, "messageHideDelay", js.undefined)
    
    @scala.inline
    def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundMessageUndefined: Self = StObject.set(x, "notFoundMessage", js.undefined)
    
    @scala.inline
    def setPopupFormat(value: /* hasQueryResult */ Query => String): Self = StObject.set(x, "popupFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopupFormatUndefined: Self = StObject.set(x, "popupFormat", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProvider(value: BaseProvider[js.Object, js.Object]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainZoomLevel(value: Boolean): Self = StObject.set(x, "retainZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainZoomLevelUndefined: Self = StObject.set(x, "retainZoomLevel", js.undefined)
    
    @scala.inline
    def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchLabelUndefined: Self = StObject.set(x, "searchLabel", js.undefined)
    
    @scala.inline
    def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
    
    @scala.inline
    def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
    
    @scala.inline
    def setStyle(value: button | bar): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
