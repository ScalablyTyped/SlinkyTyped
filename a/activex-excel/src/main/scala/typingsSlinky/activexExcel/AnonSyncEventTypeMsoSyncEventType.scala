package typingsSlinky.activexExcel

import typingsSlinky.activexOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSyncEventTypeMsoSyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType = js.native
}

object AnonSyncEventTypeMsoSyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType): AnonSyncEventTypeMsoSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSyncEventTypeMsoSyncEventType]
  }
  @scala.inline
  implicit class AnonSyncEventTypeMsoSyncEventTypeOps[Self <: AnonSyncEventTypeMsoSyncEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncEventType(value: MsoSyncEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncEventType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

