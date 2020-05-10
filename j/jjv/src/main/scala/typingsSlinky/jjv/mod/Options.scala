package typingsSlinky.jjv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var checkRequired: js.UndefOr[Boolean] = js.native
  var removeAdditional: js.UndefOr[Boolean] = js.native
  var useCoerce: js.UndefOr[Boolean] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAdditional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAdditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAdditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAdditional")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCoerce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCoerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCoerce")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(js.undefined)
        ret
    }
  }
  
}

