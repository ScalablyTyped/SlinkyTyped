package typingsSlinky.openlayers.openlayersMod.format

import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.openlayers.openlayersMod.olx.format.ReadOptions
import typingsSlinky.openlayers.openlayersMod.olx.format.WMSGetFeatureInfoOptions
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Format for reading WMSGetFeatureInfo format. It uses
  * {@link ol.format.GML2} to read features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.WMSGetFeatureInfo")
@js.native
/**
  * @classdesc
  * Format for reading WMSGetFeatureInfo format. It uses
  * {@link ol.format.GML2} to read features.
  *
  * @param opt_options Options.
  * @api
  */
class WMSGetFeatureInfo () extends XMLFeature {
  def this(opt_options: WMSGetFeatureInfoOptions) = this()
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  /**
    * Read all features from a WMSGetFeatureInfo response.
    *
    * @param source Source.
    * @param opt_options Options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
}

