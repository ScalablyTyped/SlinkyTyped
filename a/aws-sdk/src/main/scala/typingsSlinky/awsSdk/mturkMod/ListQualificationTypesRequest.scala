package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationTypesRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    *  Specifies that only Qualification types that the Requester created are returned. If false, the operation returns all Qualification types. 
    */
  var MustBeOwnedByCaller: js.UndefOr[Boolean] = js.native
  /**
    * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types, including those managed by the system, are considered. Valid values are True | False. 
    */
  var MustBeRequestable: Boolean = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A text query against all of the searchable attributes of Qualification types. 
    */
  var Query: js.UndefOr[String] = js.native
}

object ListQualificationTypesRequest {
  @scala.inline
  def apply(MustBeRequestable: Boolean): ListQualificationTypesRequest = {
    val __obj = js.Dynamic.literal(MustBeRequestable = MustBeRequestable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationTypesRequest]
  }
  @scala.inline
  implicit class ListQualificationTypesRequestOps[Self <: ListQualificationTypesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMustBeRequestable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MustBeRequestable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: ResultSize): Self = {
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
    def withMustBeOwnedByCaller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MustBeOwnedByCaller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustBeOwnedByCaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MustBeOwnedByCaller")(js.undefined)
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
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.undefined)
        ret
    }
  }
  
}

