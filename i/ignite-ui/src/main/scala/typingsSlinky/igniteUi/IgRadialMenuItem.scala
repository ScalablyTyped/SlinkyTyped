package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialMenuItem
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Returns or sets a boolean indicating if the children should be rotated to align with the location of this element.
  	 */
  var autoRotateChildren: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating if the RecentItem property is updated when a child item is clicked.
  	 */
  var autoUpdateRecentItem: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a value indicating how the IsChecked property may be changed.
  	 *
  	 * Valid values:
  	 * "none" The item is not checkable
  	 * "checkBox" The item is checkable and may be independantly checked or unchecked without affecting other items.
  	 * "radioButton" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be unchecked.
  	 * "radioButtonAllowAllUp" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be checked allowing all items to be unchecked.
  	 */
  var checkBehavior: js.UndefOr[String] = js.native
  /**
  	 * Cancel="false" Occurs when the IsChecked is changed to true.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var checked: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the brush used for the arc displayed within the tool when checked.
  	 */
  var checkedHighlightBrush: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets an enumeration indicating where the child items are displayed.
  	 *
  	 * Valid values:
  	 * "asChildren" The Items are displayed within a separate level that is accessed by clicking on the button in the outer ring of the xamRadialMenu for the parent.
  	 * "asSiblingsWhenChecked" The items are displayed as siblings of the parent as long as the IsChecked is set to true.
  	 * "none" The child items are not displayed.
  	 */
  var childItemPlacement: js.UndefOr[String] = js.native
  /**
  	 * Cancel="false" Occurs when the item area is clicked.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var click: js.UndefOr[js.Any] = js.native
  /**
  	 * Cancel="false" Invoked when one navigates back to the item after viewing the child items.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var closed: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the color that the item represents.
  	 * Note: When the Color property is set, several of the brush properties are changed.
  	 */
  var color: js.UndefOr[js.Any] = js.native
  /**
  	 * Cancel="false" Event invoked when the Color property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var colorChanged: js.UndefOr[js.Any] = js.native
  /**
  	 * Cancel="false" Occurs when the item area of a descendant color well is clicked.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var colorWellClick: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the foreground for the inner area of the item.
  	 */
  var foreground: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the name used to identify which RadioButton type items will be grouped together when determining the item to uncheck when the item is checked.
  	 */
  var groupName: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the header of the menu item.
  	 */
  var header: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the brush used for the arc displayed within the tool when hot tracked.
  	 */
  var highlightBrush: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the uri of the image for the item.
  	 */
  var iconUri: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the background of the inner area of the menu item.
  	 */
  var innerAreaFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the background of the inner area of the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item.
  	 */
  var innerAreaStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the thickness of the border for the inner area for the menu item.
  	 */
  var innerAreaStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets a boolean indicating if the item is displayed as checked.
  	 */
  var isChecked: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the item is enabled.
  	 */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating if a tooltip may be displayed for the item.
  	 */
  var isToolTipEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the unique name of the item within the menu.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Cancel="false" Invoked when one navigates to the view the child items.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var opened: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the default background of the button within the outer ring for a menu item.
  	 */
  var outerRingButtonFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the foreground of the buttons in the outer ring of the menu.
  	 */
  var outerRingButtonForeground: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the background of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the foreground of the buttons in the outer ring of the menu that is under the pointer.
  	 */
  var outerRingButtonHotTrackForeground: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item.
  	 */
  var outerRingButtonStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the width of the outline of a button in the outer ring of the menu.
  	 */
  var outerRingButtonStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the value while the user is interacting with the element.
  	 */
  var pendingValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Cancel="false" Event invoked when the PendingValue property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var pendingValueChanged: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the brush used to render the line that represents the PendingValue
  	 */
  var pendingValueNeedleBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the name of the child item that represents the most recently interacted with item. Note other item properties may be set to "{RecentItem}" to have them automatically set to values of the associated recent child item.
  	 */
  var recentItemName: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets a boolean indicating whether space should be left before the first tickmark.
  	 */
  var reserveFirstSlice: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets the amount that the PendingValue should be adjusted when incrementing or decrementing the value.
  	 */
  var smallIncrement: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the brush used to render the tick marks.
  	 */
  var tickBrush: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the values of the ticks.
  	 */
  var ticks: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the tooltip to be displayed for the radial menu item.
  	 */
  var toolTip: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the ending color for the track.
  	 */
  var trackEndColor: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the starting color for the track.
  	 */
  var trackStartColor: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets a value indicating what type of item is being provided.
  	 *
  	 *
  	 * Valid values:
  	 * "button"
  	 * "coloritem"
  	 * "colorwell"
  	 * "list"
  	 * "numericitem"
  	 * "numericgauge"
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Cancel="false" Occurs when the IsChecked is changed to false.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var unchecked: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the value of the numeric item.
  	 */
  var value: js.UndefOr[Double] = js.native
  /**
  	 * Cancel="false" Event invoked when the Value property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var valueChanged: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the brush used to represent the Value
  	 */
  var valueNeedleBrush: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the wedge at which the item should be positioned.
  	 */
  var wedgeIndex: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the number of wedges that the item should occupy.
  	 */
  var wedgeSpan: js.UndefOr[Double] = js.native
}

object IgRadialMenuItem {
  @scala.inline
  def apply(): IgRadialMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialMenuItem]
  }
  @scala.inline
  implicit class IgRadialMenuItemOps[Self <: IgRadialMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRotateChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotateChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRotateChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotateChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateRecentItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateRecentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateRecentItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateRecentItem")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedHighlightBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedHighlightBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedHighlightBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedHighlightBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withChildItemPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItemPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildItemPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItemPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorChanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withColorWellClick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorWellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerAreaFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerAreaFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaFill")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerAreaHotTrackFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaHotTrackFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerAreaHotTrackFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaHotTrackFill")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerAreaHotTrackStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaHotTrackStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerAreaHotTrackStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaHotTrackStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerAreaStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerAreaStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerAreaStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerAreaStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerAreaStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsToolTipEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolTipEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsToolTipEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolTipEnabled")(js.undefined)
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
    def withOpened(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonFill")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonHotTrackFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonHotTrackFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackFill")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonHotTrackForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonHotTrackForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonHotTrackStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonHotTrackStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonHotTrackStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingButtonStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingButtonStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingButtonStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingValueChanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingValueNeedleBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValueNeedleBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingValueNeedleBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingValueNeedleBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentItemName")(js.undefined)
        ret
    }
    @scala.inline
    def withReserveFirstSlice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveFirstSlice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserveFirstSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveFirstSlice")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withTickBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackEndColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEndColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackEndColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEndColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStartColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStartColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStartColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStartColor")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    @scala.inline
    def withUnchecked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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
    @scala.inline
    def withValueChanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNeedleBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNeedleBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueNeedleBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNeedleBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withWedgeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWedgeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWedgeSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgeSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWedgeSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgeSpan")(js.undefined)
        ret
    }
  }
  
}

