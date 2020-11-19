package typingsSlinky.firebaseMessaging.apiMod

import typingsSlinky.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typingsSlinky.firebaseMessaging.tokenDetailsMod.TokenDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/core/api", "requestUpdateToken")
@js.native
object requestUpdateToken extends js.Object {
  
  def apply(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[String] = js.native
}
