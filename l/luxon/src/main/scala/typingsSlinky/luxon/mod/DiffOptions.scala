package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffOptions extends js.Object {
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.native
}

object DiffOptions {
  @scala.inline
  def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  @scala.inline
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionAccuracy(value: ConversionAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionAccuracy")(js.undefined)
        ret
    }
  }
  
}

