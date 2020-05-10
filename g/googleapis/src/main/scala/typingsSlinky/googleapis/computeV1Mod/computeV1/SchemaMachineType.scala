package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonDiskGb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Machine Type resource. (== resource_for v1.machineTypes ==) (==
  * resource_for beta.machineTypes ==)
  */
@js.native
trait SchemaMachineType extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this machine type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The number of virtual CPUs that are available to the
    * instance.
    */
  var guestCpus: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This property is deprecated and will never be populated with
    * any relevant values.
    */
  var imageSpaceGb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Whether this machine type has a shared CPU. See Shared-core
    * machine types for more information.
    */
  var isSharedCpu: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] The type of the resource. Always compute#machineType for
    * machine types.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Maximum persistent disks allowed.
    */
  var maximumPersistentDisks: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Maximum total persistent disks size (GB) allowed.
    */
  var maximumPersistentDisksSizeGb: js.UndefOr[String] = js.native
  /**
    * [Output Only] The amount of physical memory available to the instance,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of extended scratch disks assigned to the instance.
    */
  var scratchDisks: js.UndefOr[js.Array[AnonDiskGb]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the zone where the machine type resides, such
    * as us-central1-a.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaMachineType {
  @scala.inline
  def apply(): SchemaMachineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineType]
  }
  @scala.inline
  implicit class SchemaMachineTypeOps[Self <: SchemaMachineType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: SchemaDeprecationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestCpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSpaceGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSpaceGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSpaceGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSpaceGb")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSharedCpu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharedCpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSharedCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharedCpu")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPersistentDisks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPersistentDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPersistentDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPersistentDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPersistentDisksSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPersistentDisksSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPersistentDisksSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPersistentDisksSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryMb")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScratchDisks(value: js.Array[AnonDiskGb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scratchDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScratchDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scratchDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

