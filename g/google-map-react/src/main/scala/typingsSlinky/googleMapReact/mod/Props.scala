package typingsSlinky.googleMapReact.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.googleMapReact.AnonMap
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.native
  var center: js.UndefOr[Coords] = js.native
  var debounced: js.UndefOr[Boolean] = js.native
  var defaultCenter: js.UndefOr[Coords] = js.native
  var defaultZoom: js.UndefOr[Double] = js.native
  var distanceToMouse: js.UndefOr[
    js.Function3[/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object], Double]
  ] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, Unit]] = js.native
  var heatmap: js.UndefOr[Heatmap] = js.native
  var heatmapLibrary: js.UndefOr[Boolean] = js.native
  var hoverDistance: js.UndefOr[Double] = js.native
  var layerTypes: js.UndefOr[js.Array[String]] = js.native
  var margin: js.UndefOr[js.Array[_]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.native
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.native
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.native
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ AnonMap, Unit]] = js.native
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var onTilesLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.native
  var resetBoundsOnResize: js.UndefOr[Boolean] = js.native
  var shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapURLKeys(value: BootstrapURLKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapURLKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapURLKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapURLKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Coords): Self = {
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
    def withDebounced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounced")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCenter(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToMouse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDistanceToMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleMapLoader(value: /* bootstrapURLKeys */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMapLoader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoogleMapLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMapLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatmap(value: Heatmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatmapLibrary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmapLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatmapLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmapLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ ChangeEventValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildClick(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChildClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildMouseDown(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChildMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildMouseEnter(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChildMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildMouseLeave(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChildMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildMouseMove(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChildMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChildMouseUp(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseUp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChildMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* value */ ClickEventValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* map */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* map */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGoogleApiLoaded(value: /* maps */ AnonMap => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGoogleApiLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGoogleApiLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGoogleApiLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMapTypeIdChange(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapTypeIdChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMapTypeIdChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapTypeIdChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTilesLoaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTilesLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTilesLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTilesLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomAnimationEnd(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomAnimationStart(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsFunction1(value: /* maps */ Maps => MapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withResetBoundsOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBoundsOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetBoundsOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBoundsOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUnregisterMapOnUnmount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUnregisterMapOnUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUnregisterMapOnUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUnregisterMapOnUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: HTMLProps[HTMLDivElement]): Self = {
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
    def withYesIWantToUseGoogleMapApiInternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesIWantToUseGoogleMapApiInternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYesIWantToUseGoogleMapApiInternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesIWantToUseGoogleMapApiInternals")(js.undefined)
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

