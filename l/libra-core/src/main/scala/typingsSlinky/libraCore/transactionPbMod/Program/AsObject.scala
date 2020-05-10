package typingsSlinky.libraCore.transactionPbMod.Program

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var argumentsList: js.Array[typingsSlinky.libraCore.transactionPbMod.TransactionArgument.AsObject] = js.native
  var code: js.typedarray.Uint8Array | String = js.native
  var modulesList: js.Array[js.typedarray.Uint8Array | String] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    argumentsList: js.Array[typingsSlinky.libraCore.transactionPbMod.TransactionArgument.AsObject],
    code: js.typedarray.Uint8Array | String,
    modulesList: js.Array[js.typedarray.Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentsList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.TransactionArgument.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulesList(value: js.Array[js.typedarray.Uint8Array | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

