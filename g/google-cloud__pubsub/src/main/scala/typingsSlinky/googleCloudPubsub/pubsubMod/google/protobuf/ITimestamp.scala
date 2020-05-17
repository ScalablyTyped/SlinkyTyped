package typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf

import typingsSlinky.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Timestamp. */
@js.native
trait ITimestamp extends js.Object {
  /** Timestamp nanos */
  var nanos: js.UndefOr[Double | Null] = js.native
  /** Timestamp seconds */
  var seconds: js.UndefOr[Double | Long | Null] = js.native
}

object ITimestamp {
  @scala.inline
  def apply(): ITimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimestamp]
  }
  @scala.inline
  implicit class ITimestampOps[Self <: ITimestamp] (val x: Self) extends AnyVal {
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
    def withNanosNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(null)
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
    @scala.inline
    def withSecondsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(null)
        ret
    }
  }
  
}

