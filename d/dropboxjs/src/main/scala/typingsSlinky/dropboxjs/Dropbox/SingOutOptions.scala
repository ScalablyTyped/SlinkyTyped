package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingOutOptions extends js.Object {
  var mustInvalidate: Boolean = js.native
}

object SingOutOptions {
  @scala.inline
  def apply(mustInvalidate: Boolean): SingOutOptions = {
    val __obj = js.Dynamic.literal(mustInvalidate = mustInvalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingOutOptions]
  }
  @scala.inline
  implicit class SingOutOptionsOps[Self <: SingOutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMustInvalidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustInvalidate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

