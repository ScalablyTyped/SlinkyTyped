package typingsSlinky.cordovarduino.Cordovardunio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialOptions extends js.Object {
  /**
    * @defaultValue 9600
    */
  var baudRate: js.UndefOr[Double] = js.native
  /**
    * @defaultValue 8
    */
  var dataBits: js.UndefOr[Double] = js.native
  /**
    * @defaultValue 0
    */
  var parity: js.UndefOr[Double] = js.native
  /**
    * @defaultValue 1
    */
  var stopBits: js.UndefOr[Double] = js.native
}

object SerialOptions {
  @scala.inline
  def apply(): SerialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialOptions]
  }
  @scala.inline
  implicit class SerialOptionsOps[Self <: SerialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaudRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaudRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(js.undefined)
        ret
    }
    @scala.inline
    def withParity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(js.undefined)
        ret
    }
    @scala.inline
    def withStopBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(js.undefined)
        ret
    }
  }
  
}

