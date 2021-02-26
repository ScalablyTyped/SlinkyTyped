package typingsSlinky.leafletDraw.mod

import typingsSlinky.leaflet.mod.Handler
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leafletDraw.mod.EditOptions.EditPolyVerticesEditOptions
import typingsSlinky.leafletDraw.mod.EditOptions.EditSimpleShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Edit {
  
  @JSImport("leaflet", "Edit.Circle")
  @js.native
  class Circle protected () extends CircleMarker {
    def this(shape: Circle) = this()
    def this(shape: Circle, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.CircleMarker")
  @js.native
  class CircleMarker protected () extends SimpleShape {
    def this(shape: CircleMarker) = this()
    def this(shape: CircleMarker, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.Marker")
  @js.native
  class Marker protected () extends Handler {
    def this(marker: Marker) = this()
    def this(marker: Marker, options: js.Object) = this()
  }
  
  @JSImport("leaflet", "Edit.PolyVerticesEdit")
  @js.native
  class PolyVerticesEdit protected () extends Handler {
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression]) = this()
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression], options: EditPolyVerticesEditOptions) = this()
    
    def updateMarkers(): Unit = js.native
  }
  
  @JSImport("leaflet", "Edit.Polyline")
  @js.native
  class Polyline protected () extends Handler {
    def this(polyline: typingsSlinky.leafletDraw.mod.Draw.Polyline) = this()
    
    def updateMarkers(): Unit = js.native
  }
  
  @JSImport("leaflet", "Edit.Rectangle")
  @js.native
  class Rectangle protected () extends SimpleShape {
    def this(shape: Rectangle) = this()
    def this(shape: Rectangle, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.SimpleShape")
  @js.native
  class SimpleShape protected () extends Handler {
    def this(shape: SimpleShape) = this()
    def this(shape: SimpleShape, options: EditSimpleShapeOptions) = this()
    
    def updateMarkers(): Unit = js.native
  }
}
