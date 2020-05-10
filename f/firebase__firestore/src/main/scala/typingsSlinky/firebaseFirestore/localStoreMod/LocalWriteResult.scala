package typingsSlinky.firebaseFirestore.localStoreMod

import typingsSlinky.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.typesMod.BatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalWriteResult extends js.Object {
  var batchId: BatchId = js.native
  var changes: MaybeDocumentMap_ = js.native
}

object LocalWriteResult {
  @scala.inline
  def apply(batchId: BatchId, changes: MaybeDocumentMap_): LocalWriteResult = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalWriteResult]
  }
  @scala.inline
  implicit class LocalWriteResultOps[Self <: LocalWriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: BatchId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: MaybeDocumentMap_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

