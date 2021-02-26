package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.mod.ConfigType
import typingsSlinky.dayjs.mod.OpUnitType
import typingsSlinky.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsBetweenMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isBetween", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsBetweenMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
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
