package typingsSlinky.awsSdkCoreHandler

import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.HttpOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](httpHandler: HttpHandler[Stream, HttpOptions], responseParser: ResponseParser[Stream]): Terminalware[OutputConstraint, Stream] = js.native
}
