package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSearchSuggestionsRequest extends js.Object {
  /**
    * The name of the Amazon SageMaker resource to Search for.
    */
  var Resource: ResourceType = js.native
  /**
    * Limits the property names that are included in the response.
    */
  var SuggestionQuery: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SuggestionQuery] = js.native
}

object GetSearchSuggestionsRequest {
  @scala.inline
  def apply(Resource: ResourceType): GetSearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchSuggestionsRequest]
  }
  @scala.inline
  implicit class GetSearchSuggestionsRequestOps[Self <: GetSearchSuggestionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionQuery(value: SuggestionQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestionQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestionQuery")(js.undefined)
        ret
    }
  }
  
}

