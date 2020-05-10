package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpectrumMessage extends js.Object {
  /**
    * The bandwidth (in Hertz) for which permissible power levels are specified. For example, FCC regulation would require only one spectrum specification at
    * 6MHz bandwidth, but Ofcom regulation would require two specifications, at 0.1MHz and 8MHz. This parameter may be empty if there is no available
    * spectrum. It will be present otherwise.
    */
  var bandwidth: js.UndefOr[Double] = js.native
  /** The list of frequency ranges and permissible power levels. The list may be empty if there is no available spectrum, otherwise it will be present. */
  var frequencyRanges: js.UndefOr[js.Array[FrequencyRange]] = js.native
}

object SpectrumMessage {
  @scala.inline
  def apply(): SpectrumMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpectrumMessage]
  }
  @scala.inline
  implicit class SpectrumMessageOps[Self <: SpectrumMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencyRanges(value: js.Array[FrequencyRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencyRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyRanges")(js.undefined)
        ret
    }
  }
  
}

