package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of score submission requests
  */
@js.native
trait SchemaPlayerScoreSubmissionList extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreSubmissionList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The score submissions.
    */
  var scores: js.UndefOr[js.Array[SchemaScoreSubmission]] = js.native
}

object SchemaPlayerScoreSubmissionList {
  @scala.inline
  def apply(): SchemaPlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreSubmissionList]
  }
  @scala.inline
  implicit class SchemaPlayerScoreSubmissionListOps[Self <: SchemaPlayerScoreSubmissionList] (val x: Self) extends AnyVal {
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
    def withScores(value: js.Array[SchemaScoreSubmission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(js.undefined)
        ret
    }
  }
  
}

