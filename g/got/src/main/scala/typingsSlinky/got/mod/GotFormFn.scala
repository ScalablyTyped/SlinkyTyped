package typingsSlinky.got.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFormFn[T /* <: String | Null */] extends js.Object {
  
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: Partial[GotFormOptions[T]]): GotPromise[String | Buffer] = js.native
}
