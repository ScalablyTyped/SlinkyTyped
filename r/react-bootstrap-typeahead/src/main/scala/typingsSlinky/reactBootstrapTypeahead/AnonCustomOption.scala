package typingsSlinky.reactBootstrapTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomOption extends js.Object {
  var customOption: Boolean = js.native
}

object AnonCustomOption {
  @scala.inline
  def apply(customOption: Boolean): AnonCustomOption = {
    val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomOption]
  }
  @scala.inline
  implicit class AnonCustomOptionOps[Self <: AnonCustomOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

