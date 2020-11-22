package typingsSlinky.awsSdkMiddlewareStack.typesMod

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareType
import typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedRelativeEntry[Input /* <: js.Object */, Output /* <: js.Object */] extends HandlerOptions {
  
  var middleware: MiddlewareType[Input, Output] = js.native
  
  var next: js.UndefOr[NormalizedRelativeEntry[Input, Output]] = js.native
  
  var prev: js.UndefOr[NormalizedRelativeEntry[Input, Output]] = js.native
  
  var priority: Null = js.native
  
  @JSName("step")
  var step_NormalizedRelativeEntry: Step = js.native
}
object NormalizedRelativeEntry {
  
  @scala.inline
  def apply[Input /* <: js.Object */, Output /* <: js.Object */](
    middleware: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output]),
    priority: Null,
    step: Step
  ): NormalizedRelativeEntry[Input, Output] = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction2(middleware), priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedRelativeEntry[Input, Output]]
  }
  
  @scala.inline
  implicit class NormalizedRelativeEntryOps[Self <: NormalizedRelativeEntry[_, _], Input /* <: js.Object */, Output /* <: js.Object */] (val x: Self with (NormalizedRelativeEntry[Input, Output])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMiddleware(
      value: ((/* next */ BuildHandler[Input, Output]) | (/* next */ DeserializeHandler[Input, Output]) | (/* next */ FinalizeHandler[Input, Output]) | (/* next */ InitializeHandler[Input, Output]) | (/* next */ SerializeHandler[Input, Output]), /* context */ HandlerExecutionContext) => (BuildHandler[Input, Output]) | (DeserializeHandler[Input, Output]) | (FinalizeHandler[Input, Output]) | (InitializeHandler[Input, Output]) | (SerializeHandler[Input, Output])
    ): Self = this.set("middleware", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPriority(value: Null): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: NormalizedRelativeEntry[Input, Output]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrev(value: NormalizedRelativeEntry[Input, Output]): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
  }
}
