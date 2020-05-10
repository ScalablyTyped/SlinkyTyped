package typingsSlinky.ddTrace

import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[ClientRequest], 
      /* res */ js.UndefOr[IncomingMessage], 
      _
    ]
  ] = js.native
}

object Anon0 {
  @scala.inline
  def apply(): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(
      value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => _
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

