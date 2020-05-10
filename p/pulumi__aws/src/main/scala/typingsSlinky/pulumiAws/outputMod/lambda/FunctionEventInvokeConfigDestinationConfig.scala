package typingsSlinky.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigDestinationConfig extends js.Object {
  /**
    * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
    */
  var onFailure: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnFailure] = js.native
  /**
    * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
    */
  var onSuccess: js.UndefOr[FunctionEventInvokeConfigDestinationConfigOnSuccess] = js.native
}

object FunctionEventInvokeConfigDestinationConfig {
  @scala.inline
  def apply(): FunctionEventInvokeConfigDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
  }
  @scala.inline
  implicit class FunctionEventInvokeConfigDestinationConfigOps[Self <: FunctionEventInvokeConfigDestinationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFailure(value: FunctionEventInvokeConfigDestinationConfigOnFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: FunctionEventInvokeConfigDestinationConfigOnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
  }
  
}

