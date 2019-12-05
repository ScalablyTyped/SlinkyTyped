package typingsSlinky.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeDashApps.Anon_SHOWADDDIALOG
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.showAddDialog
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.showConfigureDialog
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
      typingsSlinky.chromeDashApps.chrome.events.Event[
        js.Function2[
          /* event */ ToStringLiteral[Anon_SHOWADDDIALOG, String, Exclude[String, showAddDialog | showConfigureDialog]], 
          /* id */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]

