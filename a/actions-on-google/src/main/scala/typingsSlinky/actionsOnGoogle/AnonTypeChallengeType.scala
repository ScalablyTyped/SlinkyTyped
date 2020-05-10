package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.apiV1Mod.challengeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeChallengeType extends js.Object {
  var `type`: challengeType = js.native
}

object AnonTypeChallengeType {
  @scala.inline
  def apply(`type`: challengeType): AnonTypeChallengeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeChallengeType]
  }
  @scala.inline
  implicit class AnonTypeChallengeTypeOps[Self <: AnonTypeChallengeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: challengeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

