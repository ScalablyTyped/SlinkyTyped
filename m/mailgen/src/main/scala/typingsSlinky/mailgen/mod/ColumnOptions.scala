package typingsSlinky.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnOptions extends js.Object {
  var customAlignment: js.Any = js.native
  var customWidth: js.Any = js.native
}

object ColumnOptions {
  @scala.inline
  def apply(customAlignment: js.Any, customWidth: js.Any): ColumnOptions = {
    val __obj = js.Dynamic.literal(customAlignment = customAlignment.asInstanceOf[js.Any], customWidth = customWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOptions]
  }
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAlignment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

