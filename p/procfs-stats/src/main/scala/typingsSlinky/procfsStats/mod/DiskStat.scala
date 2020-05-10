package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskStat extends js.Object {
  var device: String = js.native
  var device_number: String = js.native
  var device_number_minor: String = js.native
  var ios_pending: String = js.native
  var ms_io: String = js.native
  var ms_reading: String = js.native
  var ms_weighted_io: String = js.native
  var ms_writing: String = js.native
  var reads_completed: String = js.native
  var reads_merged: String = js.native
  var sectors_read: String = js.native
  var sectors_written: String = js.native
  var writes_completed: String = js.native
  var writes_merged: String = js.native
}

object DiskStat {
  @scala.inline
  def apply(
    device: String,
    device_number: String,
    device_number_minor: String,
    ios_pending: String,
    ms_io: String,
    ms_reading: String,
    ms_weighted_io: String,
    ms_writing: String,
    reads_completed: String,
    reads_merged: String,
    sectors_read: String,
    sectors_written: String,
    writes_completed: String,
    writes_merged: String
  ): DiskStat = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], device_number = device_number.asInstanceOf[js.Any], device_number_minor = device_number_minor.asInstanceOf[js.Any], ios_pending = ios_pending.asInstanceOf[js.Any], ms_io = ms_io.asInstanceOf[js.Any], ms_reading = ms_reading.asInstanceOf[js.Any], ms_weighted_io = ms_weighted_io.asInstanceOf[js.Any], ms_writing = ms_writing.asInstanceOf[js.Any], reads_completed = reads_completed.asInstanceOf[js.Any], reads_merged = reads_merged.asInstanceOf[js.Any], sectors_read = sectors_read.asInstanceOf[js.Any], sectors_written = sectors_written.asInstanceOf[js.Any], writes_completed = writes_completed.asInstanceOf[js.Any], writes_merged = writes_merged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskStat]
  }
  @scala.inline
  implicit class DiskStatOps[Self <: DiskStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice_number_minor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_number_minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos_pending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMs_io(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms_io")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMs_reading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms_reading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMs_weighted_io(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms_weighted_io")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMs_writing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms_writing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReads_completed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reads_completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReads_merged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reads_merged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectors_read(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectors_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectors_written(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectors_written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrites_completed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes_completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrites_merged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes_merged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

