package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Runtime object, for use in `runtime.set({ ... })`. */
@js.native
trait RuntimeUpdateData extends js.Object {
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}

object RuntimeUpdateData {
  @scala.inline
  def apply(): RuntimeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeUpdateData]
  }
  @scala.inline
  implicit class RuntimeUpdateDataOps[Self <: RuntimeUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEvents")(js.undefined)
        ret
    }
  }
  
}

