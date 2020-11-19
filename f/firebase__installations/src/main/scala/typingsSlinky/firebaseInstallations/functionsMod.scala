package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typingsSlinky.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import typingsSlinky.firebaseInstallations.onIdChangeMod.IdChangeUnsubscribeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  
  def deleteInstallation(dependencies: FirebaseDependencies): js.Promise[Unit] = js.native
  
  def getId(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = js.native
  
  def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = js.native
}
