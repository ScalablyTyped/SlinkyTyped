package typingsSlinky.appBuilderLib.frameworkMod

import typingsSlinky.appBuilderLib.configurationMod.AfterPackContext
import typingsSlinky.appBuilderLib.mod.Platform
import typingsSlinky.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framework extends js.Object {
  var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[_]]] = js.native
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.native
  var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.native
  val defaultAppIdPrefix: String = js.native
  val distMacOsAppName: String = js.native
  var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
  var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.native
  var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
  val isCopyElevateHelper: Boolean = js.native
  val isNpmRebuildRequired: Boolean = js.native
  val macOsDefaultTargets: js.Array[String] = js.native
  val name: String = js.native
  val version: String = js.native
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_] = js.native
}

object Framework {
  @scala.inline
  def apply(
    defaultAppIdPrefix: String,
    distMacOsAppName: String,
    isCopyElevateHelper: Boolean,
    isNpmRebuildRequired: Boolean,
    macOsDefaultTargets: js.Array[String],
    name: String,
    prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => js.Promise[_],
    version: String
  ): Framework = {
    val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prepareApplicationStageDirectory = js.Any.fromFunction1(prepareApplicationStageDirectory), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  @scala.inline
  implicit class FrameworkOps[Self <: Framework] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAppIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAppIdPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistMacOsAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distMacOsAppName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCopyElevateHelper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCopyElevateHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNpmRebuildRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNpmRebuildRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacOsDefaultTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOsDefaultTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepareApplicationStageDirectory(value: PrepareApplicationStageDirectoryOptions => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareApplicationStageDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterPack(value: /* context */ AfterPackContext => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCopyExtraFiles(value: /* options */ BeforeCopyExtraFilesOptions => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCopyExtraFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCopyExtraFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCopyExtraFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTransformer(value: () => FileTransformer | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultIcon(value: /* platform */ Platform => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExcludedDependencies(value: /* platform */ Platform => js.Array[String] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExcludedDependencies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetExcludedDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExcludedDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMainFile(value: /* platform */ Platform => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMainFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMainFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMainFile")(js.undefined)
        ret
    }
  }
  
}

