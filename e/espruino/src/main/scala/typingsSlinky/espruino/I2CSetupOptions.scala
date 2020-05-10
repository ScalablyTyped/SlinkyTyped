package typingsSlinky.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I2CSetupOptions extends js.Object {
  var bitrate: js.UndefOr[Double] = js.native
  var scl: Pin = js.native
  var sda: Pin = js.native
}

object I2CSetupOptions {
  @scala.inline
  def apply(scl: Pin, sda: Pin): I2CSetupOptions = {
    val __obj = js.Dynamic.literal(scl = scl.asInstanceOf[js.Any], sda = sda.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CSetupOptions]
  }
  @scala.inline
  implicit class I2CSetupOptionsOps[Self <: I2CSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScl(value: Pin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSda(value: Pin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
  }
  
}

