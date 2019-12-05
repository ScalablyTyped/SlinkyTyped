package typingsSlinky.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPacketReceived")
@js.native
object onPacketReceived
  extends TopLevel[
      typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* data */ ArrayBuffer, Unit]]
    ]

