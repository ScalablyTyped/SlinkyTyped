package typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TournamentRegistrationParameters extends js.Object {
  var name: String = js.native
  var providerId: Double = js.native
}

object TournamentRegistrationParameters {
  @scala.inline
  def apply(name: String, providerId: Double): TournamentRegistrationParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentRegistrationParameters]
  }
  @scala.inline
  implicit class TournamentRegistrationParametersOps[Self <: TournamentRegistrationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

