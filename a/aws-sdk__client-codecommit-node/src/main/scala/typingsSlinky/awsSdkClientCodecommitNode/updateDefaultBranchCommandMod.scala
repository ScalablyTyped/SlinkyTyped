package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", JSImport.Namespace)
@js.native
object updateDefaultBranchCommandMod extends js.Object {
  
  @js.native
  class UpdateDefaultBranchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateDefaultBranchInput, 
          OutputTypesUnion, 
          UpdateDefaultBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateDefaultBranchInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateDefaultBranchInput, UpdateDefaultBranchOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  }
}
