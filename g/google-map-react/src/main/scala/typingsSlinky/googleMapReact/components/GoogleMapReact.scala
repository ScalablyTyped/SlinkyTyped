package typingsSlinky.googleMapReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googleMapReact.AnonMap
import typingsSlinky.googleMapReact.mod.BootstrapURLKeys
import typingsSlinky.googleMapReact.mod.ChangeEventValue
import typingsSlinky.googleMapReact.mod.ClickEventValue
import typingsSlinky.googleMapReact.mod.Coords
import typingsSlinky.googleMapReact.mod.Heatmap
import typingsSlinky.googleMapReact.mod.MapOptions
import typingsSlinky.googleMapReact.mod.Maps
import typingsSlinky.googleMapReact.mod.Point
import typingsSlinky.googleMapReact.mod.Props
import typingsSlinky.googleMapReact.mod.default
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GoogleMapReact {
  @JSImport("google-map-react", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def bootstrapURLKeys(value: BootstrapURLKeys): this.type = set("bootstrapURLKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def center(value: Coords): this.type = set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def debounced(value: Boolean): this.type = set("debounced", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCenter(value: Coords): this.type = set("defaultCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultZoom(value: Double): this.type = set("defaultZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def distanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): this.type = set("distanceToMouse", js.Any.fromFunction3(value))
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def googleMapLoader(value: /* bootstrapURLKeys */ js.Any => Unit): this.type = set("googleMapLoader", js.Any.fromFunction1(value))
    @scala.inline
    def heatmap(value: Heatmap): this.type = set("heatmap", value.asInstanceOf[js.Any])
    @scala.inline
    def heatmapLibrary(value: Boolean): this.type = set("heatmapLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverDistance(value: Double): this.type = set("hoverDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def layerTypes(value: js.Array[String]): this.type = set("layerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: js.Array[_]): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ ChangeEventValue => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onChildClick(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): this.type = set("onChildClick", js.Any.fromFunction2(value))
    @scala.inline
    def onChildMouseDown(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): this.type = set("onChildMouseDown", js.Any.fromFunction3(value))
    @scala.inline
    def onChildMouseEnter(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): this.type = set("onChildMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onChildMouseLeave(value: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Unit): this.type = set("onChildMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def onChildMouseMove(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): this.type = set("onChildMouseMove", js.Any.fromFunction3(value))
    @scala.inline
    def onChildMouseUp(value: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Unit): this.type = set("onChildMouseUp", js.Any.fromFunction3(value))
    @scala.inline
    def onClick(value: /* value */ ClickEventValue => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDrag(value: /* map */ js.Any => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: /* map */ js.Any => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onGoogleApiLoaded(value: /* maps */ AnonMap => Unit): this.type = set("onGoogleApiLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def onMapTypeIdChange(value: /* args */ js.Any => Unit): this.type = set("onMapTypeIdChange", js.Any.fromFunction1(value))
    @scala.inline
    def onTilesLoaded(value: () => Unit): this.type = set("onTilesLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def onZoomAnimationEnd(value: /* args */ js.Any => Unit): this.type = set("onZoomAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onZoomAnimationStart(value: /* args */ js.Any => Unit): this.type = set("onZoomAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def optionsFunction1(value: /* maps */ Maps => MapOptions): this.type = set("options", js.Any.fromFunction1(value))
    @scala.inline
    def options(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def resetBoundsOnResize(value: Boolean): this.type = set("resetBoundsOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldUnregisterMapOnUnmount(value: Boolean): this.type = set("shouldUnregisterMapOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: HTMLProps[HTMLDivElement]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def yesIWantToUseGoogleMapApiInternals(value: Boolean): this.type = set("yesIWantToUseGoogleMapApiInternals", value.asInstanceOf[js.Any])
    @scala.inline
    def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GoogleMapReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

