package typingsSlinky.appBuilderLib.yarnMod

import typingsSlinky.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typingsSlinky.lazyVal.mod.Lazy
import typingsSlinky.node.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebuildOptions extends js.Object {
  var additionalArgs: js.UndefOr[js.Array[String] | Null] = js.native
  var arch: js.UndefOr[String] = js.native
  var buildFromSource: js.UndefOr[Boolean] = js.native
  var frameworkInfo: DesktopFrameworkInfo = js.native
  var platform: js.UndefOr[Platform] = js.native
  var productionDeps: js.UndefOr[Lazy[js.Array[NodeModuleDirInfo]]] = js.native
}

object RebuildOptions {
  @scala.inline
  def apply(frameworkInfo: DesktopFrameworkInfo): RebuildOptions = {
    val __obj = js.Dynamic.literal(frameworkInfo = frameworkInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildOptions]
  }
  @scala.inline
  implicit class RebuildOptionsOps[Self <: RebuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameworkInfo(value: DesktopFrameworkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalArgsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArgs")(null)
        ret
    }
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildFromSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionDeps(value: Lazy[js.Array[NodeModuleDirInfo]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionDeps")(js.undefined)
        ret
    }
  }
  
}

