package typingsSlinky.activexWord

import typingsSlinky.activexOffice.Office.MsoSyncEventType
import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyncEventType extends js.Object {
  val Doc: Document
  val SyncEventType: MsoSyncEventType
}

object AnonSyncEventType {
  @scala.inline
  def apply(Doc: Document, SyncEventType: MsoSyncEventType): AnonSyncEventType = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSyncEventType]
  }
}

