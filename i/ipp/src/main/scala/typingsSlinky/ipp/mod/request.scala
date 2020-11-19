package typingsSlinky.ipp.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipp", "request")
@js.native
object request extends js.Object {
  
  def apply(
    opts: String,
    buffer: Buffer,
    cb: js.Function2[/* error */ js.Error | Null, /* response */ ParsedBuffer, Unit]
  ): Unit = js.native
  def apply(
    opts: UrlWithStringQuery,
    buffer: Buffer,
    cb: js.Function2[/* error */ js.Error | Null, /* response */ ParsedBuffer, Unit]
  ): Unit = js.native
}
