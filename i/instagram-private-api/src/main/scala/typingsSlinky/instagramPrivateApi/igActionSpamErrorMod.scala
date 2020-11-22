package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.spamResponseMod.SpamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-action-spam.error", JSImport.Namespace)
@js.native
object igActionSpamErrorMod extends js.Object {
  
  @js.native
  class IgActionSpamError () extends IgResponseError[SpamResponse] {
    
    def expirationDate: String | Null = js.native
  }
}
