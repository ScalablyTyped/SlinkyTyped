package typingsSlinky.atAntDashDesignProDashLayout

import slinky.core.ReactComponentClass
import typingsSlinky.atAntDashDesignProDashLayout.libBasicLayoutMod.BasicLayoutProps
import typingsSlinky.atAntDashDesignProDashLayout.libFooterMod.FooterProps
import typingsSlinky.atAntDashDesignProDashLayout.libGetPageTitleMod.GetPageTitleProps
import typingsSlinky.atAntDashDesignProDashLayout.libGridContentMod.GridContentProps
import typingsSlinky.atAntDashDesignProDashLayout.libHeaderMod.HeaderView
import typingsSlinky.atAntDashDesignProDashLayout.libPageHeaderWrapperMod.PageHeaderWrapperProps
import typingsSlinky.atAntDashDesignProDashLayout.libRouteContextMod.RouteContextType
import typingsSlinky.atAntDashDesignProDashLayout.libSettingDrawerMod.SettingDrawerProps
import typingsSlinky.atAntDashDesignProDashLayout.libSettingDrawerMod.SettingDrawerState
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.Route
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object atAntDashDesignProDashLayoutMod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
  @js.native
  class SettingDrawer ()
    extends typingsSlinky.atAntDashDesignProDashLayout.libSettingDrawerMod.default
  
  @js.native
  class TopNavHeader ()
    extends typingsSlinky.atAntDashDesignProDashLayout.libTopNavHeaderMod.TopNavHeader
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val BasicLayout: ReactComponentClass[BasicLayoutProps] = js.native
  val DefaultFooter: ReactComponentClass[FooterProps] = js.native
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  val GridContent: ReactComponentClass[GridContentProps] = js.native
  val PageHeaderWrapper: ReactComponentClass[PageHeaderWrapperProps] = js.native
  val RouteContext: Context[RouteContextType] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: ReactComponentClass[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: Anon_Locale): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
  /* static members */
  @js.native
  object SettingDrawer extends js.Object {
    def getDerivedStateFromProps(props: SettingDrawerProps): SettingDrawerState | Null = js.native
  }
  
}

