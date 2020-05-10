package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArchiveOldVersionsJob extends js.Object {
  var AtLeastNDaysOlder: Double = js.native
  var AtLeastNVersionsOlder: Double = js.native
  var CheckedInBefore: ITimestamp = js.native
  var Flags: MFExportContentFlag = js.native
  var Impersonation: IImpersonation = js.native
  var MarkedForArchiving: Boolean = js.native
  var NoVersionTag: Boolean = js.native
  var TargetLocation: String = js.native
  var UseAtLeastNDaysOlder: Boolean = js.native
  var UseAtLeastNVersionsOlder: Boolean = js.native
  var UseCheckedInBefore: Boolean = js.native
  def Clone(): IArchiveOldVersionsJob = js.native
}

object IArchiveOldVersionsJob {
  @scala.inline
  def apply(
    AtLeastNDaysOlder: Double,
    AtLeastNVersionsOlder: Double,
    CheckedInBefore: ITimestamp,
    Clone: () => IArchiveOldVersionsJob,
    Flags: MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: Boolean,
    NoVersionTag: Boolean,
    TargetLocation: String,
    UseAtLeastNDaysOlder: Boolean,
    UseAtLeastNVersionsOlder: Boolean,
    UseCheckedInBefore: Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder.asInstanceOf[js.Any], AtLeastNVersionsOlder = AtLeastNVersionsOlder.asInstanceOf[js.Any], CheckedInBefore = CheckedInBefore.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MarkedForArchiving = MarkedForArchiving.asInstanceOf[js.Any], NoVersionTag = NoVersionTag.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseAtLeastNDaysOlder = UseAtLeastNDaysOlder.asInstanceOf[js.Any], UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder.asInstanceOf[js.Any], UseCheckedInBefore = UseCheckedInBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
  @scala.inline
  implicit class IArchiveOldVersionsJobOps[Self <: IArchiveOldVersionsJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtLeastNDaysOlder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtLeastNDaysOlder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtLeastNVersionsOlder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtLeastNVersionsOlder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedInBefore(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedInBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IArchiveOldVersionsJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlags(value: MFExportContentFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpersonation(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkedForArchiving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkedForArchiving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoVersionTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoVersionTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseAtLeastNDaysOlder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAtLeastNDaysOlder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseAtLeastNVersionsOlder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAtLeastNVersionsOlder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCheckedInBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseCheckedInBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

