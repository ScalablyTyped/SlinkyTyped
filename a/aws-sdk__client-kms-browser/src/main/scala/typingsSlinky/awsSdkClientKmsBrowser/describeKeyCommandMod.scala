package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
import typingsSlinky.awsSdkClientKmsBrowser.typesDescribeKeyOutputMod.DescribeKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DescribeKeyCommand", "DescribeKeyCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  }
}
