package typingsSlinky.reactBootstrapTable

import typingsSlinky.reactBootstrapTable.mod.EditCheckboxOptionValue
import typingsSlinky.reactBootstrapTable.mod.EditSelectOptionValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues[TRow /* <: js.Object */] extends js.Object {
  var values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
}

object AnonValues {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
  ): AnonValues[TRow] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues[TRow]]
  }
}

