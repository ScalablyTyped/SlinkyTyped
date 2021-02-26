package typingsSlinky.reactMdIcon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdIcon.fontIconMod.FontIconProps
import typingsSlinky.reactMdIcon.iconProviderMod.IconProviderProps
import typingsSlinky.reactMdIcon.iconRotatorMod.IconRotatorProps
import typingsSlinky.reactMdIcon.reactMdIconStrings.back
import typingsSlinky.reactMdIcon.reactMdIconStrings.checkbox
import typingsSlinky.reactMdIcon.reactMdIconStrings.download
import typingsSlinky.reactMdIcon.reactMdIconStrings.dropdown
import typingsSlinky.reactMdIcon.reactMdIconStrings.expander
import typingsSlinky.reactMdIcon.reactMdIconStrings.forward
import typingsSlinky.reactMdIcon.reactMdIconStrings.menu
import typingsSlinky.reactMdIcon.reactMdIconStrings.notification
import typingsSlinky.reactMdIcon.reactMdIconStrings.password
import typingsSlinky.reactMdIcon.reactMdIconStrings.radio
import typingsSlinky.reactMdIcon.reactMdIconStrings.selected
import typingsSlinky.reactMdIcon.reactMdIconStrings.sort
import typingsSlinky.reactMdIcon.svgiconMod.SVGIconProps
import typingsSlinky.reactMdIcon.textIconSpacingMod.TextIconSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/icon", "FontIcon")
  @js.native
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  
  object IconProvider {
    
    @JSImport("@react-md/icon", "IconProvider")
    @js.native
    def apply(
      hasChildrenBackCheckboxDownloadDropdownExpanderForwardMenuNotificationPasswordRadioSelectedSort: IconProviderProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/icon", "IconProvider.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.back")
      @js.native
      def back: js.Any = js.native
      @scala.inline
      def back_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.checkbox")
      @js.native
      def checkbox: js.Any = js.native
      @scala.inline
      def checkbox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.download")
      @js.native
      def download: js.Any = js.native
      @scala.inline
      def download_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("download")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.dropdown")
      @js.native
      def dropdown: js.Any = js.native
      @scala.inline
      def dropdown_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.expander")
      @js.native
      def expander: js.Any = js.native
      @scala.inline
      def expander_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expander")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.forward")
      @js.native
      def forward: js.Any = js.native
      @scala.inline
      def forward_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.menu")
      @js.native
      def menu: js.Any = js.native
      @scala.inline
      def menu_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.notification")
      @js.native
      def notification: js.Any = js.native
      @scala.inline
      def notification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notification")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.password")
      @js.native
      def password: js.Any = js.native
      @scala.inline
      def password_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("password")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.radio")
      @js.native
      def radio: js.Any = js.native
      @scala.inline
      def radio_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radio")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.selected")
      @js.native
      def selected: js.Any = js.native
      @scala.inline
      def selected_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.sort")
      @js.native
      def sort: js.Any = js.native
      @scala.inline
      def sort_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/icon", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/icon", "SVGIcon")
  @js.native
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  
  object TextIconSpacing {
    
    @JSImport("@react-md/icon", "TextIconSpacing")
    @js.native
    def apply(
      hasClassNameIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.aboveClassName")
      @js.native
      def aboveClassName: js.Any = js.native
      @scala.inline
      def aboveClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aboveClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.afterClassName")
      @js.native
      def afterClassName: js.Any = js.native
      @scala.inline
      def afterClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.beforeClassName")
      @js.native
      def beforeClassName: js.Any = js.native
      @scala.inline
      def beforeClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.belowClassName")
      @js.native
      def belowClassName: js.Any = js.native
      @scala.inline
      def belowClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("belowClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.forceIconWrap")
      @js.native
      def forceIconWrap: js.Any = js.native
      @scala.inline
      def forceIconWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceIconWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.icon")
      @js.native
      def icon: js.Any = js.native
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.iconAfter")
      @js.native
      def iconAfter: js.Any = js.native
      @scala.inline
      def iconAfter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconAfter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def icon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.stacked")
      @js.native
      def stacked: js.Any = js.native
      @scala.inline
      def stacked_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stacked")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_back(name: back): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_back(name: back, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_checkbox(name: checkbox): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_checkbox(name: checkbox, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_download(name: download): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_download(name: download, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_dropdown(name: dropdown): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_dropdown(name: dropdown, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_expander(name: expander): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_expander(name: expander, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_forward(name: forward): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_forward(name: forward, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_menu(name: menu): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_menu(name: menu, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_notification(name: notification): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_notification(name: notification, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_password(name: password): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_password(name: password, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_radio(name: radio): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_radio(name: radio, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_selected(name: selected): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_selected(name: selected, `override`: ReactElement): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_sort(name: sort): ReactElement = js.native
  @JSImport("@react-md/icon", "useIcon")
  @js.native
  def useIcon_sort(name: sort, `override`: ReactElement): ReactElement = js.native
}
