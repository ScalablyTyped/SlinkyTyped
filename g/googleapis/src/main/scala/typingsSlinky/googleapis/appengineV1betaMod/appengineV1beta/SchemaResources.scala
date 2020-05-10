package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Machine resources for a version.
  */
@js.native
trait SchemaResources extends js.Object {
  /**
    * Number of CPU cores needed.
    */
  var cpu: js.UndefOr[Double] = js.native
  /**
    * Disk size (GB) needed.
    */
  var diskGb: js.UndefOr[Double] = js.native
  /**
    * Memory (GB) needed.
    */
  var memoryGb: js.UndefOr[Double] = js.native
  /**
    * User specified volumes.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}

object SchemaResources {
  @scala.inline
  def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  @scala.inline
  implicit class SchemaResourcesOps[Self <: SchemaResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryGb")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[SchemaVolume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

