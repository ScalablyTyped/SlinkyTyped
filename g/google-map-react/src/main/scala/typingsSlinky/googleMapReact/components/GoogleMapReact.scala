package typingsSlinky.googleMapReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.googleMapReact.AnonMap
import typingsSlinky.googleMapReact.mod.BootstrapURLKeys
import typingsSlinky.googleMapReact.mod.ChangeEventValue
import typingsSlinky.googleMapReact.mod.ClickEventValue
import typingsSlinky.googleMapReact.mod.Coords
import typingsSlinky.googleMapReact.mod.MapOptions
import typingsSlinky.googleMapReact.mod.Maps
import typingsSlinky.googleMapReact.mod.Point
import typingsSlinky.googleMapReact.mod.default
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GoogleMapReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("google-map-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: draggable */
  def apply(
    bootstrapURLKeys: BootstrapURLKeys = null,
    center: Coords = null,
    debounced: js.UndefOr[Boolean] = js.undefined,
    defaultCenter: Coords = null,
    defaultZoom: Int | Double = null,
    distanceToMouse: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double = null,
    googleMapLoader: /* bootstrapURLKeys */ js.Any => Unit = null,
    heatmapLibrary: js.UndefOr[Boolean] = js.undefined,
    hoverDistance: Int | Double = null,
    layerTypes: js.Array[String] = null,
    margin: js.Array[_] = null,
    onChange: /* value */ ChangeEventValue => _ = null,
    onChildClick: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseDown: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onChildMouseEnter: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseLeave: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit = null,
    onChildMouseMove: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onChildMouseUp: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit = null,
    onClick: /* value */ ClickEventValue => _ = null,
    onDrag: /* map */ js.Any => Unit = null,
    onDragEnd: /* map */ js.Any => Unit = null,
    onGoogleApiLoaded: /* maps */ AnonMap => Unit = null,
    onMapTypeIdChange: /* args */ js.Any => Unit = null,
    onTilesLoaded: () => Unit = null,
    onZoomAnimationEnd: /* args */ js.Any => Unit = null,
    onZoomAnimationStart: /* args */ js.Any => Unit = null,
    options: MapOptions | (js.Function1[/* maps */ Maps, MapOptions]) = null,
    resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined,
    shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined,
    style: HTMLProps[HTMLDivElement] = null,
    yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (bootstrapURLKeys != null) __obj.updateDynamic("bootstrapURLKeys")(bootstrapURLKeys.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(debounced)) __obj.updateDynamic("debounced")(debounced.asInstanceOf[js.Any])
    if (defaultCenter != null) __obj.updateDynamic("defaultCenter")(defaultCenter.asInstanceOf[js.Any])
    if (defaultZoom != null) __obj.updateDynamic("defaultZoom")(defaultZoom.asInstanceOf[js.Any])
    if (distanceToMouse != null) __obj.updateDynamic("distanceToMouse")(js.Any.fromFunction3(distanceToMouse))
    if (googleMapLoader != null) __obj.updateDynamic("googleMapLoader")(js.Any.fromFunction1(googleMapLoader))
    if (!js.isUndefined(heatmapLibrary)) __obj.updateDynamic("heatmapLibrary")(heatmapLibrary.asInstanceOf[js.Any])
    if (hoverDistance != null) __obj.updateDynamic("hoverDistance")(hoverDistance.asInstanceOf[js.Any])
    if (layerTypes != null) __obj.updateDynamic("layerTypes")(layerTypes.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChildClick != null) __obj.updateDynamic("onChildClick")(js.Any.fromFunction2(onChildClick))
    if (onChildMouseDown != null) __obj.updateDynamic("onChildMouseDown")(js.Any.fromFunction3(onChildMouseDown))
    if (onChildMouseEnter != null) __obj.updateDynamic("onChildMouseEnter")(js.Any.fromFunction2(onChildMouseEnter))
    if (onChildMouseLeave != null) __obj.updateDynamic("onChildMouseLeave")(js.Any.fromFunction2(onChildMouseLeave))
    if (onChildMouseMove != null) __obj.updateDynamic("onChildMouseMove")(js.Any.fromFunction3(onChildMouseMove))
    if (onChildMouseUp != null) __obj.updateDynamic("onChildMouseUp")(js.Any.fromFunction3(onChildMouseUp))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onGoogleApiLoaded != null) __obj.updateDynamic("onGoogleApiLoaded")(js.Any.fromFunction1(onGoogleApiLoaded))
    if (onMapTypeIdChange != null) __obj.updateDynamic("onMapTypeIdChange")(js.Any.fromFunction1(onMapTypeIdChange))
    if (onTilesLoaded != null) __obj.updateDynamic("onTilesLoaded")(js.Any.fromFunction0(onTilesLoaded))
    if (onZoomAnimationEnd != null) __obj.updateDynamic("onZoomAnimationEnd")(js.Any.fromFunction1(onZoomAnimationEnd))
    if (onZoomAnimationStart != null) __obj.updateDynamic("onZoomAnimationStart")(js.Any.fromFunction1(onZoomAnimationStart))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBoundsOnResize)) __obj.updateDynamic("resetBoundsOnResize")(resetBoundsOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUnregisterMapOnUnmount)) __obj.updateDynamic("shouldUnregisterMapOnUnmount")(shouldUnregisterMapOnUnmount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(yesIWantToUseGoogleMapApiInternals)) __obj.updateDynamic("yesIWantToUseGoogleMapApiInternals")(yesIWantToUseGoogleMapApiInternals.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.googleMapReact.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.googleMapReact.mod.Props
}

