package typingsSlinky.antd.statisticUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountdownFormatConfig extends FormatConfig {
  var format: js.UndefOr[String] = js.native
}

object CountdownFormatConfig {
  @scala.inline
  def apply(): CountdownFormatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountdownFormatConfig]
  }
  @scala.inline
  implicit class CountdownFormatConfigOps[Self <: CountdownFormatConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

