package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.anon.Breadcrumb
import typingsSlinky.antDesignProLayout.anon.Locale
import typingsSlinky.antDesignProLayout.anon.Tip
import typingsSlinky.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typingsSlinky.antDesignProLayout.footerMod.FooterProps
import typingsSlinky.antDesignProLayout.footerToolbarMod.FooterToolbarProps
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.gridContentMod.GridContentProps
import typingsSlinky.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import typingsSlinky.antDesignProLayout.pageContainerMod.PageContainerProps
import typingsSlinky.antDesignProLayout.routeContextMod.RouteContextType
import typingsSlinky.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.Route
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  @JSImport("@ant-design/pro-layout", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BasicLayoutProps] = js.native
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "BasicLayout")
  @js.native
  val BasicLayout: ReactComponentClass[BasicLayoutProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  val DefaultFooter: ReactComponentClass[FooterProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultHeader")
  @js.native
  class DefaultHeader ()
    extends typingsSlinky.antDesignProLayout.headerMod.default
  
  @JSImport("@ant-design/pro-layout", "FooterToolbar")
  @js.native
  val FooterToolbar: ReactComponentClass[FooterToolbarProps] = js.native
  
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "GridContent")
  @js.native
  val GridContent: ReactComponentClass[GridContentProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  val PageContainer: ReactComponentClass[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageHeaderWrapper")
  @js.native
  val PageHeaderWrapper: ReactComponentClass[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  val PageLoading: ReactComponentClass[Tip] = js.native
  
  @JSImport("@ant-design/pro-layout", "RouteContext")
  @js.native
  val RouteContext: Context[RouteContextType] = js.native
  
  /**
    * 可视化配置组件
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "SettingDrawer")
  @js.native
  val SettingDrawer: ReactComponentClass[SettingDrawerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "TopNavHeader")
  @js.native
  val TopNavHeader: ReactComponentClass[TopNavHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(routes: js.Array[Route]): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(routes: js.Array[Route], menu: Locale): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@ant-design/pro-layout", "getMenuData")
  @js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = js.native
  
  @JSImport("@ant-design/pro-layout", "getPageTitle")
  @js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  @JSImport("@ant-design/pro-layout", "getPageTitle")
  @js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
  
  type _To = ReactComponentClass[BasicLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[BasicLayoutProps] = default
}
