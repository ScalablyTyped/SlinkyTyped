package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.baseMod.default
import typingsSlinky.antvComponent.typesMod.AxisBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  @JSImport("@antv/component/lib/axis", "Base")
  @js.native
  abstract class Base[T /* <: AxisBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/axis", "Circle")
  @js.native
  class Circle ()
    extends typingsSlinky.antvComponent.circleMod.default
  
  @JSImport("@antv/component/lib/axis", "Line")
  @js.native
  class Line ()
    extends typingsSlinky.antvComponent.axisLineMod.default
}
