package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.WorksheetState
import typingsSlinky.exceljs.mod.WorksheetView
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.AddWorksheetOptions> */
@js.native
trait PartialAddWorksheetOption extends js.Object {
  var pageSetup: js.UndefOr[PartialPageSetup] = js.native
  var properties: js.UndefOr[PartialWorksheetPropertie] = js.native
  var state: js.UndefOr[WorksheetState] = js.native
  var views: js.UndefOr[js.Array[Partial[WorksheetView]]] = js.native
}

object PartialAddWorksheetOption {
  @scala.inline
  def apply(): PartialAddWorksheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddWorksheetOption]
  }
  @scala.inline
  implicit class PartialAddWorksheetOptionOps[Self <: PartialAddWorksheetOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageSetup(value: PartialPageSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PartialWorksheetPropertie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WorksheetState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Array[Partial[WorksheetView]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

