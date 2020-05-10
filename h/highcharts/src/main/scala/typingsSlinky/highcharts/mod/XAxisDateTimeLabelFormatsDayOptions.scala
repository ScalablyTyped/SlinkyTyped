package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.native
}

object XAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(): XAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsDayOptions]
  }
  @scala.inline
  implicit class XAxisDateTimeLabelFormatsDayOptionsOps[Self <: XAxisDateTimeLabelFormatsDayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
  }
  
}

