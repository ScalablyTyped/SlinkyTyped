package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiceDeltaEncoding extends js.Object {
  /** The encoded deltas that are encoded using the Golomb-Rice coder. */
  var encodedData: js.UndefOr[String] = js.native
  /**
    * The offset of the first entry in the encoded data, or, if only a single
    * integer was encoded, that single integer's value.
    */
  var firstValue: js.UndefOr[String] = js.native
  /**
    * The number of entries that are delta encoded in the encoded data. If only a
    * single integer was encoded, this will be zero and the single value will be
    * stored in `first_value`.
    */
  var numEntries: js.UndefOr[Double] = js.native
  /**
    * The Golomb-Rice parameter, which is a number between 2 and 28. This field
    * is missing (that is, zero) if `num_entries` is zero.
    */
  var riceParameter: js.UndefOr[Double] = js.native
}

object RiceDeltaEncoding {
  @scala.inline
  def apply(): RiceDeltaEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiceDeltaEncoding]
  }
  @scala.inline
  implicit class RiceDeltaEncodingOps[Self <: RiceDeltaEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodedData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedData")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNumEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withRiceParameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiceParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceParameter")(js.undefined)
        ret
    }
  }
  
}

