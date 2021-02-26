package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelNumbers.`2`
import typingsSlinky.activexExcel.activexExcelNumbers.`3`
import typingsSlinky.activexExcel.activexExcelNumbers.`4`
import typingsSlinky.activexExcel.activexExcelNumbers.`5`
import typingsSlinky.activexExcel.activexExcelNumbers.`6`
import typingsSlinky.activexExcel.activexExcelNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishObjects extends StObject {
  
  def apply(Index: String): PublishObject = js.native
  def apply(Index: Double): PublishObject = js.native
  
  def Add(
    SourceType: XlSourceType,
    Filename: String,
    Sheet: js.UndefOr[String],
    Source: js.UndefOr[`3` | `5` | `6` | `2` | `7` | `4`],
    HtmlType: js.UndefOr[XlHtmlType],
    DivID: js.UndefOr[String],
    Title: js.UndefOr[String]
  ): PublishObject = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): PublishObject = js.native
  def Item(Index: Double): PublishObject = js.native
  
  val Parent: js.Any = js.native
  
  def Publish(): Unit = js.native
  
  def _Default(Index: js.Any): PublishObject = js.native
}
