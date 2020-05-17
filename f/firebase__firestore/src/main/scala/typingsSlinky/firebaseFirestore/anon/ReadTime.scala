package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadTime extends js.Object {
  var changedDocs: MaybeDocumentMap_ = js.native
  var readTime: SnapshotVersion = js.native
}

object ReadTime {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap_, readTime: SnapshotVersion): ReadTime = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadTime]
  }
  @scala.inline
  implicit class ReadTimeOps[Self <: ReadTime] (val x: Self) extends AnyVal {
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

