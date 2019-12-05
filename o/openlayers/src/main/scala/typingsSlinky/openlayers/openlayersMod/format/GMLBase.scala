package typingsSlinky.openlayers.openlayersMod.format

import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.openlayers.openlayersMod.olx.format.GMLOptions
import typingsSlinky.openlayers.openlayersMod.olx.format.ReadOptions
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Feature base format for reading and writing data in the GML format.
  * This class cannot be instantiated, it contains only base content that
  * is shared with versioned format classes ol.format.GML2 and
  * ol.format.GML3.
  *
  * @param opt_options
  *     Optional configuration object.
  */
@JSImport("openlayers", "format.GMLBase")
@js.native
/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Feature base format for reading and writing data in the GML format.
  * This class cannot be instantiated, it contains only base content that
  * is shared with versioned format classes ol.format.GML2 and
  * ol.format.GML3.
  *
  * @param opt_options
  *     Optional configuration object.
  */
class GMLBase () extends XMLFeature {
  def this(opt_options: GMLOptions) = this()
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  /**
    * Read all features from a GML FeatureCollection.
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

