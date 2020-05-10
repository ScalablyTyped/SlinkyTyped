package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}

object CreateGraphqlApiResponse {
  @scala.inline
  def apply(): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
  @scala.inline
  implicit class CreateGraphqlApiResponseOps[Self <: CreateGraphqlApiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphqlApi(value: GraphqlApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphqlApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlApi")(js.undefined)
        ret
    }
  }
  
}

