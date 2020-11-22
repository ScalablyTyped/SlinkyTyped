package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.igClientErrorMod.IgClientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-parse.error", JSImport.Namespace)
@js.native
object igParseErrorMod extends js.Object {
  
  @js.native
  class IgParseError protected () extends IgClientError {
    def this(body: String) = this()
    
    var body: String = js.native
  }
}
