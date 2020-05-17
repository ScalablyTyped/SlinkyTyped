package typingsSlinky.jestCore.updateSnapshotsInteractiveMod

import typingsSlinky.jestCore.anon.Key
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.AssertionLocation
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ @js.native
trait UpdateSnapshotInteractivePlugin extends js.Object {
  var _failedSnapshotTestAssertions: js.Any = js.native
  var _snapshotInteractiveMode: js.Any = js.native
  var isInternal: `true` = js.native
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit = js.native
  def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation] = js.native
  def getUsageInfo(): Key | Null = js.native
  def onKey(key: String): Unit = js.native
  def run(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit] = js.native
}

object UpdateSnapshotInteractivePlugin {
  @scala.inline
  def apply(
    _failedSnapshotTestAssertions: js.Any,
    _snapshotInteractiveMode: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Unit,
    getFailedSnapshotTestAssertions: AggregatedResult => js.Array[AssertionLocation],
    getUsageInfo: () => Key | Null,
    isInternal: `true`,
    onKey: String => Unit,
    run: (GlobalConfig, js.Function) => js.Promise[Unit]
  ): UpdateSnapshotInteractivePlugin = {
    val __obj = js.Dynamic.literal(_failedSnapshotTestAssertions = _failedSnapshotTestAssertions.asInstanceOf[js.Any], _snapshotInteractiveMode = _snapshotInteractiveMode.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getFailedSnapshotTestAssertions = js.Any.fromFunction1(getFailedSnapshotTestAssertions), getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[UpdateSnapshotInteractivePlugin]
  }
  @scala.inline
  implicit class UpdateSnapshotInteractivePluginOps[Self <: UpdateSnapshotInteractivePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_failedSnapshotTestAssertions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_failedSnapshotTestAssertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_snapshotInteractiveMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_snapshotInteractiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFailedSnapshotTestAssertions(value: AggregatedResult => js.Array[AssertionLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFailedSnapshotTestAssertions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUsageInfo(value: () => Key | Null): Self = {
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
    def withRun(value: (GlobalConfig, js.Function) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

