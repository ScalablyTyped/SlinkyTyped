package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igPrivateUserErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-private-user.error", "IgPrivateUserError")
  @js.native
  class IgPrivateUserError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[_]) = this()
  }
}
