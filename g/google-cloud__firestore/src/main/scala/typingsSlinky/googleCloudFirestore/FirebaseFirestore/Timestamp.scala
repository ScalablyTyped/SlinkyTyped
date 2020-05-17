package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timestamp extends js.Object {
  /** The non-negative fractions of a second at nanosecond resolution. */
  val nanoseconds: Double = js.native
  /**
    * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
    */
  val seconds: Double = js.native
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return 'true' if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean = js.native
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
  implicit class TimestampOps[Self <: Timestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEqual(value: Timestamp => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNanoseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanoseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToMillis(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMillis")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

