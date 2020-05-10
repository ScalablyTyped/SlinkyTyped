package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISupport extends js.Object {
   // | () => boolean;
  var canTakeSnapshot: js.UndefOr[Boolean] = js.native
   // | () => boolean;
  var export: js.UndefOr[Boolean] = js.native
  var exportData: js.UndefOr[Boolean] = js.native
  var snapshot: js.UndefOr[Boolean] = js.native
}

object ISupport {
  @scala.inline
  def apply(): ISupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupport]
  }
  @scala.inline
  implicit class ISupportOps[Self <: ISupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanTakeSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTakeSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanTakeSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTakeSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withExportData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
  }
  
}

