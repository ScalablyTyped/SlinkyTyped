package typingsSlinky.qrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQuality extends js.Object {
  /**
    * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
    * Default: 0.92
    */
  var quality: js.UndefOr[Double] = js.native
}

object AnonQuality {
  @scala.inline
  def apply(): AnonQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonQuality]
  }
  @scala.inline
  implicit class AnonQualityOps[Self <: AnonQuality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

