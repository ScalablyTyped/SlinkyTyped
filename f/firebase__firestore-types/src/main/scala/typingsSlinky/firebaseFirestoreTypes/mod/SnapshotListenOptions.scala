package typingsSlinky.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotListenOptions extends js.Object {
  val includeMetadataChanges: js.UndefOr[Boolean] = js.native
}

object SnapshotListenOptions {
  @scala.inline
  def apply(): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotListenOptions]
  }
  @scala.inline
  implicit class SnapshotListenOptionsOps[Self <: SnapshotListenOptions] (val x: Self) extends AnyVal {
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
  }
  
}

