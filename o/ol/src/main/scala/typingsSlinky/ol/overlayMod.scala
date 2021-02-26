package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olBooleans.`false`
import typingsSlinky.ol.olStrings.changeColonelement
import typingsSlinky.ol.olStrings.changeColonmap
import typingsSlinky.ol.olStrings.changeColonoffset
import typingsSlinky.ol.olStrings.changeColonposition
import typingsSlinky.ol.olStrings.changeColonpositioning
import typingsSlinky.ol.overlayPositioningMod.OverlayPositioning
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("ol/Overlay", JSImport.Default)
  @js.native
  class default protected () extends Overlay {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var autoPan: js.UndefOr[PanIntoViewOptions | Boolean] = js.native
    
    var autoPanAnimation: js.UndefOr[PanOptions] = js.native
    
    var autoPanMargin: js.UndefOr[Double] = js.native
    
    var autoPanOptions: js.UndefOr[PanIntoViewOptions] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    var insertFirst: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[js.Array[Double]] = js.native
    
    var position: js.UndefOr[Coordinate] = js.native
    
    var positioning: js.UndefOr[OverlayPositioning] = js.native
    
    var stopEvent: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPan(value: PanIntoViewOptions | Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPanAnimation(value: PanOptions): Self = StObject.set(x, "autoPanAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPanAnimationUndefined: Self = StObject.set(x, "autoPanAnimation", js.undefined)
      
      @scala.inline
      def setAutoPanMargin(value: Double): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
      
      @scala.inline
      def setAutoPanOptions(value: PanIntoViewOptions): Self = StObject.set(x, "autoPanOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPanOptionsUndefined: Self = StObject.set(x, "autoPanOptions", js.undefined)
      
      @scala.inline
      def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: Coordinate): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setPositioning(value: OverlayPositioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
      
      @scala.inline
      def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    }
  }
  
  @js.native
  trait Overlay
    extends typingsSlinky.ol.objectMod.default {
    
    var autoPan: PanIntoViewOptions | `false` = js.native
    
    var element: HTMLElement = js.native
    
    /**
      * Get the DOM element of this overlay.
      */
    def getElement(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Get the overlay identifier which is set on constructor.
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Get the map associated with this overlay.
      */
    def getMap(): js.UndefOr[typingsSlinky.ol.pluggableMapMod.default] = js.native
    
    /**
      * Get the offset of this overlay.
      */
    def getOffset(): js.Array[Double] = js.native
    
    /**
      * returns the options this Overlay has been created with
      */
    def getOptions(): Options = js.native
    
    /**
      * Get the current position of this overlay.
      */
    def getPosition(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the current positioning of this overlay.
      */
    def getPositioning(): OverlayPositioning = js.native
    
    /**
      * Get the extent of an element relative to the document
      */
    /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
    
    /* protected */ def handleElementChanged(): Unit = js.native
    
    /* protected */ def handleMapChanged(): Unit = js.native
    
    /* protected */ def handleOffsetChanged(): Unit = js.native
    
    /* protected */ def handlePositionChanged(): Unit = js.native
    
    /* protected */ def handlePositioningChanged(): Unit = js.native
    
    var id: Double | String = js.native
    
    var insertFirst: Boolean = js.native
    
    var mapPostrenderListenerKey: EventsKey = js.native
    
    @JSName("on")
    def on_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    var options: Options = js.native
    
    /**
      * Pan the map so that the overlay is entirely visible in the current viewport
      * (if necessary).
      */
    def panIntoView(): Unit = js.native
    def panIntoView(opt_panIntoViewOptions: PanIntoViewOptions): Unit = js.native
    
    /**
      * Pan the map so that the overlay is entirely visisble in the current viewport
      * (if necessary) using the configured autoPan parameters
      */
    /* protected */ def performAutoPan(): Unit = js.native
    
    /* protected */ def render(): Unit = js.native
    
    var rendered: js.Any = js.native
    
    /**
      * Set the DOM element to be associated with this overlay.
      */
    def setElement(): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native
    
    /**
      * Set the map to be associated with this overlay.
      */
    def setMap(): Unit = js.native
    def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
    
    /**
      * Set the offset for this overlay.
      */
    def setOffset(offset: js.Array[Double]): Unit = js.native
    
    /**
      * Set the position for this overlay. If the position is undefined the
      * overlay is hidden.
      */
    def setPosition(): Unit = js.native
    def setPosition(position: Coordinate): Unit = js.native
    
    /**
      * Set the positioning for this overlay.
      */
    def setPositioning(positioning: OverlayPositioning): Unit = js.native
    
    /**
      * Modify the visibility of the element.
      */
    /* protected */ def setVisible(visible: Boolean): Unit = js.native
    
    var stopEvent: Boolean = js.native
    
    @JSName("un")
    def un_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    
    /**
      * Update pixel position.
      */
    /* protected */ def updatePixelPosition(): Unit = js.native
    
    /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
    /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
  }
  
  @js.native
  trait PanIntoViewOptions extends StObject {
    
    var animation: js.UndefOr[PanOptions] = js.native
    
    var margin: js.UndefOr[Double] = js.native
  }
  object PanIntoViewOptions {
    
    @scala.inline
    def apply(): PanIntoViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanIntoViewOptions]
    }
    
    @scala.inline
    implicit class PanIntoViewOptionsMutableBuilder[Self <: PanIntoViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: PanOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
  
  @js.native
  trait PanOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.native
  }
  object PanOptions {
    
    @scala.inline
    def apply(): PanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanOptions]
    }
    
    @scala.inline
    implicit class PanOptionsMutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* p0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
