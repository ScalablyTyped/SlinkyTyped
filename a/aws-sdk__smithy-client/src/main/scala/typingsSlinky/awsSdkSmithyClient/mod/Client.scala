package typingsSlinky.awsSdkSmithyClient.mod

import typingsSlinky.awsSdkSmithyClient.clientMod.SmithyResolvedConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client", "Client")
@js.native
class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
  extends typingsSlinky.awsSdkSmithyClient.clientMod.Client[HandlerOptions, ClientInput, ClientOutput, ResolvedClientConfiguration] {
  def this(config: ResolvedClientConfiguration) = this()
}
