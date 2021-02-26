package typingsSlinky.ol

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.conditionMod.Condition
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.boxdrag
import typingsSlinky.ol.olStrings.boxend
import typingsSlinky.ol.olStrings.boxstart
import typingsSlinky.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragBoxMod {
  
  @JSImport("ol/interaction/DragBox", JSImport.Default)
  @js.native
  class default () extends DragBox {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DragBox
    extends typingsSlinky.ol.pointerMod.default {
    
    /**
      * The default condition for determining whether the boxend event
      * should fire.
      */
    def defaultBoxEndCondition(
      mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent],
      startPixel: Pixel,
      endPixel: Pixel
    ): Boolean = js.native
    
    /**
      * Returns geometry of last drawn box.
      */
    def getGeometry(): typingsSlinky.ol.polygonMod.default = js.native
    
    /**
      * Function to execute just before onboxend is fired
      */
    def onBoxEnd(event: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    @JSName("on")
    def on_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait DragBoxEvent
    extends typingsSlinky.ol.eventMod.default {
    
    /**
      * The coordinate of the drag event.
      */
    var coordinate: Coordinate = js.native
    
    var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
  }
  
  type EndCondition = js.ThisFunction3[
    /* this */ js.Any, 
    /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], 
    /* p1 */ Pixel, 
    /* p2 */ Pixel, 
    Boolean
  ]
  
  @js.native
  trait Options extends StObject {
    
    var boxEndCondition: js.UndefOr[EndCondition] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var condition: js.UndefOr[Condition] = js.native
    
    var minArea: js.UndefOr[Double] = js.native
    
    var onBoxEnd: js.UndefOr[
        js.ThisFunction1[
          /* this */ DragBox, 
          /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], 
          Unit
        ]
      ] = js.native
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
      def setBoxEndCondition(value: EndCondition): Self = StObject.set(x, "boxEndCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxEndConditionUndefined: Self = StObject.set(x, "boxEndCondition", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
      
      @scala.inline
      def setOnBoxEnd(
        value: js.ThisFunction1[
              /* this */ DragBox, 
              /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default[UIEvent], 
              Unit
            ]
      ): Self = StObject.set(x, "onBoxEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBoxEndUndefined: Self = StObject.set(x, "onBoxEnd", js.undefined)
    }
  }
}
