package typingsSlinky.awsSdkSmithyClient

import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client/dist/cjs/command", JSImport.Namespace)
@js.native
object commandMod extends js.Object {
  
  @js.native
  abstract class Command[Input /* <: ClientInput */, Output /* <: ClientOutput */, ResolvedClientConfiguration, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */] ()
    extends typingsSlinky.awsSdkTypes.commandMod.Command[ClientInput, Input, ClientOutput, Output, ResolvedClientConfiguration]
}
