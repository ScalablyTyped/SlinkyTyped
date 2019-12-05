package typingsSlinky.openlayers.openlayersMod.format

import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.openlayers.openlayersMod.olx.format.TopoJSONOptions
import typingsSlinky.openlayers.openlayersMod.proj.Projection
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading data in the TopoJSON format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.TopoJSON")
@js.native
/**
  * @classdesc
  * Feature format for reading data in the TopoJSON format.
  *
  * @param opt_options Options.
  * @api stable
  */
class TopoJSON () extends JSONFeature {
  def this(opt_options: TopoJSONOptions) = this()
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  /**
    * Read all features from a TopoJSON source.
    *
    * @param source Source.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsSlinky.openlayers.openlayersMod.Feature] = js.native
  def readProjection(`object`: String): Projection = js.native
  def readProjection(`object`: GlobalObject): Projection = js.native
  /**
    * Read the projection from a TopoJSON source.
    *
    * @param object Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(`object`: Document): Projection = js.native
  def readProjection(`object`: Node): Projection = js.native
}

