package typingsSlinky.libraCore.validatorSetPbMod.ValidatorSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var validatorPublicKeysList: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    validatorPublicKeysList: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(validatorPublicKeysList = validatorPublicKeysList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidatorPublicKeysList(value: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorPublicKeysList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

