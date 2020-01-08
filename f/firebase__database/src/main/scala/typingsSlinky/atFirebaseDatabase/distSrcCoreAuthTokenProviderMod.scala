package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseAppDashTypes.privateMod.FirebaseAuthTokenData
import typingsSlinky.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternalName
import typingsSlinky.atFirebaseComponent.atFirebaseComponentMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", JSImport.Namespace)
@js.native
object distSrcCoreAuthTokenProviderMod extends js.Object {
  @js.native
  class AuthTokenProvider protected () extends js.Object {
    def this(app_ : FirebaseApp, authProvider_ : Provider[FirebaseAuthInternalName]) = this()
    var app_ : js.Any = js.native
    var authProvider_ : js.Any = js.native
    var auth_ : js.Any = js.native
    def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    /**
      * @param {boolean} forceRefresh
      * @return {!Promise<FirebaseAuthTokenData>}
      */
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    def notifyForInvalidToken(): Unit = js.native
    def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
}

