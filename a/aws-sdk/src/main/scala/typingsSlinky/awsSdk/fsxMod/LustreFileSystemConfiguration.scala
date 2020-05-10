package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemConfiguration extends js.Object {
  var DataRepositoryConfiguration: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DataRepositoryConfiguration] = js.native
  /**
    * The deployment type of the FSX for Lustre file system.
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.native
  /**
    * You use the MountName value when mounting the file system. For the SCRATCH_1 deployment type, this value is always "fsx". For SCRATCH_2 and PERSISTENT_1 deployment types, this value is a string that is unique within an AWS Region. 
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.native
  /**
    *  Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for PERSISTENT_1 deployment types. Valid values are 50, 100, 200. 
    */
  var PerUnitStorageThroughput: js.UndefOr[typingsSlinky.awsSdk.fsxMod.PerUnitStorageThroughput] = js.native
  /**
    * The UTC time that you want to begin your weekly maintenance window.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object LustreFileSystemConfiguration {
  @scala.inline
  def apply(): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
  @scala.inline
  implicit class LustreFileSystemConfigurationOps[Self <: LustreFileSystemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRepositoryConfiguration(value: DataRepositoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRepositoryConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentType(value: LustreDeploymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(js.undefined)
        ret
    }
    @scala.inline
    def withMountName(value: LustreFileSystemMountName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountName")(js.undefined)
        ret
    }
    @scala.inline
    def withPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerUnitStorageThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerUnitStorageThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerUnitStorageThroughput")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklyMaintenanceStartTime(value: WeeklyTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

