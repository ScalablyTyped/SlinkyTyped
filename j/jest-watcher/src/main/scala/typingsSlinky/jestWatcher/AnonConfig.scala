package typingsSlinky.jestWatcher

import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  var config: ProjectConfig = js.native
  var testPaths: js.Array[Path] = js.native
}

object AnonConfig {
  @scala.inline
  def apply(config: ProjectConfig, testPaths: js.Array[Path]): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
  @scala.inline
  implicit class AnonConfigOps[Self <: AnonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPaths(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

