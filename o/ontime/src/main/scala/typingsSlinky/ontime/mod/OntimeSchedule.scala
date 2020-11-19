package typingsSlinky.ontime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OntimeSchedule extends js.Object {
  
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
  implicit class OntimeScheduleOps[Self <: OntimeSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCycleVarargs(value: String*): Self = this.set("cycle", js.Array(value :_*))
    
    @scala.inline
    def setCycle(value: String | js.Array[String]): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLast(value: Boolean): Self = this.set("keepLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLast: Self = this.set("keepLast", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setUtc(value: Boolean): Self = this.set("utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtc: Self = this.set("utc", js.undefined)
  }
}
