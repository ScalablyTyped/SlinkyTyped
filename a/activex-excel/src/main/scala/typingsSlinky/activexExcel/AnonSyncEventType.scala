package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Workbook
import typingsSlinky.activexOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType = js.native
  val Wb: Workbook = js.native
}

object AnonSyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType, Wb: Workbook): AnonSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSyncEventType]
  }
  @scala.inline
  implicit class AnonSyncEventTypeOps[Self <: AnonSyncEventType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withWb(value: Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

