package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.close
import typingsSlinky.devextreme.devextremeStrings.high
import typingsSlinky.devextreme.devextremeStrings.low
import typingsSlinky.devextreme.devextremeStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorLevel extends js.Object {
  var color: js.UndefOr[String] = js.native
  var level: js.UndefOr[close | high | low | open] = js.native
}

object ColorLevel {
  @scala.inline
  def apply(): ColorLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorLevel]
  }
  @scala.inline
  implicit class ColorLevelOps[Self <: ColorLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: close | high | low | open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

