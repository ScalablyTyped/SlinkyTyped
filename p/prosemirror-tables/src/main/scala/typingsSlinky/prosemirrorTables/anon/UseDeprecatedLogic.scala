package typingsSlinky.prosemirrorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseDeprecatedLogic extends js.Object {
  var useDeprecatedLogic: js.UndefOr[Boolean] = js.native
}

object UseDeprecatedLogic {
  @scala.inline
  def apply(): UseDeprecatedLogic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDeprecatedLogic]
  }
  @scala.inline
  implicit class UseDeprecatedLogicOps[Self <: UseDeprecatedLogic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseDeprecatedLogic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedLogic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDeprecatedLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedLogic")(js.undefined)
        ret
    }
  }
  
}

