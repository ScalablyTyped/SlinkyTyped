package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.constantsMod.NavigationConstants
import typingsSlinky.reactNativeNavigation.navigationMod.NavigationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactNativeNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typingsSlinky.reactNativeNavigation.constantsMod.Constants
  
  val Navigation: NavigationRoot = js.native
  /* static members */
  @js.native
  object Constants extends js.Object {
    var instance: js.Any = js.native
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popOver" */ val popOver: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popOver with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle with String
      ] = js.native
  }
  
}

