package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureloaderMod.FeatureLoader
import typingsSlinky.ol.featureloaderMod.FeatureUrlFunction
import typingsSlinky.ol.olStrings.addfeature
import typingsSlinky.ol.olStrings.changefeature
import typingsSlinky.ol.olStrings.clear
import typingsSlinky.ol.olStrings.removefeature
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceVectorMod {
  
  @JSImport("ol/source/Vector", JSImport.Default)
  @js.native
  class default[GeomType /* <: typingsSlinky.ol.geometryMod.default */] () extends VectorSource[GeomType] {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/source/Vector", "VectorSourceEvent")
  @js.native
  class VectorSourceEvent[GeomType /* <: typingsSlinky.ol.geometryMod.default */] protected ()
    extends typingsSlinky.ol.eventMod.default {
    def this(`type`: String) = this()
    def this(`type`: String, opt_feature: typingsSlinky.ol.olFeatureMod.default[GeomType]) = this()
    
    /**
      * The feature being added or removed.
      */
    var feature: typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  }
  
  type LoadingStrategy = js.Function2[/* p0 */ Extent, /* p1 */ Double, js.Array[Extent]]
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var features: js.UndefOr[
        js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ] = js.native
    
    var format: js.UndefOr[typingsSlinky.ol.featureMod.default] = js.native
    
    var loader: js.UndefOr[FeatureLoader] = js.native
    
    var overlaps: js.UndefOr[Boolean] = js.native
    
    var strategy: js.UndefOr[LoadingStrategy] = js.native
    
    var url: js.UndefOr[String | FeatureUrlFunction] = js.native
    
    var useSpatialIndex: js.UndefOr[Boolean] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
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
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setFeatures(
        value: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFeaturesVarargs(value: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: typingsSlinky.ol.featureMod.default): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLoader(value: FeatureLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
      
      @scala.inline
      def setStrategy(value: (/* p0 */ Extent, /* p1 */ Double) => js.Array[Extent]): Self = StObject.set(x, "strategy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setUrl(value: String | FeatureUrlFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction3(
        value: (/* p0 */ Extent, /* p1 */ Double, /* p2 */ typingsSlinky.ol.projectionMod.default) => String
      ): Self = StObject.set(x, "url", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUseSpatialIndex(value: Boolean): Self = StObject.set(x, "useSpatialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSpatialIndexUndefined: Self = StObject.set(x, "useSpatialIndex", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  @js.native
  trait VectorSource[GeomType /* <: typingsSlinky.ol.geometryMod.default */]
    extends typingsSlinky.ol.sourceSourceMod.default {
    
    /**
      * Add a single feature to the source.  If you want to add a batch of features
      * at once, call {@link module:ol/source/Vector~VectorSource#addFeatures #addFeatures()}
      * instead. A feature will not be added to the source if feature with
      * the same id is already there. The reason for this behavior is to avoid
      * feature duplication when using bbox or tile loading strategies.
      * Note: this also applies if an {@link module:ol/Collection} is used for features,
      * meaning that if a feature with a duplicate id is added in the collection, it will
      * be removed from it right away.
      */
    def addFeature(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
    
    /**
      * Add a feature without firing a change event.
      */
    /* protected */ def addFeatureInternal(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
    
    /**
      * Add a batch of features to the source.
      */
    def addFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]]): Unit = js.native
    
    /**
      * Add features without firing a change event.
      */
    /* protected */ def addFeaturesInternal(features: js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]]): Unit = js.native
    
    /**
      * Remove all features from the source.
      */
    def clear(): Unit = js.native
    def clear(opt_fast: Boolean): Unit = js.native
    
    /**
      * Iterate through all features on the source, calling the provided callback
      * with each one.  If the callback returns any "truthy" value, iteration will
      * stop and the function will return the same value.
      * Note: this function only iterate through the feature that have a defined geometry.
      */
    def forEachFeature[T](callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]): js.UndefOr[T] = js.native
    
    /**
      * Iterate through all features whose geometries contain the provided
      * coordinate, calling the callback with each feature.  If the callback returns
      * a "truthy" value, iteration will stop and the function will return the same
      * value.
      */
    def forEachFeatureAtCoordinateDirect[T](
      coordinate: Coordinate,
      callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
    ): js.UndefOr[T] = js.native
    
    /**
      * Iterate through all features whose bounding box intersects the provided
      * extent (note that the feature's geometry may not intersect the extent),
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      * If you are interested in features whose geometry intersects an extent, call
      * the {@link module:ol/source/Vector~VectorSource#forEachFeatureIntersectingExtent #forEachFeatureIntersectingExtent()} method instead.
      * When useSpatialIndex is set to false, this method will loop through all
      * features, equivalent to {@link module:ol/source/Vector~VectorSource#forEachFeature #forEachFeature()}.
      */
    def forEachFeatureInExtent[T](
      extent: Extent,
      callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
    ): js.UndefOr[T] = js.native
    
    /**
      * Iterate through all features whose geometry intersects the provided extent,
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      * If you only want to test for bounding box intersection, call the
      * {@link module:ol/source/Vector~VectorSource#forEachFeatureInExtent #forEachFeatureInExtent()} method instead.
      */
    def forEachFeatureIntersectingExtent[T](
      extent: Extent,
      callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
    ): js.UndefOr[T] = js.native
    
    /**
      * Get the closest feature to the provided coordinate.
      * This method is not available when the source is configured with
      * useSpatialIndex set to false.
      */
    def getClosestFeatureToCoordinate(coordinate: Coordinate): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
    def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function0[Unit]): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
    
    /**
      * Get the extent of the features currently in the source.
      * This method is not available when the source is configured with
      * useSpatialIndex set to false.
      */
    def getExtent(): Extent = js.native
    def getExtent(opt_extent: Extent): Extent = js.native
    
    /**
      * Get a feature by its identifier (the value returned by feature.getId()).
      * Note that the index treats string and numeric identifiers as the same.  So
      * source.getFeatureById(2) will return a feature with id '2' or 2.
      */
    def getFeatureById(id: String): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
    def getFeatureById(id: Double): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
    
    /**
      * Get a feature by its internal unique identifier (using getUid).
      */
    def getFeatureByUid(uid: String): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
    
    /**
      * Get all features on the source in random order.
      */
    def getFeatures(): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
    
    /**
      * Get all features whose geometry intersects the provided coordinate.
      */
    def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
    
    /**
      * Get the features collection associated with this source. Will be null
      * unless the source was configured with useSpatialIndex set to false, or
      * with an {@link module:ol/Collection} as features.
      */
    def getFeaturesCollection(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
    
    /**
      * Get all features whose bounding box intersects the provided extent.  Note that this returns an array of
      * all features intersecting the given extent in random order (so it may include
      * features whose geometries do not intersect the extent).
      * When useSpatialIndex is set to false, this method will return all
      * features.
      */
    def getFeaturesInExtent(extent: Extent): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
    
    /**
      * Get the format associated with this source.
      */
    def getFormat(): js.UndefOr[typingsSlinky.ol.featureMod.default] = js.native
    
    def getOverlaps(): Boolean = js.native
    
    /**
      * Get the url associated with this source.
      */
    def getUrl(): js.UndefOr[String | FeatureUrlFunction] = js.native
    
    /**
      * Returns true if the feature is contained within the source.
      */
    def hasFeature(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def loadFeatures(extent: Extent, resolution: Double, projection: typingsSlinky.ol.projectionMod.default): Unit = js.native
    
    @JSName("on")
    def on_addfeature(
      `type`: addfeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_changefeature(
      `type`: changefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_clear(
      `type`: clear,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_removefeature(
      `type`: removefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    
    @JSName("once")
    def once_addfeature(
      `type`: addfeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_changefeature(
      `type`: changefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_clear(
      `type`: clear,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_removefeature(
      `type`: removefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): EventsKey = js.native
    
    /**
      * Remove a single feature from the source.  If you want to remove all features
      * at once, use the {@link module:ol/source/Vector~VectorSource#clear #clear()} method
      * instead.
      */
    def removeFeature(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
    
    /**
      * Remove feature without firing a change event.
      */
    /* protected */ def removeFeatureInternal(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
    
    /**
      * Remove an extent from the list of loaded extents.
      */
    def removeLoadedExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the new loader of the source. The next render cycle will use the
      * new loader.
      */
    def setLoader(loader: FeatureLoader): Unit = js.native
    
    /**
      * Points the source to a new url. The next render cycle will use the new url.
      */
    def setUrl(url: String): Unit = js.native
    def setUrl(url: FeatureUrlFunction): Unit = js.native
    
    @JSName("un")
    def un_addfeature(
      `type`: addfeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_changefeature(
      `type`: changefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_clear(
      `type`: clear,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_removefeature(
      `type`: removefeature,
      listener: js.Function1[/* evt */ VectorSourceEvent[typingsSlinky.ol.geometryMod.default], Unit]
    ): Unit = js.native
  }
}
