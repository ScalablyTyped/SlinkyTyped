package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/helpers/fid-changed", JSImport.Namespace)
@js.native
object fidChangedMod extends js.Object {
  
  def addCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
  
  def fidChanged(appConfig: AppConfig, fid: String): Unit = js.native
  
  def removeCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
}
