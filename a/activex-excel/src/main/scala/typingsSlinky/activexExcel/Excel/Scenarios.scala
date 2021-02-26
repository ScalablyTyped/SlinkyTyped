package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenarios extends StObject {
  
  def apply(Index: String): Scenario = js.native
  def apply(Index: Double): Scenario = js.native
  
  def Add(Name: String, ChangingCells: Range): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: js.UndefOr[scala.Nothing],
    Locked: js.UndefOr[scala.Nothing],
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: js.UndefOr[scala.Nothing],
    Locked: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: js.UndefOr[scala.Nothing],
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: js.UndefOr[scala.Nothing], Comment: String): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: String,
    Locked: js.UndefOr[scala.Nothing],
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: String,
    Locked: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: js.UndefOr[scala.Nothing],
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_]): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: js.UndefOr[scala.Nothing],
    Locked: js.UndefOr[scala.Nothing],
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: js.UndefOr[scala.Nothing],
    Locked: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: js.UndefOr[scala.Nothing],
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_], Comment: String): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: String,
    Locked: js.UndefOr[scala.Nothing],
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_], Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  /** @param ReportType [ReportType=1] */
  def CreateSummary(): js.Any = js.native
  def CreateSummary(ReportType: js.UndefOr[scala.Nothing], ResultCells: Range): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType, ResultCells: Range): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Scenario = js.native
  def Item(Index: Double): Scenario = js.native
  
  def Merge(Source: String): js.Any = js.native
  def Merge(Source: Worksheet): js.Any = js.native
  
  val Parent: js.Any = js.native
}
