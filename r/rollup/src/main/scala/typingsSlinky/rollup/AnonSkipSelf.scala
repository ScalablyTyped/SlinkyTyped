package typingsSlinky.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSkipSelf extends js.Object {
  var skipSelf: Boolean = js.native
}

object AnonSkipSelf {
  @scala.inline
  def apply(skipSelf: Boolean): AnonSkipSelf = {
    val __obj = js.Dynamic.literal(skipSelf = skipSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipSelf]
  }
  @scala.inline
  implicit class AnonSkipSelfOps[Self <: AnonSkipSelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSelf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

