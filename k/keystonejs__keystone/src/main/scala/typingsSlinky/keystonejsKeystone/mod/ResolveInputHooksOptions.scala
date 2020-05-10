package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsKeystone.AnonQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveInputHooksOptions[Record /* <: js.Object */] extends js.Object {
  var context: js.Any = js.native
   // todo: check
  var existingItem: Record = js.native
   // not clear in the documentation
  var list: AnonQuery[Record] = js.native
  var originalInput: js.Any = js.native
  var resolvedData: js.Any = js.native
  var updatedItem: Record = js.native
   // TODO: use apollo context
  def addFieldValidationError(error: String): js.Any = js.native
}

object ResolveInputHooksOptions {
  @scala.inline
  def apply[Record](
    addFieldValidationError: String => js.Any,
    context: js.Any,
    existingItem: Record,
    list: AnonQuery[Record],
    originalInput: js.Any,
    resolvedData: js.Any,
    updatedItem: Record
  ): ResolveInputHooksOptions[Record] = {
    val __obj = js.Dynamic.literal(addFieldValidationError = js.Any.fromFunction1(addFieldValidationError), context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveInputHooksOptions[Record]]
  }
  @scala.inline
  implicit class ResolveInputHooksOptionsOps[Self[record] <: ResolveInputHooksOptions[record], Record] (val x: Self[Record]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Record] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Record]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Record] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Record] with Other]
    @scala.inline
    def withAddFieldValidationError(value: String => js.Any): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFieldValidationError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingItem(value: Record): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonQuery[Record]): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalInput(value: js.Any): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedData(value: js.Any): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedItem(value: Record): Self[Record] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

