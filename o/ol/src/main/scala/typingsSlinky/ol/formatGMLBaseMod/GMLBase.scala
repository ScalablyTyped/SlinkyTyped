package typingsSlinky.ol.formatGMLBaseMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.ol.xmlMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GMLBase
  extends typingsSlinky.ol.formatXMLFeatureMod.default {
  var FLAT_LINEAR_RINGS_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var GEOMETRY_FLAT_COORDINATES_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var GEOMETRY_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var RING_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var featureNS: StringDictionary[String] | String = js.native
  var featureType: js.Array[String] | String = js.native
  var schemaLocation: String = js.native
  var srsName: String = js.native
  def readFeatureElement(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.featureMod.default = js.native
  def readFeatureElementInternal(node: Element, objectStack: js.Array[_], asFeature: Boolean): typingsSlinky.ol.featureMod.default | js.Object = js.native
  def readFeaturesInternal(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[typingsSlinky.ol.featureMod.default]] = js.native
  def readGeometryElement(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomGeometryMod.default] = js.native
  def readLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomLineStringMod.default] = js.native
  def readLinearRing(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomLinearRingMod.default] = js.native
  def readMultiLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomMultiLineStringMod.default] = js.native
  def readMultiPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomMultiPointMod.default] = js.native
  def readMultiPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomMultiPolygonMod.default] = js.native
  def readPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomPointMod.default] = js.native
  def readPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geomPolygonMod.default] = js.native
}

