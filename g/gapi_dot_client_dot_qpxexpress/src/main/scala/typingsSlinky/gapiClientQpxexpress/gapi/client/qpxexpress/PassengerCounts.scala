package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassengerCounts extends js.Object {
  /** The number of passengers that are adults. */
  var adultCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are children. */
  var childCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are infants travelling in the lap of an adult. */
  var infantInLapCount: js.UndefOr[Double] = js.native
  /** The number of passengers that are infants each assigned a seat. */
  var infantInSeatCount: js.UndefOr[Double] = js.native
  /** Identifies this as a passenger count object, representing the number of passengers. Value: the fixed string qpxexpress#passengerCounts. */
  var kind: js.UndefOr[String] = js.native
  /** The number of passengers that are senior citizens. */
  var seniorCount: js.UndefOr[Double] = js.native
}

object PassengerCounts {
  @scala.inline
  def apply(): PassengerCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassengerCounts]
  }
  @scala.inline
  implicit class PassengerCountsOps[Self <: PassengerCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdultCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adultCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdultCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adultCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChildCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInfantInLapCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infantInLapCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfantInLapCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infantInLapCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInfantInSeatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infantInSeatCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfantInSeatCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infantInSeatCount")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSeniorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seniorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeniorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seniorCount")(js.undefined)
        ret
    }
  }
  
}

