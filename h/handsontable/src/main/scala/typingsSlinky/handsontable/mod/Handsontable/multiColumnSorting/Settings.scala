package typingsSlinky.handsontable.mod.Handsontable.multiColumnSorting

import typingsSlinky.handsontable.handsontableNumbers.`-1`
import typingsSlinky.handsontable.handsontableNumbers.`0`
import typingsSlinky.handsontable.handsontableNumbers.`1`
import typingsSlinky.handsontable.mod.Handsontable.GridSettings
import typingsSlinky.handsontable.mod.Handsontable.columnSorting.Config
import typingsSlinky.handsontable.mod.Handsontable.columnSorting.SortOrderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var compareFunctionFactory: js.UndefOr[
    js.Function2[
      /* sortOrder */ SortOrderType, 
      /* columnMeta */ GridSettings, 
      js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ]
  ] = js.native
  var headerAction: js.UndefOr[Boolean] = js.native
  var indicator: js.UndefOr[Boolean] = js.native
  var initialConfig: js.UndefOr[Config | js.Array[Config]] = js.native
  var sortEmptyCells: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareFunctionFactory(
      value: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunctionFactory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompareFunctionFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunctionFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAction")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialConfig(value: Config | js.Array[Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSortEmptyCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEmptyCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortEmptyCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEmptyCells")(js.undefined)
        ret
    }
  }
  
}

