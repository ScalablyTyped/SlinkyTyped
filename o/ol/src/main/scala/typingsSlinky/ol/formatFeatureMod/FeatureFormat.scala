package typingsSlinky.ol.formatFeatureMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.formatFormatTypeMod.FormatType
import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormat extends js.Object {
  var dataProjection: typingsSlinky.ol.projProjectionMod.default = js.native
  var defaultFeatureProjection: typingsSlinky.ol.projProjectionMod.default = js.native
  /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  def getLastExtent(): Extent = js.native
  /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Node): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Node, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
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
  def readFeatures(source: ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readGeometry(source: String): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: js.Object): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Document): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Node): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): typingsSlinky.ol.geomGeometryMod.default = js.native
  def readProjection(source: String): typingsSlinky.ol.projProjectionMod.default = js.native
  def readProjection(source: js.Object): typingsSlinky.ol.projProjectionMod.default = js.native
  def readProjection(source: Document): typingsSlinky.ol.projProjectionMod.default = js.native
  def readProjection(source: Node): typingsSlinky.ol.projProjectionMod.default = js.native
  def writeFeature(feature: typingsSlinky.ol.featureMod.default): String = js.native
  def writeFeature(feature: typingsSlinky.ol.featureMod.default, opt_options: WriteOptions): String = js.native
  def writeFeatures(features: js.Array[typingsSlinky.ol.featureMod.default]): String = js.native
  def writeFeatures(features: js.Array[typingsSlinky.ol.featureMod.default], opt_options: WriteOptions): String = js.native
  def writeGeometry(geometry: typingsSlinky.ol.geomGeometryMod.default): String = js.native
  def writeGeometry(geometry: typingsSlinky.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
}

