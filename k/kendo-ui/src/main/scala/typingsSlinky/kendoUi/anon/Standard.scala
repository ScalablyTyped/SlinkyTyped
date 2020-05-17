package typingsSlinky.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Standard extends js.Object {
  var standard: AM = js.native
}

object Standard {
  @scala.inline
  def apply(standard: AM): Standard = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  @scala.inline
  implicit class StandardOps[Self <: Standard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandard(value: AM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

