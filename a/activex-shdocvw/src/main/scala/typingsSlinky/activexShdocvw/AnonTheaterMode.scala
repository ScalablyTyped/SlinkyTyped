package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTheaterMode extends js.Object {
  val TheaterMode: Boolean = js.native
}

object AnonTheaterMode {
  @scala.inline
  def apply(TheaterMode: Boolean): AnonTheaterMode = {
    val __obj = js.Dynamic.literal(TheaterMode = TheaterMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheaterMode]
  }
  @scala.inline
  implicit class AnonTheaterModeOps[Self <: AnonTheaterMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheaterMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TheaterMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

