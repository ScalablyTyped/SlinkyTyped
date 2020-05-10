package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.CRS
import typingsSlinky.leaflet.mod.FitBoundsOptions
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.Renderer
import typingsSlinky.leaflet.mod.Zoom
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined enableHighAccuracy, maximumAge, setView, timeout, watch
- typingsSlinky.leaflet.mod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, bounceAtZoomLimits, boxZoom, center, closePopupOnClick, crs, doubleClickZoom, dragging, fadeAnimation, inertia, inertiaDeceleration, inertiaMaxSpeed, keyboard, keyboardPanDelta, layers, markerZoomAnimation, maxBounds, maxBoundsViscosity, minZoom, preferCanvas, renderer, scrollWheelZoom, tap, tapTolerance, touchZoom, trackResize, transform3DLimit, wheelDebounceTime, wheelPxPerZoomLevel, worldCopyJump, zoom, zoomAnimation, zoomAnimationThreshold, zoomControl, zoomDelta, zoomSnap */ @js.native
trait MapProps
  extends FitBoundsOptions
     with MapEvents {
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.native
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.native
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var boundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  var boxZoom: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[LatLngExpression] = js.native
  var children: Children = js.native
  var className: js.UndefOr[String] = js.native
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.native
  // Map state options
  var crs: js.UndefOr[CRS] = js.native
  var doubleClickZoom: js.UndefOr[Zoom] = js.native
  var dragging: js.UndefOr[Boolean] = js.native
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.native
  var inertiaDeceleration: js.UndefOr[Double] = js.native
  var inertiaMaxSpeed: js.UndefOr[Double] = js.native
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.native
  var keyboardPanDelta: js.UndefOr[Double] = js.native
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var markerZoomAnimation: js.UndefOr[Boolean] = js.native
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var maxBoundsViscosity: js.UndefOr[Double] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.native
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.native
  var preferCanvas: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[Renderer] = js.native
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.native
  var setView: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.native
  var tapTolerance: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var touchZoom: js.UndefOr[Zoom] = js.native
  var trackResize: js.UndefOr[Boolean] = js.native
  var transform3DLimit: js.UndefOr[Double] = js.native
  var useFlyTo: js.UndefOr[Boolean] = js.native
  var viewport: js.UndefOr[Viewport] = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var wheelDebounceTime: js.UndefOr[Double] = js.native
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.native
  var whenReady: js.UndefOr[js.Function0[Unit]] = js.native
  var worldCopyJump: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomAnimation: js.UndefOr[Boolean] = js.native
  var zoomAnimationThreshold: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomDelta: js.UndefOr[Double] = js.native
  var zoomSnap: js.UndefOr[Double] = js.native
}

object MapProps {
  @scala.inline
  def apply(): MapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapProps]
  }
  @scala.inline
  implicit class MapPropsOps[Self <: MapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBounceAtZoomLimits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceAtZoomLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceAtZoomLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceAtZoomLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LatLngBoundsExpression): Self = {
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
    def withBoundsOptions(value: FitBoundsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsOptions")(js.undefined)
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
    def withCenter(value: LatLngExpression): Self = {
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClosePopupOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopupOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosePopupOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopupOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCrs(value: CRS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Zoom): Self = {
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
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeAnimation")(js.undefined)
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
    def withInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDeceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaMaxSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaMaxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaMaxSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaMaxSpeed")(js.undefined)
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
    def withKeyboardPanDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPanDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardPanDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPanDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerZoomAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerZoomAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBounds(value: LatLngBoundsExpression): Self = {
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
    def withMaxBoundsViscosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBoundsViscosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBoundsViscosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBoundsViscosity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(js.undefined)
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
    def withOnViewportChange(value: /* viewport */ Viewport => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChanged(value: /* viewport */ Viewport => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWheelZoom(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setView")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTapTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(js.undefined)
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
    def withTransform3DLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform3DLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform3DLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform3DLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFlyTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFlyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelDebounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDebounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelDebounceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDebounceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelPxPerZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPxPerZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelPxPerZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelPxPerZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWhenReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenReady")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldCopyJump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldCopyJump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldCopyJump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldCopyJump")(js.undefined)
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
    @scala.inline
    def withZoomAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAnimationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSnap")(js.undefined)
        ret
    }
  }
  
}

