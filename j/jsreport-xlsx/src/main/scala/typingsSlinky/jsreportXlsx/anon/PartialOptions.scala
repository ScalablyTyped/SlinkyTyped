package typingsSlinky.jsreportXlsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-xlsx.jsreport-xlsx.Options> */
@js.native
trait PartialOptions extends js.Object {
  var addBufferSize: js.UndefOr[Double] = js.native
  var escapeAmp: js.UndefOr[Boolean] = js.native
  var numberOfParsedAddIterations: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeAmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeAmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeAmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeAmp")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfParsedAddIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfParsedAddIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfParsedAddIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfParsedAddIterations")(js.undefined)
        ret
    }
  }
  
}

