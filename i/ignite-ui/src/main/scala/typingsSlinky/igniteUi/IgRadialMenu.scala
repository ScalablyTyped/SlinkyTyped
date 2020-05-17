package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialMenu
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is false.
  	 */
  var centerButtonClosedFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen property is false.
  	 */
  var centerButtonClosedStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the height of the center button content.
  	 */
  var centerButtonContentHeight: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the width of the center button content.
  	 */
  var centerButtonContentWidth: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the background of the center button of the menu when the IsOpen property is true.
  	 */
  var centerButtonFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the background of the center button of the menu when under the pointer.
  	 */
  var centerButtonHotTrackFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when under the pointer.
  	 */
  var centerButtonHotTrackStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen is true.
  	 */
  var centerButtonStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the width of the outline of the inner rings of the menu.
  	 */
  var centerButtonStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Invoked when the IsOpen property is changed to false.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var closed: js.UndefOr[ClosedEvent] = js.native
  /**
  	 * Gets or sets the name of the item within the menu whose children are currently displayed.
  	 */
  var currentOpenMenuItemName: js.UndefOr[String] = js.native
  /**
  	 * The font for the control
  	 */
  var font: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the items of the menu are currently displayed. When closed, only the center button is rendered.
  	 */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the items in the menu.
  	 */
  var items: js.UndefOr[js.Array[IgRadialMenuItem]] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the brush for the backing of the radial menu.
  	 */
  var menuBackground: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuItemOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the duration of the animation performed when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
  	 */
  var menuOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the minimum number of wedges displayed by the menu.
  	 */
  var minWedgeCount: js.UndefOr[Double] = js.native
  /**
  	 * Invoked when the IsOpen property is changed to true.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 */
  var opened: js.UndefOr[OpenedEvent] = js.native
  /**
  	 * Returns or sets the background of the outer ring of the menu.
  	 */
  var outerRingFill: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the brush used for the outline of the outer ring.
  	 */
  var outerRingStroke: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the width of the outline of the outer ring of the menu.
  	 */
  var outerRingStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the thickness of the outer ring of the menu.
  	 */
  var outerRingThickness: js.UndefOr[Double] = js.native
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Returns or sets the starting angle of the items expressed as the percentage of the width of a single wedge/slice.
  	 */
  var rotationAsPercentageOfWedge: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the starting angle of the items in degrees.
  	 */
  var rotationInDegrees: js.UndefOr[Double] = js.native
  /**
  	 * Returns or sets the amount of padding around each wedge in degrees.
  	 */
  var wedgePaddingInDegrees: js.UndefOr[Double] = js.native
}

object IgRadialMenu {
  @scala.inline
  def apply(): IgRadialMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialMenu]
  }
  @scala.inline
  implicit class IgRadialMenuOps[Self <: IgRadialMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterButtonClosedFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonClosedFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonClosedFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonClosedFill")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonClosedStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonClosedStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonClosedStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonClosedStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonContentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonContentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonContentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonContentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonContentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonFill")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonHotTrackFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHotTrackFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonHotTrackFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHotTrackFill")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonHotTrackStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHotTrackStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonHotTrackStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHotTrackStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: (/* event */ Event, /* ui */ ClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentOpenMenuItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOpenMenuItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentOpenMenuItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOpenMenuItemName")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IgRadialMenuItem]): Self = {
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withMenuBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemOpenCloseAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemOpenCloseAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemOpenCloseAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemOpenCloseAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemOpenCloseAnimationEasingFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemOpenCloseAnimationEasingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemOpenCloseAnimationEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemOpenCloseAnimationEasingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuOpenCloseAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpenCloseAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuOpenCloseAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpenCloseAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuOpenCloseAnimationEasingFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpenCloseAnimationEasingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuOpenCloseAnimationEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpenCloseAnimationEasingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWedgeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWedgeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWedgeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWedgeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: (/* event */ Event, /* ui */ OpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingFill")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRingThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRingThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRingThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAsPercentageOfWedge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAsPercentageOfWedge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAsPercentageOfWedge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAsPercentageOfWedge")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationInDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationInDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationInDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationInDegrees")(js.undefined)
        ret
    }
    @scala.inline
    def withWedgePaddingInDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgePaddingInDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWedgePaddingInDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wedgePaddingInDegrees")(js.undefined)
        ret
    }
  }
  
}

