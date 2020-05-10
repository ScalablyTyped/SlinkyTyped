package typingsSlinky.officeUiFabricReact.keytipsDynamicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipsTestState extends js.Object {
  var currButton: String = js.native
}

object IKeytipsTestState {
  @scala.inline
  def apply(currButton: String): IKeytipsTestState = {
    val __obj = js.Dynamic.literal(currButton = currButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipsTestState]
  }
  @scala.inline
  implicit class IKeytipsTestStateOps[Self <: IKeytipsTestState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

