package typingsSlinky.leveldown.mod

import typingsSlinky.abstractLeveldown.mod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownPutOptions extends AbstractOptions {
  var sync: js.UndefOr[Boolean] = js.native
}

object LevelDownPutOptions {
  @scala.inline
  def apply(): LevelDownPutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownPutOptions]
  }
  @scala.inline
  implicit class LevelDownPutOptionsOps[Self <: LevelDownPutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

