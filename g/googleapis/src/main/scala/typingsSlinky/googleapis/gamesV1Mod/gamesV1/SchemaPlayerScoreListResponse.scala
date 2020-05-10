package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of score submission statuses.
  */
@js.native
trait SchemaPlayerScoreListResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The score submissions statuses.
    */
  var submittedScores: js.UndefOr[js.Array[SchemaPlayerScoreResponse]] = js.native
}

object SchemaPlayerScoreListResponse {
  @scala.inline
  def apply(): SchemaPlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreListResponse]
  }
  @scala.inline
  implicit class SchemaPlayerScoreListResponseOps[Self <: SchemaPlayerScoreListResponse] (val x: Self) extends AnyVal {
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
    def withSubmittedScores(value: js.Array[SchemaPlayerScoreResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedScores")(js.undefined)
        ret
    }
  }
  
}

