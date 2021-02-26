package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapMod {
  
  @JSImport("ol/interaction/Snap", JSImport.Default)
  @js.native
  class default () extends Snap {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var edge: js.UndefOr[Boolean] = js.native
    
    var features: js.UndefOr[
        typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ] = js.native
    
    var pixelTolerance: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    var vertex: js.UndefOr[Boolean] = js.native
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
      def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      @scala.inline
      def setFeatures(
        value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      @scala.inline
      def setSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setVertex(value: Boolean): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var snapped: Boolean = js.native
    
    var vertex: Coordinate = js.native
    
    var vertexPixel: Pixel = js.native
  }
  object Result {
    
    @scala.inline
    def apply(snapped: Boolean, vertex: Coordinate, vertexPixel: Pixel): Result = {
      val __obj = js.Dynamic.literal(snapped = snapped.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any], vertexPixel = vertexPixel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSnapped(value: Boolean): Self = StObject.set(x, "snapped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex(value: Coordinate): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPixel(value: Pixel): Self = StObject.set(x, "vertexPixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexPixelVarargs(value: Double*): Self = StObject.set(x, "vertexPixel", js.Array(value :_*))
      
      @scala.inline
      def setVertexVarargs(value: Double*): Self = StObject.set(x, "vertex", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SegmentData extends StObject {
    
    var feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    var segment: js.Array[Coordinate] = js.native
  }
  object SegmentData {
    
    @scala.inline
    def apply(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      segment: js.Array[Coordinate]
    ): SegmentData = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentData]
    }
    
    @scala.inline
    implicit class SegmentDataMutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: js.Array[Coordinate]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentVarargs(value: Coordinate*): Self = StObject.set(x, "segment", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Snap
    extends typingsSlinky.ol.pointerMod.default {
    
    /**
      * Add a feature to the collection of features that we may snap to.
      */
    def addFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
    def addFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_listen: Boolean
    ): Unit = js.native
    
    /**
      * Remove a feature from the collection of features that we may snap to.
      */
    def removeFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
    def removeFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_unlisten: Boolean
    ): Unit = js.native
    
    def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typingsSlinky.ol.pluggableMapMod.default): Result = js.native
  }
}
