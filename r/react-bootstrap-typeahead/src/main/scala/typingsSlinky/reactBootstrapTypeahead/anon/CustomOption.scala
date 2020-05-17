package typingsSlinky.reactBootstrapTypeahead.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomOption extends js.Object {
  var customOption: Boolean = js.native
}

object CustomOption {
  @scala.inline
  def apply(customOption: Boolean): CustomOption = {
    val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOption]
  }
  @scala.inline
  implicit class CustomOptionOps[Self <: CustomOption] (val x: Self) extends AnyVal {
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

