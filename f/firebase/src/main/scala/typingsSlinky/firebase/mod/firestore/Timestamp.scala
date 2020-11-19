package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "firestore.Timestamp")
@js.native
class Timestamp protected () extends js.Object {
  /**
    * Creates a new timestamp.
    *
    * @param seconds The number of seconds of UTC time since Unix epoch
    *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
    *     9999-12-31T23:59:59Z inclusive.
    * @param nanoseconds The non-negative fractions of a second at nanosecond
    *     resolution. Negative second values with fractions must still have
    *     non-negative nanoseconds values that count forward in time. Must be
    *     from 0 to 999,999,999 inclusive.
    */
  def this(seconds: Double, nanoseconds: Double) = this()
  
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return true if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean = js.native
  
  val nanoseconds: Double = js.native
  
  val seconds: Double = js.native
  
  /**
    * Convert a Timestamp to a JavaScript `Date` object. This conversion causes
    * a loss of precision since `Date` objects only support millisecond precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */
  def toDate(): js.Date = js.native
  
  /**
    * Convert a timestamp to a numeric timestamp (in milliseconds since epoch).
    * This operation causes a loss of precision.
    *
    * @return The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): Double = js.native
}
/* static members */
@JSImport("firebase", "firestore.Timestamp")
@js.native
object Timestamp extends js.Object {
  
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date The date to initialize the `Timestamp` from.
    * @return A new `Timestamp` representing the same point in time as the given
    *     date.
    */
  def fromDate(date: js.Date): Timestamp = js.native
  
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds Number of milliseconds since Unix epoch
    *     1970-01-01T00:00:00Z.
    * @return A new `Timestamp` representing the same point in time as the given
    *     number of milliseconds.
    */
  def fromMillis(milliseconds: Double): Timestamp = js.native
  
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @return a new timestamp representing the current date.
    */
  def now(): Timestamp = js.native
}
