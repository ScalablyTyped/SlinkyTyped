package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigTextOptions extends BoxOptions {
  /**
    * foreground character. (default: ' ')
    */
  var fch: js.UndefOr[String] = js.native
  /**
    * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var font: js.UndefOr[String] = js.native
  /**
    * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var fontBold: js.UndefOr[String] = js.native
}

object BigTextOptions {
  @scala.inline
  def apply(): BigTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTextOptions]
  }
  @scala.inline
  implicit class BigTextOptionsOps[Self <: BigTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fch")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontBold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBold")(js.undefined)
        ret
    }
  }
  
}

