package typingsSlinky.ol.featureMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.ol.formatTypeMod.FormatType
import typingsSlinky.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormat extends js.Object {
  
  /**
    * Sets the dataProjection on the options, if no dataProjection
    * is set.
    */
  /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  
  var dataProjection: typingsSlinky.ol.projectionMod.default = js.native
  
  var defaultFeatureProjection: typingsSlinky.ol.projectionMod.default = js.native
  
  /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /**
    * Adds the data projection to the read options.
    */
  /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Element): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Element, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  
  def getType(): FormatType = js.native
  
  def readFeature(source: String): FeatureLike = js.native
  def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: js.Object): FeatureLike = js.native
  def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
  /**
    * Read a single feature from a source.
    */
  def readFeature(source: Document): FeatureLike = js.native
  def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Element): FeatureLike = js.native
  def readFeature(source: Element, opt_options: ReadOptions): FeatureLike = js.native
  
  def readFeatures(source: String): js.Array[FeatureLike] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  /**
    * Read all features from a source.
    */
  def readFeatures(source: Document): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Element): js.Array[FeatureLike] = js.native
  def readFeatures(source: Element, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  
  def readGeometry(source: String): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  /**
    * Read a single geometry from a source.
    */
  def readGeometry(source: Document): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Element): typingsSlinky.ol.geometryMod.default = js.native
  def readGeometry(source: Element, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  
  def readProjection(source: String): typingsSlinky.ol.projectionMod.default = js.native
  def readProjection(source: js.Object): typingsSlinky.ol.projectionMod.default = js.native
  /**
    * Read the projection from a source.
    */
  def readProjection(source: Document): typingsSlinky.ol.projectionMod.default = js.native
  def readProjection(source: Element): typingsSlinky.ol.projectionMod.default = js.native
  
  /**
    * Encode a feature in this format.
    */
  def writeFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): String = js.native
  def writeFeature(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    opt_options: WriteOptions
  ): String = js.native
  
  /**
    * Encode an array of features in this format.
    */
  def writeFeatures(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): String = js.native
  def writeFeatures(
    features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    opt_options: WriteOptions
  ): String = js.native
  
  /**
    * Write a single geometry in this format.
    */
  def writeGeometry(geometry: typingsSlinky.ol.geometryMod.default): String = js.native
  def writeGeometry(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
}
