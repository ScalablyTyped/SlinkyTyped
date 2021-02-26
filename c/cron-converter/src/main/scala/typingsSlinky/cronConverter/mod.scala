package typingsSlinky.cronConverter

import typingsSlinky.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron-converter", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of Cron.
    * Cron objects each represent a cron schedule.
    * @param options The options to use.
    */
  class ^ () extends Cron {
    def this(options: Options) = this()
  }
  
  @JSImport("cron-converter", "Seeker")
  @js.native
  class Seeker protected () extends StObject {
    /**
      * Creates an instance of Seeker.
      * Seeker objects search for execution times of a cron schedule.
      * @param cron A Cron instance.
      * @param now A Date or Moment object.
      */
    def this(cron: Cron, now: js.Date) = this()
    
    /**
      * Returns the time the schedule would run next.
      */
    def next(): Moment = js.native
    
    /**
      * Returns the time the schedule would have last run at.
      */
    def prev(): Moment = js.native
    
    /**
      * Resets the iterator.
      */
    def reset(): Unit = js.native
  }
  
  @js.native
  trait Cron extends StObject {
    
    /**
      * Parses a 2-dimensional array of integers as a cron schedule.
      * @param cronArr The array to parse.
      */
    def fromArray(cronArr: CronArray): Cron = js.native
    
    /**
      * Parses a cron string.
      * @param str The string to parse.
      */
    def fromString(str: String): Cron = js.native
    
    /**
      * Returns the time the schedule would run next.
      * @param now A Date or Moment object.
      */
    def schedule(): Seeker = js.native
    def schedule(now: js.Date): Seeker = js.native
    def schedule(now: Moment): Seeker = js.native
    
    /**
      * Returns the cron schedule as a 2-dimensional array of integers.
      */
    def toArray(): CronArray = js.native
  }
  
  type CronArray = js.Tuple5[js.Array[Double], js.Array[Double], js.Array[Double], js.Array[Double], js.Array[Double]]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Changes the * to H on the `toString()`.
      * Default: `false`.
      */
    var outputHashes: js.UndefOr[Boolean] = js.native
    
    /**
      * Changes the numbers to 3 letter month names on the `toString()`.
      * Default: `false`.
      */
    var outputMonthNames: js.UndefOr[Boolean] = js.native
    
    /**
      * Changes the numbers to 3 letter weekday names on the `toString()`.
      * Default: `false`.
      */
    var outputWeekdayNames: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines a timezone to the cron instance.
      * Default: `Local timezone`.
      */
    var timezone: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputHashes(value: Boolean): Self = StObject.set(x, "outputHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputHashesUndefined: Self = StObject.set(x, "outputHashes", js.undefined)
      
      @scala.inline
      def setOutputMonthNames(value: Boolean): Self = StObject.set(x, "outputMonthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputMonthNamesUndefined: Self = StObject.set(x, "outputMonthNames", js.undefined)
      
      @scala.inline
      def setOutputWeekdayNames(value: Boolean): Self = StObject.set(x, "outputWeekdayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputWeekdayNamesUndefined: Self = StObject.set(x, "outputWeekdayNames", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
}
