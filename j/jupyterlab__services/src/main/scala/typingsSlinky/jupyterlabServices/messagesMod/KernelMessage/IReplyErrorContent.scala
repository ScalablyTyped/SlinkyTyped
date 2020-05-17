package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply content indicating an error.
  *
  * See the [Message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply) for details.
  */
@js.native
trait IReplyErrorContent
  extends ReplyContent[js.Any] {
  /**
    * Exception name
    */
  var ename: String = js.native
  /**
    * Exception value
    */
  var evalue: String = js.native
  var status: error = js.native
  /**
    * Traceback
    */
  var traceback: js.Array[String] = js.native
}

object IReplyErrorContent {
  @scala.inline
  def apply(ename: String, evalue: String, status: error, traceback: js.Array[String]): IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyErrorContent]
  }
  @scala.inline
  implicit class IReplyErrorContentOps[Self <: IReplyErrorContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceback(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

