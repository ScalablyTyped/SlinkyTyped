package typingsSlinky.jestCore.quitMod

import typingsSlinky.jestCore.AnonKey
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ @js.native
trait QuitPlugin extends js.Object {
  var isInternal: `true` = js.native
  def getUsageInfo(): AnonKey = js.native
  def run(): js.Promise[Unit] = js.native
}

object QuitPlugin {
  @scala.inline
  def apply(getUsageInfo: () => AnonKey, isInternal: `true`, run: () => js.Promise[Unit]): QuitPlugin = {
    val __obj = js.Dynamic.literal(getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[QuitPlugin]
  }
  @scala.inline
  implicit class QuitPluginOps[Self <: QuitPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUsageInfo(value: () => AnonKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsageInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInternal(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

