package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTextTranslationJobsResponse extends js.Object {
  /**
    * The token to use to retreive the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.translateMod.NextToken] = js.native
  /**
    * A list containing the properties of each job that is returned.
    */
  var TextTranslationJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.translateMod.TextTranslationJobPropertiesList] = js.native
}

object ListTextTranslationJobsResponse {
  @scala.inline
  def apply(): ListTextTranslationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsResponse]
  }
  @scala.inline
  implicit class ListTextTranslationJobsResponseOps[Self <: ListTextTranslationJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTextTranslationJobPropertiesList(value: TextTranslationJobPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTranslationJobPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTranslationJobPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTranslationJobPropertiesList")(js.undefined)
        ret
    }
  }
  
}

