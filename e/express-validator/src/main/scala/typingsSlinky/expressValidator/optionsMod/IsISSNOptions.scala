package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsISSNOptions extends js.Object {
  var case_sensitive: js.UndefOr[Boolean] = js.native
  var require_hyphen: js.UndefOr[Boolean] = js.native
}

object IsISSNOptions {
  @scala.inline
  def apply(): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISSNOptions]
  }
  @scala.inline
  implicit class IsISSNOptionsOps[Self <: IsISSNOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCase_sensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCase_sensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_sensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_hyphen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_hyphen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_hyphen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_hyphen")(js.undefined)
        ret
    }
  }
  
}

