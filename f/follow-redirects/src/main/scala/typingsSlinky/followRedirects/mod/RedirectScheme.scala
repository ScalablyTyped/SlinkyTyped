package typingsSlinky.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectScheme[Options, Request /* <: WrappableRequest */, Response] extends js.Object {
  
  def get(options: Options with FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
  def get(
    options: Options with FollowOptions[Options],
    callback: js.Function1[/* res */ Response with FollowResponse, Unit]
  ): RedirectableRequest[Request, Response] = js.native
  def get(options: String): RedirectableRequest[Request, Response] = js.native
  def get(options: String, callback: js.Function1[/* res */ Response with FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
  
  def request(options: Options with FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
  def request(
    options: Options with FollowOptions[Options],
    callback: js.Function1[/* res */ Response with FollowResponse, Unit]
  ): RedirectableRequest[Request, Response] = js.native
  def request(options: String): RedirectableRequest[Request, Response] = js.native
  def request(options: String, callback: js.Function1[/* res */ Response with FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
}
