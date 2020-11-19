package typingsSlinky.autocannon.mod

import typingsSlinky.autocannon.autocannonStrings.ACL
import typingsSlinky.autocannon.autocannonStrings.BIND
import typingsSlinky.autocannon.autocannonStrings.CHECKOUT
import typingsSlinky.autocannon.autocannonStrings.CONNECT
import typingsSlinky.autocannon.autocannonStrings.COPY
import typingsSlinky.autocannon.autocannonStrings.DELETE
import typingsSlinky.autocannon.autocannonStrings.GET
import typingsSlinky.autocannon.autocannonStrings.HEAD
import typingsSlinky.autocannon.autocannonStrings.LINK
import typingsSlinky.autocannon.autocannonStrings.LOCK
import typingsSlinky.autocannon.autocannonStrings.MERGE
import typingsSlinky.autocannon.autocannonStrings.MKACTIVITY
import typingsSlinky.autocannon.autocannonStrings.MKCALENDAR
import typingsSlinky.autocannon.autocannonStrings.MKCOL
import typingsSlinky.autocannon.autocannonStrings.MOVE
import typingsSlinky.autocannon.autocannonStrings.NOTIFY
import typingsSlinky.autocannon.autocannonStrings.OPTIONS
import typingsSlinky.autocannon.autocannonStrings.PATCH
import typingsSlinky.autocannon.autocannonStrings.POST
import typingsSlinky.autocannon.autocannonStrings.PROPFIND
import typingsSlinky.autocannon.autocannonStrings.PROPPATCH
import typingsSlinky.autocannon.autocannonStrings.PURGE
import typingsSlinky.autocannon.autocannonStrings.PUT
import typingsSlinky.autocannon.autocannonStrings.REBIND
import typingsSlinky.autocannon.autocannonStrings.REPORT
import typingsSlinky.autocannon.autocannonStrings.SEARCH
import typingsSlinky.autocannon.autocannonStrings.SOURCE
import typingsSlinky.autocannon.autocannonStrings.SUBSCRIBE
import typingsSlinky.autocannon.autocannonStrings.TRACE
import typingsSlinky.autocannon.autocannonStrings.UNBIND
import typingsSlinky.autocannon.autocannonStrings.UNLINK
import typingsSlinky.autocannon.autocannonStrings.UNLOCK
import typingsSlinky.autocannon.autocannonStrings.UNSUBSCRIBE
import typingsSlinky.autocannon.autocannonStrings.`M-SEARCH`
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  var body: js.UndefOr[String | Buffer] = js.native
  
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object Request {
  
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(
      value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
