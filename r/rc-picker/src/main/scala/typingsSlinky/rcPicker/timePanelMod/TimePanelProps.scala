package typingsSlinky.rcPicker.timePanelMod

import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePanelProps[DateType]
  extends SharedTimeProps[DateType]
     with PanelSharedProps[DateType] {
  var active: js.UndefOr[Boolean] = js.native
}

