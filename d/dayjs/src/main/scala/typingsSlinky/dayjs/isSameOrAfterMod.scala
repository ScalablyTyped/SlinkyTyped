package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.esmMod.ConfigType
import typingsSlinky.dayjs.esmMod.OpUnitType
import typingsSlinky.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSameOrAfterMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isSameOrAfter", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isSameOrAfterMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrAfter(date: ConfigType): Boolean = js.native
      def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    }
  }
}
