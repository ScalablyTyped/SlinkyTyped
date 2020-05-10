package typingsSlinky.ddTrace

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequest extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[IncomingMessage], 
      /* res */ js.UndefOr[ServerResponse], 
      _
    ]
  ] = js.native
}

object AnonRequest {
  @scala.inline
  def apply(): AnonRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRequest]
  }
  @scala.inline
  implicit class AnonRequestOps[Self <: AnonRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(
      value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage], /* res */ js.UndefOr[ServerResponse]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

