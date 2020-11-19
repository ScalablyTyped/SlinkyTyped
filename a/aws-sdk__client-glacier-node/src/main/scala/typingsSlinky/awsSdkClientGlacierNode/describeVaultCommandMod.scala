package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/DescribeVaultCommand", JSImport.Namespace)
@js.native
object describeVaultCommandMod extends js.Object {
  
  @js.native
  class DescribeVaultCommand protected () extends Command[
          InputTypesUnion, 
          DescribeVaultInput, 
          OutputTypesUnion, 
          DescribeVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeVaultInput) = this()
    
    val middlewareStack: MiddlewareStack[DescribeVaultInput, DescribeVaultOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
  }
}
