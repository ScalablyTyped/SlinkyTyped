package typingsSlinky.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteReason extends js.Object {
  var NEGATIVE_ATTITUDE: Double = js.native
  var OFFENSIVE_LANGUAGE: Double = js.native
  var SPAMMING_TROLLING: Double = js.native
  var VERBAL_ABUSE: Double = js.native
  var VIOLATING_COMMUNITY_RULES: Double = js.native
}

object MuteReason {
  @scala.inline
  def apply(
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_LANGUAGE: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double,
    VIOLATING_COMMUNITY_RULES: Double
  ): MuteReason = {
    val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any], VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteReason]
  }
  @scala.inline
  implicit class MuteReasonOps[Self <: MuteReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNEGATIVE_ATTITUDE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEGATIVE_ATTITUDE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFFENSIVE_LANGUAGE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFENSIVE_LANGUAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPAMMING_TROLLING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPAMMING_TROLLING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERBAL_ABUSE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERBAL_ABUSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVIOLATING_COMMUNITY_RULES(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VIOLATING_COMMUNITY_RULES")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

