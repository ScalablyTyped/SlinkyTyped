package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'inspect_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
  *
  * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
  */
@js.native
trait IInspectReply extends IReplyOkContent {
  var data: JSONObject = js.native
  var found: Boolean = js.native
  var metadata: JSONObject = js.native
}

object IInspectReply {
  @scala.inline
  def apply(data: JSONObject, found: Boolean, metadata: JSONObject, status: ok): IInspectReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReply]
  }
  @scala.inline
  implicit class IInspectReplyOps[Self <: IInspectReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

