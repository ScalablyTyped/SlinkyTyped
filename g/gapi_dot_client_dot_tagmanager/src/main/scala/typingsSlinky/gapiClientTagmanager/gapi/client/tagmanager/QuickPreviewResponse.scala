package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickPreviewResponse extends js.Object {
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.native
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.native
}

object QuickPreviewResponse {
  @scala.inline
  def apply(): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPreviewResponse]
  }
  @scala.inline
  implicit class QuickPreviewResponseOps[Self <: QuickPreviewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilerError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerError")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersion(value: ContainerVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncStatus(value: SyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncStatus")(js.undefined)
        ret
    }
  }
  
}

