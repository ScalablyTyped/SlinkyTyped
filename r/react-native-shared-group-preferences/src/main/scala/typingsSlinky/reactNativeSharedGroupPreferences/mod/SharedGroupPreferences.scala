package typingsSlinky.reactNativeSharedGroupPreferences.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-shared-group-preferences", "SharedGroupPreferences")
@js.native
object SharedGroupPreferences extends js.Object {
  
  def getItem(key: String, appGroup: String): js.Promise[_] = js.native
  def getItem(key: String, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[_] = js.native
  
  def isAppInstalledAndroid(packageName: String): js.Promise[Unit] = js.native
  
  def setItem(key: String, value: js.Any, appGroup: String): js.Promise[Unit] = js.native
  def setItem(key: String, value: js.Any, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[Unit] = js.native
}
