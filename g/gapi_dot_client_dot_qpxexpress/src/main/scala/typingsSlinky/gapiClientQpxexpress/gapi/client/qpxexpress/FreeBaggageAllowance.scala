package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBaggageAllowance extends js.Object {
  /** A representation of a type of bag, such as an ATPCo subcode, Commercial Name, or other description. */
  var bagDescriptor: js.UndefOr[js.Array[BagDescriptor]] = js.native
  /** The maximum number of kilos all the free baggage together may weigh. */
  var kilos: js.UndefOr[Double] = js.native
  /** The maximum number of kilos any one piece of baggage may weigh. */
  var kilosPerPiece: js.UndefOr[Double] = js.native
  /** Identifies this as free baggage object, allowed on one segment of a trip. Value: the fixed string qpxexpress#freeBaggageAllowance. */
  var kind: js.UndefOr[String] = js.native
  /** The number of free pieces of baggage allowed. */
  var pieces: js.UndefOr[Double] = js.native
  /** The number of pounds of free baggage allowed. */
  var pounds: js.UndefOr[Double] = js.native
}

object FreeBaggageAllowance {
  @scala.inline
  def apply(): FreeBaggageAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBaggageAllowance]
  }
  @scala.inline
  implicit class FreeBaggageAllowanceOps[Self <: FreeBaggageAllowance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBagDescriptor(value: js.Array[BagDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBagDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withKilos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kilos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKilos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kilos")(js.undefined)
        ret
    }
    @scala.inline
    def withKilosPerPiece(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kilosPerPiece")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKilosPerPiece: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kilosPerPiece")(js.undefined)
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
    def withPieces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieces")(js.undefined)
        ret
    }
    @scala.inline
    def withPounds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pounds")(js.undefined)
        ret
    }
  }
  
}

