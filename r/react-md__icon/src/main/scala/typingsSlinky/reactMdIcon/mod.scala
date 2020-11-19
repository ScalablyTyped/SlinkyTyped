package typingsSlinky.reactMdIcon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
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
  
  /**
    * The `FontIcon` component is used for rendering a font-icon library's icon.
    * The default is to use the `material-icons` library, but others can be used as
    * well.
    *
    * If you are using another font icon library that does not always create icons
    * with a perfect 1:1 scale (such as font awesome), it is recommended to use the
    * `forceSize` and `forceFontSize` props to fix the sizing issues.
    */
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  
  /**
    * The `IconProvider` component is used to override all the default icons within
    * `react-md` with a newly defined set of icons. This is super nice since you
    * won't need to create new component wrappers for all the components within
    * `react-md` if you want to switch to SVG icons instead of the default font
    * icons.
    */
  val IconProvider: ReactComponentClass[IconProviderProps] = js.native
  
  /**
    * The `IconRotator` is a simple component that is used to rotate an icon from a
    * one degrees to another.
    */
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps with RefAttributes[HTMLSpanElement]] = js.native
  
  /**
    * The `SVGIcon` component is used to render inline SVG icons or SVG icons in a
    * sprite map as an icon.
    */
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  
  val TextIconSpacing: ReactComponentClass[TextIconSpacingProps] = js.native
  
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
}
