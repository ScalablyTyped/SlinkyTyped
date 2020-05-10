package typingsSlinky.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRepeaterName extends js.Object {
  var repeaterName: js.UndefOr[js.Any] = js.native
}

object AnonRepeaterName {
  @scala.inline
  def apply(): AnonRepeaterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRepeaterName]
  }
  @scala.inline
  implicit class AnonRepeaterNameOps[Self <: AnonRepeaterName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepeaterName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeaterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeaterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeaterName")(js.undefined)
        ret
    }
  }
  
}

