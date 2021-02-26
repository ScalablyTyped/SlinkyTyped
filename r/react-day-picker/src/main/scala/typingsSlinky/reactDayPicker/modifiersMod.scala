package typingsSlinky.reactDayPicker

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @js.native
  trait ModifiersUtils extends StObject {
    
    def dayMatchesModifier(day: js.Date): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
    
    def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  object ModifiersUtils {
    
    @JSImport("react-day-picker/types/Modifiers", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date): Boolean = js.native
    @JSImport("react-day-picker/types/Modifiers", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
    @JSImport("react-day-picker/types/Modifiers", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
    
    @JSImport("react-day-picker/types/Modifiers", "ModifiersUtils.getModifiersForDay")
    @js.native
    def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
  @js.native
  trait AfterModifier extends _Modifier {
    
    var after: js.Date = js.native
  }
  object AfterModifier {
    
    @scala.inline
    def apply(after: js.Date): AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterModifier]
    }
    
    @scala.inline
    implicit class AfterModifierMutableBuilder[Self <: AfterModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeAfterModifier extends _Modifier {
    
    var after: js.Date = js.native
    
    var before: js.Date = js.native
  }
  object BeforeAfterModifier {
    
    @scala.inline
    def apply(after: js.Date, before: js.Date): BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeAfterModifier]
    }
    
    @scala.inline
    implicit class BeforeAfterModifierMutableBuilder[Self <: BeforeAfterModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeModifier extends _Modifier {
    
    var before: js.Date = js.native
  }
  object BeforeModifier {
    
    @scala.inline
    def apply(before: js.Date): BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeModifier]
    }
    
    @scala.inline
    implicit class BeforeModifierMutableBuilder[Self <: BeforeModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DayModifiers
    extends /* other */ StringDictionary[js.UndefOr[Boolean]] {
    
    var outside: js.UndefOr[Boolean] = js.native
    
    var today: js.UndefOr[Boolean] = js.native
  }
  object DayModifiers {
    
    @scala.inline
    def apply(): DayModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayModifiers]
    }
    
    @scala.inline
    implicit class DayModifiersMutableBuilder[Self <: DayModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutside(value: Boolean): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  @js.native
  trait DaysOfWeekModifier extends _Modifier {
    
    var daysOfWeek: js.Array[Double] = js.native
  }
  object DaysOfWeekModifier {
    
    @scala.inline
    def apply(daysOfWeek: js.Array[Double]): DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[DaysOfWeekModifier]
    }
    
    @scala.inline
    implicit class DaysOfWeekModifierMutableBuilder[Self <: DaysOfWeekModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaysOfWeek(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekVarargs(value: Double*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    }
  }
  
  type FunctionModifier = js.Function1[/* date */ js.Date, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Date
    - typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
    - typingsSlinky.reactDayPicker.modifiersMod.BeforeModifier
    - typingsSlinky.reactDayPicker.modifiersMod.AfterModifier
    - typingsSlinky.reactDayPicker.modifiersMod.BeforeAfterModifier
    - typingsSlinky.reactDayPicker.modifiersMod.DaysOfWeekModifier
    - typingsSlinky.reactDayPicker.modifiersMod.FunctionModifier
    - js.UndefOr[scala.Nothing]
  */
  type Modifier = js.UndefOr[_Modifier | js.Date | FunctionModifier]
  
  @js.native
  trait Modifiers
    extends /* other */ StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] {
    
    var outside: Modifier | js.Array[Modifier] = js.native
    
    var today: Modifier | js.Array[Modifier] = js.native
  }
  object Modifiers {
    
    @scala.inline
    def apply(): Modifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modifiers]
    }
    
    @scala.inline
    implicit class ModifiersMutableBuilder[Self <: Modifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutside(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideDate(value: js.Date): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "outside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setOutsideVarargs(value: Modifier*): Self = StObject.set(x, "outside", js.Array(value :_*))
      
      @scala.inline
      def setToday(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayDate(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "today", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setTodayVarargs(value: Modifier*): Self = StObject.set(x, "today", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RangeModifier extends _Modifier {
    
    var from: js.Date = js.native
    
    var to: js.Date = js.native
  }
  object RangeModifier {
    
    @scala.inline
    def apply(from: js.Date, to: js.Date): RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeModifier]
    }
    
    @scala.inline
    implicit class RangeModifierMutableBuilder[Self <: RangeModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Modifier extends StObject
  object _Modifier {
    
    @scala.inline
    def AfterModifier(after: js.Date): typingsSlinky.reactDayPicker.modifiersMod.AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDayPicker.modifiersMod.AfterModifier]
    }
    
    @scala.inline
    def BeforeAfterModifier(after: js.Date, before: js.Date): typingsSlinky.reactDayPicker.modifiersMod.BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDayPicker.modifiersMod.BeforeAfterModifier]
    }
    
    @scala.inline
    def BeforeModifier(before: js.Date): typingsSlinky.reactDayPicker.modifiersMod.BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDayPicker.modifiersMod.BeforeModifier]
    }
    
    @scala.inline
    def DaysOfWeekModifier(daysOfWeek: js.Array[Double]): typingsSlinky.reactDayPicker.modifiersMod.DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDayPicker.modifiersMod.DaysOfWeekModifier]
    }
    
    @scala.inline
    def RangeModifier(from: js.Date, to: js.Date): typingsSlinky.reactDayPicker.modifiersMod.RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDayPicker.modifiersMod.RangeModifier]
    }
  }
}
