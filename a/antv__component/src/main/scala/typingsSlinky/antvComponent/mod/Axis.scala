package typingsSlinky.antvComponent.mod

import typingsSlinky.antvComponent.baseMod.AxisBase
import typingsSlinky.antvComponent.typesMod.AxisBaseCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Axis")
@js.native
object Axis extends js.Object {
  
  @js.native
  abstract class Base[T /* <: AxisBaseCfg */] () extends AxisBase[T]
  
  @js.native
  class Circle ()
    extends typingsSlinky.antvComponent.circleMod.Circle
  
  @js.native
  class Line ()
    extends typingsSlinky.antvComponent.axisLineMod.Line
}
