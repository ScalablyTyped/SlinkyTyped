package typingsSlinky.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSAltitude extends js.Object {
  var GPSAltitude: js.UndefOr[Double] = js.native
  var GPSAltitudeRef: js.UndefOr[Double] = js.native
  var GPSDateStamp: js.UndefOr[String] = js.native
  var GPSLatitude: js.UndefOr[js.Array[Double]] = js.native
  var GPSLatitudeRef: js.UndefOr[String] = js.native
  var GPSLongitude: js.UndefOr[js.Array[Double]] = js.native
  var GPSLongitudeRef: js.UndefOr[String] = js.native
  var GPSTimeStamp: js.UndefOr[js.Array[Double]] = js.native
  var GPSVersionId: js.UndefOr[js.Array[Double]] = js.native
}

object GPSAltitude {
  @scala.inline
  def apply(): GPSAltitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPSAltitude]
  }
  @scala.inline
  implicit class GPSAltitudeOps[Self <: GPSAltitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGPSAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSAltitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSAltitude")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSAltitudeRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSAltitudeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSAltitudeRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSAltitudeRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSDateStamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSDateStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSDateStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSDateStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSLatitude(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLatitude")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSLatitudeRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLatitudeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSLatitudeRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLatitudeRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSLongitude(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLongitude")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSLongitudeRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLongitudeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSLongitudeRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSLongitudeRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSTimeStamp(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSVersionId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSVersionId")(js.undefined)
        ret
    }
  }
  
}

