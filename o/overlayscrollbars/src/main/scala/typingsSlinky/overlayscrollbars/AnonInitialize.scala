package typingsSlinky.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitialize extends js.Object {
  var initialize: js.UndefOr[Boolean] = js.native
  var showNativeScrollbars: js.UndefOr[Boolean] = js.native
}

object AnonInitialize {
  @scala.inline
  def apply(): AnonInitialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInitialize]
  }
  @scala.inline
  implicit class AnonInitializeOps[Self <: AnonInitialize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNativeScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNativeScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNativeScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNativeScrollbars")(js.undefined)
        ret
    }
  }
  
}

