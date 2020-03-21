package typingsSlinky.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.AnonDISCONNECTED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chromeAppsStrings.connected_
import typingsSlinky.chromeApps.chromeAppsStrings.disconnected_
import typingsSlinky.chromeApps.chromeAppsStrings.error
import typingsSlinky.chromeApps.chromeAppsStrings.linkChanged
import typingsSlinky.chromeApps.chromeAppsStrings.linkDown
import typingsSlinky.chromeApps.chromeAppsStrings.linkUp
import typingsSlinky.chromeApps.chromeAppsStrings.resume
import typingsSlinky.chromeApps.chromeAppsStrings.suspend
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            AnonDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkUp | linkChanged | suspend | resume | linkDown | connected_ | error | disconnected_
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

