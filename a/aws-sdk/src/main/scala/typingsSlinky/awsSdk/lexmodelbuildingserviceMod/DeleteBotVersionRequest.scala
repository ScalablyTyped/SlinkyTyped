package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotVersionRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var name: BotName = js.native
  /**
    * The version of the bot to delete. You cannot delete the $LATEST version of the bot. To delete the $LATEST version, use the DeleteBot operation.
    */
  var version: NumericalVersion = js.native
}

object DeleteBotVersionRequest {
  @scala.inline
  def apply(name: BotName, version: NumericalVersion): DeleteBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotVersionRequest]
  }
  @scala.inline
  implicit class DeleteBotVersionRequestOps[Self <: DeleteBotVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: NumericalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

