package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionResponse extends js.Object {
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typingsSlinky.awsSdk.glueMod.Partition] = js.native
}

object GetPartitionResponse {
  @scala.inline
  def apply(): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionResponse]
  }
  @scala.inline
  implicit class GetPartitionResponseOps[Self <: GetPartitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartition(value: Partition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partition")(js.undefined)
        ret
    }
  }
  
}

