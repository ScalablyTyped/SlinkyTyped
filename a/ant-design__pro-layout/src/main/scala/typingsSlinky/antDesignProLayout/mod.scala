package typingsSlinky.antDesignProLayout

import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.anon.Breadcrumb
import typingsSlinky.antDesignProLayout.anon.Locale
import typingsSlinky.antDesignProLayout.anon.Tip
import typingsSlinky.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typingsSlinky.antDesignProLayout.footerMod.FooterProps
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.gridContentMod.GridContentProps
import typingsSlinky.antDesignProLayout.headerMod.HeaderView
import typingsSlinky.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import typingsSlinky.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps
import typingsSlinky.antDesignProLayout.routeContextMod.RouteContextType
import typingsSlinky.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.Route
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
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
  val PageLoading: ReactComponentClass[Tip] = js.native
  val RouteContext: Context[RouteContextType] = js.native
  /**
    * 可视化配置组件
    * @param props
    */
  val SettingDrawer: ReactComponentClass[SettingDrawerProps] = js.native
  val TopNavHeader: ReactComponentClass[TopNavHeaderProps] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: ReactComponentClass[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): Breadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: Locale): Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
}

