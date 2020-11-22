package typingsSlinky.awsSdkS3RequestPresigner

import typingsSlinky.awsSdkSmithyClient.mod.Client
import typingsSlinky.awsSdkSmithyClient.mod.Command
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.signatureMod.RequestPresigningArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/s3-request-presigner/dist/cjs/getSignedUrl", JSImport.Namespace)
@js.native
object getSignedUrlMod extends js.Object {
  
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = js.native
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = js.native
}
