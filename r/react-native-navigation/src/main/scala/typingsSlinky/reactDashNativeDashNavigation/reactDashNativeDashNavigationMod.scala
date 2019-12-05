package typingsSlinky.reactDashNativeDashNavigation

import typingsSlinky.reactDashNativeDashNavigation.libDistAdaptersConstantsMod.NavigationConstants
import typingsSlinky.reactDashNativeDashNavigation.libDistNavigationMod.NavigationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactDashNativeDashNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typingsSlinky.reactDashNativeDashNavigation.libDistAdaptersConstantsMod.Constants
  
  val Navigation: NavigationRoot = js.native
  /* static members */
  @js.native
  object Constants extends js.Object {
    var instance: js.Any = js.native
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popOver" */ val popOver: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.popOver with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle with String
      ] = js.native
  }
  
}

