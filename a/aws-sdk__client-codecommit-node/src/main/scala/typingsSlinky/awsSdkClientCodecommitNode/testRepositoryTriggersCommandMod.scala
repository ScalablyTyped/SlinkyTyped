package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
import typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/TestRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object testRepositoryTriggersCommandMod extends js.Object {
  
  @js.native
  class TestRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          TestRepositoryTriggersInput, 
          OutputTypesUnion, 
          TestRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: TestRepositoryTriggersInput) = this()
    
    val middlewareStack: MiddlewareStack[TestRepositoryTriggersInput, TestRepositoryTriggersOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
  }
}
