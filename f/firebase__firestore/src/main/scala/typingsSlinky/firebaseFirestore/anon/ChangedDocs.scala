package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedDocs extends js.Object {
  var changedDocs: MaybeDocumentMap_ = js.native
  var readTime: SnapshotVersion = js.native
}

object ChangedDocs {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap_, readTime: SnapshotVersion): ChangedDocs = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedDocs]
  }
  @scala.inline
  implicit class ChangedDocsOps[Self <: ChangedDocs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedDocs(value: MaybeDocumentMap_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadTime(value: SnapshotVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

