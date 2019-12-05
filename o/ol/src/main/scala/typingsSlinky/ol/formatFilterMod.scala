package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.formatFilterFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Namespace)
@js.native
object formatFilterMod extends js.Object {
  def and(conditions: default*): typingsSlinky.ol.formatFilterAndMod.default = js.native
  def bbox(geometryName: String, extent: Extent): typingsSlinky.ol.formatFilterBboxMod.default = js.native
  def bbox(geometryName: String, extent: Extent, opt_srsName: String): typingsSlinky.ol.formatFilterBboxMod.default = js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typingsSlinky.ol.formatFilterIsBetweenMod.default = js.native
  def contains(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default): typingsSlinky.ol.formatFilterContainsMod.default = js.native
  def contains(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default, opt_srsName: String): typingsSlinky.ol.formatFilterContainsMod.default = js.native
  def during(propertyName: String, begin: String, end: String): typingsSlinky.ol.formatFilterDuringMod.default = js.native
  def equalTo(propertyName: String, expression: String): typingsSlinky.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsSlinky.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsSlinky.ol.formatFilterEqualToMod.default = js.native
  def greaterThan(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterGreaterThanMod.default = js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterGreaterThanOrEqualToMod.default = js.native
  def intersects(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default): typingsSlinky.ol.formatFilterIntersectsMod.default = js.native
  def intersects(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default, opt_srsName: String): typingsSlinky.ol.formatFilterIntersectsMod.default = js.native
  def isNull(propertyName: String): typingsSlinky.ol.formatFilterIsNullMod.default = js.native
  def lessThan(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterLessThanMod.default = js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterLessThanOrEqualToMod.default = js.native
  def like(propertyName: String, pattern: String): typingsSlinky.ol.formatFilterIsLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): typingsSlinky.ol.formatFilterIsLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typingsSlinky.ol.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsSlinky.ol.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsSlinky.ol.formatFilterIsLikeMod.default = js.native
  def not(condition: default): typingsSlinky.ol.formatFilterNotMod.default = js.native
  def notEqualTo(propertyName: String, expression: String): typingsSlinky.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsSlinky.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsSlinky.ol.formatFilterNotEqualToMod.default = js.native
  def or(conditions: default*): typingsSlinky.ol.formatFilterOrMod.default = js.native
  def within(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default): typingsSlinky.ol.formatFilterWithinMod.default = js.native
  def within(geometryName: String, geometry: typingsSlinky.ol.geomGeometryMod.default, opt_srsName: String): typingsSlinky.ol.formatFilterWithinMod.default = js.native
}

