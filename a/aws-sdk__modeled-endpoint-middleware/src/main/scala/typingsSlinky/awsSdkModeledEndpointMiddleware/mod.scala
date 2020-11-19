package typingsSlinky.awsSdkModeledEndpointMiddleware

import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/modeled-endpoint-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def modeledEndpointMiddleware[InputType /* <: js.Object */](urlParser: UrlParser, inputKey: /* keyof InputType */ String): BuildMiddleware[InputType, _, _] = js.native
}
