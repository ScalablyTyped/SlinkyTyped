package typingsSlinky.requestDebug.mod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("request-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
}
