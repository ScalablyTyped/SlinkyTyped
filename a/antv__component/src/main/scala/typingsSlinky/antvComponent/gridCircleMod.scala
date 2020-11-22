package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.gridBaseMod.GridBase
import typingsSlinky.antvComponent.typesMod.CircleGridCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/grid/circle", JSImport.Namespace)
@js.native
object gridCircleMod extends js.Object {
  
  @js.native
  trait Circle extends GridBase[CircleGridCfg]
  
  @js.native
  class default () extends Circle
}
