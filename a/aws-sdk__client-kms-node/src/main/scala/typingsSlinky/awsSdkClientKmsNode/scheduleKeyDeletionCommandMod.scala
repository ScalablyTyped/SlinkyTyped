package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ScheduleKeyDeletionCommand", JSImport.Namespace)
@js.native
object scheduleKeyDeletionCommandMod extends js.Object {
  @js.native
  class ScheduleKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          ScheduleKeyDeletionInput, 
          OutputTypesUnion, 
          ScheduleKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ScheduleKeyDeletionInput) = this()
    val middlewareStack: MiddlewareStack[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  }
  
}

