package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocation extends js.Object {
  var Location: AnonDisplayPosition = js.native
  var MatchLevel: String = js.native
  var MatchQuality: AnonHouseNumber = js.native
  var MatchType: String = js.native
  var Relevance: Double = js.native
}

object AnonLocation {
  @scala.inline
  def apply(
    Location: AnonDisplayPosition,
    MatchLevel: String,
    MatchQuality: AnonHouseNumber,
    MatchType: String,
    Relevance: Double
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], MatchLevel = MatchLevel.asInstanceOf[js.Any], MatchQuality = MatchQuality.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], Relevance = Relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
  @scala.inline
  implicit class AnonLocationOps[Self <: AnonLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: AnonDisplayPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchQuality(value: AnonHouseNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relevance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

