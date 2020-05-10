package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStandardAnon extends js.Object {
  var standard: Anon = js.native
}

object AnonStandardAnon {
  @scala.inline
  def apply(standard: Anon): AnonStandardAnon = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStandardAnon]
  }
  @scala.inline
  implicit class AnonStandardAnonOps[Self <: AnonStandardAnon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandard(value: Anon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

