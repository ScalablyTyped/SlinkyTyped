package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.olx.format.ReadOptions
import typingsSlinky.openlayers.mod.olx.format.WKTOptions
import typingsSlinky.openlayers.mod.olx.format.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Geometry format for reading and writing data in the `WellKnownText` (WKT)
  * format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.WKT")
@js.native
/**
  * @classdesc
  * Geometry format for reading and writing data in the `WellKnownText` (WKT)
  * format.
  *
  * @param opt_options Options.
  * @api stable
  */
class WKT () extends TextFeature {
  def this(opt_options: WKTOptions) = this()
  
  def readFeature(source: String): typingsSlinky.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsSlinky.openlayers.mod.Feature = js.native
  /**
    * Read a feature from a WKT source.
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
    * Read all features from a WKT source.
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
  
  def readGeometry(source: String): Geometry = js.native
  def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
  /**
    * Read a single geometry from a WKT source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Geometry.
    * @api stable
    */
  def readGeometry(source: Document): Geometry = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: Node): Geometry = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: GlobalObject): Geometry = js.native
  def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
  
  /**
    * Encode a feature as a WKT string.
    *
    * @param feature Feature.
    * @param opt_options Write options.
    * @return WKT string.
    * @api stable
    */
  def writeFeature(feature: typingsSlinky.openlayers.mod.Feature): String = js.native
  def writeFeature(feature: typingsSlinky.openlayers.mod.Feature, opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features as a WKT string.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return WKT string.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsSlinky.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsSlinky.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Write a single geometry as a WKT string.
    *
    * @param geometry Geometry.
    * @return WKT string.
    * @api stable
    */
  def writeGeometry(geometry: Geometry): String = js.native
}
