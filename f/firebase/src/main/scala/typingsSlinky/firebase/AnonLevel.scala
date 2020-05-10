package typingsSlinky.firebase

import typingsSlinky.firebase.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  /**
    * Threshhold log level. Only logs at or above this level trigger the `logCallback`
    * passed to `onLog`.
    */
  var level: LogLevel = js.native
}

object AnonLevel {
  @scala.inline
  def apply(level: LogLevel): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

