package typingsSlinky.jestResolve.nodeModulesPathsMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModulesPathsOptions extends js.Object {
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[js.Array[Path]] = js.native
}

object NodeModulesPathsOptions {
  @scala.inline
  def apply(): NodeModulesPathsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeModulesPathsOptions]
  }
  @scala.inline
  implicit class NodeModulesPathsOptionsOps[Self <: NodeModulesPathsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleDirectory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
  }
  
}

