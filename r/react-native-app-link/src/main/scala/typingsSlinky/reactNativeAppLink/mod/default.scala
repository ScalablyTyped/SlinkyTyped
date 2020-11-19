package typingsSlinky.reactNativeAppLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-app-link", JSImport.Default)
@js.native
object default extends js.Object {
  
  def maybeOpenURL(url: String, options: AppLinkOptions): js.Promise[Unit] = js.native
  
  def openInStore(options: AppLinkOptions): js.Promise[Unit] = js.native
}
