package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonArguments
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_request'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this function is *NOT* considered
  * part of the public API, and may change without notice.
  */
@js.native
trait IDebugRequestMsg
  extends IControlMessage[debug_request]
     with _Message {
  @JSName("content")
  var content_IDebugRequestMsg: AnonArguments = js.native
}

object IDebugRequestMsg {
  @scala.inline
  def apply(
    channel: control,
    content: AnonArguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
  @scala.inline
  implicit class IDebugRequestMsgOps[Self <: IDebugRequestMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

