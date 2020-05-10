package typingsSlinky.officeUiFabricReact.textFieldControlledExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldControlledExampleState extends js.Object {
  var value1: String = js.native
  var value2: String = js.native
}

object ITextFieldControlledExampleState {
  @scala.inline
  def apply(value1: String, value2: String): ITextFieldControlledExampleState = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2 = value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldControlledExampleState]
  }
  @scala.inline
  implicit class ITextFieldControlledExampleStateOps[Self <: ITextFieldControlledExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

