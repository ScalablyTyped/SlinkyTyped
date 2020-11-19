package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobOutputMod.DescribeJobOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/DescribeJobCommand", JSImport.Namespace)
@js.native
object describeJobCommandMod extends js.Object {
  
  @js.native
  class DescribeJobCommand protected () extends Command[
          InputTypesUnion, 
          DescribeJobInput, 
          OutputTypesUnion, 
          DescribeJobOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeJobInput) = this()
    
    val middlewareStack: MiddlewareStack[DescribeJobInput, DescribeJobOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
  }
}
