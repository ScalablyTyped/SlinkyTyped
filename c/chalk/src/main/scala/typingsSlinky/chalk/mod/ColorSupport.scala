package typingsSlinky.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSupport extends js.Object {
  var has16m: Boolean = js.native
  var has256: Boolean = js.native
  var hasBasic: Boolean = js.native
  var level: Level = js.native
}

object ColorSupport {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Level): ColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSupport]
  }
  @scala.inline
  implicit class ColorSupportOps[Self <: ColorSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas16m(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has16m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas256(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBasic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

