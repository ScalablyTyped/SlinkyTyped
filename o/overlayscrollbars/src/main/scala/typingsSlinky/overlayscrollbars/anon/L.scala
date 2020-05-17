package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.Coordinates
import typingsSlinky.overlayscrollbars.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L extends Coordinates {
  var l: js.UndefOr[Position] = js.native
  var t: js.UndefOr[Position] = js.native
}

object L {
  @scala.inline
  def apply(): L = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L]
  }
  @scala.inline
  implicit class LOps[Self <: L] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(js.undefined)
        ret
    }
    @scala.inline
    def withT(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.undefined)
        ret
    }
  }
  
}

