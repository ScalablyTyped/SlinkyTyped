package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'complete_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
  */
@js.native
trait ICompleteReply extends IReplyOkContent {
  var cursor_end: Double = js.native
  var cursor_start: Double = js.native
  var matches: js.Array[String] = js.native
  var metadata: JSONObject = js.native
}

object ICompleteReply {
  @scala.inline
  def apply(
    cursor_end: Double,
    cursor_start: Double,
    matches: js.Array[String],
    metadata: JSONObject,
    status: ok
  ): ICompleteReply = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReply]
  }
  @scala.inline
  implicit class ICompleteReplyOps[Self <: ICompleteReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
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

