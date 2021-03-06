package typingsSlinky.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dayjs.dayjsStrings.m_
import typingsSlinky.dayjs.esmMod.ConfigType
import typingsSlinky.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isoWeekMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isoWeek", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dayjs.dayjsStrings.isoWeek
    - typingsSlinky.dayjs.dayjsStrings.week
    - typingsSlinky.dayjs.dayjsStrings.w
    - typingsSlinky.dayjs.dayjsStrings.millisecond
    - typingsSlinky.dayjs.dayjsStrings.second
    - typingsSlinky.dayjs.dayjsStrings.minute
    - typingsSlinky.dayjs.dayjsStrings.hour
    - typingsSlinky.dayjs.dayjsStrings.day
    - typingsSlinky.dayjs.dayjsStrings.month
    - typingsSlinky.dayjs.dayjsStrings.year
    - typingsSlinky.dayjs.dayjsStrings.date
    - typingsSlinky.dayjs.dayjsStrings.d
    - typingsSlinky.dayjs.dayjsStrings.M
    - typingsSlinky.dayjs.dayjsStrings.y
    - typingsSlinky.dayjs.dayjsStrings.h
    - typingsSlinky.dayjs.dayjsStrings.m_
    - typingsSlinky.dayjs.dayjsStrings.s
    - typingsSlinky.dayjs.dayjsStrings.ms
  */
  trait ISOUnitType extends StObject
  object ISOUnitType {
    
    @scala.inline
    def M: typingsSlinky.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: typingsSlinky.dayjs.dayjsStrings.d = "d".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.d]
    
    @scala.inline
    def date: typingsSlinky.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.date]
    
    @scala.inline
    def day: typingsSlinky.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.day]
    
    @scala.inline
    def h: typingsSlinky.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.h]
    
    @scala.inline
    def hour: typingsSlinky.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def isoWeek: typingsSlinky.dayjs.dayjsStrings.isoWeek = "isoWeek".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.isoWeek]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def millisecond: typingsSlinky.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def minute: typingsSlinky.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.month]
    
    @scala.inline
    def ms: typingsSlinky.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: typingsSlinky.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: typingsSlinky.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.second]
    
    @scala.inline
    def w: typingsSlinky.dayjs.dayjsStrings.w = "w".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.w]
    
    @scala.inline
    def week: typingsSlinky.dayjs.dayjsStrings.week = "week".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.week]
    
    @scala.inline
    def y: typingsSlinky.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: typingsSlinky.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.year]
  }
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isoWeekMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def endOf(unit: ISOUnitType): Dayjs = js.native
      
      def isAfter(date: ConfigType): Boolean = js.native
      def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isBefore(date: ConfigType): Boolean = js.native
      def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isSame(date: ConfigType): Boolean = js.native
      def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
      
      def isoWeek(): Double = js.native
      def isoWeek(value: Double): Dayjs = js.native
      
      def isoWeekYear(): Double = js.native
      
      def isoWeekday(): Double = js.native
      def isoWeekday(value: Double): Dayjs = js.native
      
      def startOf(unit: ISOUnitType): Dayjs = js.native
    }
  }
}
