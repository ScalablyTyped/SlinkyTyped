package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelNumbers.`0`
import typingsSlinky.activexExcel.activexExcelNumbers.`1`
import typingsSlinky.activexExcel.activexExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexExcel.activexExcelNumbers.`1`
  - typingsSlinky.activexExcel.activexExcelNumbers.`0`
  - typingsSlinky.activexExcel.activexExcelNumbers.`2`
*/
trait XlCalculationState extends js.Object

object XlCalculationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlCalculating: `1` = this.cast(1)
  @scala.inline
  def xlDone: `0` = this.cast(0)
  @scala.inline
  def xlPending: `2` = this.cast(2)
}

