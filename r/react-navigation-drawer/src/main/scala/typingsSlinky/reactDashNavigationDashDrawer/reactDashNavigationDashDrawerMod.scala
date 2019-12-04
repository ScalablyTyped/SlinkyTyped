package typingsSlinky.reactDashNavigationDashDrawer

import slinky.core.facade.ReactRef
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRouteConfigMap
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerNavigatorItemsMod.default
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.Props
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.State
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/CLOSE_DRAWER`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/DRAWER_CLOSED`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/DRAWER_OPENED`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/MARK_DRAWER_ACTIVE`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/MARK_DRAWER_IDLE`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/MARK_DRAWER_SETTLING`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/OPEN_DRAWER`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`Navigation/TOGGLE_DRAWER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer", JSImport.Namespace)
@js.native
object reactDashNavigationDashDrawerMod extends js.Object {
  @js.native
  class DrawerItems () extends default
  
  @js.native
  class DrawerNavigatorItems () extends default
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @js.native
  class DrawerSidebar ()
    extends typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.DrawerSidebar
  
  @js.native
  class DrawerView ()
    extends typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.default
  
  val DrawerGestureContext: Context[ReactRef[js.Any] | Null] = js.native
  val DrawerProgressContext: Context[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any) | Null
  ] = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _]): Anon_Action = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _], config: Anon_InitialRouteName): Anon_Action = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ],
    config: CreateNavigatorConfigNavigationDrawerConfigNavigat
  ): js.Any = js.native
  @js.native
  object DrawerActions extends js.Object {
    val CLOSE_DRAWER: `Navigation/CLOSE_DRAWER` = js.native
    val DRAWER_CLOSED: `Navigation/DRAWER_CLOSED` = js.native
    val DRAWER_OPENED: `Navigation/DRAWER_OPENED` = js.native
    val MARK_DRAWER_ACTIVE: `Navigation/MARK_DRAWER_ACTIVE` = js.native
    val MARK_DRAWER_IDLE: `Navigation/MARK_DRAWER_IDLE` = js.native
    val MARK_DRAWER_SETTLING: `Navigation/MARK_DRAWER_SETTLING` = js.native
    val OPEN_DRAWER: `Navigation/OPEN_DRAWER` = js.native
    val TOGGLE_DRAWER: `Navigation/TOGGLE_DRAWER` = js.native
    def closeDrawer(): js.Any = js.native
    def closeDrawer(payload: js.Any): js.Any = js.native
    def openDrawer(): js.Any = js.native
    def openDrawer(payload: js.Any): js.Any = js.native
    def toggleDrawer(): js.Any = js.native
    def toggleDrawer(payload: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DrawerItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerNavigatorItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerView extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_Lazy = js.native
    def getDerivedStateFromProps(nextProps: Props, prevState: State): Anon_Loaded = js.native
  }
  
}

