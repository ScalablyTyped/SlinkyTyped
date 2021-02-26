package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.drawing.DrawingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  // Sub module: drawing
  @JSGlobal("naver.maps.drawing")
  @js.native
  def apply(): Unit = js.native
  
  @JSGlobal("naver.maps.drawing.DrawingEvent")
  @js.native
  object DrawingEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent with Double] = js.native
    
    /* 0 */ val ADD: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.ADD with Double = js.native
    
    /* 3 */ val Added: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.Added with Double = js.native
    
    /* 1 */ val REMOVE: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.REMOVE with Double = js.native
    
    /* 4 */ val Removed: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.Removed with Double = js.native
    
    /* 2 */ val SELECT: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.SELECT with Double = js.native
    
    /* 5 */ val Selected: typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent.Selected with Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingManager")
  @js.native
  class DrawingManager ()
    extends typingsSlinky.navermaps.naver.maps.drawing.DrawingManager {
    def this(options: DrawingOptions) = this()
  }
  
  @JSGlobal("naver.maps.drawing.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.DrawingMode with Double] = js.native
    
    /* 3 */ val ARROWLINE: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.ARROWLINE with Double = js.native
    
    /* 1 */ val ELLIPSE: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.ELLIPSE with Double = js.native
    
    /* 0 */ val HAND: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.HAND with Double = js.native
    
    /* 5 */ val MARKER: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.MARKER with Double = js.native
    
    /* 4 */ val POLYGON: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.POLYGON with Double = js.native
    
    /* 2 */ val POLYLINE: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.POLYLINE with Double = js.native
    
    /* 0 */ val RECTANGLE: typingsSlinky.navermaps.naver.maps.drawing.DrawingMode.RECTANGLE with Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingStyle")
  @js.native
  object DrawingStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.DrawingStyle with Double] = js.native
    
    /* 0 */ val HORIZONTAL: typingsSlinky.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL with Double = js.native
    
    /* 1 */ val HORIZONTAL_2: typingsSlinky.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL_2 with Double = js.native
    
    /* 0 */ val VERTICAL: typingsSlinky.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL with Double = js.native
    
    /* 2 */ val VERTICAL_2: typingsSlinky.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL_2 with Double = js.native
  }
}
