package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.legendBaseMod.default
import typingsSlinky.antvComponent.typesMod.LegendBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("@antv/component/lib/legend", "Base")
  @js.native
  abstract class Base[T /* <: LegendBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/legend", "Category")
  @js.native
  class Category ()
    extends typingsSlinky.antvComponent.categoryMod.default
  
  @JSImport("@antv/component/lib/legend", "Continuous")
  @js.native
  class Continuous ()
    extends typingsSlinky.antvComponent.continuousMod.default
}
