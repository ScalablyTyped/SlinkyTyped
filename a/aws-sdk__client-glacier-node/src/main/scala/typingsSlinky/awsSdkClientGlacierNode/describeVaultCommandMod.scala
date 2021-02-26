package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DescribeVaultCommand", "DescribeVaultCommand")
  @js.native
  class DescribeVaultCommand protected () extends Command[
          InputTypesUnion, 
          DescribeVaultInput, 
          OutputTypesUnion, 
          DescribeVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DescribeVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
  }
}
