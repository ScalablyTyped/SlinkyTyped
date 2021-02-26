package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.filterFilterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("ol/format/filter", "and")
  @js.native
  def and(conditions: default*): typingsSlinky.ol.andMod.default = js.native
  
  @JSImport("ol/format/filter", "bbox")
  @js.native
  def bbox(geometryName: String, extent: Extent): typingsSlinky.ol.bboxMod.default = js.native
  @JSImport("ol/format/filter", "bbox")
  @js.native
  def bbox(geometryName: String, extent: Extent, opt_srsName: String): typingsSlinky.ol.bboxMod.default = js.native
  
  @JSImport("ol/format/filter", "between")
  @js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typingsSlinky.ol.isBetweenMod.default = js.native
  
  @JSImport("ol/format/filter", "contains")
  @js.native
  def contains(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default): typingsSlinky.ol.containsMod.default = js.native
  @JSImport("ol/format/filter", "contains")
  @js.native
  def contains(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default, opt_srsName: String): typingsSlinky.ol.containsMod.default = js.native
  
  @JSImport("ol/format/filter", "during")
  @js.native
  def during(propertyName: String, begin: String, end: String): typingsSlinky.ol.duringMod.default = js.native
  
  @JSImport("ol/format/filter", "equalTo")
  @js.native
  def equalTo(propertyName: String, expression: String): typingsSlinky.ol.equalToMod.default = js.native
  @JSImport("ol/format/filter", "equalTo")
  @js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsSlinky.ol.equalToMod.default = js.native
  @JSImport("ol/format/filter", "equalTo")
  @js.native
  def equalTo(propertyName: String, expression: Double): typingsSlinky.ol.equalToMod.default = js.native
  @JSImport("ol/format/filter", "equalTo")
  @js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsSlinky.ol.equalToMod.default = js.native
  
  @JSImport("ol/format/filter", "greaterThan")
  @js.native
  def greaterThan(propertyName: String, expression: Double): typingsSlinky.ol.greaterThanMod.default = js.native
  
  @JSImport("ol/format/filter", "greaterThanOrEqualTo")
  @js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.greaterThanOrEqualToMod.default = js.native
  
  @JSImport("ol/format/filter", "intersects")
  @js.native
  def intersects(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default): typingsSlinky.ol.intersectsMod.default = js.native
  @JSImport("ol/format/filter", "intersects")
  @js.native
  def intersects(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default, opt_srsName: String): typingsSlinky.ol.intersectsMod.default = js.native
  
  @JSImport("ol/format/filter", "isNull")
  @js.native
  def isNull(propertyName: String): typingsSlinky.ol.isNullMod.default = js.native
  
  @JSImport("ol/format/filter", "lessThan")
  @js.native
  def lessThan(propertyName: String, expression: Double): typingsSlinky.ol.lessThanMod.default = js.native
  
  @JSImport("ol/format/filter", "lessThanOrEqualTo")
  @js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.lessThanOrEqualToMod.default = js.native
  
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(propertyName: String, pattern: String): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsSlinky.ol.isLikeMod.default = js.native
  @JSImport("ol/format/filter", "like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsSlinky.ol.isLikeMod.default = js.native
  
  @JSImport("ol/format/filter", "not")
  @js.native
  def not(condition: default): typingsSlinky.ol.notMod.default = js.native
  
  @JSImport("ol/format/filter", "notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: String): typingsSlinky.ol.notEqualToMod.default = js.native
  @JSImport("ol/format/filter", "notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsSlinky.ol.notEqualToMod.default = js.native
  @JSImport("ol/format/filter", "notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: Double): typingsSlinky.ol.notEqualToMod.default = js.native
  @JSImport("ol/format/filter", "notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsSlinky.ol.notEqualToMod.default = js.native
  
  @JSImport("ol/format/filter", "or")
  @js.native
  def or(conditions: default*): typingsSlinky.ol.orMod.default = js.native
  
  @JSImport("ol/format/filter", "within")
  @js.native
  def within(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default): typingsSlinky.ol.withinMod.default = js.native
  @JSImport("ol/format/filter", "within")
  @js.native
  def within(geometryName: String, geometry: typingsSlinky.ol.geometryMod.default, opt_srsName: String): typingsSlinky.ol.withinMod.default = js.native
}
