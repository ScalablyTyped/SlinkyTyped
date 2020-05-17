package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialPageSetup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetModel extends js.Object {
  var autoFilter: AutoFilter = js.native
  var headerFooter: HeaderFooter = js.native
  var id: Double = js.native
  var media: js.Array[Media] = js.native
  var name: String = js.native
  var pageSetup: PartialPageSetup = js.native
  // dataValidations: this.dataValidations.model,
  var properties: WorksheetProperties = js.native
  var rowBreaks: js.Array[RowBreak] = js.native
  var views: js.Array[WorksheetView] = js.native
}

object WorksheetModel {
  @scala.inline
  def apply(
    autoFilter: AutoFilter,
    headerFooter: HeaderFooter,
    id: Double,
    media: js.Array[Media],
    name: String,
    pageSetup: PartialPageSetup,
    properties: WorksheetProperties,
    rowBreaks: js.Array[RowBreak],
    views: js.Array[WorksheetView]
  ): WorksheetModel = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], headerFooter = headerFooter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rowBreaks = rowBreaks.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetModel]
  }
  @scala.inline
  implicit class WorksheetModelOps[Self <: WorksheetModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFilter(value: AutoFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFooter(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSetup(value: PartialPageSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: WorksheetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowBreaks(value: js.Array[RowBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: js.Array[WorksheetView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

