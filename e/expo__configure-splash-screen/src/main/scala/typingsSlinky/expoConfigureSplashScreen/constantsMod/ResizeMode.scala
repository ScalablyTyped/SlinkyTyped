package typingsSlinky.expoConfigureSplashScreen.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResizeMode extends js.Object
@JSImport("@expo/configure-splash-screen/build/constants", "ResizeMode")
@js.native
object ResizeMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResizeMode with String] = js.native
  
  @js.native
  sealed trait CONTAIN extends ResizeMode
  /* "contain" */ @js.native
  object CONTAIN extends TopLevel[CONTAIN with String]
  
  @js.native
  sealed trait COVER extends ResizeMode
  /* "cover" */ @js.native
  object COVER extends TopLevel[COVER with String]
  
  @js.native
  sealed trait NATIVE extends ResizeMode
  /* "native" */ @js.native
  object NATIVE extends TopLevel[NATIVE with String]
}
