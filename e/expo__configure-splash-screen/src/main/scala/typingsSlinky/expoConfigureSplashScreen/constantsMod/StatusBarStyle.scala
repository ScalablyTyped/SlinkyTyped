package typingsSlinky.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusBarStyle extends js.Object
@JSImport("@expo/configure-splash-screen/build/constants", "StatusBarStyle")
@js.native
object StatusBarStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusBarStyle with String] = js.native
  
  @js.native
  sealed trait DARK_CONTENT extends StatusBarStyle
  /* "dark-content" */ @js.native
  object DARK_CONTENT extends TopLevel[DARK_CONTENT with String]
  
  @js.native
  sealed trait DEFAULT extends StatusBarStyle
  /* "default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  @js.native
  sealed trait LIGHT_CONTENT extends StatusBarStyle
  /* "light-content" */ @js.native
  object LIGHT_CONTENT extends TopLevel[LIGHT_CONTENT with String]
}
