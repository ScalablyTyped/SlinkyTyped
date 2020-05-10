package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a service-defined function call that was invoked during test
  * execution.
  */
@js.native
trait SchemaFunctionCall extends js.Object {
  /**
    * The arguments that were provided to the function.
    */
  var args: js.UndefOr[js.Array[_]] = js.native
  /**
    * Name of the function invoked.
    */
  var function: js.UndefOr[String] = js.native
}

object SchemaFunctionCall {
  @scala.inline
  def apply(): SchemaFunctionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionCall]
  }
  @scala.inline
  implicit class SchemaFunctionCallOps[Self <: SchemaFunctionCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
  }
  
}

