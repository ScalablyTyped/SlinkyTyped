package typingsSlinky.googleProtobuf.descriptorPbMod.MethodOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.native
  var uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUninterpretedOptionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOptionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyLevel(value: IdempotencyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyLevel")(js.undefined)
        ret
    }
  }
  
}

