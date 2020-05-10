package typingsSlinky.nodeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDOptions extends js.Object {
  /**
    * (Number between 0 - 0x3fff) RFC clock sequence.
    * Default: An internally maintained clockseq is used.
    */
  var clockseq: js.UndefOr[Double] = js.native
  /**
    * (Number | Date) Time in milliseconds since unix Epoch.
    * Default: The current time is used.
    */
  var msecs: js.UndefOr[Double | js.Date] = js.native
  /**
    * Node id as Array of 6 bytes (per 4.1.6).
    * Default: Randomly generated ID. See note 1.
    */
  var node: js.UndefOr[js.Array[_]] = js.native
  /**
    * (Number between 0-9999) additional time, in 100-nanosecond units. Ignored if msecs is unspecified.
    * Default: internal uuid counter is used, as per 4.2.1.2.
    */
  var nsecs: js.UndefOr[Double] = js.native
}

object UUIDOptions {
  @scala.inline
  def apply(): UUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UUIDOptions]
  }
  @scala.inline
  implicit class UUIDOptionsOps[Self <: UUIDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockseq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockseq")(js.undefined)
        ret
    }
    @scala.inline
    def withMsecsDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsecs(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsecs")(js.undefined)
        ret
    }
  }
  
}

