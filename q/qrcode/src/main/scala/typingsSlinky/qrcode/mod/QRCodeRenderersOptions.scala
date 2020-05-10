package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.AnonDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeRenderersOptions extends QRCodeOptions {
  var color: js.UndefOr[AnonDark] = js.native
  /**
    * Define how much wide the quiet zone should be.
    * Default: 4
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * Scale factor. A value of 1 means 1px per modules (black dots).
    * Default: 4
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Forces a specific width for the output image.
    * If width is too small to contain the qr symbol, this option will be ignored.
    * Takes precedence over scale.
    */
  var width: js.UndefOr[Double] = js.native
}

object QRCodeRenderersOptions {
  @scala.inline
  def apply(): QRCodeRenderersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeRenderersOptions]
  }
  @scala.inline
  implicit class QRCodeRenderersOptionsOps[Self <: QRCodeRenderersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: AnonDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

