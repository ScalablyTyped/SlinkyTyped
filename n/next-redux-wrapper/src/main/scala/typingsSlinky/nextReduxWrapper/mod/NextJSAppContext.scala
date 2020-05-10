package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext * / any */ @js.native
trait NextJSAppContext extends js.Object {
  var ctx: NextJSContext[_, AnyAction] = js.native
}

object NextJSAppContext {
  @scala.inline
  def apply(ctx: NextJSContext[_, AnyAction]): NextJSAppContext = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextJSAppContext]
  }
  @scala.inline
  implicit class NextJSAppContextOps[Self <: NextJSAppContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtx(value: NextJSContext[_, AnyAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

