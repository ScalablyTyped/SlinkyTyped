package typingsSlinky.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrString extends js.Object {
  var err: String = js.native
}

object AnonErrString {
  @scala.inline
  def apply(err: String): AnonErrString = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrString]
  }
  @scala.inline
  implicit class AnonErrStringOps[Self <: AnonErrString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

