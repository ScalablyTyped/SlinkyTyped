package typingsSlinky.airtable.mod.global.Airtable

import typingsSlinky.airtable.airtableStrings.json
import typingsSlinky.airtable.airtableStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOptions extends js.Object {
  var cellFormat: js.UndefOr[json | string] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var filterByFormula: js.UndefOr[String] = js.native
  var maxRecords: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[SortParameter]] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var userLocale: js.UndefOr[String] = js.native
  var view: js.UndefOr[String] = js.native
}

object SelectOptions {
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellFormat(value: json | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterByFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterByFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterByFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterByFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[SortParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

