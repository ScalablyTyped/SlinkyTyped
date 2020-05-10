package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBare extends js.Object {
  var bare: js.UndefOr[Boolean] = js.native
}

object AnonBare {
  @scala.inline
  def apply(): AnonBare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBare]
  }
  @scala.inline
  implicit class AnonBareOps[Self <: AnonBare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare")(js.undefined)
        ret
    }
  }
  
}

