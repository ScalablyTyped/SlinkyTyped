package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igNotFoundErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-not-found.error", "IgNotFoundError")
  @js.native
  class IgNotFoundError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[_]) = this()
  }
}
