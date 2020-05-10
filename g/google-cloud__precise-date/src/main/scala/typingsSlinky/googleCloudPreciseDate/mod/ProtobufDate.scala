package typingsSlinky.googleCloudPreciseDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtobufDate extends js.Object {
  var nanos: js.UndefOr[Double | String] = js.native
  var seconds: js.UndefOr[Double | String | Long] = js.native
}

object ProtobufDate {
  @scala.inline
  def apply(): ProtobufDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtobufDate]
  }
  @scala.inline
  implicit class ProtobufDateOps[Self <: ProtobufDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNanos(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: Double | String | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
  }
  
}

