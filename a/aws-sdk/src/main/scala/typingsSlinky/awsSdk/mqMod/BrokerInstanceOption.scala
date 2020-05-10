package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstanceOption extends js.Object {
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[listOfAvailabilityZone] = js.native
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typingsSlinky.awsSdk.mqMod.EngineType] = js.native
  /**
    * The type of broker instance.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  /**
    * The list of supported deployment modes.
    */
  var SupportedDeploymentModes: js.UndefOr[listOfDeploymentMode] = js.native
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[listOfString] = js.native
}

object BrokerInstanceOption {
  @scala.inline
  def apply(): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstanceOption]
  }
  @scala.inline
  implicit class BrokerInstanceOptionOps[Self <: BrokerInstanceOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: listOfAvailabilityZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineType(value: EngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(js.undefined)
        ret
    }
    @scala.inline
    def withHostInstanceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: BrokerStorageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedDeploymentModes(value: listOfDeploymentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedDeploymentModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedDeploymentModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedDeploymentModes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedEngineVersions(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngineVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedEngineVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngineVersions")(js.undefined)
        ret
    }
  }
  
}

