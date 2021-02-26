package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.spamResponseMod.SpamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igActionSpamErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-action-spam.error", "IgActionSpamError")
  @js.native
  class IgActionSpamError protected () extends IgResponseError[SpamResponse] {
    def this(response: IgResponse[SpamResponse]) = this()
    
    def expirationDate: String | Null = js.native
  }
}
