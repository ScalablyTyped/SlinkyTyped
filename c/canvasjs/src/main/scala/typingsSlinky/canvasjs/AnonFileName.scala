package typingsSlinky.canvasjs

import typingsSlinky.canvasjs.canvasjsStrings.jpg
import typingsSlinky.canvasjs.canvasjsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileName extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var format: jpg | png = js.native
  var toDataURL: js.UndefOr[Boolean] = js.native
}

object AnonFileName {
  @scala.inline
  def apply(format: jpg | png): AnonFileName = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileName]
  }
  @scala.inline
  implicit class AnonFileNameOps[Self <: AnonFileName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: jpg | png): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withToDataURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDataURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDataURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDataURL")(js.undefined)
        ret
    }
  }
  
}

