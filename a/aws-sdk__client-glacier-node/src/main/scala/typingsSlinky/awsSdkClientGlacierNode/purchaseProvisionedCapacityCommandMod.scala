package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/PurchaseProvisionedCapacityCommand", JSImport.Namespace)
@js.native
object purchaseProvisionedCapacityCommandMod extends js.Object {
  
  @js.native
  class PurchaseProvisionedCapacityCommand protected () extends Command[
          InputTypesUnion, 
          PurchaseProvisionedCapacityInput, 
          OutputTypesUnion, 
          PurchaseProvisionedCapacityOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: PurchaseProvisionedCapacityInput) = this()
    
    val middlewareStack: MiddlewareStack[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[PurchaseProvisionedCapacityInput, PurchaseProvisionedCapacityOutput] = js.native
  }
}
