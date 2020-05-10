package typingsSlinky.jestResolve.mod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveModuleConfig extends js.Object {
  var paths: js.UndefOr[js.Array[Path]] = js.native
  var skipNodeResolution: js.UndefOr[Boolean] = js.native
}

object ResolveModuleConfig {
  @scala.inline
  def apply(): ResolveModuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveModuleConfig]
  }
  @scala.inline
  implicit class ResolveModuleConfigOps[Self <: ResolveModuleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSkipNodeResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNodeResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipNodeResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNodeResolution")(js.undefined)
        ret
    }
  }
  
}

