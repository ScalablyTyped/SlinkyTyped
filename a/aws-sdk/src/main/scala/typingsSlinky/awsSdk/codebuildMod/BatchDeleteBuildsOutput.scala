package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteBuildsOutput extends js.Object {
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.native
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.native
}

object BatchDeleteBuildsOutput {
  @scala.inline
  def apply(): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
  @scala.inline
  implicit class BatchDeleteBuildsOutputOps[Self <: BatchDeleteBuildsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildsDeleted(value: BuildIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildsDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildsNotDeleted(value: BuildsNotDeleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsNotDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildsNotDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsNotDeleted")(js.undefined)
        ret
    }
  }
  
}

