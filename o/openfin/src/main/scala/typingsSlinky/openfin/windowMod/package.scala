package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowMod {
  type SpecificWindowEvent[Type] = typingsSlinky.openfin.eventsBaseMod.WindowEvent[typingsSlinky.openfin.openfinStrings.window, Type]
  type WindowPerformanceReport[Topic, Type] = org.scalajs.dom.raw.Performance with (typingsSlinky.openfin.eventsBaseMod.WindowEvent[Topic, Type])
}
