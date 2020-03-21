package typingsSlinky.intercomWeb.Intercom_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomWeb.intercomWebStrings.boot
  - typingsSlinky.intercomWeb.intercomWebStrings.shutdown
  - typingsSlinky.intercomWeb.intercomWebStrings.update
  - typingsSlinky.intercomWeb.intercomWebStrings.hide
  - typingsSlinky.intercomWeb.intercomWebStrings.show
  - typingsSlinky.intercomWeb.intercomWebStrings.showMessages
  - typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage
  - typingsSlinky.intercomWeb.intercomWebStrings.onHide
  - typingsSlinky.intercomWeb.intercomWebStrings.onShow
  - typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange
  - typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick
  - typingsSlinky.intercomWeb.intercomWebStrings.trackEvent
  - typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId
*/
trait IntercomCommand extends js.Object

object IntercomCommand {
  @scala.inline
  def boot: typingsSlinky.intercomWeb.intercomWebStrings.boot = this.cast("boot")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def getVisitorId: typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId = this.cast("getVisitorId")
  @scala.inline
  def hide: typingsSlinky.intercomWeb.intercomWebStrings.hide = this.cast("hide")
  @scala.inline
  def onActivatorClick: typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick = this.cast("onActivatorClick")
  @scala.inline
  def onHide: typingsSlinky.intercomWeb.intercomWebStrings.onHide = this.cast("onHide")
  @scala.inline
  def onShow: typingsSlinky.intercomWeb.intercomWebStrings.onShow = this.cast("onShow")
  @scala.inline
  def onUnreadCountChange: typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange = this.cast("onUnreadCountChange")
  @scala.inline
  def show: typingsSlinky.intercomWeb.intercomWebStrings.show = this.cast("show")
  @scala.inline
  def showMessages: typingsSlinky.intercomWeb.intercomWebStrings.showMessages = this.cast("showMessages")
  @scala.inline
  def showNewMessage: typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage = this.cast("showNewMessage")
  @scala.inline
  def shutdown: typingsSlinky.intercomWeb.intercomWebStrings.shutdown = this.cast("shutdown")
  @scala.inline
  def trackEvent: typingsSlinky.intercomWeb.intercomWebStrings.trackEvent = this.cast("trackEvent")
  @scala.inline
  def update: typingsSlinky.intercomWeb.intercomWebStrings.update = this.cast("update")
}

