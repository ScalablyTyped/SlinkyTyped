package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.olx.format.ReadOptions
import typingsSlinky.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading data in the
  * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
  *
  * @api stable
  */
@JSImport("openlayers", "format.OSMXML")
@js.native
/**
  * @classdesc
  * Feature format for reading data in the
  * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
  *
  * @api stable
  */
class OSMXML () extends XMLFeature {
  
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  /**
    * Read all features from an OSM source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from an OSM source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
}
