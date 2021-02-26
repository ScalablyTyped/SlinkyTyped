package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.notifications.IOSNotification")
@js.native
class IOSNotification () extends StObject {
  
  def addAttachment(identifier: String, url: String, options: IOSAttachmentOptions): Notification = js.native
  
  var alertAction: js.UndefOr[String] = js.native
  
  var attachments: js.Array[IOSAttachment] = js.native
  
  var badge: js.UndefOr[Double] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[CompletionHandler] = js.native
  
  var hasAction: js.UndefOr[Boolean] = js.native
  
  var launchImage: js.UndefOr[String] = js.native
  
  def setAlertAction(alertAction: String): Notification = js.native
  
  def setBadge(badge: Double): Notification = js.native
  
  def setCategory(category: String): Notification = js.native
  
  def setHasAction(hasAction: Boolean): Notification = js.native
  
  def setLaunchImage(launchImage: String): Notification = js.native
  
  def setThreadIdentifier(threadIdentifier: String): Notification = js.native
  
  var threadIdentifier: js.UndefOr[String] = js.native
}
