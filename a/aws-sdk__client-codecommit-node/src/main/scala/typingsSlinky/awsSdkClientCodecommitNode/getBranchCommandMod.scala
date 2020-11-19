package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBranchCommand", JSImport.Namespace)
@js.native
object getBranchCommandMod extends js.Object {
  
  @js.native
  class GetBranchCommand protected () extends Command[
          InputTypesUnion, 
          GetBranchInput, 
          OutputTypesUnion, 
          GetBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBranchInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBranchInput, GetBranchOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
  }
}
