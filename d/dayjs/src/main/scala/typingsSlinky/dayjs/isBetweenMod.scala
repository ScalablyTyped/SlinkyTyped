package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.esmMod.ConfigType
import typingsSlinky.dayjs.esmMod.OpUnitType
import typingsSlinky.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBetweenMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isBetween", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isBetweenMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: js.UndefOr[scala.Nothing], d: String): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
    }
  }
}
