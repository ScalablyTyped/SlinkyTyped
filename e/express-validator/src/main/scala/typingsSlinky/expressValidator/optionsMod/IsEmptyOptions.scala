package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEmptyOptions extends js.Object {
  var ignore_whitespace: Boolean = js.native
}

object IsEmptyOptions {
  @scala.inline
  def apply(ignore_whitespace: Boolean): IsEmptyOptions = {
    val __obj = js.Dynamic.literal(ignore_whitespace = ignore_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEmptyOptions]
  }
  @scala.inline
  implicit class IsEmptyOptionsOps[Self <: IsEmptyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore_whitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_whitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

