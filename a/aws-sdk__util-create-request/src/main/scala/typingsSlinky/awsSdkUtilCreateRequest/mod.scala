package typingsSlinky.awsSdkUtilCreateRequest

import typingsSlinky.awsSdkSmithyClient.mod.Client
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/util-create-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createRequest[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer]
  ): js.Promise[HttpRequest] = js.native
}
