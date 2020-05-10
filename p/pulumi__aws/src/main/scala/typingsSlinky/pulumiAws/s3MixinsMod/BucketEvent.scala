package typingsSlinky.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEvent extends js.Object {
  var Records: js.UndefOr[js.Array[BucketRecord]] = js.native
}

object BucketEvent {
  @scala.inline
  def apply(): BucketEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketEvent]
  }
  @scala.inline
  implicit class BucketEventOps[Self <: BucketEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[BucketRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(js.undefined)
        ret
    }
  }
  
}

