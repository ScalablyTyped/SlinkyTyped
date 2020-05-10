package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiaInventorySettings extends js.Object {
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.native
  var inventoryVerificationContactName: js.UndefOr[String] = js.native
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object LiaInventorySettings {
  @scala.inline
  def apply(): LiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaInventorySettings]
  }
  @scala.inline
  implicit class LiaInventorySettingsOps[Self <: LiaInventorySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryVerificationContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryVerificationContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryVerificationContactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryVerificationContactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactName")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryVerificationContactStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryVerificationContactStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryVerificationContactStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

