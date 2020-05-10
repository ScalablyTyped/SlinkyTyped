package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance operation errors list wrapper.
  */
@js.native
trait SchemaOperationErrors extends js.Object {
  /**
    * The list of errors encountered while processing this operation.
    */
  var errors: js.UndefOr[js.Array[SchemaOperationError]] = js.native
  /**
    * This is always sql#operationErrors.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOperationErrors {
  @scala.inline
  def apply(): SchemaOperationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationErrors]
  }
  @scala.inline
  implicit class SchemaOperationErrorsOps[Self <: SchemaOperationErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[SchemaOperationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

