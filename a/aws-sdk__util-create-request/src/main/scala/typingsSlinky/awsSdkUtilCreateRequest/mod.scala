package typingsSlinky.awsSdkUtilCreateRequest

import typingsSlinky.awsSdkSmithyClient.mod.Client
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-create-request", "createRequest")
  @js.native
  def createRequest[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer]
  ): js.Promise[HttpRequest] = js.native
}
