package typingsSlinky.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.AnonDISCONNECTED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.DISCONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_CHANGED
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_DOWN
import typingsSlinky.chromeApps.chromeAppsStrings.LINK_UP
import typingsSlinky.chromeApps.chromeAppsStrings.RESUME
import typingsSlinky.chromeApps.chromeAppsStrings.SUSPEND
import typingsSlinky.chromeApps.chromeAppsStrings.connected__
import typingsSlinky.chromeApps.chromeAppsStrings.disconnected__
import typingsSlinky.chromeApps.chromeAppsStrings.error_
import typingsSlinky.chromeApps.chromeAppsStrings.linkChanged
import typingsSlinky.chromeApps.chromeAppsStrings.linkDown
import typingsSlinky.chromeApps.chromeAppsStrings.linkUp
import typingsSlinky.chromeApps.chromeAppsStrings.resume_
import typingsSlinky.chromeApps.chromeAppsStrings.suspend_
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
            /* keyof chrome-apps.AnonDISCONNECTED */ CONNECTED | DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
            Exclude[
              /* keyof chrome-apps.AnonDISCONNECTED */ CONNECTED | DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
              linkUp | linkChanged | suspend_ | resume_ | linkDown | connected__ | error_ | disconnected__
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

