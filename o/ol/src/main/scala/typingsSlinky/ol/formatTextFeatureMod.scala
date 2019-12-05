package typingsSlinky.ol

import typingsSlinky.ol.formatFeatureMod.ReadOptions
import typingsSlinky.ol.formatFeatureMod.WriteOptions
import typingsSlinky.ol.formatTextFeatureMod.TextFeature
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/TextFeature", JSImport.Namespace)
@js.native
object formatTextFeatureMod extends js.Object {
  @js.native
  trait TextFeature
    extends typingsSlinky.ol.formatFeatureMod.default {
    /* protected */ def readFeatureFromText(text: String): typingsSlinky.ol.featureMod.default = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
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
    /* protected */ def readFeaturesFromText(text: String): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readGeometryFromText(text: String): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readProjectionFromText(text: String): typingsSlinky.ol.projProjectionMod.default = js.native
    /* protected */ def writeFeatureText(feature: typingsSlinky.ol.featureMod.default): String = js.native
    /* protected */ def writeFeatureText(feature: typingsSlinky.ol.featureMod.default, opt_options: WriteOptions): String = js.native
    /* protected */ def writeFeaturesText(features: js.Array[typingsSlinky.ol.featureMod.default]): String = js.native
    /* protected */ def writeFeaturesText(features: js.Array[typingsSlinky.ol.featureMod.default], opt_options: WriteOptions): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsSlinky.ol.geomGeometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsSlinky.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
  }
  
  @js.native
  class default () extends TextFeature
  
}

