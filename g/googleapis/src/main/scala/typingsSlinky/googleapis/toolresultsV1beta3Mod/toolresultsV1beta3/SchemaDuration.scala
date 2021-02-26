package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Duration represents a signed, fixed-length span of time represented as a
  * count of seconds and fractions of seconds at nanosecond resolution. It is
  * independent of any calendar and concepts like &quot;day&quot; or
  * &quot;month&quot;. It is related to Timestamp in that the difference
  * between two Timestamp values is a Duration and it can be added or
  * subtracted from a Timestamp. Range is approximately +-10,000 years.  #
  * Examples  Example 1: Compute Duration from two Timestamps in pseudo code.
  * Timestamp start = ...; Timestamp end = ...; Duration duration = ...;
  * duration.seconds = end.seconds - start.seconds; duration.nanos = end.nanos
  * - start.nanos;  if (duration.seconds  0) { duration.seconds += 1;
  * duration.nanos -= 1000000000; } else if (durations.seconds &gt; 0
  * &amp;&amp; duration.nanos &lt; 0) { duration.seconds -= 1; duration.nanos
  * += 1000000000; }  Example 2: Compute Timestamp from Timestamp + Duration in
  * pseudo code.  Timestamp start = ...; Duration duration = ...; Timestamp end
  * = ...;  end.seconds = start.seconds + duration.seconds; end.nanos =
  * start.nanos + duration.nanos;  if (end.nanos = 1000000000) { end.seconds +=
  * 1; end.nanos -= 1000000000; }  Example 3: Compute Duration from
  * datetime.timedelta in Python.  td = datetime.timedelta(days=3, minutes=10)
  * duration = Duration() duration.FromTimedelta(td)  # JSON Mapping  In JSON
  * format, the Duration type is encoded as a string rather than an object,
  * where the string ends in the suffix &quot;s&quot; (indicating seconds) and
  * is preceded by the number of seconds, with nanoseconds expressed as
  * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
  * encoded in JSON format as &quot;3s&quot;, while 3 seconds and 1 nanosecond
  * should be expressed in JSON format as &quot;3.000000001s&quot;, and 3
  * seconds and 1 microsecond should be expressed in JSON format as
  * &quot;3.000001s&quot;.
  */
@js.native
trait SchemaDuration extends StObject {
  
  /**
    * Signed fractions of a second at nanosecond resolution of the span of
    * time. Durations less than one second are represented with a 0 `seconds`
    * field and a positive or negative `nanos` field. For durations of one
    * second or more, a non-zero value for the `nanos` field must be of the
    * same sign as the `seconds` field. Must be from -999,999,999 to
    * +999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double] = js.native
  
  /**
    * Signed seconds of the span of time. Must be from -315,576,000,000 to
    * +315,576,000,000 inclusive. Note: these bounds are computed from: 60
    * sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
    */
  var seconds: js.UndefOr[String] = js.native
}
object SchemaDuration {
  
  @scala.inline
  def apply(): SchemaDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuration]
  }
  
  @scala.inline
  implicit class SchemaDurationMutableBuilder[Self <: SchemaDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
