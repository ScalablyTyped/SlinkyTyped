package typingsSlinky.javascriptTimeAgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradationMod {
  
  @JSImport("javascript-time-ago/gradation", "canonical")
  @js.native
  val canonical: js.Array[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation", "convenient")
  @js.native
  val convenient: js.Array[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation", "day")
  @js.native
  val day: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "getDate")
  @js.native
  def getDate(value: js.Date): js.Date = js.native
  @JSImport("javascript-time-ago/gradation", "getDate")
  @js.native
  def getDate(value: Double): js.Date = js.native
  
  @JSImport("javascript-time-ago/gradation", "getStep")
  @js.native
  def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation", "hour")
  @js.native
  val hour: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "minute")
  @js.native
  val minute: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "month")
  @js.native
  val month: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "year")
  @js.native
  val year: Double = js.native
  
  @js.native
  trait Gradation extends StObject {
    
    var factor: js.UndefOr[Double] = js.native
    
    var granularity: js.UndefOr[Double] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var threshold_for_day: js.UndefOr[Double] = js.native
    
    var threshold_for_hour: js.UndefOr[Double] = js.native
    
    var threshold_for_minute: js.UndefOr[Double] = js.native
    
    var threshold_for_month: js.UndefOr[Double] = js.native
    
    var threshold_for_now: js.UndefOr[Double] = js.native
    
    var threshold_for_second: js.UndefOr[Double] = js.native
    
    var threshold_for_week: js.UndefOr[Double] = js.native
    
    var threshold_for_year: js.UndefOr[Double] = js.native
    
    var unit: js.UndefOr[Unit] = js.native
  }
  object Gradation {
    
    @scala.inline
    def apply(): Gradation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gradation]
    }
    
    @scala.inline
    implicit class GradationMutableBuilder[Self <: Gradation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setThreshold_for_day(value: Double): Self = StObject.set(x, "threshold_for_day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_dayUndefined: Self = StObject.set(x, "threshold_for_day", js.undefined)
      
      @scala.inline
      def setThreshold_for_hour(value: Double): Self = StObject.set(x, "threshold_for_hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_hourUndefined: Self = StObject.set(x, "threshold_for_hour", js.undefined)
      
      @scala.inline
      def setThreshold_for_minute(value: Double): Self = StObject.set(x, "threshold_for_minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_minuteUndefined: Self = StObject.set(x, "threshold_for_minute", js.undefined)
      
      @scala.inline
      def setThreshold_for_month(value: Double): Self = StObject.set(x, "threshold_for_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_monthUndefined: Self = StObject.set(x, "threshold_for_month", js.undefined)
      
      @scala.inline
      def setThreshold_for_now(value: Double): Self = StObject.set(x, "threshold_for_now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_nowUndefined: Self = StObject.set(x, "threshold_for_now", js.undefined)
      
      @scala.inline
      def setThreshold_for_second(value: Double): Self = StObject.set(x, "threshold_for_second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_secondUndefined: Self = StObject.set(x, "threshold_for_second", js.undefined)
      
      @scala.inline
      def setThreshold_for_week(value: Double): Self = StObject.set(x, "threshold_for_week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_weekUndefined: Self = StObject.set(x, "threshold_for_week", js.undefined)
      
      @scala.inline
      def setThreshold_for_year(value: Double): Self = StObject.set(x, "threshold_for_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold_for_yearUndefined: Self = StObject.set(x, "threshold_for_year", js.undefined)
      
      @scala.inline
      def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def day: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day = "day".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day]
    
    @scala.inline
    def hour: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour = "hour".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour]
    
    @scala.inline
    def minute: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute = "minute".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month = "month".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month]
    
    @scala.inline
    def now: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now = "now".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now]
    
    @scala.inline
    def second: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second = "second".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second]
    
    @scala.inline
    def week: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week = "week".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week]
    
    @scala.inline
    def year: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year = "year".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year]
  }
}
