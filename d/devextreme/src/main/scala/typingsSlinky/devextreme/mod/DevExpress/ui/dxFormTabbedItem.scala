package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.AlignItemLabels
import typingsSlinky.devextreme.devextremeStrings.button
import typingsSlinky.devextreme.devextremeStrings.empty
import typingsSlinky.devextreme.devextremeStrings.group
import typingsSlinky.devextreme.devextremeStrings.simple
import typingsSlinky.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFormTabbedItem extends js.Object {
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.native
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies the item's type. Set it to "tabbed" to create a tabbed item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.native
  /** Holds a configuration object for the TabPanel widget used to display the current form item. */
  var tabPanelOptions: js.UndefOr[dxTabPanelOptions] = js.native
  /** An array of tab configuration objects. */
  var tabs: js.UndefOr[js.Array[AlignItemLabels]] = js.native
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.native
}

object dxFormTabbedItem {
  @scala.inline
  def apply(): dxFormTabbedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormTabbedItem]
  }
  @scala.inline
  implicit class dxFormTabbedItemOps[Self <: dxFormTabbedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
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
    def withItemType(value: empty | group | simple | tabbed | button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
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
    def withTabPanelOptions(value: dxTabPanelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPanelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabPanelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPanelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[AlignItemLabels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(js.undefined)
        ret
    }
  }
  
}

