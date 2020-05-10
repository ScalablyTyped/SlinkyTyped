package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.Next
import typingsSlinky.restify.mod.Request
import typingsSlinky.restify.mod.RequestHandler
import typingsSlinky.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerCandidate extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.native
  var handler: RequestHandler | js.Array[RequestHandler] = js.native
  var version: js.UndefOr[String | js.Array[String]] = js.native
}

object HandlerCandidate {
  @scala.inline
  def apply(handler: RequestHandler | js.Array[RequestHandler]): HandlerCandidate = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerCandidate]
  }
  @scala.inline
  implicit class HandlerCandidateOps[Self <: HandlerCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerFunction3(value: (/* req */ Request, /* res */ Response, /* next */ Next) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandler(value: RequestHandler | js.Array[RequestHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

