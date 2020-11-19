package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.olx.format.TopoJSONOptions
import typingsSlinky.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a TopoJSON source.
    *
    * @param source Source.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  
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
