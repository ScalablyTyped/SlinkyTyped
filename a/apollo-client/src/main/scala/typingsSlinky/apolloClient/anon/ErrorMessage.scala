package typingsSlinky.apolloClient.anon

import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var extraInfo: js.UndefOr[js.Any] = js.native
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var networkError: js.UndefOr[js.Error | Null] = js.native
}

object ErrorMessage {
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  @scala.inline
  implicit class ErrorMessageOps[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphQLErrors(value: js.Array[GraphQLError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphQLErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(null)
        ret
    }
  }
  
}

