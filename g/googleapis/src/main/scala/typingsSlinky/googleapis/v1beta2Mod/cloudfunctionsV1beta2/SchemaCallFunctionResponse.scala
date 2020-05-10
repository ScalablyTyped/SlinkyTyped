package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionResponse extends js.Object {
  /**
    * Either system or user-function generated error. Set if execution was not
    * successful.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Execution id of function invocation.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Result populated for successful execution of synchronous function. Will
    * not be populated if function does not return a result through context.
    */
  var result: js.UndefOr[String] = js.native
}

object SchemaCallFunctionResponse {
  @scala.inline
  def apply(): SchemaCallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionResponse]
  }
  @scala.inline
  implicit class SchemaCallFunctionResponseOps[Self <: SchemaCallFunctionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

