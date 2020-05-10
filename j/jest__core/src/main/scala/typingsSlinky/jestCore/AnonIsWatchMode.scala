package typingsSlinky.jestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsWatchMode extends js.Object {
  var isWatchMode: Boolean = js.native
}

object AnonIsWatchMode {
  @scala.inline
  def apply(isWatchMode: Boolean): AnonIsWatchMode = {
    val __obj = js.Dynamic.literal(isWatchMode = isWatchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsWatchMode]
  }
  @scala.inline
  implicit class AnonIsWatchModeOps[Self <: AnonIsWatchMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWatchMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWatchMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

