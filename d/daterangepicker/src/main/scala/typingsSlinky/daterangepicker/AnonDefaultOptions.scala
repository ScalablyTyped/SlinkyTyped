package typingsSlinky.daterangepicker

import typingsSlinky.daterangepicker.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultOptions extends js.Object {
  var defaultOptions: js.UndefOr[Options] = js.native
}

object AnonDefaultOptions {
  @scala.inline
  def apply(): AnonDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultOptions]
  }
  @scala.inline
  implicit class AnonDefaultOptionsOps[Self <: AnonDefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
  }
  
}

