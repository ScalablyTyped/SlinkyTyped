package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`1.8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRepair extends js.Object {
  var build: `1.8` = js.native
  var repair: `1.8` = js.native
}

object AnonRepair {
  @scala.inline
  def apply(build: `1.8`, repair: `1.8`): AnonRepair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRepair]
  }
  @scala.inline
  implicit class AnonRepairOps[Self <: AnonRepair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: `1.8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepair(value: `1.8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

