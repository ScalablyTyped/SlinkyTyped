package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.PartialPageSetup
import typingsSlinky.exceljs.PartialWorksheetPropertie
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddWorksheetOptions extends js.Object {
  var pageSetup: PartialPageSetup = js.native
  var properties: PartialWorksheetPropertie = js.native
  var state: WorksheetState = js.native
  var views: js.Array[Partial[WorksheetView]] = js.native
}

object AddWorksheetOptions {
  @scala.inline
  def apply(
    pageSetup: PartialPageSetup,
    properties: PartialWorksheetPropertie,
    state: WorksheetState,
    views: js.Array[Partial[WorksheetView]]
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal(pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWorksheetOptions]
  }
  @scala.inline
  implicit class AddWorksheetOptionsOps[Self <: AddWorksheetOptions] (val x: Self) extends AnyVal {
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
    def withProperties(value: PartialWorksheetPropertie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: WorksheetState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: js.Array[Partial[WorksheetView]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

