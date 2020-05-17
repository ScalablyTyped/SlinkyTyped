package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Allowstdin
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `execute_request` message on the `'shell'` channel.
  */
@js.native
trait IExecuteRequestMsg
  extends IShellMessage[execute_request]
     with Message {
  @JSName("content")
  var content_IExecuteRequestMsg: Allowstdin = js.native
}

object IExecuteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequestMsg]
  }
  @scala.inline
  implicit class IExecuteRequestMsgOps[Self <: IExecuteRequestMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Allowstdin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

