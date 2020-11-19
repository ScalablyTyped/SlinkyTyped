package typingsSlinky.phin.mod

import typingsSlinky.phin.anon.IWithDataIJSONResponseOpt
import typingsSlinky.phin.anon.IWithDataIOptions
import typingsSlinky.phin.anon.IWithDataIStreamResponseO
import typingsSlinky.phin.anon.IWithFormIJSONResponseOpt
import typingsSlinky.phin.anon.IWithFormIOptions
import typingsSlinky.phin.anon.IWithFormIStreamResponseO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: String): js.Promise[IResponse] = js.native
  def apply(options: IWithDataIOptions): js.Promise[IResponse] = js.native
  def apply(options: IWithDataIStreamResponseO): js.Promise[IStreamResponse] = js.native
  def apply(options: IWithFormIOptions): js.Promise[IResponse] = js.native
  def apply(options: IWithFormIStreamResponseO): js.Promise[IStreamResponse] = js.native
  def apply(options: IOptions): js.Promise[IResponse] = js.native
  def apply(options: IStreamResponseOptions): js.Promise[IStreamResponse] = js.native
  def apply[T](options: IWithDataIJSONResponseOpt): js.Promise[IJSONResponse[T]] = js.native
  def apply[T](options: IWithFormIJSONResponseOpt): js.Promise[IJSONResponse[T]] = js.native
  def apply[T](options: IJSONResponseOptions): js.Promise[IJSONResponse[T]] = js.native
  
  var promisified: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ js.Any = js.native
}
