package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igInactiveUserErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-inactive-user.error", "IgInactiveUserError")
  @js.native
  class IgInactiveUserError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[_]) = this()
  }
}
