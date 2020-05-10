package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonTransient
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_result'` message on the `'iopub'` channel.
  *
  * See [Execution results](https://jupyter-client.readthedocs.io/en/latest/messaging.html#id4).
  */
@js.native
trait IExecuteResultMsg
  extends IIOPubMessage[execute_result]
     with _Message {
  @JSName("content")
  var content_IExecuteResultMsg: AnonTransient = js.native
}

object IExecuteResultMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonTransient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResultMsg]
  }
  @scala.inline
  implicit class IExecuteResultMsgOps[Self <: IExecuteResultMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonTransient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

