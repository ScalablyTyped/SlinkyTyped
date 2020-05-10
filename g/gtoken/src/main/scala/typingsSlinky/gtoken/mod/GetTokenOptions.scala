package typingsSlinky.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTokenOptions extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.native
}

object GetTokenOptions {
  @scala.inline
  def apply(): GetTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTokenOptions]
  }
  @scala.inline
  implicit class GetTokenOptionsOps[Self <: GetTokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRefresh")(js.undefined)
        ret
    }
  }
  
}

