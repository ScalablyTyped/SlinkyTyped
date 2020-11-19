package typingsSlinky.minimalRequestPromise.mod

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minimal-request-promise", "post")
@js.native
object post extends js.Object {
  
  def apply(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
}
