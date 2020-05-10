package typingsSlinky.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var requireBase: js.UndefOr[Boolean] = js.native
  var rewriteLinks: js.UndefOr[Boolean] = js.native
}

object AnonEnabled {
  @scala.inline
  def apply(): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnabled]
  }
  @scala.inline
  implicit class AnonEnabledOps[Self <: AnonEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireBase")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteLinks")(js.undefined)
        ret
    }
  }
  
}

