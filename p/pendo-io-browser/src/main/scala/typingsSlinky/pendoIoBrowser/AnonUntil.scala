package typingsSlinky.pendoIoBrowser

import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUntil extends js.Object {
  var until: reload = js.native
}

object AnonUntil {
  @scala.inline
  def apply(until: reload): AnonUntil = {
    val __obj = js.Dynamic.literal(until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUntil]
  }
  @scala.inline
  implicit class AnonUntilOps[Self <: AnonUntil] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUntil(value: reload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

