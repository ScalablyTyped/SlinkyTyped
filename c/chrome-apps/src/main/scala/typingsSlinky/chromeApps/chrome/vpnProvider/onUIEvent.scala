package typingsSlinky.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.AnonSHOWADDDIALOG
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chromeAppsStrings.SHOW_ADD_DIALOG
import typingsSlinky.chromeApps.chromeAppsStrings.SHOW_CONFIGURE_DIALOG
import typingsSlinky.chromeApps.chromeAppsStrings.showAddDialog
import typingsSlinky.chromeApps.chromeAppsStrings.showConfigureDialog
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Triggered when there is a UI event for the extension.
  * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
  */
@JSGlobal("chrome.vpnProvider.onUIEvent")
@js.native
object onUIEvent
  extends TopLevel[
      Event[
        js.Function2[
          /* event */ ToStringLiteral[
            AnonSHOWADDDIALOG, 
            /* keyof chrome-apps.AnonSHOWADDDIALOG */ SHOW_ADD_DIALOG | SHOW_CONFIGURE_DIALOG, 
            Exclude[
              /* keyof chrome-apps.AnonSHOWADDDIALOG */ SHOW_ADD_DIALOG | SHOW_CONFIGURE_DIALOG, 
              showAddDialog | showConfigureDialog
            ]
          ], 
          /* id */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]

