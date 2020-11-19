package typingsSlinky.ibmMobilefirst.global.WL

import typingsSlinky.ibmMobilefirst.WL.App.ActionReceiverCallback
import typingsSlinky.ibmMobilefirst.WL.App.BackgroundHandler.Handler
import typingsSlinky.ibmMobilefirst.WL.App.Callback
import typingsSlinky.ibmMobilefirst.WL.App.Data
import typingsSlinky.ibmMobilefirst.WL.App.KeepAliveInBackgroundOptions
import typingsSlinky.ibmMobilefirst.WL.App.OpenURLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WL.App")
@js.native
object App extends js.Object {
  
  def addActionReceiver(id: String, callback: ActionReceiverCallback): Unit = js.native
  
  /**
    * @deprecate Deprecated.
    */
  def close(): Unit = js.native
  
  def copyToClipboard(stringToCopy: String): Unit = js.native
  def copyToClipboard(stringToCopy: String, callback: Callback): Unit = js.native
  
  def getDeviceLanguage(): String = js.native
  
  def getDeviceLocale(): String = js.native
  
  /**
    * TODO: declare exception type. (Exceptions that are thrown by the IBM® Worklight® client runtime framework)
    */
  def getErrorMessage(exception: js.Any): String = js.native
  
  def hideSplashScreen(): Unit = js.native
  
  def openURL(url: String): Unit = js.native
  def openURL(url: String, target: js.UndefOr[scala.Nothing], options: OpenURLOptions): Unit = js.native
  def openURL(url: String, target: String): Unit = js.native
  def openURL(url: String, target: String, options: OpenURLOptions): Unit = js.native
  
  def overrideBackButton(callback: Callback): Unit = js.native
  
  def removeActionReceiver(id: String): Unit = js.native
  
  /**
    * @deprecated since version 6.0.0
    */
  def resetBackButton(): Unit = js.native
  
  def sendActionToNative(action: String): Unit = js.native
  def sendActionToNative(action: String, data: Data): Unit = js.native
  
  def setKeepAliveInBackground(enabled: Boolean): Unit = js.native
  def setKeepAliveInBackground(enabled: Boolean, options: KeepAliveInBackgroundOptions): Unit = js.native
  
  def showSplashScreen(): Unit = js.native
  
  @js.native
  object BackgroundHandler extends js.Object {
    
    var defaultIOSBehavior: Handler = js.native
    
    /**
      * @deprecated since version 6.0.0
      */
    var hideElements: Handler = js.native
    
    var hideView: Handler = js.native
    
    def setOnAppEnteringBackground(handler: Handler): Unit = js.native
  }
}
