package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListModelsInput extends js.Object {
  /**
    * A filter that returns only models with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only models created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of models to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the training job name. This filter returns only models in the training job whose name contains the specified string.
    */
  var NameContains: js.UndefOr[ModelNameContains] = js.native
  /**
    * If the response to a previous ListModels request was truncated, the response includes a NextToken. To retrieve the next set of models, use the token in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ModelSortKey] = js.native
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.native
}

object ListModelsInput {
  @scala.inline
  def apply(): ListModelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsInput]
  }
  @scala.inline
  implicit class ListModelsInputOps[Self <: ListModelsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(js.undefined)
        ret
    }
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
    def withNameContains(value: ModelNameContains): Self = {
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
    def withNextToken(value: PaginationToken): Self = {
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
    def withSortBy(value: ModelSortKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: OrderKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
  }
  
}

