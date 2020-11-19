package typingsSlinky.ol.featureMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.formatTypeMod.FormatType
import typingsSlinky.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormat extends js.Object {
  
  /* protected */ def adaptOptions(): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: ReadOptions): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: WriteOptions): WriteOptions | ReadOptions = js.native
  
  var dataProjection: typingsSlinky.ol.projectionMod.default = js.native
  
  var defaultFeatureProjection: typingsSlinky.ol.projectionMod.default = js.native
  
  /* protected */ def getReadOptions(source: String): ReadOptions = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node, opt_options: ReadOptions): ReadOptions = js.native
  
  def getType(): FormatType = js.native
  
  def readFeature(source: String): FeatureLike = js.native
  def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: js.Object): FeatureLike = js.native
  def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Document): FeatureLike = js.native
  def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Node): FeatureLike = js.native
  def readFeature(source: Node, opt_options: ReadOptions): FeatureLike = js.native
  
  def readFeatures(source: String): js.Array[FeatureLike] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  
  def readGeometry(source: String): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Document): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Node): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  
  def readProjection(source: String): typingsSlinky.ol.projectionMod.default = js.native
  def readProjection(source: js.Object): typingsSlinky.ol.projectionMod.default = js.native
  def readProjection(source: Document): typingsSlinky.ol.projectionMod.default = js.native
  def readProjection(source: Node): typingsSlinky.ol.projectionMod.default = js.native
  
  def writeFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): String = js.native
  def writeFeature(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    opt_options: WriteOptions
  ): String = js.native
  
  def writeFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): String = js.native
  def writeFeatures(
    features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    opt_options: WriteOptions
  ): String = js.native
  
  def writeGeometry(geometry: typingsSlinky.ol.geometryMod.default): String = js.native
  def writeGeometry(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
}
