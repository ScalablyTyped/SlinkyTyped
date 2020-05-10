package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.pdfmakeStrings.H
import typingsSlinky.pdfmake.pdfmakeStrings.L
import typingsSlinky.pdfmake.pdfmakeStrings.M
import typingsSlinky.pdfmake.pdfmakeStrings.Q
import typingsSlinky.pdfmake.pdfmakeStrings.alphanumeric
import typingsSlinky.pdfmake.pdfmakeStrings.numeric
import typingsSlinky.pdfmake.pdfmakeStrings.octet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentQr
  extends ContentBase
     with _Content {
  var eccLevel: js.UndefOr[L | M | Q | H] = js.native
  var fit: js.UndefOr[Double] = js.native
  var foreground: js.UndefOr[String] = js.native
  var mask: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[numeric | alphanumeric | octet] = js.native
  var qr: String = js.native
  var version: js.UndefOr[Double] = js.native
}

object ContentQr {
  @scala.inline
  def apply(qr: String): ContentQr = {
    val __obj = js.Dynamic.literal(qr = qr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQr]
  }
  @scala.inline
  implicit class ContentQrOps[Self <: ContentQr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEccLevel(value: L | M | Q | H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eccLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEccLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eccLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: numeric | alphanumeric | octet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

