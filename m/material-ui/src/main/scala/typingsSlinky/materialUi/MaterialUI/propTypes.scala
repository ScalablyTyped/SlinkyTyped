package typingsSlinky.materialUi.MaterialUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypes {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.`bottom-left`
    - typingsSlinky.materialUi.materialUiStrings.`bottom-right`
    - typingsSlinky.materialUi.materialUiStrings.`top-left`
    - typingsSlinky.materialUi.materialUiStrings.`top-right`
  */
  trait corners extends StObject
  object corners {
    
    @scala.inline
    def `bottom-left`: typingsSlinky.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`bottom-right`]
    
    @scala.inline
    def `top-left`: typingsSlinky.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.`bottom-center`
    - typingsSlinky.materialUi.materialUiStrings.`bottom-left`
    - typingsSlinky.materialUi.materialUiStrings.`bottom-right`
    - typingsSlinky.materialUi.materialUiStrings.`top-center`
    - typingsSlinky.materialUi.materialUiStrings.`top-left`
    - typingsSlinky.materialUi.materialUiStrings.`top-right`
  */
  trait cornersAndCenter extends StObject
  object cornersAndCenter {
    
    @scala.inline
    def `bottom-center`: typingsSlinky.materialUi.materialUiStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typingsSlinky.materialUi.materialUiStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.materialUi.materialUiStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typingsSlinky.materialUi.materialUiStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typingsSlinky.materialUi.materialUiStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.materialUi.materialUiStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.left
    - typingsSlinky.materialUi.materialUiStrings.right
    - typingsSlinky.materialUi.materialUiStrings.up
    - typingsSlinky.materialUi.materialUiStrings.down
  */
  trait direction extends StObject
  object direction {
    
    @scala.inline
    def down: typingsSlinky.materialUi.materialUiStrings.down = "down".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.down]
    
    @scala.inline
    def left: typingsSlinky.materialUi.materialUiStrings.left = "left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.left]
    
    @scala.inline
    def right: typingsSlinky.materialUi.materialUiStrings.right = "right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.right]
    
    @scala.inline
    def up: typingsSlinky.materialUi.materialUiStrings.up = "up".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.up]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.left
    - typingsSlinky.materialUi.materialUiStrings.middle
    - typingsSlinky.materialUi.materialUiStrings.right
  */
  trait horizontal extends StObject
  object horizontal {
    
    @scala.inline
    def left: typingsSlinky.materialUi.materialUiStrings.left = "left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.left]
    
    @scala.inline
    def middle: typingsSlinky.materialUi.materialUiStrings.middle = "middle".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.middle]
    
    @scala.inline
    def right: typingsSlinky.materialUi.materialUiStrings.right = "right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.right]
  }
  
  @js.native
  trait origin extends StObject {
    
    var horizontal: typingsSlinky.materialUi.MaterialUI.propTypes.horizontal = js.native
    
    var vertical: typingsSlinky.materialUi.MaterialUI.propTypes.vertical = js.native
  }
  object origin {
    
    @scala.inline
    def apply(horizontal: horizontal, vertical: vertical): origin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[origin]
    }
    
    @scala.inline
    implicit class originMutableBuilder[Self <: origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.left
    - typingsSlinky.materialUi.materialUiStrings.center
    - typingsSlinky.materialUi.materialUiStrings.right
  */
  trait tooltipHorizontal extends StObject
  object tooltipHorizontal {
    
    @scala.inline
    def center: typingsSlinky.materialUi.materialUiStrings.center = "center".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.center]
    
    @scala.inline
    def left: typingsSlinky.materialUi.materialUiStrings.left = "left".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.left]
    
    @scala.inline
    def right: typingsSlinky.materialUi.materialUiStrings.right = "right".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.right]
  }
  
  @js.native
  trait utils extends StObject {
    
    def addDays(date: js.Date, days: Double): js.Date = js.native
    
    def addMonths(date: js.Date, months: Double): js.Date = js.native
    
    def addYears(date: js.Date, years: Double): js.Date = js.native
    
    def getFirstDayOfMonth(date: js.Date): js.Date = js.native
    
    def getWeekArray(date: js.Date, firstDayOfWeek: Double): js.Array[js.Array[js.Date | Null]] = js.native
    
    def getYear(date: js.Date): Double = js.native
    
    def monthDiff(date1: js.Date, date2: js.Date): Double = js.native
    
    def setYear(date: js.Date, year: Double): js.Date = js.native
  }
  object utils {
    
    @scala.inline
    def apply(
      addDays: (js.Date, Double) => js.Date,
      addMonths: (js.Date, Double) => js.Date,
      addYears: (js.Date, Double) => js.Date,
      getFirstDayOfMonth: js.Date => js.Date,
      getWeekArray: (js.Date, Double) => js.Array[js.Array[js.Date | Null]],
      getYear: js.Date => Double,
      monthDiff: (js.Date, js.Date) => Double,
      setYear: (js.Date, Double) => js.Date
    ): utils = {
      val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
      __obj.asInstanceOf[utils]
    }
    
    @scala.inline
    implicit class utilsMutableBuilder[Self <: utils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDays(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addDays", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddMonths(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addMonths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddYears(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addYears", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFirstDayOfMonth(value: js.Date => js.Date): Self = StObject.set(x, "getFirstDayOfMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWeekArray(value: (js.Date, Double) => js.Array[js.Array[js.Date | Null]]): Self = StObject.set(x, "getWeekArray", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetYear(value: js.Date => Double): Self = StObject.set(x, "getYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonthDiff(value: (js.Date, js.Date) => Double): Self = StObject.set(x, "monthDiff", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetYear(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "setYear", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUi.materialUiStrings.top
    - typingsSlinky.materialUi.materialUiStrings.center
    - typingsSlinky.materialUi.materialUiStrings.bottom
  */
  trait vertical extends StObject
  object vertical {
    
    @scala.inline
    def bottom: typingsSlinky.materialUi.materialUiStrings.bottom = "bottom".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.materialUi.materialUiStrings.center = "center".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.center]
    
    @scala.inline
    def top: typingsSlinky.materialUi.materialUiStrings.top = "top".asInstanceOf[typingsSlinky.materialUi.materialUiStrings.top]
  }
}
