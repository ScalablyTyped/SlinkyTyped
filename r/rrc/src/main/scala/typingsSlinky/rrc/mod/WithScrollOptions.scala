package typingsSlinky.rrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithScrollOptions extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.native
  var propId: js.UndefOr[PropIdCallback] = js.native
}

object WithScrollOptions {
  @scala.inline
  def apply(): WithScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithScrollOptions]
  }
  @scala.inline
  implicit class WithScrollOptionsOps[Self <: WithScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPropId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPropId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propId")(js.undefined)
        ret
    }
  }
  
}

