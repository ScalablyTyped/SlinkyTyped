package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`1.5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuild extends js.Object {
  var build: `1.5` = js.native
  var repair: `1.5` = js.native
}

object AnonBuild {
  @scala.inline
  def apply(build: `1.5`, repair: `1.5`): AnonBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuild]
  }
  @scala.inline
  implicit class AnonBuildOps[Self <: AnonBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: `1.5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepair(value: `1.5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

