package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEntityOptions extends TimeoutIntervalOptions {
  var checkEtag: js.UndefOr[Boolean] = js.native
}

object UpdateEntityOptions {
  @scala.inline
  def apply(): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEntityOptions]
  }
  @scala.inline
  implicit class UpdateEntityOptionsOps[Self <: UpdateEntityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckEtag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkEtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkEtag")(js.undefined)
        ret
    }
  }
  
}

