package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpectrumSchedule extends js.Object {
  /** The event time expresses when the spectrum profile is valid. It will always be present. */
  var eventTime: js.UndefOr[EventTime] = js.native
  /** A list of spectrum messages representing the usable profile. It will always be present, but may be empty when there is no available spectrum. */
  var spectra: js.UndefOr[js.Array[SpectrumMessage]] = js.native
}

object SpectrumSchedule {
  @scala.inline
  def apply(): SpectrumSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpectrumSchedule]
  }
  @scala.inline
  implicit class SpectrumScheduleOps[Self <: SpectrumSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTime(value: EventTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectra(value: js.Array[SpectrumMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectra")(js.undefined)
        ret
    }
  }
  
}

