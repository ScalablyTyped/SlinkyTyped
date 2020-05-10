package typingsSlinky.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnSettings extends js.Object {
  /** Field and Header Text collections can be defined and customized through columns field.
    */
  var columns: js.UndefOr[js.Array[MultiColumnSettingsColumn]] = js.native
  /** Allow list of data to be displayed in several columns.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** This property allows user to search text for any number of fields in the suggestion list without modifying the selected text format.
    */
  var searchColumnIndices: js.UndefOr[js.Array[_]] = js.native
  /** Allow header text to be displayed in corresponding columns.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Displayed selected value and autocomplete search based on mentioned column value specified in that format.
    */
  var stringFormat: js.UndefOr[String] = js.native
}

object MultiColumnSettings {
  @scala.inline
  def apply(): MultiColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnSettings]
  }
  @scala.inline
  implicit class MultiColumnSettingsOps[Self <: MultiColumnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[MultiColumnSettingsColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchColumnIndices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchColumnIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchColumnIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchColumnIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStringFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringFormat")(js.undefined)
        ret
    }
  }
  
}

