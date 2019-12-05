package typingsSlinky.autocannon.autocannonMod

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
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[String | Buffer] = js.undefined
  var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    body: String | Buffer = null,
    headers: IncomingHttpHeaders = null,
    method: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE = null,
    path: String = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

