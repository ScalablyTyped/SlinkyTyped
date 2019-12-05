package typingsSlinky.intercomDashWeb.Intercom_

import typingsSlinky.intercomDashWeb.intercomDashWebStrings.boot
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.getVisitorId
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.hide
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.onActivatorClick
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.onHide
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.onShow
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.onUnreadCountChange
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.show
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.showMessages
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.showNewMessage
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.shutdown
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.trackEvent
import typingsSlinky.intercomDashWeb.intercomDashWebStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomStatic extends js.Object {
  var booted: Boolean = js.native
  def apply(command: IntercomCommand): Unit = js.native
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
  def apply(command: trackEvent): Unit = js.native
  def apply(command: trackEvent, tag: String): Unit = js.native
  def apply(command: trackEvent, tag: String, metadata: js.Any): Unit = js.native
  def apply(command: update): Unit = js.native
  def apply(command: update, param: IntercomSettings): Unit = js.native
}

