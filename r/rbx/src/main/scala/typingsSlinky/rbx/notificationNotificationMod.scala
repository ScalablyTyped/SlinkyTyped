package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.BinVariablesbreakpointsLi
import typingsSlinky.rbx.anon.KinVariablesbreakpointsto
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxStrings.`black-bis`
import typingsSlinky.rbx.rbxStrings.`black-ter`
import typingsSlinky.rbx.rbxStrings.`grey-dark`
import typingsSlinky.rbx.rbxStrings.`grey-darker`
import typingsSlinky.rbx.rbxStrings.`grey-light`
import typingsSlinky.rbx.rbxStrings.`grey-lighter`
import typingsSlinky.rbx.rbxStrings.`white-bis`
import typingsSlinky.rbx.rbxStrings.`white-ter`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bold
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.capitalized
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.grey
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.lowercase
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.semibold
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.uppercase
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationNotificationMod {
  
  @JSImport("rbx/elements/notification/notification", "Notification")
  @js.native
  val Notification: ForwardRefAsExoticComponent[NotificationProps, ReactElement] = js.native
  
  @js.native
  trait NotificationModifierProps extends StObject {
    
    var color: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
  }
  object NotificationModifierProps {
    
    @scala.inline
    def apply(): NotificationModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationModifierProps]
    }
    
    @scala.inline
    implicit class NotificationModifierPropsMutableBuilder[Self <: NotificationModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/elements/notification/notification.NotificationModifierProps */
  @js.native
  trait NotificationProps extends StObject {
    
    var backgroundColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.native
    
    var badge: js.UndefOr[Double | String] = js.native
    
    var badgeColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
    
    var badgeOutlined: js.UndefOr[Boolean] = js.native
    
    var badgeRounded: js.UndefOr[Boolean] = js.native
    
    var badgeSize: js.UndefOr[small | medium | large] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearfix: js.UndefOr[Boolean] = js.native
    
    var clipped: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var invisible: js.UndefOr[Boolean] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var marginless: js.UndefOr[Boolean] = js.native
    
    var overlay: js.UndefOr[Boolean] = js.native
    
    var paddingless: js.UndefOr[Boolean] = js.native
    
    var pull: js.UndefOr[left | right] = js.native
    
    var radiusless: js.UndefOr[Boolean] = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
    
    var shadowless: js.UndefOr[Boolean] = js.native
    
    var srOnly: js.UndefOr[Boolean] = js.native
    
    var textAlign: js.UndefOr[centered | justified | left | right] = js.native
    
    var textColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.native
    
    var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
    
    var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.native
    
    var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.native
    
    var tooltip: js.UndefOr[Double | String] = js.native
    
    var tooltipActive: js.UndefOr[Boolean] = js.native
    
    var tooltipColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
    
    var tooltipMultiline: js.UndefOr[Boolean] = js.native
    
    var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
    
    var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.native
    
    var unselectable: js.UndefOr[Boolean] = js.native
  }
  object NotificationProps {
    
    @scala.inline
    def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    @scala.inline
    implicit class NotificationPropsMutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBadge(value: Double | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
      
      @scala.inline
      def setBadgeOutlined(value: Boolean): Self = StObject.set(x, "badgeOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeOutlinedUndefined: Self = StObject.set(x, "badgeOutlined", js.undefined)
      
      @scala.inline
      def setBadgeRounded(value: Boolean): Self = StObject.set(x, "badgeRounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRoundedUndefined: Self = StObject.set(x, "badgeRounded", js.undefined)
      
      @scala.inline
      def setBadgeSize(value: small | medium | large): Self = StObject.set(x, "badgeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeSizeUndefined: Self = StObject.set(x, "badgeSize", js.undefined)
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      @scala.inline
      def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      @scala.inline
      def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      @scala.inline
      def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
      
      @scala.inline
      def setTextAlign(value: centered | justified | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      @scala.inline
      def setTextTransform(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextWeight(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeightUndefined: Self = StObject.set(x, "textWeight", js.undefined)
      
      @scala.inline
      def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      @scala.inline
      def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      @scala.inline
      def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
}
