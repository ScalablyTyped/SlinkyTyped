package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWriteAck extends js.Object {
  /**
    * Whether we should keep the write in our internal queue. This should only
    * be set to 'true' if the client ignores the write (e.g. a secondary client
    * which ignores write acknowledgments).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.native
  /** The version the backend uses to ack the write. */
  var version: TestSnapshotVersion = js.native
}

object SpecWriteAck {
  @scala.inline
  def apply(version: TestSnapshotVersion): SpecWriteAck = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteAck]
  }
  @scala.inline
  implicit class SpecWriteAckOps[Self <: SpecWriteAck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: TestSnapshotVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepInQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(js.undefined)
        ret
    }
  }
  
}

