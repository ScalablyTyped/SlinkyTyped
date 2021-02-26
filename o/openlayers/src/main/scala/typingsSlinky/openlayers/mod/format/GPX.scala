package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.olx.format.GPXOptions
import typingsSlinky.openlayers.mod.olx.format.ReadOptions
import typingsSlinky.openlayers.mod.olx.format.WriteOptions
import typingsSlinky.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the GPX format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.GPX")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the GPX format.
  *
  * @param opt_options Options.
  * @api stable
  */
class GPX () extends XMLFeature {
  def this(opt_options: GPXOptions) = this()
  
  def readFeature(source: String): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsSlinky.openlayers.mod.Feature = js.native
  /**
    * Read the first feature from a GPX source.
    * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
    * into MultiLineString. Any properties on route and track waypoints are ignored.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api stable
    */
  def readFeature(source: Document): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsSlinky.openlayers.mod.Feature = js.native
  
  def readFeatures(source: String): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a GPX source.
    * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
    * into MultiLineString. Any properties on route and track waypoints are ignored.
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
  def readFeatures(source: GlobalObject): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsSlinky.openlayers.mod.Feature] = js.native
  
  def readProjection(source: String): Projection = js.native
  /**
    * Read the projection from a GPX source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  
  /**
    * Encode an array of features in the GPX format.
    * LineString geometries are output as routes (`<rte>`), and MultiLineString
    * as tracks (`<trk>`).
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return Result.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsSlinky.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsSlinky.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features in the GPX format as an XML node.
    * LineString geometries are output as routes (`<rte>`), and MultiLineString
    * as tracks (`<trk>`).
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeFeaturesNode(features: js.Array[typingsSlinky.openlayers.mod.Feature]): Node = js.native
  def writeFeaturesNode(features: js.Array[typingsSlinky.openlayers.mod.Feature], opt_options: WriteOptions): Node = js.native
}
