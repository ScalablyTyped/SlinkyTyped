package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.action
import typingsSlinky.electron.electronStrings.click
import typingsSlinky.electron.electronStrings.close
import typingsSlinky.electron.electronStrings.critical
import typingsSlinky.electron.electronStrings.default
import typingsSlinky.electron.electronStrings.low
import typingsSlinky.electron.electronStrings.never
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.reply
import typingsSlinky.electron.electronStrings.show
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends EventEmitter {
  
  var actions: js.Array[NotificationAction] = js.native
  
  @JSName("addListener")
  def addListener_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  var body: String = js.native
  
  /**
    * Dismisses the notification.
    */
  def close(): Unit = js.native
  
  var closeButtonText: String = js.native
  
  var hasReply: Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/notification
  @JSName("on")
  def on_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  /**
    * Emitted when the notification is clicked by the user.
    */
  @JSName("on")
  def on_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the notification is closed by manual intervention from the user.
    *
    * This event is not guaranteed to be emitted in all cases where the notification
    * is closed.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the user clicks the "Reply" button on a notification with
    * `hasReply: true`.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  /**
    * Emitted when the notification is shown to the user, note this could be fired
    * multiple times as a notification can be shown multiple times through the
    * `show()` method.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("once")
  def once_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  var replyPlaceholder: String = js.native
  
  /**
    * Immediately shows the notification to the user, please note this means unlike
    * the HTML5 Notification implementation, instantiating a `new Notification` does
    * not immediately show it to the user, you need to call this method before the OS
    * will display it.
    *
    * If the notification has been shown before, this method will dismiss the
    * previously shown notification and create a new one with identical properties.
    */
  def show(): Unit = js.native
  
  var silent: Boolean = js.native
  
  var sound: String = js.native
  
  var subtitle: String = js.native
  
  var timeoutType: default | never = js.native
  
  var title: String = js.native
  
  var urgency: normal | critical | low = js.native
}
