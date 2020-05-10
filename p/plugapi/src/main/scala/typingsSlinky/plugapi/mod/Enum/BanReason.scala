package typingsSlinky.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanReason extends js.Object {
  var INAPPROPRIATE_GENRE: Double = js.native
  var NEGATIVE_ATTITUDE: Double = js.native
  var OFFENSIVE_MEDIA: Double = js.native
  var SPAMMING_TROLLING: Double = js.native
  var VERBAL_ABUSE: Double = js.native
}

object BanReason {
  @scala.inline
  def apply(
    INAPPROPRIATE_GENRE: Double,
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_MEDIA: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double
  ): BanReason = {
    val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE.asInstanceOf[js.Any], NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_MEDIA = OFFENSIVE_MEDIA.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanReason]
  }
  @scala.inline
  implicit class BanReasonOps[Self <: BanReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withINAPPROPRIATE_GENRE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INAPPROPRIATE_GENRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEGATIVE_ATTITUDE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEGATIVE_ATTITUDE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFFENSIVE_MEDIA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFENSIVE_MEDIA")(value.asInstanceOf[js.Any])
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
  }
  
}

