package typingsSlinky.officeUiFabricReact.keytipsButtonExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipsButtonExampleState extends js.Object {
  var btnDisabled: Boolean = js.native
}

object IKeytipsButtonExampleState {
  @scala.inline
  def apply(btnDisabled: Boolean): IKeytipsButtonExampleState = {
    val __obj = js.Dynamic.literal(btnDisabled = btnDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipsButtonExampleState]
  }
  @scala.inline
  implicit class IKeytipsButtonExampleStateOps[Self <: IKeytipsButtonExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

