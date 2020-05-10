package typingsSlinky.fossilDelta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVerifyChecksum extends js.Object {
  var verifyChecksum: Boolean = js.native
}

object AnonVerifyChecksum {
  @scala.inline
  def apply(verifyChecksum: Boolean): AnonVerifyChecksum = {
    val __obj = js.Dynamic.literal(verifyChecksum = verifyChecksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVerifyChecksum]
  }
  @scala.inline
  implicit class AnonVerifyChecksumOps[Self <: AnonVerifyChecksum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerifyChecksum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyChecksum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

