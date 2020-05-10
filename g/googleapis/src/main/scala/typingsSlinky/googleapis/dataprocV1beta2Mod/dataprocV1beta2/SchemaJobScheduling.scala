package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job scheduling options.
  */
@js.native
trait SchemaJobScheduling extends js.Object {
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a
    * result of driver terminating with non-zero code before job is reported
    * failed.A job may be reported as thrashing if driver exits with non-zero
    * code 4 times within 10 minute window.Maximum value is 10.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.native
}

object SchemaJobScheduling {
  @scala.inline
  def apply(): SchemaJobScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobScheduling]
  }
  @scala.inline
  implicit class SchemaJobSchedulingOps[Self <: SchemaJobScheduling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxFailuresPerHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailuresPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFailuresPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailuresPerHour")(js.undefined)
        ret
    }
  }
  
}

