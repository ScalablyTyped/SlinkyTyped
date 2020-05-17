package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.AddedItemsComponent
import typingsSlinky.devextreme.anon.ElementModelValue
import typingsSlinky.devextreme.anon.MultiTagElement
import typingsSlinky.devextreme.devextremeStrings.allPages
import typingsSlinky.devextreme.devextremeStrings.page
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTagBoxOptions extends dxSelectBoxOptions[dxTagBox] {
  /** A Boolean value specifying whether or not to hide selected items. */
  var hideSelectedItems: js.UndefOr[Boolean] = js.native
  /** Specifies the limit on displayed tags. On exceeding it, the widget replaces all tags with a single multi-tag that displays the number of selected items. */
  var maxDisplayedTags: js.UndefOr[Double] = js.native
  /** A Boolean value specifying whether or not the widget is multiline. */
  var multiline: js.UndefOr[Boolean] = js.native
  /** A function that is executed before the multi-tag is rendered. */
  var onMultiTagPreparing: js.UndefOr[js.Function1[/* e */ MultiTagElement, _]] = js.native
  /** A function that is executed when the "Select All" check box value is changed. Applies only if showSelectionControls is true. */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ ElementModelValue, _]] = js.native
  /** A function that is executed when a list item is selected or selection is canceled. */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTagBoxOptions: js.UndefOr[js.Function1[/* e */ AddedItemsComponent, _]] = js.native
  /** Specifies the mode in which all items are selected. */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  /** Gets the currently selected items. */
  var selectedItems: js.UndefOr[js.Array[String | Double | _]] = js.native
  /** Specifies whether the multi-tag is shown without ordinary tags. */
  var showMultiTagOnly: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for tags. */
  var tagTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies the selected items. */
  @JSName("value")
  var value_dxTagBoxOptions: js.UndefOr[js.Array[String | Double | _]] = js.native
}

object dxTagBoxOptions {
  @scala.inline
  def apply(): dxTagBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTagBoxOptions]
  }
  @scala.inline
  implicit class dxTagBoxOptionsOps[Self <: dxTagBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideSelectedItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDisplayedTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDisplayedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMultiTagPreparing(value: /* e */ MultiTagElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMultiTagPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMultiTagPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMultiTagPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAllValueChanged(value: /* e */ ElementModelValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAllValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAllValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AddedItemsComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllMode(value: allPages | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[String | Double | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMultiTagOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMultiTagOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMultiTagOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMultiTagOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTagTemplateFunction2(value: (/* itemData */ js.Any, /* itemElement */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTagTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[String | Double | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

