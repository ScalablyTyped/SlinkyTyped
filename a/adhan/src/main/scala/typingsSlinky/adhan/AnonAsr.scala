package typingsSlinky.adhan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsr extends js.Object {
  var asr: Double = js.native
  var dhuhr: Double = js.native
  var fajr: Double = js.native
  var isha: Double = js.native
  var maghrib: Double = js.native
  var sunrise: Double = js.native
}

object AnonAsr {
  @scala.inline
  def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): AnonAsr = {
    val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsr]
  }
  @scala.inline
  implicit class AnonAsrOps[Self <: AnonAsr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDhuhr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhuhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFajr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fajr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaghrib(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maghrib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunrise(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunrise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

