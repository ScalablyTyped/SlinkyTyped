package typingsSlinky.requestDashDebug.requestDashDebugMod

import typingsSlinky.request.requestMod.CoreOptions
import typingsSlinky.request.requestMod.Request
import typingsSlinky.request.requestMod.RequestAPI
import typingsSlinky.request.requestMod.RequiredUriUrl
import typingsSlinky.requestDashDebug.requestDashDebugStrings.auth
import typingsSlinky.requestDashDebug.requestDashDebugStrings.redirect
import typingsSlinky.requestDashDebug.requestDashDebugStrings.request
import typingsSlinky.requestDashDebug.requestDashDebugStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends js.Object {
  def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: redirect, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
}

