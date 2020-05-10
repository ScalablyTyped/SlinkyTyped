package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentInfo extends js.Object {
  /** The booking code or class for this segment. */
  var bookingCode: js.UndefOr[String] = js.native
  /** The number of seats available in this booking code on this segment. */
  var bookingCodeCount: js.UndefOr[Double] = js.native
  /** The cabin booked for this segment. */
  var cabin: js.UndefOr[String] = js.native
  /** In minutes, the duration of the connection following this segment. */
  var connectionDuration: js.UndefOr[Double] = js.native
  /** The duration of the flight segment in minutes. */
  var duration: js.UndefOr[Double] = js.native
  /** The flight this is a segment of. */
  var flight: js.UndefOr[FlightInfo] = js.native
  /** An id uniquely identifying the segment in the solution. */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this as a segment object. A segment is one or more consecutive legs on the same flight. For example a hypothetical flight ZZ001, from DFW to
    * OGG, could have one segment with two legs: DFW to HNL (leg 1), HNL to OGG (leg 2). Value: the fixed string qpxexpress#segmentInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** The legs composing this segment. */
  var leg: js.UndefOr[js.Array[LegInfo]] = js.native
  /**
    * The solution-based index of a segment in a married segment group. Married segments can only be booked together. For example, an airline might report a
    * certain booking code as sold out from Boston to Pittsburgh, but as available as part of two married segments Boston to Chicago connecting through
    * Pittsburgh. For example content of this field, consider the round-trip flight ZZ1 PHX-PHL ZZ2 PHL-CLT ZZ3 CLT-PHX. This has three segments, with the
    * two outbound ones (ZZ1 ZZ2) married. In this case, the two outbound segments belong to married segment group 0, and the return segment belongs to
    * married segment group 1.
    */
  var marriedSegmentGroup: js.UndefOr[String] = js.native
  /** Whether the operation of this segment remains subject to government approval. */
  var subjectToGovernmentApproval: js.UndefOr[Boolean] = js.native
}

object SegmentInfo {
  @scala.inline
  def apply(): SegmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentInfo]
  }
  @scala.inline
  implicit class SegmentInfoOps[Self <: SegmentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookingCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookingCode")(js.undefined)
        ret
    }
    @scala.inline
    def withBookingCodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookingCodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookingCodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookingCodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCabin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cabin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCabin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cabin")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFlight(value: FlightInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flight")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLeg(value: js.Array[LegInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leg")(js.undefined)
        ret
    }
    @scala.inline
    def withMarriedSegmentGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marriedSegmentGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarriedSegmentGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marriedSegmentGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectToGovernmentApproval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectToGovernmentApproval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectToGovernmentApproval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectToGovernmentApproval")(js.undefined)
        ret
    }
  }
  
}

