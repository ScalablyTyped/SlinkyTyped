package typingsSlinky.firebaseMessaging

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/core/token-management", JSImport.Namespace)
@js.native
object tokenManagementMod extends js.Object {
  
  def deleteToken(firebaseDependencies: FirebaseInternalDependencies, swRegistration: ServiceWorkerRegistration): js.Promise[Boolean] = js.native
  
  def getToken(
    firebaseDependencies: FirebaseInternalDependencies,
    swRegistration: ServiceWorkerRegistration,
    vapidKey: String
  ): js.Promise[String] = js.native
}
