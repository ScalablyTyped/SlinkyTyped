package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match results object.
  */
@js.native
trait SchemaTurnBasedMatchResults extends js.Object {
  /**
    * The final match data.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchResults.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.native
}

object SchemaTurnBasedMatchResults {
  @scala.inline
  def apply(): SchemaTurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchResults]
  }
  @scala.inline
  implicit class SchemaTurnBasedMatchResultsOps[Self <: SchemaTurnBasedMatchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: SchemaTurnBasedMatchDataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    @scala.inline
    def withMatchVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaParticipantResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

