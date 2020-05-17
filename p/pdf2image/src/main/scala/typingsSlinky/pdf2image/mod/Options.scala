package typingsSlinky.pdf2image.mod

import typingsSlinky.pdf2image.anon.TypeofimportedVm
import typingsSlinky.pdf2image.pdf2imageStrings.Asterisk
import typingsSlinky.pdf2image.pdf2imageStrings.Dotjpg
import typingsSlinky.pdf2image.pdf2imageStrings.Dotpng
import typingsSlinky.pdf2image.pdf2imageStrings.jpg
import typingsSlinky.pdf2image.pdf2imageStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var backgroundColor: String = js.native
  var density: Double = js.native
  var height: Double = js.native
  	// #ffffff
  var outputFormat: OutputFormat = js.native
  var outputType: jpg | png | Dotjpg | Dotpng = js.native
  var pages: Asterisk | String = js.native
  var quality: Double = js.native
  	// * | even | odd | '/1,/3,5-6,-8, 9-'
  var singleProcess: Boolean = js.native
  var width: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    backgroundColor: String,
    density: Double,
    height: Double,
    outputFormat: OutputFormat,
    outputType: jpg | png | Dotjpg | Dotpng,
    pages: Asterisk | String,
    quality: Double,
    singleProcess: Boolean,
    width: Double
  ): Options = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], singleProcess = singleProcess.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputFormatFunction7(
      value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withOutputFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputType(value: jpg | png | Dotjpg | Dotpng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Asterisk | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleProcess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

