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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/icon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps with RefAttributes[HTMLSpanElement]] = js.native
  
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  
  @JSName("useIcon")
  def useIcon_back(name: back): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_back(name: back, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_checkbox(name: checkbox): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_checkbox(name: checkbox, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_download(name: download): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_download(name: download, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_dropdown(name: dropdown): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_dropdown(name: dropdown, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_expander(name: expander): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_expander(name: expander, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_forward(name: forward): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_forward(name: forward, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_menu(name: menu): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_menu(name: menu, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_notification(name: notification): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_notification(name: notification, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_password(name: password): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_password(name: password, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_radio(name: radio): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_radio(name: radio, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_selected(name: selected): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_selected(name: selected, `override`: ReactElement): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_sort(name: sort): ReactElement = js.native
  @JSName("useIcon")
  def useIcon_sort(name: sort, `override`: ReactElement): ReactElement = js.native
  
  @js.native
  object IconProvider extends js.Object {
    
    def apply(
      hasChildrenBackCheckboxDownloadDropdownExpanderForwardMenuNotificationPasswordRadioSelectedSort: IconProviderProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var back: js.Any = js.native
      
      var checkbox: js.Any = js.native
      
      var children: js.Any = js.native
      
      var download: js.Any = js.native
      
      var dropdown: js.Any = js.native
      
      var expander: js.Any = js.native
      
      var forward: js.Any = js.native
      
      var menu: js.Any = js.native
      
      var notification: js.Any = js.native
      
      var password: js.Any = js.native
      
      var radio: js.Any = js.native
      
      var selected: js.Any = js.native
      
      var sort: js.Any = js.native
    }
  }
  
  @js.native
  object TextIconSpacing extends js.Object {
    
    def apply(
      hasClassNameIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var aboveClassName: js.Any = js.native
      
      var afterClassName: js.Any = js.native
      
      var beforeClassName: js.Any = js.native
      
      var belowClassName: js.Any = js.native
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var forceIconWrap: js.Any = js.native
      
      var icon: js.Any = js.native
      
      var iconAfter: js.Any = js.native
      
      var stacked: js.Any = js.native
    }
  }
}
