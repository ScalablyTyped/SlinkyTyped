package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.error
import typingsSlinky.atom.atomStrings.fatal
import typingsSlinky.atom.atomStrings.info
import typingsSlinky.atom.atomStrings.success
import typingsSlinky.atom.atomStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "Notification")
@js.native
class Notification protected () extends StObject {
  def this(`type`: error, message: String) = this()
  def this(`type`: fatal, message: String) = this()
  def this(`type`: info, message: String) = this()
  def this(`type`: success, message: String) = this()
  def this(`type`: warning, message: String) = this()
  def this(`type`: error, message: String, options: ErrorNotificationOptions) = this()
  def this(`type`: fatal, message: String, options: ErrorNotificationOptions) = this()
  def this(`type`: info, message: String, options: NotificationOptions) = this()
  def this(`type`: success, message: String, options: NotificationOptions) = this()
  def this(`type`: warning, message: String, options: NotificationOptions) = this()
  
  /**
    *  Dismisses the notification, removing it from the UI. Calling this
    *  programmatically will call all callbacks added via onDidDismiss.
    */
  def dismiss(): Unit = js.native
  
  /** Returns the Notification's message. */
  def getMessage(): String = js.native
  
  // Methods
  /** Returns the Notification's type. */
  def getType(): String = js.native
  
  // Event Subscription
  /** Invoke the given callback when the notification is dismissed. */
  def onDidDismiss(callback: js.Function1[/* notification */ this.type, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the notification is displayed. */
  def onDidDisplay(callback: js.Function1[/* notification */ this.type, Unit]): Disposable = js.native
}
