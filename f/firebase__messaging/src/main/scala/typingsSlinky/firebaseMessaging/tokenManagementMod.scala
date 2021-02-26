package typingsSlinky.firebaseMessaging

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenManagementMod {
  
  @JSImport("@firebase/messaging/dist/core/token-management", "deleteToken")
  @js.native
  def deleteToken(firebaseDependencies: FirebaseInternalDependencies, swRegistration: ServiceWorkerRegistration): js.Promise[Boolean] = js.native
  
  @JSImport("@firebase/messaging/dist/core/token-management", "getToken")
  @js.native
  def getToken(
    firebaseDependencies: FirebaseInternalDependencies,
    swRegistration: ServiceWorkerRegistration,
    vapidKey: String
  ): js.Promise[String] = js.native
}
