package typingsSlinky.firebaseFirestore.eventManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenOptions extends js.Object {
  /** Raise events even when only the metadata changes */
  val includeMetadataChanges: js.UndefOr[Boolean] = js.native
  /**
    * Wait for a sync with the server when online, but still raise events while
    * offline.
    */
  val waitForSyncWhenOnline: js.UndefOr[Boolean] = js.native
}

object ListenOptions {
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  @scala.inline
  implicit class ListenOptionsOps[Self <: ListenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeMetadataChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadataChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMetadataChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadataChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSyncWhenOnline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSyncWhenOnline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSyncWhenOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSyncWhenOnline")(js.undefined)
        ret
    }
  }
  
}

