package typingsSlinky.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeDashApps.Anon_CONNECTEDConnectedDISCONNECTED
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.connected_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.disconnected_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.error
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.linkChanged
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.linkDown
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.linkUp
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.resume
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.suspend
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      typingsSlinky.chromeDashApps.chrome.events.Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            Anon_CONNECTEDConnectedDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkChanged | linkUp | suspend | error | connected_ | resume | disconnected_ | linkDown
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

