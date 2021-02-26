package typingsSlinky.ontime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ontime", "ontime")
  @js.native
  def ontime(sched: OntimeSchedule, job: OntimeJob): Unit = js.native
  
  type OntimeJob = js.Function1[/* ot */ OntimeReport, Unit]
  
  @js.native
  trait OntimeReport extends StObject {
    
    /**
      * Clears timers for scheduling jobs that the ontime instance knows.
      * This does not terminate the current execution of a job; you still need to call ot.done() for that purpose.
      */
    def cancel(): Unit = js.native
    
    /**
      * Should be called after the job has been finished.
      * This is important especially when single is set to true because scheduling the next run is done in the method.
      */
    def done(): Unit = js.native
  }
  object OntimeReport {
    
    @scala.inline
    def apply(cancel: () => Unit, done: () => Unit): OntimeReport = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), done = js.Any.fromFunction0(done))
      __obj.asInstanceOf[OntimeReport]
    }
    
    @scala.inline
    implicit class OntimeReportMutableBuilder[Self <: OntimeReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OntimeSchedule extends StObject {
    
    /**
      * ontime determines the cycle of a job based on the format of time expressions. The time expression basically has
      * the form of an ISO-8601 Date Format, YYYY-MM-DDThh:mm:ss where YYYY indicates a year, MM a month, DD a day of the
      * month, hh an hour, mm a minute and ss a second, except that:
      *
      * * A unit can be omitted only when units greater than that are also omitted, which means the day part(DD) cannot be
      * omitted unless the year and month parts(YYYY-MM-) are. This makes ontime's time expression differ from the
      * original ISO-8601 format because the later allows smaller units to be omitted in times. For example, 12 and 12:00
      * denote hh and hh:mm respectively in the ISO-8601 format while ss and mm:ss respectively in the ontime's format;
      * * A space can be used to separate the time part from the date part instead of T as in 2010-01-09 11:00:00;
      * * and ontime allows digits not to be zero-padded; for example, it accepts 2014-5-4T0:0:0 as well as
      * 2014-05-04T00:00:00
      *
      * The time expression is given to ontime through the cycle option. You can give a single expression of the string
      * type like '01-01T12:00:00' or multiple ones as an array of strings like [ '01-01T12:00:00', '7-1T0:0:0' ]
      */
    var cycle: String | js.Array[String] = js.native
    
    /**
      * It is sometimes necessary to run a job on the last day of each month, which have been replaced with doing it on
      * the first day of each month instead. By setting the keepLast option to true, ontime automatically adjusts the
      * date part(DD) to the last day according to the value of the month part(MM) if necessary.
      *
      * Default: false
      */
    var keepLast: js.UndefOr[Boolean] = js.native
    
    /**
      * ontime has a very simple form of logging that is useful when checking if your configuration works as intended.
      * It can be turned on by setting the log option to true.
      *
      * Default: false
      */
    var log: js.UndefOr[Boolean] = js.native
    
    /**
      * ontime launches a job on its scheduled time. If the job takes longer than the time interval of the cycle, more
      * than one instance of the job may run at the same time. The single option keeps another instance of a job from
      * starting if there is already a running one.
      *
      * Default: false
      */
    var single: js.UndefOr[Boolean] = js.native
    
    /**
      * The step option enables a job to be skipped periodically.Setting it to n forces ontime to skip a given job n-1
      * times after a run, which leads to launching the job eveny n cycles.
      *
      * Default: 1
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Setting the utc option to true changes ontime to interpret the time expressions as UTC.
      *
      * Default: false
      */
    var utc: js.UndefOr[Boolean] = js.native
  }
  object OntimeSchedule {
    
    @scala.inline
    def apply(cycle: String | js.Array[String]): OntimeSchedule = {
      val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any])
      __obj.asInstanceOf[OntimeSchedule]
    }
    
    @scala.inline
    implicit class OntimeScheduleMutableBuilder[Self <: OntimeSchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCycle(value: String | js.Array[String]): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleVarargs(value: String*): Self = StObject.set(x, "cycle", js.Array(value :_*))
      
      @scala.inline
      def setKeepLast(value: Boolean): Self = StObject.set(x, "keepLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepLastUndefined: Self = StObject.set(x, "keepLast", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
}
