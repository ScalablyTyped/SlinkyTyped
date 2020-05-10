package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * The available port speeds for the location.
    */
  var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.native
  /**
    * The name of the service provider for the location.
    */
  var availableProviders: js.UndefOr[ProviderList] = js.native
  /**
    * The code for the location.
    */
  var locationCode: js.UndefOr[LocationCode] = js.native
  /**
    * The name of the location. This includes the name of the colocation partner and the physical site of the building.
    */
  var locationName: js.UndefOr[LocationName] = js.native
  /**
    * The AWS Region for the location.
    */
  var region: js.UndefOr[Region] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailablePortSpeeds(value: AvailablePortSpeeds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePortSpeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailablePortSpeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePortSpeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableProviders(value: ProviderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationCode(value: LocationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationName(value: LocationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

