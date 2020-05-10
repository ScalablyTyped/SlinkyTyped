package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsFinal extends js.Object {
  var isFinal: js.UndefOr[Boolean] = js.native
}

object AnonIsFinal {
  @scala.inline
  def apply(): AnonIsFinal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIsFinal]
  }
  @scala.inline
  implicit class AnonIsFinalOps[Self <: AnonIsFinal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFinal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(js.undefined)
        ret
    }
  }
  
}

