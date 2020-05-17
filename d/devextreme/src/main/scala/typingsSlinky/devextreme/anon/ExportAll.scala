package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAll extends js.Object {
  var exportAll: js.UndefOr[String] = js.native
  var exportSelectedRows: js.UndefOr[String] = js.native
  var exportTo: js.UndefOr[String] = js.native
}

object ExportAll {
  @scala.inline
  def apply(): ExportAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAll]
  }
  @scala.inline
  implicit class ExportAllOps[Self <: ExportAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSelectedRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSelectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withExportTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportTo")(js.undefined)
        ret
    }
  }
  
}

