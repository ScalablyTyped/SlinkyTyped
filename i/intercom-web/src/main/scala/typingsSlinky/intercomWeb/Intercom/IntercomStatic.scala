package typingsSlinky.intercomWeb.Intercom

import typingsSlinky.intercomWeb.intercomWebStrings.boot
import typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId
import typingsSlinky.intercomWeb.intercomWebStrings.hide
import typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick
import typingsSlinky.intercomWeb.intercomWebStrings.onHide
import typingsSlinky.intercomWeb.intercomWebStrings.onShow
import typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange
import typingsSlinky.intercomWeb.intercomWebStrings.show
import typingsSlinky.intercomWeb.intercomWebStrings.showMessages
import typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage
import typingsSlinky.intercomWeb.intercomWebStrings.shutdown
import typingsSlinky.intercomWeb.intercomWebStrings.startTour
import typingsSlinky.intercomWeb.intercomWebStrings.trackEvent
import typingsSlinky.intercomWeb.intercomWebStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntercomStatic extends js.Object {
  
  def apply(command: IntercomCommand): Unit = js.native
  def apply(command: IntercomCommand, param1: js.UndefOr[scala.Nothing], param2: js.Any): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any, param2: js.Any): Unit = js.native
  def apply(command: boot, param: IntercomSettings): Unit = js.native
  def apply(command: getVisitorId): String = js.native
  def apply(command: hide): Unit = js.native
  def apply(command: onActivatorClick): Unit = js.native
  def apply(command: onActivatorClick, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onHide): Unit = js.native
  def apply(command: onHide, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onShow): Unit = js.native
  def apply(command: onShow, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onUnreadCountChange, cb: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
  def apply(command: show): Unit = js.native
  def apply(command: showMessages): Unit = js.native
  def apply(command: showNewMessage): Unit = js.native
  def apply(command: showNewMessage, param: String): Unit = js.native
  def apply(command: shutdown): Unit = js.native
  def apply(command: startTour, tourId: Double): Unit = js.native
  def apply(command: trackEvent): Unit = js.native
  def apply(command: trackEvent, tag: js.UndefOr[scala.Nothing], metadata: js.Any): Unit = js.native
  def apply(command: trackEvent, tag: String): Unit = js.native
  def apply(command: trackEvent, tag: String, metadata: js.Any): Unit = js.native
  def apply(command: update): Unit = js.native
  def apply(command: update, param: IntercomSettings): Unit = js.native
  
  var booted: Boolean = js.native
}
