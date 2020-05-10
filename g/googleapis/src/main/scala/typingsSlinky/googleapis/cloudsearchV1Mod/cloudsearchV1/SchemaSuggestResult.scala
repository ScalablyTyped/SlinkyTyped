package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One suggestion result.
  */
@js.native
trait SchemaSuggestResult extends js.Object {
  var peopleSuggestion: js.UndefOr[SchemaPeopleSuggestion] = js.native
  var querySuggestion: js.UndefOr[SchemaQuerySuggestion] = js.native
  /**
    * The source of the suggestion.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * The suggested query that will be used for search, when the user clicks on
    * the suggestion
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object SchemaSuggestResult {
  @scala.inline
  def apply(): SchemaSuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResult]
  }
  @scala.inline
  implicit class SchemaSuggestResultOps[Self <: SchemaSuggestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeopleSuggestion(value: SchemaPeopleSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeopleSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySuggestion(value: SchemaQuerySuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuerySuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuery")(js.undefined)
        ret
    }
  }
  
}

