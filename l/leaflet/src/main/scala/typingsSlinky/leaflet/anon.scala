package typingsSlinky.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.leaflet.mod.Class
import typingsSlinky.leaflet.mod.ControlOptions
import typingsSlinky.leaflet.mod.Control_
import typingsSlinky.leaflet.mod.Control_.AttributionOptions
import typingsSlinky.leaflet.mod.Control_.LayersObject
import typingsSlinky.leaflet.mod.Control_.LayersOptions
import typingsSlinky.leaflet.mod.Control_.ScaleOptions
import typingsSlinky.leaflet.mod.Control_.ZoomOptions
import typingsSlinky.leaflet.mod.Coords
import typingsSlinky.leaflet.mod.DomEvent.EventHandlerFn
import typingsSlinky.leaflet.mod.DomEvent.PropagableEvent
import typingsSlinky.leaflet.mod.Point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var coords: Coords = js.native
    
    var current: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    var loaded: js.UndefOr[js.Date] = js.native
    
    var retain: js.UndefOr[Boolean] = js.native
  }
  object Active {
    
    @scala.inline
    def apply(coords: Coords, current: Boolean, el: HTMLElement): Active = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: js.Date): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  @js.native
  trait Alt extends StObject {
    
    var alt: js.UndefOr[Double] = js.native
    
    var lat: Double = js.native
    
    var lng: Double = js.native
  }
  object Alt {
    
    @scala.inline
    def apply(lat: Double, lng: Double): Alt = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: Double): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Attribution
    extends Instantiable0[Control_]
       with Instantiable1[/* options */ ControlOptions, Control_] {
    
    var Attribution: Instantiable1[
        /* options */ js.UndefOr[AttributionOptions], 
        typingsSlinky.leaflet.mod.Control_.Attribution
      ] = js.native
    
    var Layers: Instantiable3[
        /* baseLayers */ js.UndefOr[LayersObject], 
        /* overlays */ js.UndefOr[LayersObject], 
        /* options */ js.UndefOr[LayersOptions], 
        typingsSlinky.leaflet.mod.Control_.Layers
      ] = js.native
    
    var Scale: Instantiable1[/* options */ js.UndefOr[ScaleOptions], typingsSlinky.leaflet.mod.Control_.Scale] = js.native
    
    var Zoom: Instantiable1[/* options */ js.UndefOr[ZoomOptions], typingsSlinky.leaflet.mod.Control_.Zoom] = js.native
    
    def extend[T /* <: js.Object */](props: T): InstantiableT[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  @js.native
  trait InstantiableT[T /* <: js.Object */]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
  
  @js.native
  trait TypeofClass extends Instantiable0[Class] {
    
    def addInitHook(initHookFn: js.Function0[Unit]): js.Any = js.native
    def addInitHook(methodName: String, args: js.Any*): js.Any = js.native
    
    def extend(props: js.Any): Instantiable with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def include(props: js.Any): js.Any = js.native
    
    def mergeOptions(props: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TypeofDomEvent extends StObject {
    
    def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def disableClickPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def disableScrollPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def getMousePosition(ev: MouseEvent): Point_ = js.native
    def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
    
    def getWheelDelta(ev: Event): Double = js.native
    
    def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def preventDefault(ev: Event): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def stop(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def stopPropagation(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[name: string] : std.HTMLElement} & leaflet.leaflet.DefaultMapPanes */
  @js.native
  trait namestringHTMLElementDefa extends /* name */ StringDictionary[HTMLElement] {
    
    var mapPane: HTMLElement = js.native
    
    var markerPane: HTMLElement = js.native
    
    var overlayPane: HTMLElement = js.native
    
    var popupPane: HTMLElement = js.native
    
    var shadowPane: HTMLElement = js.native
    
    var tilePane: HTMLElement = js.native
    
    var tooltipPane: HTMLElement = js.native
  }
  object namestringHTMLElementDefa {
    
    @scala.inline
    def apply(
      mapPane: HTMLElement,
      markerPane: HTMLElement,
      overlayPane: HTMLElement,
      popupPane: HTMLElement,
      shadowPane: HTMLElement,
      tilePane: HTMLElement,
      tooltipPane: HTMLElement
    ): namestringHTMLElementDefa = {
      val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
      __obj.asInstanceOf[namestringHTMLElementDefa]
    }
    
    @scala.inline
    implicit class namestringHTMLElementDefaMutableBuilder[Self <: namestringHTMLElementDefa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapPane(value: HTMLElement): Self = StObject.set(x, "mapPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerPane(value: HTMLElement): Self = StObject.set(x, "markerPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayPane(value: HTMLElement): Self = StObject.set(x, "overlayPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPane(value: HTMLElement): Self = StObject.set(x, "popupPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowPane(value: HTMLElement): Self = StObject.set(x, "shadowPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilePane(value: HTMLElement): Self = StObject.set(x, "tilePane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPane(value: HTMLElement): Self = StObject.set(x, "tooltipPane", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {new (args : ...any): any} & {extend (props : any): {new (args : ...any): any} & typeof Class, include (props : any): any & typeof Class, mergeOptions (props : any): any & typeof Class, addInitHook (initHookFn : (): void): any & typeof Class, addInitHook (methodName : string, args : ...any): any & typeof Class, new (): leaflet.leaflet.Class} */
  @js.native
  trait newargsanyanyextendpropsa
    extends Instantiable0[Class]
       with Instantiable1[/* args (repeated) */ js.Any, js.Any] {
    
    def addInitHook(initHookFn: js.Function0[Unit]): js.Any = js.native
    def addInitHook(methodName: String, args: js.Any*): js.Any = js.native
    
    def extend(props: js.Any): Instantiable with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def include(props: js.Any): js.Any = js.native
    
    def mergeOptions(props: js.Any): js.Any = js.native
  }
}
