package typingsSlinky.firebaseMessaging

import typingsSlinky.firebaseAppTypes.privateMod.FirebaseService
import typingsSlinky.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typingsSlinky.firebaseMessaging.mod.FirebaseApp
import typingsSlinky.firebaseMessagingTypes.mod.FirebaseMessaging
import typingsSlinky.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/controllers/window-controller", JSImport.Namespace)
@js.native
object windowControllerMod extends js.Object {
  
  @js.native
  class WindowController protected ()
    extends FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    
    @JSName("app")
    def app_MWindowController: FirebaseApp = js.native
    
    def deleteToken(): js.Promise[Boolean] = js.native
    
    val firebaseDependencies: js.Any = js.native
    
    /**
      * Creates or updates the default service worker registration.
      * @return The service worker registration to be used for the push service.
      */
    var getServiceWorkerRegistration: js.Any = js.native
    
    var logEvent: js.Any = js.native
    
    var messageEventListener: js.Any = js.native
    
    var onMessageCallback: js.Any = js.native
    
    def onTokenRefresh(): Unsubscribe = js.native
    
    def setBackgroundMessageHandler(): Unit = js.native
    
    var swRegistration: js.Any = js.native
    
    var vapidKey: js.Any = js.native
  }
}
