package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of the worker VM.
  */
@js.native
trait SchemaWorkerStatus extends js.Object {
  /**
    * Status of attached disks.
    */
  var attachedDisks: js.UndefOr[StringDictionary[SchemaDiskStatus]] = js.native
  /**
    * Status of the boot disk.
    */
  var bootDisk: js.UndefOr[SchemaDiskStatus] = js.native
  /**
    * Free RAM.
    */
  var freeRamBytes: js.UndefOr[String] = js.native
  /**
    * Total RAM.
    */
  var totalRamBytes: js.UndefOr[String] = js.native
  /**
    * System uptime.
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}

object SchemaWorkerStatus {
  @scala.inline
  def apply(): SchemaWorkerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerStatus]
  }
  @scala.inline
  implicit class SchemaWorkerStatusOps[Self <: SchemaWorkerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedDisks(value: StringDictionary[SchemaDiskStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withBootDisk(value: SchemaDiskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeRamBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeRamBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeRamBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeRamBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRamBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRamBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRamBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRamBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUptimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUptimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeSeconds")(js.undefined)
        ret
    }
  }
  
}

