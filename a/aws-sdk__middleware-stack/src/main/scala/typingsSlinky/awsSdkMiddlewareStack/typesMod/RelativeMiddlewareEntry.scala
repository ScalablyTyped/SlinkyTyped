package typingsSlinky.awsSdkMiddlewareStack.typesMod

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.Relation
import typingsSlinky.awsSdkTypes.middlewareMod.RelativeLocation
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeMiddlewareEntry[Input /* <: js.Object */, Output /* <: js.Object */]
  extends MiddlewareEntry[Input, Output]
     with RelativeLocation
object RelativeMiddlewareEntry {
  
  @scala.inline
  def apply[Input /* <: js.Object */, Output /* <: js.Object */](
    middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output]),
    relation: Relation,
    toMiddleware: String
  ): RelativeMiddlewareEntry[Input, Output] = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware), relation = relation.asInstanceOf[js.Any], toMiddleware = toMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeMiddlewareEntry[Input, Output]]
  }
}
