package typingsSlinky.ol

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.formatFeatureMod.ReadOptions
import typingsSlinky.ol.formatFeatureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/XMLFeature", JSImport.Namespace)
@js.native
object formatXMLFeatureMod extends js.Object {
  @js.native
  trait XMLFeature
    extends typingsSlinky.ol.formatFeatureMod.default {
    def readFeatureFromDocument(doc: Document): typingsSlinky.ol.featureMod.default = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    def readFeatureFromNode(node: Node): typingsSlinky.ol.featureMod.default = js.native
    def readFeatureFromNode(node: Node, opt_options: ReadOptions): typingsSlinky.ol.featureMod.default = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: String): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: String, opt_options: ReadOptions): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: js.Object): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: typingsSlinky.std.Document): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: typingsSlinky.std.Document, opt_options: ReadOptions): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: typingsSlinky.std.Node): FeatureLike = js.native
    @JSName("readFeature")
    def readFeature_FeatureLike(source: typingsSlinky.std.Node, opt_options: ReadOptions): FeatureLike = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromNode(node: Node): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromNode(node: Node, opt_options: ReadOptions): js.Array[typingsSlinky.ol.featureMod.default] = js.native
    /* protected */ def readGeometryFromDocument(doc: Document): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
    /* protected */ def readProjectionFromDocument(doc: Document): typingsSlinky.ol.projProjectionMod.default = js.native
    /* protected */ def readProjectionFromNode(node: Node): typingsSlinky.ol.projProjectionMod.default = js.native
    /* protected */ def writeFeatureNode(feature: typingsSlinky.ol.featureMod.default): Node = js.native
    /* protected */ def writeFeatureNode(feature: typingsSlinky.ol.featureMod.default, opt_options: WriteOptions): Node = js.native
    def writeFeaturesNode(features: js.Array[typingsSlinky.ol.featureMod.default]): Node = js.native
    def writeFeaturesNode(features: js.Array[typingsSlinky.ol.featureMod.default], opt_options: WriteOptions): Node = js.native
    def writeGeometryNode(geometry: typingsSlinky.ol.geomGeometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typingsSlinky.ol.geomGeometryMod.default, opt_options: WriteOptions): Node = js.native
  }
  
  @js.native
  class default () extends XMLFeature
  
}

