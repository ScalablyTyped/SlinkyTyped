package typingsSlinky.officeUiFabricReact.panelTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Classname for FocusTrapZone element
    */
  var focusTrapZoneClassName: js.UndefOr[String] = js.native
  /**
    * Panel has close button
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Determines where the header is rendered based on whether the user
    * has passed in a custom onRenderNavigation or onRenderNavigationContent render callback
    */
  var hasCustomNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * Is animation currently running
    */
  var isAnimating: js.UndefOr[Boolean] = js.native
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.native
  /**
    * Based on state value setting footer to sticky or not
    */
  var isFooterSticky: js.UndefOr[Boolean] = js.native
  /**
    * Is panel hidden on dismiss
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Is panel on right side
    */
  var isOnRightSide: js.UndefOr[Boolean] = js.native
  /**
    * Is Panel open
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
  /**
    * Type of the panel.
    */
  var `type`: js.UndefOr[PanelType] = js.native
}

object IPanelStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPanelStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyleProps]
  }
  @scala.inline
  implicit class IPanelStylePropsOps[Self <: IPanelStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTrapZoneClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapZoneClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusTrapZoneClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTrapZoneClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCustomNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCustomNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCustomNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCustomNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnimating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFooterAtBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterAtBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFooterAtBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterAtBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFooterSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFooterSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterSticky")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHiddenOnDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHiddenOnDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHiddenOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHiddenOnDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnRightSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnRightSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOnRightSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnRightSide")(js.undefined)
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
    def withType(value: PanelType): Self = {
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
  }
  
}

