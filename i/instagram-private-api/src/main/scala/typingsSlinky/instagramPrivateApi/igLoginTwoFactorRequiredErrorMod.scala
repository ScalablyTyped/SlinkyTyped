package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igLoginTwoFactorRequiredErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-login-two-factor-required.error", "IgLoginTwoFactorRequiredError")
  @js.native
  class IgLoginTwoFactorRequiredError protected () extends IgResponseError[AccountRepositoryLoginErrorResponse] {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
}
