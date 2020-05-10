package typingsSlinky.reactNavigationDrawer

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.SupportedThemes
import typingsSlinky.reactNavigationDrawer.drawerNavigatorItemsMod.default
import typingsSlinky.reactNavigationDrawer.drawerViewMod.Props
import typingsSlinky.reactNavigationDrawer.drawerViewMod.State
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerConfig
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerRouterConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DrawerItems () extends default
  
  @js.native
  class DrawerNavigatorItems () extends default
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @js.native
  class DrawerSidebar ()
    extends typingsSlinky.reactNavigationDrawer.drawerSidebarMod.DrawerSidebar
  
  @js.native
  class DrawerView ()
    extends typingsSlinky.reactNavigationDrawer.drawerViewMod.default
  
  val DrawerGestureContext: Context[ReactRef[js.Any] | Null] = js.native
  val DrawerProgressContext: Context[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any) | Null
  ] = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _]): AnonGetActionCreators = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _], config: AnonInitialRouteName): AnonGetActionCreators = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  @js.native
  object DrawerActions extends js.Object {
    val CLOSE_DRAWER: /* "Navigation/CLOSE_DRAWER" */ String = js.native
    val DRAWER_CLOSED: /* "Navigation/DRAWER_CLOSED" */ String = js.native
    val DRAWER_OPENED: /* "Navigation/DRAWER_OPENED" */ String = js.native
    val MARK_DRAWER_ACTIVE: /* "Navigation/MARK_DRAWER_ACTIVE" */ String = js.native
    val MARK_DRAWER_IDLE: /* "Navigation/MARK_DRAWER_IDLE" */ String = js.native
    val MARK_DRAWER_SETTLING: /* "Navigation/MARK_DRAWER_SETTLING" */ String = js.native
    val OPEN_DRAWER: /* "Navigation/OPEN_DRAWER" */ String = js.native
    val TOGGLE_DRAWER: /* "Navigation/TOGGLE_DRAWER" */ String = js.native
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
    var defaultProps: AnonActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerNavigatorItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerView extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonLazy = js.native
    def getDerivedStateFromProps(nextProps: Props, prevState: State): AnonLoaded = js.native
  }
  
}

