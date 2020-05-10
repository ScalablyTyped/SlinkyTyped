package typingsSlinky.reactBootstrapTable

import typingsSlinky.reactBootstrapTable.mod.EditCheckboxOptionValue
import typingsSlinky.reactBootstrapTable.mod.EditSelectOptionValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValues[TRow /* <: js.Object */] extends js.Object {
  var values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue]) = js.native
}

object AnonValues {
  @scala.inline
  def apply[TRow](
    values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
  ): AnonValues[TRow] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValues[TRow]]
  }
  @scala.inline
  implicit class AnonValuesOps[Self[trow] <: AnonValues[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withValuesFunction1(value: /* row */ TRow => EditCheckboxOptionValue | EditSelectOptionValue): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(
      value: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

