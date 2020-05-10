package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableReplicationInstance extends js.Object {
  /**
    * List of Availability Zones for this replication instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
  /**
    * The default amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var DefaultAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The version of the replication engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var IncludedAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MinAllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The value returned when the specified EngineVersion of the replication instance is in Beta or test mode. This indicates some features might not work as expected.  AWS DMS supports the ReleaseStatus parameter in versions 3.1.4 and later. 
    */
  var ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.native
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  /**
    * The type of storage used by the replication instance.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object OrderableReplicationInstance {
  @scala.inline
  def apply(): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
  @scala.inline
  implicit class OrderableReplicationInstanceOps[Self <: OrderableReplicationInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZonesList): Self = {
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
    def withDefaultAllocatedStorage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedAllocatedStorage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedAllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAllocatedStorage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAllocatedStorage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseStatus(value: ReleaseStatusValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: String): Self = {
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
  }
  
}

