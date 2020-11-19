package typingsSlinky.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Platform extends js.Object
@JSImport("@expo/configure-splash-screen/build/constants", "Platform")
@js.native
object Platform extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Platform with String] = js.native
  
  @js.native
  sealed trait ALL extends Platform
  /* "all" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  @js.native
  sealed trait ANDROID extends Platform
  /* "android" */ @js.native
  object ANDROID extends TopLevel[ANDROID with String]
  
  @js.native
  sealed trait IOS extends Platform
  /* "ios" */ @js.native
  object IOS extends TopLevel[IOS with String]
}
