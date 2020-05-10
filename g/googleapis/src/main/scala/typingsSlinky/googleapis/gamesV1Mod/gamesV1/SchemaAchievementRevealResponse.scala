package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement reveal response
  */
@js.native
trait SchemaAchievementRevealResponse extends js.Object {
  /**
    * The current state of the achievement for which a reveal was attempted.
    * This might be UNLOCKED if the achievement was already unlocked. Possible
    * values are:   - &quot;REVEALED&quot; - Achievement is revealed.  -
    * &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementRevealResponse.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAchievementRevealResponse {
  @scala.inline
  def apply(): SchemaAchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementRevealResponse]
  }
  @scala.inline
  implicit class SchemaAchievementRevealResponseOps[Self <: SchemaAchievementRevealResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

