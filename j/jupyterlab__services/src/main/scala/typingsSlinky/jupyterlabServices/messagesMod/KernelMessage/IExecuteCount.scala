package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of an `execute-reply` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
  */
trait IExecuteCount extends js.Object {
  var execution_count: ExecutionCount
}

object IExecuteCount {
  @scala.inline
  def apply(execution_count: ExecutionCount = null.asInstanceOf[ExecutionCount]): IExecuteCount = {
    val __obj = js.Dynamic.literal(execution_count = execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCount]
  }
}

