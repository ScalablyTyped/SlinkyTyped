package typingsSlinky.i18nJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToHumanSizeOptions extends ToNumberOptions {
  var format: js.UndefOr[String] = js.native
}

object ToHumanSizeOptions {
  @scala.inline
  def apply(): ToHumanSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToHumanSizeOptions]
  }
  @scala.inline
  implicit class ToHumanSizeOptionsOps[Self <: ToHumanSizeOptions] (val x: Self) extends AnyVal {
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

