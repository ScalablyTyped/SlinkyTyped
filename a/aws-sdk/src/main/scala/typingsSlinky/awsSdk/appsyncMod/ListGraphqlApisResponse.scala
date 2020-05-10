package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphqlApisResponse extends js.Object {
  /**
    * The GraphqlApi objects.
    */
  var graphqlApis: js.UndefOr[GraphqlApis] = js.native
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphqlApisResponse {
  @scala.inline
  def apply(): ListGraphqlApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisResponse]
  }
  @scala.inline
  implicit class ListGraphqlApisResponseOps[Self <: ListGraphqlApisResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphqlApis(value: GraphqlApis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlApis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphqlApis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlApis")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

