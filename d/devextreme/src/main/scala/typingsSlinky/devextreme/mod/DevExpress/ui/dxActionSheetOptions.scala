package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ElementModel
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxActionSheetOptions extends CollectionWidgetOptions[dxActionSheet] {
  /** The text displayed in the button that closes the action sheet. */
  var cancelText: js.UndefOr[String] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxActionSheetOptions: js.UndefOr[
    String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxActionSheetOptions: js.UndefOr[js.Array[String | dxActionSheetItem | _]] = js.native
  /** A function that is executed when the Cancel button is clicked or tapped. */
  var onCancelClick: js.UndefOr[(js.Function1[/* e */ ElementModel, _]) | String] = js.native
  /** Specifies whether or not to display the Cancel button in action sheet. */
  var showCancelButton: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not the title of the action sheet is visible. */
  var showTitle: js.UndefOr[Boolean] = js.native
  /** Specifies the element the action sheet popover points at. Applies only if usePopover is true. */
  var target: js.UndefOr[String | Element | JQuery] = js.native
  /** The title of the action sheet. */
  var title: js.UndefOr[String] = js.native
  /** Specifies whether or not to show the action sheet within a Popover widget. */
  var usePopover: js.UndefOr[Boolean] = js.native
}

object dxActionSheetOptions {
  @scala.inline
  def apply(): dxActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetOptions]
  }
  @scala.inline
  implicit class dxActionSheetOptionsOps[Self <: dxActionSheetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withItems(value: js.Array[String | dxActionSheetItem | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancelClickFunction1(value: /* e */ ElementModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancelClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCancelClick(value: (js.Function1[/* e */ ElementModel, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancelClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCancelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePopover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(js.undefined)
        ret
    }
  }
  
}

