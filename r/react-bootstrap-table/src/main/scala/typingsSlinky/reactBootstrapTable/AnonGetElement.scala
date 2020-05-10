package typingsSlinky.reactBootstrapTable

import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTable.mod.EditableAttrs
import typingsSlinky.reactBootstrapTable.mod.InsertModalColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetElement extends js.Object {
  def getElement(
    column: InsertModalColumnDescription[_],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): ReactElement | Boolean = js.native
}

object AnonGetElement {
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[_], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
  ): AnonGetElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
    __obj.asInstanceOf[AnonGetElement]
  }
  @scala.inline
  implicit class AnonGetElementOps[Self <: AnonGetElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElement(
      value: (InsertModalColumnDescription[_], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

