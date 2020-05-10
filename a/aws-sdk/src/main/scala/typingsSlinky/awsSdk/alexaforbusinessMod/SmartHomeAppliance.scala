package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeAppliance extends js.Object {
  /**
    * The description of the smart home appliance.
    */
  var Description: js.UndefOr[ApplianceDescription] = js.native
  /**
    * The friendly name of the smart home appliance.
    */
  var FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.native
  /**
    * The name of the manufacturer of the smart home appliance.
    */
  var ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.native
}

object SmartHomeAppliance {
  @scala.inline
  def apply(): SmartHomeAppliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartHomeAppliance]
  }
  @scala.inline
  implicit class SmartHomeApplianceOps[Self <: SmartHomeAppliance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: ApplianceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendlyName(value: ApplianceFriendlyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturerName(value: ApplianceManufacturerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManufacturerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManufacturerName")(js.undefined)
        ret
    }
  }
  
}

