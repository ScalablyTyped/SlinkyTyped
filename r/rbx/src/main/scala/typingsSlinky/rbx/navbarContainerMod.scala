package typingsSlinky.rbx

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.rbx.anon.BinVariablesbreakpointsLi
import typingsSlinky.rbx.anon.KinVariablesbreakpointsto
import typingsSlinky.rbx.anon.Transparent
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
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarContainerMod {
  
  object NAVBAR_DEFAULTS {
    
    @JSImport("rbx/components/navbar/navbar-container", "NAVBAR_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/navbar/navbar-container", "NAVBAR_DEFAULTS.fixedAlignments")
    @js.native
    def fixedAlignments: js.Tuple2[top, bottom] = js.native
    @scala.inline
    def fixedAlignments_=(x: js.Tuple2[top, bottom]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedAlignments")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rbx/components/navbar/navbar-container", "NavbarContainer")
  @js.native
  class NavbarContainer protected ()
    extends PureComponent[NavbarContainerProps, NavbarContainerState, js.Any] {
    def this(props: NavbarContainerProps) = this()
    
    var active: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNavbarContainer(): Unit = js.native
    
    val document: js.Any = js.native
    
    var manageHtmlAttributes: js.Any = js.native
  }
  /* static members */
  object NavbarContainer {
    
    @JSImport("rbx/components/navbar/navbar-container", "NavbarContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/navbar/navbar-container", "NavbarContainer.defaultProps")
    @js.native
    def defaultProps: Transparent = js.native
    @scala.inline
    def defaultProps_=(x: Transparent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar/navbar-container", "NavbarContainer.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NavbarContainerModifierProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var as: js.UndefOr[ReactType[_]] = js.native
    
    var color: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
    
    var document: js.UndefOr[Document] = js.native
    
    var fixed: js.UndefOr[top | bottom] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]] = js.native
    
    var managed: js.UndefOr[Boolean] = js.native
    
    var transparent: js.UndefOr[Boolean] = js.native
  }
  object NavbarContainerModifierProps {
    
    @scala.inline
    def apply(): NavbarContainerModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarContainerModifierProps]
    }
    
    @scala.inline
    implicit class NavbarContainerModifierPropsMutableBuilder[Self <: NavbarContainerModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: ReactType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setFixed(value: top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
      
      @scala.inline
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/components/navbar/navbar-container.NavbarContainerModifierProps */
  @js.native
  trait NavbarContainerProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var as: js.UndefOr[ReactType[_]] = js.native
    
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
    
    var document: js.UndefOr[Document] = js.native
    
    var fixed: js.UndefOr[top | bottom] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]] = js.native
    
    var invisible: js.UndefOr[Boolean] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var managed: js.UndefOr[Boolean] = js.native
    
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
    
    var transparent: js.UndefOr[Boolean] = js.native
    
    var unselectable: js.UndefOr[Boolean] = js.native
  }
  object NavbarContainerProps {
    
    @scala.inline
    def apply(): NavbarContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarContainerProps]
    }
    
    @scala.inline
    implicit class NavbarContainerPropsMutableBuilder[Self <: NavbarContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: ReactType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
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
      def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setFixed(value: top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
      
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
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
  
  @js.native
  trait NavbarContainerState extends StObject {
    
    var active: Boolean = js.native
  }
  object NavbarContainerState {
    
    @scala.inline
    def apply(active: Boolean): NavbarContainerState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarContainerState]
    }
    
    @scala.inline
    implicit class NavbarContainerStateMutableBuilder[Self <: NavbarContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-container.NavbarVariablesOverrides, rbx.rbx/components/navbar/navbar-container.NavbarVariablesDefaults> */
  @js.native
  trait NavbarVariables extends StObject {
    
    var fixedAlignments: top | bottom = js.native
  }
  object NavbarVariables {
    
    @scala.inline
    def apply(fixedAlignments: top | bottom): NavbarVariables = {
      val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarVariables]
    }
    
    @scala.inline
    implicit class NavbarVariablesMutableBuilder[Self <: NavbarVariables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedAlignments(value: top | bottom): Self = StObject.set(x, "fixedAlignments", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavbarVariablesDefaults extends StObject {
    
    var fixedAlignments: top | bottom = js.native
  }
  object NavbarVariablesDefaults {
    
    @scala.inline
    def apply(fixedAlignments: top | bottom): NavbarVariablesDefaults = {
      val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarVariablesDefaults]
    }
    
    @scala.inline
    implicit class NavbarVariablesDefaultsMutableBuilder[Self <: NavbarVariablesDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedAlignments(value: top | bottom): Self = StObject.set(x, "fixedAlignments", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavbarVariablesOverrides extends StObject
}
