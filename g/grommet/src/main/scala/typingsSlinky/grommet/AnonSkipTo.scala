package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSkipTo extends js.Object {
  var skipTo: js.UndefOr[String] = js.native
}

object AnonSkipTo {
  @scala.inline
  def apply(): AnonSkipTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSkipTo]
  }
  @scala.inline
  implicit class AnonSkipToOps[Self <: AnonSkipTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTo")(js.undefined)
        ret
    }
  }
  
}

