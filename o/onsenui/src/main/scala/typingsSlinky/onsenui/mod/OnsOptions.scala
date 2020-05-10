package typingsSlinky.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsOptions extends js.Object {
  var parentScope: js.UndefOr[js.Object] = js.native
}

object OnsOptions {
  @scala.inline
  def apply(): OnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnsOptions]
  }
  @scala.inline
  implicit class OnsOptionsOps[Self <: OnsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentScope(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentScope")(js.undefined)
        ret
    }
  }
  
}

