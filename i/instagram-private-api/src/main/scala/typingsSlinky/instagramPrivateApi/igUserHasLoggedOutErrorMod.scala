package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-user-has-logged-out.error", JSImport.Namespace)
@js.native
object igUserHasLoggedOutErrorMod extends js.Object {
  @js.native
  class IgUserHasLoggedOutError () extends IgResponseError[LoginRequiredResponse]
  
}

