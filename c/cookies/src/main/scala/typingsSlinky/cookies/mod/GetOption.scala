package typingsSlinky.cookies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOption extends js.Object {
  var signed: Boolean = js.native
}

object GetOption {
  @scala.inline
  def apply(signed: Boolean): GetOption = {
    val __obj = js.Dynamic.literal(signed = signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOption]
  }
  @scala.inline
  implicit class GetOptionOps[Self <: GetOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

