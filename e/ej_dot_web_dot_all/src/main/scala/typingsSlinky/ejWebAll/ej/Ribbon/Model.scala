package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables the ribbon resize feature.allowResizing is a deprecated property of isResponsive.
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Specifies the application tab to contain application menu or backstage page in the ribbon control.
    * @Default {Object}
    */
  var applicationTab: js.UndefOr[ApplicationTab] = js.native
  /** Triggered when a tab or button in the backstage page is clicked successfully.
    */
  var backstageItemClick: js.UndefOr[js.Function1[/* e */ BackstageItemClickEventArgs, Unit]] = js.native
  /** Triggered before the ribbon tab item is removed.
    */
  var beforeTabRemove: js.UndefOr[js.Function1[/* e */ BeforeTabRemoveEventArgs, Unit]] = js.native
  /** Specifies the height, width, enableRTL, showRoundedCorner,enabled,cssClass property to the controls in the ribbon commonly andit will work only when those properties are not
    * defined in buttonSettings and content defaults.
    * @Default {Object}
    */
  var buttonDefaults: js.UndefOr[js.Any] = js.native
  /** Triggered when the ribbon control is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.native
  /** Sets custom setting to the collapsible pin in the ribbon.
    * @Default {Object}
    */
  var collapsePinSettings: js.UndefOr[CollapsePinSettings] = js.native
  /** Set collapsible property as true to render ribbon in initially collapsed state.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Specifies the contextual tabs and tab set to the ribbon control with the background color and border color. Refer to the tabs section for adding tabs into the contextual tab and
    * contextual tab set.
    * @Default {Array}
    */
  var contextualTabs: js.UndefOr[js.Array[ContextualTab]] = js.native
  /** Triggered before the ribbon control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Ribbon which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered before the ribbon control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the index or indexes to disable the given index tab or indexes tabs in the ribbon control.
    * @Default {0}
    */
  var disabledItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Set enableOnDemand as true to load ribbon tab and backstage contents while corresponding item clicked.
    * @Default {false}
    */
  var enableOnDemand: js.UndefOr[Boolean] = js.native
  /** Align content in the ribbon control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the index or indexes to enable the given index tab or indexes tabs in the ribbon control.
    * @Default {null}
    */
  var enabledItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Triggered when the ribbon control is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.native
  /** Sets custom setting to the expandable pin in the ribbon.
    * @Default {Object}
    */
  var expandPinSettings: js.UndefOr[ExpandPinSettings] = js.native
  /** Triggered when an item in the Gallery control is clicked successfully.
    */
  var galleryItemClick: js.UndefOr[js.Function1[/* e */ GalleryItemClickEventArgs, Unit]] = js.native
  /** Triggered when the control in the group is clicked successfully.
    */
  var groupClick: js.UndefOr[js.Function1[/* e */ GroupClickEventArgs, Unit]] = js.native
  /** Triggered when the group expander in the group is clicked successfully.
    */
  var groupExpand: js.UndefOr[js.Function1[/* e */ GroupExpandEventArgs, Unit]] = js.native
  /** When set to true, adapts the Ribbon layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggered before the ribbon control is load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region and  it will need to use the user's preference.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggered when the QAT menu item is clicked successfully .
    */
  var qatMenuItemClick: js.UndefOr[js.Function1[/* e */ QatMenuItemClickEventArgs, Unit]] = js.native
  /** Specifies the index of the ribbon tab to select the given index tab item in the ribbon control.
    * @Default {1}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Property to enable the ribbon quick access toolbar.
    * @Default {false}
    */
  var showQAT: js.UndefOr[Boolean] = js.native
  /** Triggered after adding the new ribbon tab item.
    */
  var tabAdd: js.UndefOr[js.Function1[/* e */ TabAddEventArgs, Unit]] = js.native
  /** Triggered when tab is clicked successfully in the ribbon control.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.native
  /** Triggered before the ribbon tab is created.
    */
  var tabCreate: js.UndefOr[js.Function1[/* e */ TabCreateEventArgs, Unit]] = js.native
  /** Triggered after the tab item is removed from the ribbon control.
    */
  var tabRemove: js.UndefOr[js.Function1[/* e */ TabRemoveEventArgs, Unit]] = js.native
  /** Triggered after the ribbon tab item is selected in the ribbon control.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.native
  /** Specifies the tabs and its groups. Also specifies the control details that has to be placed in the tab area in the ribbon control.
    * @Default {Array}
    */
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  /** Triggered when the expand/collapse button is clicked successfully .
    */
  var toggleButtonClick: js.UndefOr[js.Function1[/* e */ ToggleButtonClickEventArgs, Unit]] = js.native
  /** Specifies the width to the ribbon control. You can set width in string or number format.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationTab(value: ApplicationTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationTab")(js.undefined)
        ret
    }
    @scala.inline
    def withBackstageItemClick(value: /* e */ BackstageItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstageItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBackstageItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstageItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTabRemove(value: /* e */ BeforeTabRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTabRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeTabRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTabRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: /* e */ CollapseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsePinSettings(value: CollapsePinSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsePinSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsePinSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsePinSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withContextualTabs(value: js.Array[ContextualTab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
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
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledItemIndex(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledItemIndex(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: /* e */ ExpandEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandPinSettings(value: ExpandPinSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPinSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandPinSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPinSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryItemClick(value: /* e */ GalleryItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGalleryItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupClick(value: /* e */ GroupClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClick")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpand(value: /* e */ GroupExpandEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withQatMenuItemClick(value: /* e */ QatMenuItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qatMenuItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQatMenuItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qatMenuItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShowQAT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowQAT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQAT")(js.undefined)
        ret
    }
    @scala.inline
    def withTabAdd(value: /* e */ TabAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withTabClick(value: /* e */ TabClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTabCreate(value: /* e */ TabCreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withTabRemove(value: /* e */ TabRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[Tab]): Self = {
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
    def withToggleButtonClick(value: /* e */ ToggleButtonClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

