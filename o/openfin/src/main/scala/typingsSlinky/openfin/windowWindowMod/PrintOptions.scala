package typingsSlinky.openfin.windowWindowMod

import typingsSlinky.openfin.openfinStrings.longEdge
import typingsSlinky.openfin.openfinStrings.shortEdge
import typingsSlinky.openfin.openfinStrings.simplex
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintOptions extends js.Object {
  var collate: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var copies: js.UndefOr[Double] = js.native
  var deviceName: js.UndefOr[String] = js.native
  var dpi: js.UndefOr[Dpi] = js.native
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.native
  var landscape: js.UndefOr[Boolean] = js.native
  var margins: js.UndefOr[Margins] = js.native
  var pageRanges: js.UndefOr[Record[String, Double]] = js.native
  var pagesPerSheet: js.UndefOr[Double] = js.native
  var printBackground: js.UndefOr[Boolean] = js.native
  var scaleFactor: js.UndefOr[Double] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object PrintOptions {
  @scala.inline
  def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Boolean): Self = {
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
    def withCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDpi(value: Dpi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplexMode(value: simplex | shortEdge | longEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplexMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplexMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplexMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(js.undefined)
        ret
    }
    @scala.inline
    def withMargins(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(js.undefined)
        ret
    }
    @scala.inline
    def withPageRanges(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPagesPerSheet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesPerSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagesPerSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesPerSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

