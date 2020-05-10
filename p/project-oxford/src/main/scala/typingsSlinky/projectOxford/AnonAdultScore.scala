package typingsSlinky.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdultScore extends js.Object {
  var adultScore: Double = js.native
  var isAdultContent: Boolean = js.native
  var isRacyContent: Boolean = js.native
  var racyScore: Double = js.native
}

object AnonAdultScore {
  @scala.inline
  def apply(adultScore: Double, isAdultContent: Boolean, isRacyContent: Boolean, racyScore: Double): AnonAdultScore = {
    val __obj = js.Dynamic.literal(adultScore = adultScore.asInstanceOf[js.Any], isAdultContent = isAdultContent.asInstanceOf[js.Any], isRacyContent = isRacyContent.asInstanceOf[js.Any], racyScore = racyScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdultScore]
  }
  @scala.inline
  implicit class AnonAdultScoreOps[Self <: AnonAdultScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdultScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adultScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAdultContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdultContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRacyContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRacyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRacyScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("racyScore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

