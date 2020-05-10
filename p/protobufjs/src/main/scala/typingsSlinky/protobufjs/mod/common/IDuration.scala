package typingsSlinky.protobufjs.mod.common

import typingsSlinky.protobufjs.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Duration message. */
@js.native
trait IDuration extends js.Object {
  var nanos: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double | Long] = js.native
}

object IDuration {
  @scala.inline
  def apply(): IDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDuration]
  }
  @scala.inline
  implicit class IDurationOps[Self <: IDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNanos(value: Double): Self = {
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
    def withSeconds(value: Double | Long): Self = {
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

