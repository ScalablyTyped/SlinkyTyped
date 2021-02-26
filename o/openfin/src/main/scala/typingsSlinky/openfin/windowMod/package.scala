package typingsSlinky.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object windowMod {
  
  type SpecificWindowEvent[Type] = typingsSlinky.openfin.eventsBaseMod.WindowEvent[typingsSlinky.openfin.openfinStrings.window, Type]
  
  type WindowPerformanceReport[Topic, Type] = org.scalajs.dom.raw.Performance with (typingsSlinky.openfin.eventsBaseMod.WindowEvent[Topic, Type])
}
