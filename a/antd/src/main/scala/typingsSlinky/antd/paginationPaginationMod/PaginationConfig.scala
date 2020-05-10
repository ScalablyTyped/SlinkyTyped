package typingsSlinky.antd.paginationPaginationMod

import typingsSlinky.antd.antdStrings.both
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationConfig extends PaginationProps {
  var position: js.UndefOr[top | bottom | both] = js.native
}

object PaginationConfig {
  @scala.inline
  def apply(): PaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationConfig]
  }
  @scala.inline
  implicit class PaginationConfigOps[Self <: PaginationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: top | bottom | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

