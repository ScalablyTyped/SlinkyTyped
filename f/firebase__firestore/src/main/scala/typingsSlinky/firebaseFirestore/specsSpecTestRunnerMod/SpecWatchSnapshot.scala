package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import typingsSlinky.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWatchSnapshot extends js.Object {
  var resumeToken: js.UndefOr[String] = js.native
  var targetIds: js.Array[TargetId] = js.native
  var version: TestSnapshotVersion = js.native
}

object SpecWatchSnapshot {
  @scala.inline
  def apply(targetIds: js.Array[TargetId], version: TestSnapshotVersion): SpecWatchSnapshot = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchSnapshot]
  }
  @scala.inline
  implicit class SpecWatchSnapshotOps[Self <: SpecWatchSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetIds(value: js.Array[TargetId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: TestSnapshotVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(js.undefined)
        ret
    }
  }
  
}

