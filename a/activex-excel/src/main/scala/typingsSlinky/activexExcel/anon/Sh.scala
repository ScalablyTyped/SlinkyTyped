package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Chart
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sh extends js.Object {
  val Sh: Chart | Worksheet
}

object Sh {
  @scala.inline
  def apply(Sh: Chart | Worksheet): Sh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sh]
  }
}

