package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.olx.format.ReadOptions
import typingsSlinky.openlayers.mod.olx.format.WMSGetFeatureInfoOptions
import typingsSlinky.std.Document_
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
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a WMSGetFeatureInfo response.
    *
    * @param source Source.
    * @param opt_options Options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document_): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document_, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
}

