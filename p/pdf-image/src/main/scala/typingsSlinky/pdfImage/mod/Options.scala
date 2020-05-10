package typingsSlinky.pdfImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var convertExtension: js.UndefOr[String] = js.native
  var convertOptions: js.UndefOr[ConvertOptions] = js.native
  var graphicsMagick: js.UndefOr[Boolean] = js.native
  var outputDirectory: js.UndefOr[String] = js.native
  var pdfFileBaseName: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertOptions(value: ConvertOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphicsMagick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsMagick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphicsMagick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsMagick")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfFileBaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfFileBaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfFileBaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfFileBaseName")(js.undefined)
        ret
    }
  }
  
}

