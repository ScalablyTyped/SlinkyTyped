package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.mod.ConfigType
import typingsSlinky.dayjs.mod.PluginFunc
import typingsSlinky.dayjs.mod.QUnitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginQuarterOfYearMod extends Shortcut {
  
  @JSImport("dayjs/plugin/quarterOfYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginQuarterOfYearMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def add(value: Double, unit: QUnitType): Dayjs = js.native
      
      def endOf(unit: QUnitType): Dayjs = js.native
      
      def isAfter(date: ConfigType): Boolean = js.native
      def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def isBefore(date: ConfigType): Boolean = js.native
      def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def isSame(date: ConfigType): Boolean = js.native
      def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def quarter(): Double = js.native
      def quarter(quarter: Double): Dayjs = js.native
      
      def startOf(unit: QUnitType): Dayjs = js.native
      
      def subtract(value: Double, unit: QUnitType): Dayjs = js.native
    }
  }
}
