package typingsSlinky.activexWord

import typingsSlinky.activexOffice.Office.MsoSyncEventType
import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSyncEventType extends js.Object {
  val Doc: Document = js.native
  val SyncEventType: MsoSyncEventType = js.native
}

object AnonSyncEventType {
  @scala.inline
  def apply(Doc: Document, SyncEventType: MsoSyncEventType): AnonSyncEventType = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSyncEventType]
  }
  @scala.inline
  implicit class AnonSyncEventTypeOps[Self <: AnonSyncEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncEventType(value: MsoSyncEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncEventType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

