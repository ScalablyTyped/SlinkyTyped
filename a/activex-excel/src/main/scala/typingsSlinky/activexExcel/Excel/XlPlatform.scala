package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelNumbers.`1`
import typingsSlinky.activexExcel.activexExcelNumbers.`2`
import typingsSlinky.activexExcel.activexExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexExcel.activexExcelNumbers.`1`
  - typingsSlinky.activexExcel.activexExcelNumbers.`3`
  - typingsSlinky.activexExcel.activexExcelNumbers.`2`
*/
trait XlPlatform extends js.Object

object XlPlatform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlMSDOS: `3` = this.cast(3)
  @scala.inline
  def xlMacintosh: `1` = this.cast(1)
  @scala.inline
  def xlWindows: `2` = this.cast(2)
}

