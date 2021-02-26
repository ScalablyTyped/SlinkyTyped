package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyOutputMod.DescribeKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DescribeKeyCommand", "DescribeKeyCommand")
  @js.native
  class DescribeKeyCommand protected () extends Command[
          InputTypesUnion, 
          DescribeKeyInput, 
          OutputTypesUnion, 
          DescribeKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DescribeKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  }
}
