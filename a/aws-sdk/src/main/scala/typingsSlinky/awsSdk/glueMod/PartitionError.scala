package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionError extends js.Object {
  /**
    * The details about the partition error.
    */
  var ErrorDetail: js.UndefOr[typingsSlinky.awsSdk.glueMod.ErrorDetail] = js.native
  /**
    * The values that define the partition.
    */
  var PartitionValues: js.UndefOr[ValueStringList] = js.native
}

object PartitionError {
  @scala.inline
  def apply(): PartitionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionError]
  }
  @scala.inline
  implicit class PartitionErrorOps[Self <: PartitionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetail(value: ErrorDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionValues(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionValues")(js.undefined)
        ret
    }
  }
  
}

