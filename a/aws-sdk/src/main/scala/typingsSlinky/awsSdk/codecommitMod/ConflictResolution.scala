package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConflictResolution extends js.Object {
  /**
    * Files to be deleted as part of the merge conflict resolution.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.native
  /**
    * Files to have content replaced as part of the merge conflict resolution.
    */
  var replaceContents: js.UndefOr[ReplaceContentEntries] = js.native
  /**
    * File modes that are set as part of the merge conflict resolution.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.native
}

object ConflictResolution {
  @scala.inline
  def apply(): ConflictResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictResolution]
  }
  @scala.inline
  implicit class ConflictResolutionOps[Self <: ConflictResolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteFiles(value: DeleteFileEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceContents(value: ReplaceContentEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceContents")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFileModes(value: SetFileModeEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetFileModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileModes")(js.undefined)
        ret
    }
  }
  
}

