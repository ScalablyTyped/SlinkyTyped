package typingsSlinky.ol

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.featureMod.ReadOptions
import typingsSlinky.ol.featureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/XMLFeature", JSImport.Namespace)
@js.native
object xmlfeatureMod extends js.Object {
  
  @js.native
  trait XMLFeature
    extends typingsSlinky.ol.featureMod.default {
    
    def readFeatureFromDocument(doc: Document): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    def readFeatureFromNode(node: Node): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    def readFeatureFromNode(node: Node, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /* protected */ def readFeaturesFromNode(node: Node): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Node, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromDocument(doc: Document): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    /* protected */ def readGeometryFromNode(node: Node): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    /* protected */ def readProjectionFromDocument(doc: Document): typingsSlinky.ol.projectionMod.default = js.native
    
    /* protected */ def readProjectionFromNode(node: Node): typingsSlinky.ol.projectionMod.default = js.native
    
    /* protected */ def writeFeatureNode(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeFeaturesNode(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeGeometryNode(geometry: typingsSlinky.ol.geometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): Node = js.native
  }
  
  @js.native
  abstract class default () extends XMLFeature
}
