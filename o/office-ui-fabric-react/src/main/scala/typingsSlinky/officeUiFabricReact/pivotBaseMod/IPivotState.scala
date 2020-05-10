package typingsSlinky.officeUiFabricReact.pivotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPivotState extends js.Object {
  var selectedKey: js.UndefOr[String] = js.native
}

object IPivotState {
  @scala.inline
  def apply(): IPivotState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotState]
  }
  @scala.inline
  implicit class IPivotStateOps[Self <: IPivotState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
  }
  
}

