package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igUserHasLoggedOutErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-user-has-logged-out.error", "IgUserHasLoggedOutError")
  @js.native
  class IgUserHasLoggedOutError protected () extends IgResponseError[LoginRequiredResponse] {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
}
