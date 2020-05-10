package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfExistsOption extends js.Object {
  var ifExists: js.UndefOr[Boolean] = js.native
}

object IfExistsOption {
  @scala.inline
  def apply(): IfExistsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfExistsOption]
  }
  @scala.inline
  implicit class IfExistsOptionOps[Self <: IfExistsOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(js.undefined)
        ret
    }
  }
  
}

