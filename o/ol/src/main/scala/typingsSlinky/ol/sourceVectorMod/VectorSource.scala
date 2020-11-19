package typingsSlinky.ol.sourceVectorMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureloaderMod.FeatureLoader
import typingsSlinky.ol.featureloaderMod.FeatureUrlFunction
import typingsSlinky.ol.olStrings.addfeature
import typingsSlinky.ol.olStrings.changefeature
import typingsSlinky.ol.olStrings.clear
import typingsSlinky.ol.olStrings.removefeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorSource[GeomType /* <: typingsSlinky.ol.geometryMod.default */]
  extends typingsSlinky.ol.sourceSourceMod.default {
  
  def addFeature(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
  
  /* protected */ def addFeatureInternal(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
  
  def addFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]]): Unit = js.native
  
  /* protected */ def addFeaturesInternal(features: js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]]): Unit = js.native
  
  def clear(): Unit = js.native
  def clear(opt_fast: Boolean): Unit = js.native
  
  def forEachFeature[T](callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]): T = js.native
  
  def forEachFeatureAtCoordinateDirect[T](
    coordinate: Coordinate,
    callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  
  def forEachFeatureInExtent[T](
    extent: Extent,
    callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  
  def forEachFeatureIntersectingExtent[T](
    extent: Extent,
    callback: js.Function1[/* p0 */ typingsSlinky.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  
  def getClosestFeatureToCoordinate(coordinate: Coordinate): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function0[Unit]): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  
  def getFeatureById(id: String): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  def getFeatureById(id: Double): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  
  def getFeatureByUid(uid: String): typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
  
  def getFeatures(): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
  
  def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
  
  def getFeaturesCollection(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
  
  def getFeaturesInExtent(extent: Extent): js.Array[typingsSlinky.ol.olFeatureMod.default[GeomType]] = js.native
  
  def getFormat(): typingsSlinky.ol.featureMod.default = js.native
  
  def getOverlaps(): Boolean = js.native
  
  def getUrl(): String | FeatureUrlFunction = js.native
  
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
  
  def removeFeature(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
  
  /* protected */ def removeFeatureInternal(feature: typingsSlinky.ol.olFeatureMod.default[GeomType]): Unit = js.native
  
  def removeLoadedExtent(extent: Extent): Unit = js.native
  
  def setLoader(loader: FeatureLoader): Unit = js.native
  
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
