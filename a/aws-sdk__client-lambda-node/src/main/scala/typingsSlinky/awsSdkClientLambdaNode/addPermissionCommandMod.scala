package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
import typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionOutputMod.AddPermissionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/AddPermissionCommand", JSImport.Namespace)
@js.native
object addPermissionCommandMod extends js.Object {
  
  @js.native
  class AddPermissionCommand protected () extends Command[
          InputTypesUnion, 
          AddPermissionInput, 
          OutputTypesUnion, 
          AddPermissionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddPermissionInput) = this()
    
    val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  }
}
