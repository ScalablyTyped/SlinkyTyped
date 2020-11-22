package typingsSlinky.antvComponent.mod

import typingsSlinky.antvComponent.gridBaseMod.GridBase
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Grid")
@js.native
object Grid extends js.Object {
  
  @js.native
  abstract class Base[T /* <: GroupComponentCfg */] () extends GridBase[T]
  
  @js.native
  class Circle ()
    extends typingsSlinky.antvComponent.gridCircleMod.Circle
  
  @js.native
  class Line ()
    extends typingsSlinky.antvComponent.gridLineMod.Line
}
