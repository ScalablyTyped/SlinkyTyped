package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAliasInput extends js.Object {
  /**
    * A unique identifier of the alias that you want to delete. You can use either the alias ID or ARN value.
    */
  var AliasId: typingsSlinky.awsSdk.gameliftMod.AliasId = js.native
}

object DeleteAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasInput]
  }
  @scala.inline
  implicit class DeleteAliasInputOps[Self <: DeleteAliasInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasId(value: AliasId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

