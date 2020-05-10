package typingsSlinky.atom

import typingsSlinky.atom.mod.Config
import typingsSlinky.atom.mod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  var config: js.UndefOr[Config] = js.native
  var project: js.UndefOr[Project] = js.native
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.native
}

object AnonConfig {
  @scala.inline
  def apply(): AnonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConfig]
  }
  @scala.inline
  implicit class AnonConfigOps[Self <: AnonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: Project): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshOnWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshOnWindowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnWindowFocus")(js.undefined)
        ret
    }
  }
  
}

