package typingsSlinky.ejWebAll.ej.Autocomplete

import typingsSlinky.ejWebAll.ej.TextAlign
import typingsSlinky.ejWebAll.ej.Type
import typingsSlinky.ejWebAll.ej.filterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnSettingsColumn extends js.Object {
  /** Gets or sets a value that indicates to render the multicolumn with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Get or set a value that indicates to display the columns in the autocomplete mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.native
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[typingsSlinky.ejWebAll.ej.filterType | String] = js.native
  /** Get or set a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.native
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Specifies the search data type. There are four types of data types available such as string, â€˜numberâ€™, â€˜booleanâ€™ and â€˜dateâ€™.
    * @Default {ej.Type.String}
    */
  var `type`: js.UndefOr[Type | String] = js.native
}

object MultiColumnSettingsColumn {
  @scala.inline
  def apply(): MultiColumnSettingsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnSettingsColumn]
  }
  @scala.inline
  implicit class MultiColumnSettingsColumnOps[Self <: MultiColumnSettingsColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
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
    @scala.inline
    def withFilterType(value: filterType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

