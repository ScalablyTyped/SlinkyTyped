package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttResources extends js.Object {
  var dataColorField: js.UndefOr[String] = js.native
  var dataFormatField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataTextField: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
}

object GanttResources {
  @scala.inline
  def apply(): GanttResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttResources]
  }
  @scala.inline
  implicit class GanttResourcesOps[Self <: GanttResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataColorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataColorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataColorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataColorField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFormatField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormatField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormatField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormatField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTextField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTextField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTextField")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

