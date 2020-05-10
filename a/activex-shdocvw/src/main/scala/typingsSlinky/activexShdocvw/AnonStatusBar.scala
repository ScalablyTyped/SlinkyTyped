package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStatusBar extends js.Object {
  val StatusBar: Boolean = js.native
}

object AnonStatusBar {
  @scala.inline
  def apply(StatusBar: Boolean): AnonStatusBar = {
    val __obj = js.Dynamic.literal(StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusBar]
  }
  @scala.inline
  implicit class AnonStatusBarOps[Self <: AnonStatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

