package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-login-required.error", JSImport.Namespace)
@js.native
object igLoginRequiredErrorMod extends js.Object {
  
  @js.native
  class IgLoginRequiredError () extends IgResponseError[LoginRequiredResponse]
}
