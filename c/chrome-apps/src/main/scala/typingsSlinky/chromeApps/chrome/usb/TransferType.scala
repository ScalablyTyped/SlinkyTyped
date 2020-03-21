package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chromeAppsStrings.bulk
import typingsSlinky.chromeApps.chromeAppsStrings.control
import typingsSlinky.chromeApps.chromeAppsStrings.interrupt
import typingsSlinky.chromeApps.chromeAppsStrings.isochronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
@JSGlobal("chrome.usb.TransferType")
@js.native
object TransferType extends js.Object {
  var BULK: bulk = js.native
  var CONTROL: control = js.native
  var INTERRUPT: interrupt = js.native
  var ISOCHRONOUS: isochronous = js.native
}

