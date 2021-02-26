package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igLoginRequiredErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-login-required.error", "IgLoginRequiredError")
  @js.native
  class IgLoginRequiredError protected () extends IgResponseError[LoginRequiredResponse] {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
}
