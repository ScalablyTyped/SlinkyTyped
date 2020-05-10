package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapOptions extends js.Object {
  /**
    * A boolean that, when set to true, allows the road labels to be hidden. Default: false
    * This property can only be set when using the Map constructor. This property can only be set when using the Map constructor.
    */
  var allowHidingLabelsOfRoad: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the infobox is allowed to overflow outside the bounds of the map. Default: false. */
  var allowInfoboxOverflow: js.UndefOr[Boolean] = js.native
  /** The color to use for the map control background. The default color is #EAE8E1. This property can only be set when using the Map constructor. */
  var backgroundColor: js.UndefOr[String | Color] = js.native
  /** Custom map styles used to modify the look and feel of the base map. */
  var customMapStyle: js.UndefOr[ICustomMapStyle] = js.native
  /**
    * A boolean indicating whether to disable the bird’s eye map type. The default value is false. If this property is set to true, bird’s eye will be removed
    * from the map navigation control and the birdseye MapTypeId is disabled. Additionally, the auto map type will only display road or aerial.
    * This property can only be set when using the Map constructor.
    */
  var disableBirdseye: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user’s ability to control the using the keyboard. Default: false */
  var disableKeyboardInput: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating if mousing over the map type selector should open it or not. Default: false */
  var disableMapTypeSelectorMouseOver: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user's ability to pan the map. Default: false */
  var disablePanning: js.UndefOr[Boolean] = js.native
  /**
    * Scrolling the mouse wheel over the map will zoom it in or out, but will not scroll the page.
    * Setting this property to true disables the zooming of the map and instead reverts back to scrolling the page.
    * Default: false
    */
  var disableScrollWheelZoom: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to disable streetside mode.If this property is set to true, streetside will be removed from
    * the navigation bar, and the automatic coverage overlay will be disabled when zoomed in at lower zoom levels. Default false
    * This property can only be set when using the Map constructor.
    */
  var disableStreetside: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to disable the automatic streetside coverage layer that appears when zoomed in at lower zoom
    * levels. Default false
    * This property can only be set when using the Map constructor.
    **/
  var disableStreetsideAutoCoverage: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user's ability to zoom in or out. Default: false */
  var disableZooming: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating if CORS (Cross-origin Resource Sharing) should be enabled for tiles. Useful if directly accessing the canvas to generate an image of the map. Default: false
    * Known Limitations: IE and Edge will not cache tiles when CORS is enabled. Chrome throws errors when this property is set enabled and custom tile layers don’t have CORS enabled on the server.
    * This property can only be set when using the Map constructor.
    */
  var enableCORS: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether the Bing(TM) logo on the map is clickable. Default: true.
    * This property can only be set when using the Map constructor.
    */
  var enableClickableLogo: js.UndefOr[Boolean] = js.native
  /**
  		* Enables the map to use map tiles suitable for a higher DPI display, if the display supports it. 
  		* When set to false and the map is loaded on a high DPI display, custom tile layers will load tiles 
  		* at a higher zoom level and scale the image to increase the DPI. Default: false.
  		*/
  var enableHighDpi: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to use the inertia animation effect during map navigation. Default: true
    * This property can only be set when using the Map constructor.
    */
  var enableInertia: js.UndefOr[Boolean] = js.native
  /**
    * A boolean that indicates if the map should be rendered using lite mode. When set to true vector map labels are
    * disabled and map labels are rendered directly into the map tiles. This offers improved performance, but will result
    * in the labels being rendered behind data on the map and the labels will also not use collision dection with pushpins.
    * If this property is not set, the map set this value based on the target device and browser as vector labels perform
    * better in some scenrarios than others.
    * This property can only be set when using the Map constructor.
    */
  var liteMode: js.UndefOr[Boolean] = js.native
  /** A bounding area that restricts the map view. */
  var maxBounds: js.UndefOr[LocationRect] = js.native
  /** The maximum zoom level that the map can be zoomed into. */
  var maxZoom: js.UndefOr[Double] = js.native
  /** The minimum zoom level that the map cab be zoomed out to. */
  var minZoom: js.UndefOr[Double] = js.native
  /** Specifies how the navigation bar should be rendered on the map. */
  var navigationBarMode: js.UndefOr[NavigationBarMode] = js.native
  /** A boolean whether what orientation should be used when laying out the navigation controls. */
  var navigationBarOrientation: js.UndefOr[NavigationBarOrientation] = js.native
  /**
    * A boolean value indicating whether to display the “breadcrumb control”. The breadcrumb control shows the current center location’s geography hierarchy.
    * The default value is false. Requires the showLocateMeButton map option to be set to true. The breadcrumb control displays best when the width of the map
    * is at least 400 pixels.
    */
  var showBreadcrumb: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the map navigation control. Default: true This property can only be set when using the Map constructor.
    */
  var showDashboard: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show a button that centers the map over the user's location in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showLocateMeButton: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether or not to show the map Bing logo. The default value is true.
    * This property can only be set when using the Map constructor.
    */
  var showLogo: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the map type selector in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showMapTypeSelector: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the scale bar. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showScalebar: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show a link to the End User Terms of Use, which appears to the right of the copyrights, or not. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showTermsLink: js.UndefOr[Boolean] = js.native
  /** When using the minified navigation bar, a traffic button is displayed. Setting this option to false will hide this button. */
  var showTrafficButton: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the zoom buttons in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showZoomButtons: js.UndefOr[Boolean] = js.native
  /** A set of properties for the streetside mode of the map. */
  var streetsideOptions: js.UndefOr[IStreetsideOptions] = js.native
  /** Additional support map types that should be added to the navigaiton bar such as canvasDark, canvasLight, and grayscale.*/
  var supportedMapTypes: js.UndefOr[js.Array[MapTypeId]] = js.native
}

object IMapOptions {
  @scala.inline
  def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  @scala.inline
  implicit class IMapOptionsOps[Self <: IMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHidingLabelsOfRoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHidingLabelsOfRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHidingLabelsOfRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHidingLabelsOfRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInfoboxOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInfoboxOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInfoboxOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInfoboxOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMapStyle(value: ICustomMapStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBirdseye(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBirdseye")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBirdseye: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBirdseye")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableKeyboardInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardInput")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMapTypeSelectorMouseOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMapTypeSelectorMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMapTypeSelectorMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMapTypeSelectorMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanning")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScrollWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrollWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScrollWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrollWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStreetside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStreetside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetside")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStreetsideAutoCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetsideAutoCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStreetsideAutoCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetsideAutoCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCORS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCORS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCORS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCORS")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClickableLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickableLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClickableLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickableLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighDpi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighDpi")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInertia")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBounds(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarMode(value: NavigationBarMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarOrientation(value: NavigationBarOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBreadcrumb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBreadcrumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBreadcrumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBreadcrumb")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDashboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDashboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDashboard")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLocateMeButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocateMeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLocateMeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocateMeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMapTypeSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMapTypeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMapTypeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMapTypeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScalebar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScalebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScalebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScalebar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTermsLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTermsLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTermsLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTermsLink")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTrafficButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrafficButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTrafficButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrafficButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoomButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetsideOptions(value: IStreetsideOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetsideOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetsideOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetsideOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedMapTypes(value: js.Array[MapTypeId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMapTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedMapTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMapTypes")(js.undefined)
        ret
    }
  }
  
}

