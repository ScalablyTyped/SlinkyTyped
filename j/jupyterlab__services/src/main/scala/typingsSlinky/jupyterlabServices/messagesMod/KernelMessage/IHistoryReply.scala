package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'history_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryRequest]], [[IKernel.history]]
  */
@js.native
trait IHistoryReply extends IReplyOkContent {
  var history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]] = js.native
}

object IHistoryReply {
  @scala.inline
  def apply(history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]], status: ok): IHistoryReply = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReply]
  }
  @scala.inline
  implicit class IHistoryReplyOps[Self <: IHistoryReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistory(value: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

