package typingsSlinky.reactNativeTouchId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-touch-id", "authenticate")
@js.native
object authenticate extends js.Object {
  
  def apply(reason: String): js.Promise[Boolean | TouchIDError] = js.native
  def apply(reason: String, config: AuthenticateConfig): js.Promise[Boolean | TouchIDError] = js.native
}
