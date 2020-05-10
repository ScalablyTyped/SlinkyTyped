package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a result for a match participant.
  */
@js.native
trait SchemaParticipantResult extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#participantResult.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the participant.
    */
  var participantId: js.UndefOr[String] = js.native
  /**
    * The placement or ranking of the participant in the match results; a
    * number from one to the number of participants in the match. Multiple
    * participants may have the same placing value in case of a type.
    */
  var placing: js.UndefOr[Double] = js.native
  /**
    * The result of the participant for this match. Possible values are:   -
    * &quot;MATCH_RESULT_WIN&quot; - The participant won the match.  -
    * &quot;MATCH_RESULT_LOSS&quot; - The participant lost the match.  -
    * &quot;MATCH_RESULT_TIE&quot; - The participant tied the match.  -
    * &quot;MATCH_RESULT_NONE&quot; - There was no winner for the match (nobody
    * wins or loses this kind of game.)  - &quot;MATCH_RESULT_DISCONNECT&quot;
    * - The participant disconnected / left during the match.  -
    * &quot;MATCH_RESULT_DISAGREED&quot; - Different clients reported different
    * results for this participant.
    */
  var result: js.UndefOr[String] = js.native
}

object SchemaParticipantResult {
  @scala.inline
  def apply(): SchemaParticipantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParticipantResult]
  }
  @scala.inline
  implicit class SchemaParticipantResultOps[Self <: SchemaParticipantResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placing")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

