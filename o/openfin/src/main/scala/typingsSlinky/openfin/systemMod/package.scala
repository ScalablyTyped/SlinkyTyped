package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object systemMod {
  
  type MonitorEvent[Topic, Type] = typingsSlinky.openfin.monitorMod.MonitorInfo with (typingsSlinky.openfin.eventsBaseMod.BaseEvent[Topic, Type])
}
