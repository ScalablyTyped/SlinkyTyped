package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.avg
import typingsSlinky.devextreme.devextremeStrings.count
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.max
import typingsSlinky.devextreme.devextremeStrings.min
import typingsSlinky.devextreme.devextremeStrings.sum
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignByColumn extends js.Object {
  var alignByColumn: js.UndefOr[Boolean] = js.native
  var column: js.UndefOr[String] = js.native
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.native
  var displayFormat: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var showInColumn: js.UndefOr[String] = js.native
  var showInGroupFooter: js.UndefOr[Boolean] = js.native
  var skipEmptyValues: js.UndefOr[Boolean] = js.native
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.native
  var valueFormat: js.UndefOr[format] = js.native
}

object AlignByColumn {
  @scala.inline
  def apply(): AlignByColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignByColumn]
  }
  @scala.inline
  implicit class AlignByColumnOps[Self <: AlignByColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignByColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignByColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* itemInfo */ Value => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInGroupFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInGroupFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInGroupFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInGroupFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryType(value: avg | count | custom | max | min | sum | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.undefined)
        ret
    }
  }
  
}

