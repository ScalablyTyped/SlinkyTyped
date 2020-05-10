package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptionsStatus extends js.Object {
  /**
    * Specifies the daily snapshot options specified for the Elasticsearch domain.
    */
  var Options: SnapshotOptions = js.native
  /**
    * Specifies the status of a daily automated snapshot.
    */
  var Status: OptionStatus = js.native
}

object SnapshotOptionsStatus {
  @scala.inline
  def apply(Options: SnapshotOptions, Status: OptionStatus): SnapshotOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptionsStatus]
  }
  @scala.inline
  implicit class SnapshotOptionsStatusOps[Self <: SnapshotOptionsStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: SnapshotOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: OptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

