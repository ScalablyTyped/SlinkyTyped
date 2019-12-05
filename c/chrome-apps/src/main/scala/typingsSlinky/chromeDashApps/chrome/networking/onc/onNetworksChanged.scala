package typingsSlinky.chromeDashApps.chrome.networking.onc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// EVENTS
//
/**
  * Fired when the properties change on any of the networks.
  * Sends a list of GUIDs for networks whose properties have changed.
  */
@JSGlobal("chrome.networking.onc.onNetworksChanged")
@js.native
object onNetworksChanged
  extends TopLevel[
      typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* changes */ js.Array[String], Unit]]
    ]

