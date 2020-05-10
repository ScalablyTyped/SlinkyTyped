package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * Disk storage type, as defined by Google Compute Engine.  This
    * must be a disk type appropriate to the project and zone in which
    * the workers will run.  If unknown or unspecified, the service
    * will attempt to choose a reasonable default.
    *
    * For example, the standard persistent disk type is a resource name
    * typically ending in "pd-standard".  If SSD persistent disks are
    * available, the resource name typically ends with "pd-ssd".  The
    * actual valid values are defined the Google Compute Engine API,
    * not by the Cloud Dataflow API; consult the Google Compute Engine
    * documentation for more information about determining the set of
    * available disk types for a particular project and zone.
    *
    * Google Compute Engine Disk types are local to a particular
    * project in a particular zone, and so the resource name will
    * typically look something like this:
    *
    * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
    */
  var diskType: js.UndefOr[String] = js.native
  /** Directory in a VM where disk is mounted. */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    * Size of disk in GB.  If zero or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var sizeGb: js.UndefOr[Double] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(js.undefined)
        ret
    }
    @scala.inline
    def withMountPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(js.undefined)
        ret
    }
  }
  
}

