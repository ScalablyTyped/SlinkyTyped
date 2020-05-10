package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFullScreen extends js.Object {
  val FullScreen: Boolean = js.native
}

object AnonFullScreen {
  @scala.inline
  def apply(FullScreen: Boolean): AnonFullScreen = {
    val __obj = js.Dynamic.literal(FullScreen = FullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullScreen]
  }
  @scala.inline
  implicit class AnonFullScreenOps[Self <: AnonFullScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullScreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

