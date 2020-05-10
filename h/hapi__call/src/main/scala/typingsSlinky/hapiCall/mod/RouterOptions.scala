package typingsSlinky.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var isCaseSensitive: Boolean = js.native
}

object RouterOptions {
  @scala.inline
  def apply(isCaseSensitive: Boolean): RouterOptions = {
    val __obj = js.Dynamic.literal(isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

