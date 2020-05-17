package typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod

import typingsSlinky.instagramPrivateApi.anon.FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var documentId: String = js.native
  var surface: FriendlyName = js.native
  var variables: js.Any = js.native
}

object GraphQLRequestOptions {
  @scala.inline
  def apply(documentId: String, surface: FriendlyName, variables: js.Any): GraphQLRequestOptions = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestOptions]
  }
  @scala.inline
  implicit class GraphQLRequestOptionsOps[Self <: GraphQLRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurface(value: FriendlyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
  }
  
}

