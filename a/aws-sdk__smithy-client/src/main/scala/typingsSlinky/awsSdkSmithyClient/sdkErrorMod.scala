package typingsSlinky.awsSdkSmithyClient

import typingsSlinky.awsSdkSmithyClient.exceptionMod.SmithyException
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client/dist/cjs/sdk-error", JSImport.Namespace)
@js.native
object sdkErrorMod extends js.Object {
  
  type SdkError = js.Error with SmithyException with MetadataBearer
}
