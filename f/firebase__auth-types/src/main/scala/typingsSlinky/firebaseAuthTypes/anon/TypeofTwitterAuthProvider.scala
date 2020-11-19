package typingsSlinky.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.firebaseAuthTypes.mod.AuthCredential
import typingsSlinky.firebaseAuthTypes.mod.TwitterAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTwitterAuthProvider extends Instantiable0[TwitterAuthProvider] {
  
  var PROVIDER_ID: String = js.native
  
  var TWITTER_SIGN_IN_METHOD: String = js.native
  
  def credential(token: String, secret: String): AuthCredential = js.native
}
