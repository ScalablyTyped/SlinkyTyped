package typingsSlinky.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PdfOptions extends Options {
  var antialias: js.UndefOr[Boolean] = js.native
  var cores: js.UndefOr[Double] = js.native
  var save: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PdfOptions {
  @scala.inline
  def apply(): PdfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfOptions]
  }
  @scala.inline
  implicit class PdfOptionsOps[Self <: PdfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withCores(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cores")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
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
  }
  
}

