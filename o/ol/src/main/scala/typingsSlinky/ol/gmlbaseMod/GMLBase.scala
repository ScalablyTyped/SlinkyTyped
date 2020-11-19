package typingsSlinky.ol.gmlbaseMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olXmlMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GMLBase
  extends typingsSlinky.ol.xmlfeatureMod.default {
  
  var FLAT_LINEAR_RINGS_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  
  var GEOMETRY_FLAT_COORDINATES_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  
  var GEOMETRY_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  
  var RING_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  
  var featureNS: StringDictionary[String] | String = js.native
  
  var featureType: js.Array[String] | String = js.native
  
  def readFeatureElement(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  def readFeatureElementInternal(node: Element, objectStack: js.Array[_], asFeature: Boolean): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] | js.Object = js.native
  
  def readFeaturesInternal(node: Element, objectStack: js.Array[_]): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  def readGeometryElement(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.geometryMod.default | Extent = js.native
  
  def readLineString(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.lineStringMod.default = js.native
  
  def readLinearRing(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.linearRingMod.default = js.native
  
  def readMultiLineString(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.multiLineStringMod.default = js.native
  
  def readMultiPoint(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.multiPointMod.default = js.native
  
  def readMultiPolygon(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.multiPolygonMod.default = js.native
  
  def readPoint(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.pointMod.default = js.native
  
  def readPolygon(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.polygonMod.default = js.native
  
  var schemaLocation: String = js.native
  
  var srsName: String = js.native
}
