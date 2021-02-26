package typingsSlinky.appleMapkitJsBrowser

import typingsSlinky.appleMapkitJsBrowser.mapkit.CoordinateRegion
import typingsSlinky.appleMapkitJsBrowser.mapkit.Overlay
import typingsSlinky.appleMapkitJsBrowser.mapkit.Place
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `1` extends StObject {
    
    var `1`: String = js.native
    
    var `2`: js.UndefOr[String] = js.native
    
    var `3`: js.UndefOr[String] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(`1`: String): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      @scala.inline
      def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Undefined: Self = StObject.set(x, "3", js.undefined)
    }
  }
  
  @js.native
  trait Annotation extends StObject {
    
    var annotation: js.UndefOr[typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation] = js.native
    
    var overlay: js.UndefOr[Overlay] = js.native
  }
  object Annotation {
    
    @scala.inline
    def apply(): Annotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotation]
    }
    
    @scala.inline
    implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      @scala.inline
      def setOverlay(value: Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationAnnotation extends StObject {
    
    var annotation: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation = js.native
  }
  object AnnotationAnnotation {
    
    @scala.inline
    def apply(annotation: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation): AnnotationAnnotation = {
      val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationAnnotation]
    }
    
    @scala.inline
    implicit class AnnotationAnnotationMutableBuilder[Self <: AnnotationAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Coordinate extends StObject {
    
    var annotation: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation = js.native
    
    var coordinate: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate = js.native
  }
  object Coordinate {
    
    @scala.inline
    def apply(
      annotation: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation,
      coordinate: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate
    ): Coordinate = {
      val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    @scala.inline
    implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinate(value: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisplayRegion[Q] extends StObject {
    
    /**
      * A region that encloses the search results. This property is not present
      * if there are no results.
      */
    var displayRegion: js.UndefOr[CoordinateRegion] = js.native
    
    /**
      * An array of Place objects. The places array is empty if there is no match.
      */
    var places: js.Array[Place] = js.native
    
    /**
      * The query corresponding to the results  The query corresponding to the
      * results, if a SearchAutocompleteResult was not used to perform the search.
      */
    var query: js.UndefOr[String] = js.native
  }
  object DisplayRegion {
    
    @scala.inline
    def apply[Q](places: js.Array[Place]): DisplayRegion[Q] = {
      val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayRegion[Q]]
    }
    
    @scala.inline
    implicit class DisplayRegionMutableBuilder[Self <: DisplayRegion[_], Q] (val x: Self with DisplayRegion[Q]) extends AnyVal {
      
      @scala.inline
      def setDisplayRegion(value: CoordinateRegion): Self = StObject.set(x, "displayRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayRegionUndefined: Self = StObject.set(x, "displayRegion", js.undefined)
      
      @scala.inline
      def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<apple-mapkit-js-browser.mapkit.GeocoderConstructorOptions, 'language'> */
  @js.native
  trait PickGeocoderConstructorOp extends StObject {
    
    var language: js.UndefOr[String] = js.native
  }
  object PickGeocoderConstructorOp {
    
    @scala.inline
    def apply(): PickGeocoderConstructorOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickGeocoderConstructorOp]
    }
    
    @scala.inline
    implicit class PickGeocoderConstructorOpMutableBuilder[Self <: PickGeocoderConstructorOp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait Timestamp extends StObject {
    
    var coordinate: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate = js.native
    
    var timestamp: js.Date = js.native
  }
  object Timestamp {
    
    @scala.inline
    def apply(coordinate: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate, timestamp: js.Date): Timestamp = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    @scala.inline
    implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinate(value: typingsSlinky.appleMapkitJsBrowser.mapkit.Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
