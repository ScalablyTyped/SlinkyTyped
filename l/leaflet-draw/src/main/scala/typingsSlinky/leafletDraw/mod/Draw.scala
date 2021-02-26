package typingsSlinky.leafletDraw.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.leaflet.mod.Class
import typingsSlinky.leaflet.mod.Handler
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Map_
import typingsSlinky.leafletDraw.anon.Subtext
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoncreated
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeleted
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeletestart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeletestop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawstart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawstop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawvertex
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColonedited
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditmove
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditresize
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditstart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditstop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditvertex
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColonmarkercontext
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColontoolbarclosed
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColontoolbaropened
import typingsSlinky.leafletDraw.mod.DrawOptions.CircleOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.MarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolygonOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolylineOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.RectangleOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.SimpleShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draw {
  
  @JSImport("leaflet", "Draw.Circle")
  @js.native
  class Circle protected () extends SimpleShape {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: CircleOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.CircleMarker")
  @js.native
  class CircleMarker protected () extends Marker {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: MarkerOptions) = this()
  }
  
  object Event {
    
    @JSImport("leaflet", "Draw.Event.CREATED")
    @js.native
    val CREATED: drawColoncreated = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETED")
    @js.native
    val DELETED: drawColondeleted = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETESTART")
    @js.native
    val DELETESTART: drawColondeletestart = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETESTOP")
    @js.native
    val DELETESTOP: drawColondeletestop = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWSTART")
    @js.native
    val DRAWSTART: drawColondrawstart = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWSTOP")
    @js.native
    val DRAWSTOP: drawColondrawstop = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWVERTEX")
    @js.native
    val DRAWVERTEX: drawColondrawvertex = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITED")
    @js.native
    val EDITED: drawColonedited = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITMOVE")
    @js.native
    val EDITMOVE: drawColoneditmove = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITRESIZE")
    @js.native
    val EDITRESIZE: drawColoneditresize = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITSTART")
    @js.native
    val EDITSTART: drawColoneditstart = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITSTOP")
    @js.native
    val EDITSTOP: drawColoneditstop = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITVERTEX")
    @js.native
    val EDITVERTEX: drawColoneditvertex = js.native
    
    @JSImport("leaflet", "Draw.Event.MARKERCONTEXT")
    @js.native
    val MARKERCONTEXT: drawColonmarkercontext = js.native
    
    @JSImport("leaflet", "Draw.Event.TOOLBARCLOSED")
    @js.native
    val TOOLBARCLOSED: drawColontoolbarclosed = js.native
    
    @JSImport("leaflet", "Draw.Event.TOOLBAROPENED")
    @js.native
    val TOOLBAROPENED: drawColontoolbaropened = js.native
  }
  
  @JSImport("leaflet", "Draw.Feature")
  @js.native
  class Feature protected () extends Handler {
    def this(map: Map_) = this()
    
    def initialize(map: DrawMap, options: EditHandlerOptions): Unit = js.native
    def initialize(map: DrawMap, options: MarkerOptions): Unit = js.native
    def initialize(map: DrawMap, options: PolygonOptions): Unit = js.native
    def initialize(map: DrawMap, options: PolylineOptions): Unit = js.native
    def initialize(map: DrawMap, options: RectangleOptions): Unit = js.native
    
    def setOptions(options: EditHandlerOptions): Unit = js.native
    def setOptions(options: MarkerOptions): Unit = js.native
    def setOptions(options: PolygonOptions): Unit = js.native
    def setOptions(options: PolylineOptions): Unit = js.native
    def setOptions(options: RectangleOptions): Unit = js.native
  }
  
  @JSImport("leaflet", "Draw.Marker")
  @js.native
  class Marker protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: MarkerOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Polygon")
  @js.native
  class Polygon protected () extends Polyline {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: PolygonOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Polyline")
  @js.native
  class Polyline protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: PolylineOptions) = this()
    
    def addVertex(latlng: LatLng_): Unit = js.native
    
    def completeShape(): Unit = js.native
    
    def deleteLastVertex(): Unit = js.native
  }
  
  @JSImport("leaflet", "Draw.Rectangle")
  @js.native
  class Rectangle protected () extends SimpleShape {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: RectangleOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.SimpleShape")
  @js.native
  class SimpleShape protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: SimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Tooltip")
  @js.native
  class Tooltip protected () extends Class {
    def this(map: DrawMap) = this()
    
    def dispose(): Unit = js.native
    
    def removeError(): Tooltip = js.native
    
    def showAsError(): Tooltip = js.native
    
    def updateContent(): Tooltip = js.native
    def updateContent(labelText: Subtext): Tooltip = js.native
    
    def updatePosition(latlng: LatLng_): Tooltip = js.native
  }
  
  /**
    * EventHandlers to be used in looping over all events
    *
    * @example
    * for (const key in eventHandlers) { map.off(eventHandlers[key], LeafletFn); }
    */
  @js.native
  trait EventHandlers extends // Requires an index signature of type string to be properly useful
  /* key */ StringDictionary[String] {
    
    var onCreated: drawColoncreated = js.native
    
    var onDeleteStart: drawColondeletestart = js.native
    
    var onDeleteStop: drawColondeletestop = js.native
    
    var onDeleted: drawColondeleted = js.native
    
    var onDrawStart: drawColondrawstart = js.native
    
    var onDrawStop: drawColondrawstop = js.native
    
    var onDrawVertex: drawColondrawvertex = js.native
    
    var onEditMove: drawColoneditmove = js.native
    
    var onEditResize: drawColoneditresize = js.native
    
    var onEditStart: drawColoneditstart = js.native
    
    var onEditStop: drawColoneditstop = js.native
    
    var onEditVertex: drawColoneditvertex = js.native
    
    var onEdited: drawColonedited = js.native
    
    var onMarkerContext: drawColonmarkercontext = js.native
    
    var onToolbarClosed: drawColontoolbarclosed = js.native
    
    var onToolbarOpened: drawColontoolbaropened = js.native
  }
  object EventHandlers {
    
    @scala.inline
    def apply(
      onCreated: drawColoncreated,
      onDeleteStart: drawColondeletestart,
      onDeleteStop: drawColondeletestop,
      onDeleted: drawColondeleted,
      onDrawStart: drawColondrawstart,
      onDrawStop: drawColondrawstop,
      onDrawVertex: drawColondrawvertex,
      onEditMove: drawColoneditmove,
      onEditResize: drawColoneditresize,
      onEditStart: drawColoneditstart,
      onEditStop: drawColoneditstop,
      onEditVertex: drawColoneditvertex,
      onEdited: drawColonedited,
      onMarkerContext: drawColonmarkercontext,
      onToolbarClosed: drawColontoolbarclosed,
      onToolbarOpened: drawColontoolbaropened
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(onCreated = onCreated.asInstanceOf[js.Any], onDeleteStart = onDeleteStart.asInstanceOf[js.Any], onDeleteStop = onDeleteStop.asInstanceOf[js.Any], onDeleted = onDeleted.asInstanceOf[js.Any], onDrawStart = onDrawStart.asInstanceOf[js.Any], onDrawStop = onDrawStop.asInstanceOf[js.Any], onDrawVertex = onDrawVertex.asInstanceOf[js.Any], onEditMove = onEditMove.asInstanceOf[js.Any], onEditResize = onEditResize.asInstanceOf[js.Any], onEditStart = onEditStart.asInstanceOf[js.Any], onEditStop = onEditStop.asInstanceOf[js.Any], onEditVertex = onEditVertex.asInstanceOf[js.Any], onEdited = onEdited.asInstanceOf[js.Any], onMarkerContext = onMarkerContext.asInstanceOf[js.Any], onToolbarClosed = onToolbarClosed.asInstanceOf[js.Any], onToolbarOpened = onToolbarOpened.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit class EventHandlersMutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCreated(value: drawColoncreated): Self = StObject.set(x, "onCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteStart(value: drawColondeletestart): Self = StObject.set(x, "onDeleteStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteStop(value: drawColondeletestop): Self = StObject.set(x, "onDeleteStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleted(value: drawColondeleted): Self = StObject.set(x, "onDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDrawStart(value: drawColondrawstart): Self = StObject.set(x, "onDrawStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDrawStop(value: drawColondrawstop): Self = StObject.set(x, "onDrawStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDrawVertex(value: drawColondrawvertex): Self = StObject.set(x, "onDrawVertex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditMove(value: drawColoneditmove): Self = StObject.set(x, "onEditMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditResize(value: drawColoneditresize): Self = StObject.set(x, "onEditResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditStart(value: drawColoneditstart): Self = StObject.set(x, "onEditStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditStop(value: drawColoneditstop): Self = StObject.set(x, "onEditStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditVertex(value: drawColoneditvertex): Self = StObject.set(x, "onEditVertex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEdited(value: drawColonedited): Self = StObject.set(x, "onEdited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMarkerContext(value: drawColonmarkercontext): Self = StObject.set(x, "onMarkerContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToolbarClosed(value: drawColontoolbarclosed): Self = StObject.set(x, "onToolbarClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToolbarOpened(value: drawColontoolbaropened): Self = StObject.set(x, "onToolbarOpened", value.asInstanceOf[js.Any])
    }
  }
}
