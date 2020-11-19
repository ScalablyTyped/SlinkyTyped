package typingsSlinky.ddTrace.anon

import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[IncomingMessage | ClientRequest], 
      /* res */ js.UndefOr[ServerResponse | IncomingMessage], 
      _
    ]
  ] = js.native
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(
      value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage | ClientRequest], /* res */ js.UndefOr[ServerResponse | IncomingMessage]) => _
    ): Self = this.set("request", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
