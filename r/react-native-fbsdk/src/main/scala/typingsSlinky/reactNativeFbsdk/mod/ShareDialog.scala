package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fbsdk", "ShareDialog")
@js.native
object ShareDialog extends js.Object {
  
  /**
    * Check if the dialog can be shown.
    */
  def canShow(shareContent: ShareContent): js.Promise[Boolean] = js.native
  
  /**
    * Sets the mode for the share dialog.
    */
  def setMode(mode: ShareDialogMode): Unit = js.native
  
  /**
    * Sets whether or not the native share dialog should fail when it encounters a data error.
    */
  def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = js.native
  
  /**
    * Shows the dialog using the specified content.
    */
  def show(shareContent: ShareContent): js.Promise[_] = js.native
}
