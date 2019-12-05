package typingsSlinky.ol

import typingsSlinky.ol.formatFeatureMod.ReadOptions
import typingsSlinky.ol.formatFeatureMod.WriteOptions
import typingsSlinky.ol.formatJSONFeatureMod.JSONFeature
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/JSONFeature", JSImport.Namespace)
@js.native
object formatJSONFeatureMod extends js.Object {
  @js.native
  trait JSONFeature
    extends typingsSlinky.ol.formatFeatureMod.default {
    def readFeature(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsSlinky.ol.featureMod.default = js.native
    def readFeature(source: scala.scalajs.js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any): typingsSlinky.ol.featureMod.default = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: String): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: String, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: js.Object): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: js.Object, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: Document): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: Document, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: Node): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_default(source: Node, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: ReadOptions): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    def readGeometry(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsSlinky.ol.geomGeometryMod.default = js.native
    def readGeometry(source: scala.scalajs.js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
    def readProjection(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsSlinky.ol.projProjectionMod.default = js.native
    /* protected */ def readProjectionFromObject(`object`: js.Any): typingsSlinky.ol.projProjectionMod.default = js.native
    def writeFeatureObject(feature: typingsSlinky.ol.featureMod.default): js.Any = js.native
    def writeFeatureObject(feature: typingsSlinky.ol.featureMod.default, opt_options: WriteOptions): js.Any = js.native
    def writeFeaturesObject(features: js.Array[typingsSlinky.ol.featureMod.default]): js.Any = js.native
    def writeFeaturesObject(features: js.Array[typingsSlinky.ol.featureMod.default], opt_options: WriteOptions): js.Any = js.native
    def writeGeometryObject(geometry: typingsSlinky.ol.geomGeometryMod.default): js.Any = js.native
    def writeGeometryObject(geometry: typingsSlinky.ol.geomGeometryMod.default, opt_options: WriteOptions): js.Any = js.native
  }
  
  @js.native
  class default () extends JSONFeature
  
}

