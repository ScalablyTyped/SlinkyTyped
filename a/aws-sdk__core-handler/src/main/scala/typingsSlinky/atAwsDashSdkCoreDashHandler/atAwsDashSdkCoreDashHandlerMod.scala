package typingsSlinky.atAwsDashSdkCoreDashHandler

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpOptions
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Terminalware
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object atAwsDashSdkCoreDashHandlerMod extends js.Object {
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](httpHandler: HttpHandler[Stream, HttpOptions], responseParser: ResponseParser[Stream]): Terminalware[OutputConstraint, Stream] = js.native
}

