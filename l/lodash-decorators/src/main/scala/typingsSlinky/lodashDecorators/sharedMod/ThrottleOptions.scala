package typingsSlinky.lodashDecorators.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.native
  var trailing: js.UndefOr[Boolean] = js.native
}

object ThrottleOptions {
  @scala.inline
  def apply(): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleOptions]
  }
  @scala.inline
  implicit class ThrottleOptionsOps[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailing")(js.undefined)
        ret
    }
  }
  
}

