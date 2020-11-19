package typingsSlinky.rnAppUpgrade

import typingsSlinky.reactNative.mod.EmitterSubscription
import typingsSlinky.rnAppUpgrade.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rn-app-upgrade", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addDownListener(callBack: js.Function1[/* progress */ Double, Unit]): EmitterSubscription = js.native
  
  def checkUpdate(appId: String, version: String): js.Promise[Code] = js.native
  
  def openAPPStore(appid: String): Unit = js.native
  
  def upgrade(apkUrl: String): Unit = js.native
}
