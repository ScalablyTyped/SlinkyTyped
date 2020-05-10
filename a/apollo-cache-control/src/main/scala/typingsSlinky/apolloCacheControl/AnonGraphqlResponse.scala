package typingsSlinky.apolloCacheControl

import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGraphqlResponse extends js.Object {
  var graphqlResponse: GraphQLResponse = js.native
}

object AnonGraphqlResponse {
  @scala.inline
  def apply(graphqlResponse: GraphQLResponse): AnonGraphqlResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraphqlResponse]
  }
  @scala.inline
  implicit class AnonGraphqlResponseOps[Self <: AnonGraphqlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphqlResponse(value: GraphQLResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphqlResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

