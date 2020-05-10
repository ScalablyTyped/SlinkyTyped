package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabulariesRequest extends js.Object {
  /**
    * The maximum number of vocabularies to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MaxResults] = js.native
  /**
    * When specified, the vocabularies returned in the list are limited to vocabularies whose name contains the specified string. The search is case-insensitive, ListVocabularies will return both "vocabularyname" and "VocabularyName" in the response list.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  /**
    * If the result of the previous request to ListVocabularies was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * When specified, only returns vocabularies with the VocabularyState field equal to the specified state.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}

object ListVocabulariesRequest {
  @scala.inline
  def apply(): ListVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesRequest]
  }
  @scala.inline
  implicit class ListVocabulariesRequestOps[Self <: ListVocabulariesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNameContains(value: VocabularyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameContains")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStateEquals(value: VocabularyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateEquals")(js.undefined)
        ret
    }
  }
  
}

