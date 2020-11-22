package typingsSlinky.itMultipart.anon

import typingsSlinky.itMultipart.mod.IncomingHttpHeaders
import typingsSlinky.node.Buffer
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var body: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]]) = js.native
  
  var headers: IncomingHttpHeaders = js.native
}
object Body {
  
  @scala.inline
  def apply(
    body: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]]),
    headers: IncomingHttpHeaders
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setBody(value: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]])): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
}
