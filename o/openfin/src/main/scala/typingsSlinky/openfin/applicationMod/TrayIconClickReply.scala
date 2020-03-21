package typingsSlinky.openfin.applicationMod

import typingsSlinky.openfin.baseMod.Reply
import typingsSlinky.openfin.monitorMod.MonitorInfo
import typingsSlinky.openfin.openfinStrings.`tray-icon-clicked`
import typingsSlinky.openfin.openfinStrings.application
import typingsSlinky.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrayIconClickReply
  extends Reply[application, `tray-icon-clicked`]
     with Point {
  var button: Double = js.native
  var monitorInfo: MonitorInfo = js.native
}

