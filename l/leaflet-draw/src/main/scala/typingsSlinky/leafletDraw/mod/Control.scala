package typingsSlinky.leafletDraw.mod

import typingsSlinky.leaflet.mod.ControlPosition
import typingsSlinky.leaflet.mod.Control_
import typingsSlinky.leaflet.mod.FeatureGroup_
import typingsSlinky.leafletDraw.leafletDrawBooleans.`false`
import typingsSlinky.leafletDraw.mod.DrawOptions.CircleMarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.CircleOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.MarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolygonOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolylineOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.RectangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Control {
  
  @JSImport("leaflet", "Control.Draw")
  @js.native
  class Draw () extends Control_ {
    def this(options: DrawConstructorOptions) = this()
    
    def initialize(): Unit = js.native
    def initialize(options: typingsSlinky.leafletDraw.mod.Control.DrawOptions): Unit = js.native
    
    def setDrawingOptions(): Unit = js.native
    def setDrawingOptions(options: typingsSlinky.leafletDraw.mod.Control.DrawOptions): Unit = js.native
  }
  
  @js.native
  trait DrawConstructorOptions extends StObject {
    
    /**
      * The options used to configure the draw toolbar.
      *
      * @default {}
      */
    var draw: js.UndefOr[typingsSlinky.leafletDraw.mod.Control.DrawOptions] = js.native
    
    /**
      * The options used to configure the edit toolbar.
      *
      * @default false
      */
    var edit: js.UndefOr[typingsSlinky.leafletDraw.mod.Control.EditOptions] = js.native
    
    /**
      * The initial position of the control (one of the map corners).
      *
      * @default 'topleft'
      */
    var position: js.UndefOr[ControlPosition] = js.native
  }
  object DrawConstructorOptions {
    
    @scala.inline
    def apply(): DrawConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawConstructorOptions]
    }
    
    @scala.inline
    implicit class DrawConstructorOptionsMutableBuilder[Self <: DrawConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraw(value: typingsSlinky.leafletDraw.mod.Control.DrawOptions): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      @scala.inline
      def setEdit(value: typingsSlinky.leafletDraw.mod.Control.EditOptions): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      @scala.inline
      def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait DrawOptions extends StObject {
    
    /**
      * Circle draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var circle: js.UndefOr[CircleOptions | `false`] = js.native
    
    /**
      * Circle marker draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var circlemarker: js.UndefOr[CircleMarkerOptions | `false`] = js.native
    
    /**
      * Marker draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var marker: js.UndefOr[MarkerOptions | `false`] = js.native
    
    /**
      * Polygon draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var polygon: js.UndefOr[PolygonOptions | `false`] = js.native
    
    /**
      * Polyline draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var polyline: js.UndefOr[PolylineOptions | `false`] = js.native
    
    /**
      * Rectangle draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var rectangle: js.UndefOr[RectangleOptions | `false`] = js.native
  }
  object DrawOptions {
    
    @scala.inline
    def apply(): typingsSlinky.leafletDraw.mod.Control.DrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Control.DrawOptions]
    }
    
    @scala.inline
    implicit class DrawOptionsMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Control.DrawOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: CircleOptions | `false`): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setCirclemarker(value: CircleMarkerOptions | `false`): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCirclemarkerUndefined: Self = StObject.set(x, "circlemarker", js.undefined)
      
      @scala.inline
      def setMarker(value: MarkerOptions | `false`): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setPolygon(value: PolygonOptions | `false`): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      @scala.inline
      def setPolyline(value: PolylineOptions | `false`): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      @scala.inline
      def setRectangle(value: RectangleOptions | `false`): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    }
  }
  
  @js.native
  trait EditOptions extends StObject {
    
    /**
      * Edit handler options. Set to false to disable handler.
      *
      * @default null
      */
    var edit: js.UndefOr[EditHandlerOptions | `false`] = js.native
    
    /**
      * This is the FeatureGroup that stores all editable shapes.
      * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
      *
      * @default null
      */
    var featureGroup: FeatureGroup_[_] = js.native
    
    /**
      * Delete handler options. Set to false to disable handler.
      *
      * Default value: null
      */
    var remove: js.UndefOr[Null | `false`] = js.native
  }
  object EditOptions {
    
    @scala.inline
    def apply(featureGroup: FeatureGroup_[_]): typingsSlinky.leafletDraw.mod.Control.EditOptions = {
      val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Control.EditOptions]
    }
    
    @scala.inline
    implicit class EditOptionsMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Control.EditOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdit(value: EditHandlerOptions | `false`): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      @scala.inline
      def setFeatureGroup(value: FeatureGroup_[_]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: `false`): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
