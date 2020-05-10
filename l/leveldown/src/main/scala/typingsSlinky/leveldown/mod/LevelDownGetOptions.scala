package typingsSlinky.leveldown.mod

import typingsSlinky.abstractLeveldown.mod.AbstractGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownGetOptions extends AbstractGetOptions {
  var fillCache: js.UndefOr[Boolean] = js.native
}

object LevelDownGetOptions {
  @scala.inline
  def apply(): LevelDownGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownGetOptions]
  }
  @scala.inline
  implicit class LevelDownGetOptionsOps[Self <: LevelDownGetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillCache")(js.undefined)
        ret
    }
  }
  
}

