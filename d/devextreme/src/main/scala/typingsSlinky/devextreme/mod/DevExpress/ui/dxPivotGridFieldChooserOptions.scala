package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAllFields
import typingsSlinky.devextreme.AnonAreaComponent
import typingsSlinky.devextreme.AnonSearchTimeout
import typingsSlinky.devextreme.devextremeNumbers.`0`
import typingsSlinky.devextreme.devextremeNumbers.`1`
import typingsSlinky.devextreme.devextremeNumbers.`2`
import typingsSlinky.devextreme.devextremeStrings.instantly
import typingsSlinky.devextreme.devextremeStrings.onDemand
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridFieldChooserOptions extends WidgetOptions[dxPivotGridFieldChooser] {
  /** Specifies whether the field chooser allows searching in the "All Fields" section. */
  var allowSearch: js.UndefOr[Boolean] = js.native
  /** Specifies when to apply changes made in the widget to the PivotGrid. */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.native
  /** The data source of a PivotGrid widget. */
  var dataSource: js.UndefOr[PivotGridDataSource] = js.native
  /** Configures the header filter feature. */
  var headerFilter: js.UndefOr[AnonSearchTimeout] = js.native
  /** Specifies the field chooser layout. */
  var layout: js.UndefOr[`0` | `1` | `2`] = js.native
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonAreaComponent, _]] = js.native
  /** Specifies a delay in milliseconds between when a user finishes typing in the field chooser's search panel, and when the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.native
  /** The widget's state. */
  var state: js.UndefOr[js.Any] = js.native
  /** Strings that can be changed or localized in the PivotGridFieldChooser widget. */
  var texts: js.UndefOr[AnonAllFields] = js.native
}

object dxPivotGridFieldChooserOptions {
  @scala.inline
  def apply(): dxPivotGridFieldChooserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridFieldChooserOptions]
  }
  @scala.inline
  implicit class dxPivotGridFieldChooserOptionsOps[Self <: dxPivotGridFieldChooserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyChangesMode(value: instantly | onDemand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChangesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyChangesMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChangesMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: PivotGridDataSource): Self = {
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
    def withHeaderFilter(value: AnonSearchTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuPreparing(value: /* e */ AnonAreaComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
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
    def withTexts(value: AnonAllFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
  }
  
}

