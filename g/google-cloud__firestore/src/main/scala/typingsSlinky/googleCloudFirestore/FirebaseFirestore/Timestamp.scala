package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timestamp extends StObject {
  
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return 'true' if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean = js.native
  
  /** The non-negative fractions of a second at nanosecond resolution. */
  val nanoseconds: Double = js.native
  
  /**
    * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
    */
  val seconds: Double = js.native
  
  /**
    * Returns a new `Date` corresponding to this timestamp. This may lose
    * precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    * this `Timestamp`, with millisecond precision.
    */
  def toDate(): js.Date = js.native
  
  /**
    * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    *
    * @return The point in time corresponding to this timestamp, represented as
    * the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): Double = js.native
}
object Timestamp {
  
  @scala.inline
  def apply(
    isEqual: Timestamp => Boolean,
    nanoseconds: Double,
    seconds: Double,
    toDate: () => js.Date,
    toMillis: () => Double
  ): Timestamp = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], toDate = js.Any.fromFunction0(toDate), toMillis = js.Any.fromFunction0(toMillis))
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEqual(value: Timestamp => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToMillis(value: () => Double): Self = StObject.set(x, "toMillis", js.Any.fromFunction0(value))
  }
}
