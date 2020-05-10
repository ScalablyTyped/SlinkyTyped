package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReversed extends js.Object {
  var reversed: Boolean = js.native
}

object AnonReversed {
  @scala.inline
  def apply(reversed: Boolean): AnonReversed = {
    val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReversed]
  }
  @scala.inline
  implicit class AnonReversedOps[Self <: AnonReversed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

