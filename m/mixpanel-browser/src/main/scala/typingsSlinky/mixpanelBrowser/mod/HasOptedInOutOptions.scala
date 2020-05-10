package typingsSlinky.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasOptedInOutOptions extends js.Object {
  var cookie_prefix: String = js.native
  var persistence_type: Persistence = js.native
}

object HasOptedInOutOptions {
  @scala.inline
  def apply(cookie_prefix: String, persistence_type: Persistence): HasOptedInOutOptions = {
    val __obj = js.Dynamic.literal(cookie_prefix = cookie_prefix.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasOptedInOutOptions]
  }
  @scala.inline
  implicit class HasOptedInOutOptionsOps[Self <: HasOptedInOutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistence_type(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

