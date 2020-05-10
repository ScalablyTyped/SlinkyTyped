package typingsSlinky.levelSublevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify levelup.LevelUpBase<Batch> * / any */ @js.native
trait Sublevel extends js.Object {
  def pre(hook: Hook): js.Function = js.native
  def sublevel(key: String): Sublevel = js.native
}

object Sublevel {
  @scala.inline
  def apply(pre: Hook => js.Function, sublevel: String => Sublevel): Sublevel = {
    val __obj = js.Dynamic.literal(pre = js.Any.fromFunction1(pre), sublevel = js.Any.fromFunction1(sublevel))
    __obj.asInstanceOf[Sublevel]
  }
  @scala.inline
  implicit class SublevelOps[Self <: Sublevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPre(value: Hook => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSublevel(value: String => Sublevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublevel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

