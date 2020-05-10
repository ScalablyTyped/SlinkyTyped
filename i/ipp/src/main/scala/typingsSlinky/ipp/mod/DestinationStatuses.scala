package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationStatuses extends js.Object {
  var `destination-uri`: js.UndefOr[String] = js.native
  var `images-completed`: js.UndefOr[Double] = js.native
  var `transmission-status`: js.UndefOr[TransmissionStatus] = js.native
}

object DestinationStatuses {
  @scala.inline
  def apply(): DestinationStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationStatuses]
  }
  @scala.inline
  implicit class DestinationStatusesOps[Self <: DestinationStatuses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDestination-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withImages-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImages-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withTransmission-status`(value: TransmissionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmission-status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTransmission-status`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmission-status")(js.undefined)
        ret
    }
  }
  
}

