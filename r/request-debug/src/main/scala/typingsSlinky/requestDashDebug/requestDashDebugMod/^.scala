package typingsSlinky.requestDashDebug.requestDashDebugMod

import typingsSlinky.request.requestMod.CoreOptions
import typingsSlinky.request.requestMod.Request
import typingsSlinky.request.requestMod.RequestAPI
import typingsSlinky.request.requestMod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
}

