package typingsSlinky.browserBunyan.mod.BrowserBunyan

import typingsSlinky.browserBunyan.anon.PartialConsoleFormattedSt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleFormattedStreamStyle extends js.Object {
  var `def`: String = js.native
  var levels: PartialConsoleFormattedSt = js.native
  var msg: String = js.native
  var src: String = js.native
}

object ConsoleFormattedStreamStyle {
  @scala.inline
  def apply(`def`: String, levels: PartialConsoleFormattedSt, msg: String, src: String): ConsoleFormattedStreamStyle = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStreamStyle]
  }
  @scala.inline
  implicit class ConsoleFormattedStreamStyleOps[Self <: ConsoleFormattedStreamStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: PartialConsoleFormattedSt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

