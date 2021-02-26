package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsSlinky.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
import typingsSlinky.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listQueuesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ListQueuesCommand", "ListQueuesCommand")
  @js.native
  class ListQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListQueuesInput, 
          OutputTypesUnion, 
          ListQueuesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListQueuesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
  }
}
