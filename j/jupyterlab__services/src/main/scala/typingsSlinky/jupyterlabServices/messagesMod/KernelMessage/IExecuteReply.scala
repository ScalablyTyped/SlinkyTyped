package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `'execute_reply'` contents for an `'ok'` status.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
  */
@js.native
trait IExecuteReply
  extends IExecuteCount
     with IReplyOkContent {
  /**
    * A list of payload objects.
    * Payloads are considered deprecated.
    * The only requirement of each payload object is that it have a 'source'
    * key, which is a string classifying the payload (e.g. 'page').
    */
  var payload: js.UndefOr[js.Array[JSONObject]] = js.native
  /**
    * Results for the user_expressions.
    */
  var user_expressions: JSONObject = js.native
}

object IExecuteReply {
  @scala.inline
  def apply(status: ok, user_expressions: JSONObject): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_expressions = user_expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
  @scala.inline
  implicit class IExecuteReplyOps[Self <: IExecuteReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser_expressions(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: js.Array[JSONObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

