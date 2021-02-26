package typingsSlinky.awsSdkTypes.eventStreamMod

import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerArguments
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerOutput
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamPayloadHandler extends StObject {
  
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](
    next: FinalizeHandler[Input, Output],
    args: FinalizeHandlerArguments[Input],
    context: HandlerExecutionContext
  ): js.Promise[FinalizeHandlerOutput[Output]] = js.native
}
