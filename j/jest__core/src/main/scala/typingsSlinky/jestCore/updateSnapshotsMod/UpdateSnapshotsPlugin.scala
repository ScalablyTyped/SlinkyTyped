package typingsSlinky.jestCore.updateSnapshotsMod

import typingsSlinky.jestCore.anon.Key
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ @js.native
trait UpdateSnapshotsPlugin extends js.Object {
  var _hasSnapshotFailure: js.Any = js.native
  var isInternal: `true` = js.native
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit = js.native
  def getUsageInfo(): Key | Null = js.native
  def run(
    _globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Boolean] = js.native
}

object UpdateSnapshotsPlugin {
  @scala.inline
  def apply(
    _hasSnapshotFailure: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Unit,
    getUsageInfo: () => Key | Null,
    isInternal: `true`,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Boolean]
  ): UpdateSnapshotsPlugin = {
    val __obj = js.Dynamic.literal(_hasSnapshotFailure = _hasSnapshotFailure.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[UpdateSnapshotsPlugin]
  }
  @scala.inline
  implicit class UpdateSnapshotsPluginOps[Self <: UpdateSnapshotsPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_hasSnapshotFailure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasSnapshotFailure")(value.asInstanceOf[js.Any])
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
    def withRun(
      value: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Boolean]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

