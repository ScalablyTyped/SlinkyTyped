package typingsSlinky.requestDebug.mod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.requestDebug.requestDebugStrings.auth
import typingsSlinky.requestDebug.requestDebugStrings.redirect
import typingsSlinky.requestDebug.requestDebugStrings.request
import typingsSlinky.requestDebug.requestDebugStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends js.Object {
  
  def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: redirect, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
}
