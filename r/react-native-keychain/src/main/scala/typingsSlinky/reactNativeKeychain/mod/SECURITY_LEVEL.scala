package typingsSlinky.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SECURITY_LEVEL extends StObject
@JSImport("react-native-keychain", "SECURITY_LEVEL")
@js.native
object SECURITY_LEVEL extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SECURITY_LEVEL with Double] = js.native
  
  @js.native
  sealed trait ANY extends SECURITY_LEVEL
  /* 2 */ val ANY: typingsSlinky.reactNativeKeychain.mod.SECURITY_LEVEL.ANY with Double = js.native
  
  @js.native
  sealed trait SECURE_HARDWARE extends SECURITY_LEVEL
  /* 1 */ val SECURE_HARDWARE: typingsSlinky.reactNativeKeychain.mod.SECURITY_LEVEL.SECURE_HARDWARE with Double = js.native
  
  @js.native
  sealed trait SECURE_SOFTWARE extends SECURITY_LEVEL
  /* 0 */ val SECURE_SOFTWARE: typingsSlinky.reactNativeKeychain.mod.SECURITY_LEVEL.SECURE_SOFTWARE with Double = js.native
}
