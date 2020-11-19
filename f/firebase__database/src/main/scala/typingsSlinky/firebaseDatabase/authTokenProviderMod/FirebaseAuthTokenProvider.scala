package typingsSlinky.firebaseDatabase.authTokenProviderMod

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
@js.native
class FirebaseAuthTokenProvider protected () extends AuthTokenProvider {
  def this(app_ : FirebaseApp, authProvider_ : Provider[FirebaseAuthInternalName]) = this()
  
  var app_ : js.Any = js.native
  
  var authProvider_ : js.Any = js.native
  
  var auth_ : js.Any = js.native
}
