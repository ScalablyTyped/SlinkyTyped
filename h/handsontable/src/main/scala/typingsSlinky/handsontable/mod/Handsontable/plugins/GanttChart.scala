package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod.Handsontable.CellProperties
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttChart extends Base {
  
  def addRangeBar(row: Double, startDate: String, endDate: String, additionalData: js.Object): Boolean | js.Array[_] = js.native
  def addRangeBar(row: Double, startDate: String, endDate: js.Date, additionalData: js.Object): Boolean | js.Array[_] = js.native
  def addRangeBar(row: Double, startDate: js.Date, endDate: String, additionalData: js.Object): Boolean | js.Array[_] = js.native
  def addRangeBar(row: Double, startDate: js.Date, endDate: js.Date, additionalData: js.Object): Boolean | js.Array[_] = js.native
  
  def applyRangeBarMetaCache(): Unit = js.native
  
  def cacheRangeBarMeta(row: Double, col: Double, key: String, value: js.Any): Unit = js.native
  def cacheRangeBarMeta(row: Double, col: Double, key: String, value: js.Array[_]): Unit = js.native
  
  def checkDependencies(): Unit = js.native
  
  var colorData: js.Object = js.native
  
  var currentYear: Double | Unit = js.native
  
  var dataFeed: js.Object | Unit = js.native
  
  var dateCalculator: js.Object | Unit = js.native
  
  def getRangeBarCoordinates(row: Double): js.Object = js.native
  
  def getRangeBarData(row: Double, column: Double): js.Object | Boolean = js.native
  
  var hotSource: Core | Unit = js.native
  
  var initialSettings: js.Object | Unit = js.native
  
  var monthHeadersArray: js.Array[_] = js.native
  
  var monthList: js.Array[_] = js.native
  
  var nestedHeadersPlugin: NestedHeaders | Unit = js.native
  
  var overallWeekSectionCount: Double | Unit = js.native
  
  var rangeBarMeta: js.Object | Unit = js.native
  
  var rangeBars: js.Object = js.native
  
  var rangeList: js.Object = js.native
  
  def removeAllRangeBars(): Unit = js.native
  
  def removeRangeBarByColumn(row: Double, startDateColumn: Double): Unit = js.native
  
  def removeRangeBarByDate(row: Double, startDate: String): Unit = js.native
  def removeRangeBarByDate(row: Double, startDate: js.Date): Unit = js.native
  
  def renderRangeBar(row: Double, startDateColumn: Double, endDateColumn: Double, additionalData: js.Object): Unit = js.native
  
  def setRangeBarColors(rows: js.Object): Unit = js.native
  
  def setYear(year: Double): Unit = js.native
  
  var settings: js.Object = js.native
  
  def uniformBackgroundRenderer(
    instance: Core,
    TD: HTMLElement,
    row: Double,
    col: Double,
    prop: String,
    value: String,
    cellProperties: CellProperties
  ): Unit = js.native
  def uniformBackgroundRenderer(
    instance: Core,
    TD: HTMLElement,
    row: Double,
    col: Double,
    prop: String,
    value: Double,
    cellProperties: CellProperties
  ): Unit = js.native
  def uniformBackgroundRenderer(
    instance: Core,
    TD: HTMLElement,
    row: Double,
    col: Double,
    prop: Double,
    value: String,
    cellProperties: CellProperties
  ): Unit = js.native
  def uniformBackgroundRenderer(
    instance: Core,
    TD: HTMLElement,
    row: Double,
    col: Double,
    prop: Double,
    value: Double,
    cellProperties: CellProperties
  ): Unit = js.native
  
  def unrenderRangeBar(row: Double, startDateColumn: Double, endDateColumn: Double): Unit = js.native
  
  def updateRangeBarData(row: Double, column: Double, data: js.Object): Unit = js.native
  
  var weekHeadersArray: js.Array[_] = js.native
}
