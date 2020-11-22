package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.continuousMod.ContinueLegend
import typingsSlinky.antvComponent.legendBaseMod.LegendBase
import typingsSlinky.antvComponent.typesMod.LegendBaseCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/legend", JSImport.Namespace)
@js.native
object legendMod extends js.Object {
  
  @js.native
  abstract class Base[T /* <: LegendBaseCfg */] () extends LegendBase[T]
  
  @js.native
  class Category ()
    extends typingsSlinky.antvComponent.categoryMod.Category
  
  @js.native
  class Continuous () extends ContinueLegend
}
