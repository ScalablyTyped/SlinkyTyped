package typingsSlinky.jestCore.testPathPatternMod

import typingsSlinky.jestCore.AnonKey
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ @js.native
trait TestPathPatternPlugin extends js.Object {
  var _prompt: js.Any = js.native
  var isInternal: `true` = js.native
  def getUsageInfo(): AnonKey = js.native
  def onKey(key: String): Unit = js.native
  def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit] = js.native
}

object TestPathPatternPlugin {
  @scala.inline
  def apply(
    _prompt: js.Any,
    getUsageInfo: () => AnonKey,
    isInternal: `true`,
    onKey: String => Unit,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Unit]
  ): TestPathPatternPlugin = {
    val __obj = js.Dynamic.literal(_prompt = _prompt.asInstanceOf[js.Any], getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[TestPathPatternPlugin]
  }
  @scala.inline
  implicit class TestPathPatternPluginOps[Self <: TestPathPatternPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_prompt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prompt")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withOnKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

