package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Support extends js.Object {
  var export: SupportItem = js.native
  var exportData: SupportItem = js.native
  var snapshot: SupportItem | SnapshotLegacy = js.native
}

object Support {
  @scala.inline
  def apply(export: SupportItem, exportData: SupportItem, snapshot: SupportItem | SnapshotLegacy): Support = {
    val __obj = js.Dynamic.literal(export = export.asInstanceOf[js.Any], exportData = exportData.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportFunction1(value: /* layout */ Layout => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: SupportItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDataFunction1(value: /* layout */ Layout => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExportData(value: SupportItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotFunction1(value: /* layout */ Layout => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSnapshot(value: SupportItem | SnapshotLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

