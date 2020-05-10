package typingsSlinky.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceRefresh extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.native
  var newData: js.UndefOr[Boolean] = js.native
  var suppressFlash: js.UndefOr[Boolean] = js.native
}

object AnonForceRefresh {
  @scala.inline
  def apply(): AnonForceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForceRefresh]
  }
  @scala.inline
  implicit class AnonForceRefreshOps[Self <: AnonForceRefresh] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFlash")(js.undefined)
        ret
    }
  }
  
}

