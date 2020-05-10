package typingsSlinky.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplicationCodePersistingDisabled extends js.Object {
  var applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.native
  var carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.native
  var systemInfoSendingDisabled: js.UndefOr[Boolean] = js.native
  var userDataPersistingDisabled: js.UndefOr[Boolean] = js.native
}

object AnonApplicationCodePersistingDisabled {
  @scala.inline
  def apply(): AnonApplicationCodePersistingDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApplicationCodePersistingDisabled]
  }
  @scala.inline
  implicit class AnonApplicationCodePersistingDisabledOps[Self <: AnonApplicationCodePersistingDisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCodePersistingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCodePersistingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCodePersistingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCodePersistingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierInfoSendingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierInfoSendingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierInfoSendingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierInfoSendingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemInfoSendingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInfoSendingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemInfoSendingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInfoSendingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDataPersistingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataPersistingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataPersistingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataPersistingDisabled")(js.undefined)
        ret
    }
  }
  
}

