package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotRequest extends js.Object {
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName = js.native
  /**
    * The version or alias of the bot.
    */
  var versionOrAlias: String = js.native
}

object GetBotRequest {
  @scala.inline
  def apply(name: BotName, versionOrAlias: String): GetBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versionOrAlias = versionOrAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotRequest]
  }
  @scala.inline
  implicit class GetBotRequestOps[Self <: GetBotRequest] (val x: Self) extends AnyVal {
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
    def withVersionOrAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionOrAlias")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

