package typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsModalTransitionStyle extends js.Object

@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends js.Object {
  @js.native
  sealed trait coverVertical extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait crossDissolve extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait flipHorizontal extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait partialCurl extends OptionsModalTransitionStyle
  
  /* "coverVertical" */ val coverVertical: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
  /* "crossDissolve" */ val crossDissolve: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
  /* "flipHorizontal" */ val flipHorizontal: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
  /* "partialCurl" */ val partialCurl: typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalTransitionStyle with String] = js.native
}

