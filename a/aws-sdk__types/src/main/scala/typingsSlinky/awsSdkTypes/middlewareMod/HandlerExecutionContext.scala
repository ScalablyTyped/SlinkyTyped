package typingsSlinky.awsSdkTypes.middlewareMod

import typingsSlinky.awsSdkTypes.loggerMod.Logger
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerExecutionContext extends js.Object {
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: Logger = js.native
  /**
    * The serialization model for the input, output, and possible errors for
    * the operation executed by invoking the composed handler.
    */
  var model: OperationModel = js.native
}

object HandlerExecutionContext {
  @scala.inline
  def apply(logger: Logger, model: OperationModel): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerExecutionContext]
  }
  @scala.inline
  implicit class HandlerExecutionContextOps[Self <: HandlerExecutionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: OperationModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

