package typingsSlinky.reactBootstrapTable.anon

import typingsSlinky.reactBootstrapTable.mod.EditCheckboxOptionValue
import typingsSlinky.reactBootstrapTable.mod.EditSelectOptionValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values[TRow /* <: js.Object */] extends js.Object {
  var values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
}

object Values {
  @scala.inline
  def apply[TRow](
    values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
  ): Values[TRow] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[TRow]]
  }
}

