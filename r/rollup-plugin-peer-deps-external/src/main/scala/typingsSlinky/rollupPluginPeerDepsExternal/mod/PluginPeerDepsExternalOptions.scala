package typingsSlinky.rollupPluginPeerDepsExternal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginPeerDepsExternalOptions extends js.Object {
  var includeDependencies: js.UndefOr[Boolean] = js.native
  var packageJsonPath: js.UndefOr[String] = js.native
}

object PluginPeerDepsExternalOptions {
  @scala.inline
  def apply(): PluginPeerDepsExternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginPeerDepsExternalOptions]
  }
  @scala.inline
  implicit class PluginPeerDepsExternalOptionsOps[Self <: PluginPeerDepsExternalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageJsonPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageJsonPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageJsonPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageJsonPath")(js.undefined)
        ret
    }
  }
  
}

