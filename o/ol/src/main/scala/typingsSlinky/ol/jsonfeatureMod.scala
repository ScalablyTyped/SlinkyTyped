package typingsSlinky.ol

import typingsSlinky.ol.featureMod.ReadOptions
import typingsSlinky.ol.featureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/JSONFeature", JSImport.Namespace)
@js.native
object jsonfeatureMod extends js.Object {
  @js.native
  trait JSONFeature
    extends typingsSlinky.ol.featureMod.default {
    def readFeature(source: js.typedarray.ArrayBuffer): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    def readFeature(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    def readGeometry(source: js.typedarray.ArrayBuffer): typingsSlinky.ol.geometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    def readProjection(source: js.typedarray.ArrayBuffer): typingsSlinky.ol.projectionMod.default = js.native
    /* protected */ def readProjectionFromObject(`object`: js.Any): typingsSlinky.ol.projectionMod.default = js.native
    def writeFeatureObject(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): js.Any = js.native
    def writeFeatureObject(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeFeaturesObject(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): js.Any = js.native
    def writeFeaturesObject(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeGeometryObject(geometry: typingsSlinky.ol.geometryMod.default): js.Any = js.native
    def writeGeometryObject(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends JSONFeature
  
}

