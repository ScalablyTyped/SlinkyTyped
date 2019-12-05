package typingsSlinky.handsontable

import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.ColumnSummary
import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.Endpoint
import typingsSlinky.handsontable.handsontableStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var `type`: custom
  def customFunction(`this`: ColumnSummary, endpoint: Endpoint): Double
}

object Anon_Custom {
  @scala.inline
  def apply(customFunction: (ColumnSummary, Endpoint) => Double, `type`: custom): Anon_Custom = {
    val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction2(customFunction))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Custom]
  }
}

