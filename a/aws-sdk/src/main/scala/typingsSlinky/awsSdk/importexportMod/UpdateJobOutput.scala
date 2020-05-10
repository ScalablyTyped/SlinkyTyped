package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ArtifactList] = js.native
  var Success: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Success] = js.native
  var WarningMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.WarningMessage] = js.native
}

object UpdateJobOutput {
  @scala.inline
  def apply(): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobOutput]
  }
  @scala.inline
  implicit class UpdateJobOutputOps[Self <: UpdateJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactList(value: ArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtifactList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtifactList")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningMessage(value: WarningMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(js.undefined)
        ret
    }
  }
  
}

