package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationsScopedList extends js.Object {
  /**
    * [Output Only] A list of operations contained in this scope.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of operations
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaOperationsScopedList {
  @scala.inline
  def apply(): SchemaOperationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationsScopedList]
  }
  @scala.inline
  implicit class SchemaOperationsScopedListOps[Self <: SchemaOperationsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperations(value: js.Array[SchemaOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

