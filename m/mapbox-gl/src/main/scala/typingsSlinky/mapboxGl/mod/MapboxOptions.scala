package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.mapboxGl.mapboxGlStrings.`bottom-left`
import typingsSlinky.mapboxGl.mapboxGlStrings.`bottom-right`
import typingsSlinky.mapboxGl.mapboxGlStrings.`top-left`
import typingsSlinky.mapboxGl.mapboxGlStrings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapboxOptions extends js.Object {
  /**
    * If specified, map will use this token instead of the one defined in mapboxgl.accessToken.
    *
    * @default null
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * If true, the gl context will be created with MSA antialiasing, which can be useful for antialiasing custom layers.
    * This is false by default as a performance optimization.
    */
  var antialias: js.UndefOr[Boolean] = js.native
  /** If true, an attribution control will be added to the map. */
  var attributionControl: js.UndefOr[Boolean] = js.native
  var bearing: js.UndefOr[Double] = js.native
  /** Snap to north threshold in degrees. */
  var bearingSnap: js.UndefOr[Double] = js.native
  /** The initial bounds of the map. If bounds is specified, it overrides center and zoom constructor options. */
  var bounds: js.UndefOr[LngLatBoundsLike] = js.native
  /** If true, enable the "box zoom" interaction (see BoxZoomHandler) */
  var boxZoom: js.UndefOr[Boolean] = js.native
  /** initial map center */
  var center: js.UndefOr[LngLatLike] = js.native
  /**
    * The max number of pixels a user can shift the mouse pointer during a click for it to be
    * considered a valid click (as opposed to a mouse drag).
    *
    * @default 3
    */
  var clickTolerance: js.UndefOr[Double] = js.native
  /**
    * If `true`, Resource Timing API information will be collected for requests made by GeoJSON
    * and Vector Tile web workers (this information is normally inaccessible from the main
    * Javascript thread). Information will be returned in a `resourceTiming` property of
    * relevant `data` events.
    *
    * @default false
    */
  var collectResourceTiming: js.UndefOr[Boolean] = js.native
  /** ID of the container element */
  var container: String | HTMLElement = js.native
  /**
    * If `true`, symbols from multiple sources can collide with each other during collision
    * detection. If `false`, collision detection is run separately for the symbols in each source.
    *
    * @default true
    */
  var crossSourceCollisions: js.UndefOr[Boolean] = js.native
  /** String or strings to show in an AttributionControl.
    * Only applicable if options.attributionControl is `true`. */
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.native
  /** If true, enable the "double click to zoom" interaction (see DoubleClickZoomHandler). */
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  /** If true, enable the "drag to pan" interaction (see DragPanHandler). */
  var dragPan: js.UndefOr[Boolean] = js.native
  /** If true, enable the "drag to rotate" interaction (see DragRotateHandler). */
  var dragRotate: js.UndefOr[Boolean] = js.native
  /**
    * Controls the duration of the fade-in/fade-out animation for label collisions, in milliseconds.
    * This setting affects all symbol layers. This setting does not affect the duration of runtime
    * styling transitions or raster tile cross-fading.
    *
    * @default 300
    */
  var fadeDuration: js.UndefOr[Double] = js.native
  /** If true, map creation will fail if the implementation determines that the performance of the created WebGL context would be dramatically lower than expected. */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  /** A fitBounds options object to use only when setting the bounds option. */
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  /** If `true`, the map's position (zoom, center latitude, center longitude, bearing, and pitch) will be synced with the hash fragment of the page's URL.
    * For example, `http://path/to/my/page.html#2.59/39.26/53.07/-24.1/60`.
    * An additional string may optionally be provided to indicate a parameter-styled hash,
    * e.g. http://path/to/my/page.html#map=2.59/39.26/53.07/-24.1/60&foo=bar, where foo
    * is a custom parameter and bar is an arbitrary hash distinct from the map hash.
    * */
  var hash: js.UndefOr[Boolean | String] = js.native
  /** If false, no mouse, touch, or keyboard listeners are attached to the map, so it will not respond to input */
  var interactive: js.UndefOr[Boolean] = js.native
  /** If true, enable keyboard shortcuts (see KeyboardHandler). */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * If specified, defines a CSS font-family for locally overriding generation of glyphs in the
    * 'CJK Unified Ideographs' and 'Hangul Syllables' ranges. In these ranges, font settings from
    * the map's style will be ignored, except for font-weight keywords (light/regular/medium/bold).
    * The purpose of this option is to avoid bandwidth-intensive glyph server requests.
    *
    * @default null
    */
  var localIdeographFontFamily: js.UndefOr[String] = js.native
  /** A patch to apply to the default localization table for UI strings, e.g. control tooltips.
    * The `locale` object maps namespaced UI string IDs to translated strings in the target language;
    * see `src/ui/default_locale.js` for an example with all supported string IDs.
    * The object may specify all UI strings (thereby adding support for a new translation) or
    * only a subset of strings (thereby patching the default translation table).
    */
  var locale: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A string representing the position of the Mapbox wordmark on the map.
    *
    * @default "bottom-left"
    */
  var logoPosition: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.native
  /** If set, the map is constrained to the given bounds. */
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.native
  /** Maximum pitch of the map */
  var maxPitch: js.UndefOr[Double] = js.native
  /**
    * The maximum number of tiles stored in the tile cache for a given source. If omitted, the
    * cache will be dynamically sized based on the current viewport.
    *
    * @default null
    */
  var maxTileCacheSize: js.UndefOr[Double] = js.native
  /** Maximum zoom of the map */
  var maxZoom: js.UndefOr[Double] = js.native
  /** Minimum pitch of the map */
  var minPitch: js.UndefOr[Double] = js.native
  /** Minimum zoom of the map */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * The initial pitch (tilt) of the map, measured in degrees away from the plane of the
    * screen (0-60).
    *
    * @default 0
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * If `false`, the map's pitch (tilt) control with "drag to rotate" interaction will be disabled.
    *
    * @default true
    */
  var pitchWithRotate: js.UndefOr[Boolean] = js.native
  /** If true, The maps canvas can be exported to a PNG using map.getCanvas().toDataURL();. This is false by default as a performance optimization. */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, the map won't attempt to re-request tiles once they expire per their HTTP
    * `cacheControl`/`expires` headers.
    *
    * @default true
    */
  var refreshExpiredTiles: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, multiple copies of the world will be rendered, when zoomed out.
    *
    * @default true
    */
  var renderWorldCopies: js.UndefOr[Boolean] = js.native
  /** If true, enable the "scroll to zoom" interaction */
  var scrollZoom: js.UndefOr[Boolean] = js.native
  /** stylesheet location */
  var style: js.UndefOr[Style | String] = js.native
  /** If true, enable the "pinch to rotate and zoom" interaction (see TouchZoomRotateHandler). */
  var touchZoomRotate: js.UndefOr[Boolean] = js.native
  /** If  true, the map will automatically resize when the browser window resizes */
  var trackResize: js.UndefOr[Boolean] = js.native
  /**
    * A callback run before the Map makes a request for an external URL. The callback can be
    * used to modify the url, set headers, or set the credentials property for cross-origin requests.
    *
    * @default null
    */
  var transformRequest: js.UndefOr[TransformRequestFunction] = js.native
  /** Initial zoom level */
  var zoom: js.UndefOr[Double] = js.native
}

object MapboxOptions {
  @scala.inline
  def apply(container: String | HTMLElement): MapboxOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxOptions]
  }
  @scala.inline
  implicit class MapboxOptionsOps[Self <: MapboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionControl")(js.undefined)
        ret
    }
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(js.undefined)
        ret
    }
    @scala.inline
    def withBearingSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearingSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearingSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearingSnap")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LngLatBoundsLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: LngLatLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectResourceTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResourceTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectResourceTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResourceTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossSourceCollisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSourceCollisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossSourceCollisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSourceCollisions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttribution(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttribution")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDragPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(js.undefined)
        ret
    }
    @scala.inline
    def withDragRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFailIfMajorPerformanceCaveat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailIfMajorPerformanceCaveat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(js.undefined)
        ret
    }
    @scala.inline
    def withFitBoundsOptions(value: FitBoundsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitBoundsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalIdeographFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdeographFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalIdeographFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdeographFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoPosition(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBounds(value: LngLatBoundsLike): Self = {
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
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTileCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTileCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTileCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTileCacheSize")(js.undefined)
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
    def withMinPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(js.undefined)
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
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchWithRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchWithRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchWithRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchWithRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDrawingBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDrawingBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshExpiredTiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshExpiredTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshExpiredTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshExpiredTiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderWorldCopies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWorldCopies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderWorldCopies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWorldCopies")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Style | String): Self = {
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
    def withTouchZoomRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoomRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoomRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoomRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRequest(value: (/* url */ String, /* resourceType */ ResourceType) => RequestParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

