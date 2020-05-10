package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployDescription extends js.Object {
  val inputs: js.Array[ParamType] = js.native
  val payable: Boolean = js.native
  def encode(bytecode: String, params: js.Array[_]): String = js.native
}

object DeployDescription {
  @scala.inline
  def apply(encode: (String, js.Array[_]) => String, inputs: js.Array[ParamType], payable: Boolean): DeployDescription = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode), inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployDescription]
  }
  @scala.inline
  implicit class DeployDescriptionOps[Self <: DeployDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: (String, js.Array[_]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[ParamType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

