package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a `'history_request'` tail message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReply]], [[[IKernel.history]]]
  */
@js.native
trait IHistoryRequestTail extends js.Object {
  var hist_access_type: tail = js.native
  var n: Double = js.native
  var output: Boolean = js.native
  var raw: Boolean = js.native
}

object IHistoryRequestTail {
  @scala.inline
  def apply(hist_access_type: tail, n: Double, output: Boolean, raw: Boolean): IHistoryRequestTail = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestTail]
  }
  @scala.inline
  implicit class IHistoryRequestTailOps[Self <: IHistoryRequestTail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHist_access_type(value: tail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hist_access_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

