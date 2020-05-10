package typingsSlinky.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIRequestContext extends js.Object {
  var _options: GlobalOptions = js.native
  var google: js.UndefOr[GoogleConfigurable] = js.native
}

object APIRequestContext {
  @scala.inline
  def apply(_options: GlobalOptions): APIRequestContext = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIRequestContext]
  }
  @scala.inline
  implicit class APIRequestContextOps[Self <: APIRequestContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_options(value: GlobalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogle(value: GoogleConfigurable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(js.undefined)
        ret
    }
  }
  
}

