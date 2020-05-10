package typingsSlinky.pulumiKubernetes.inputMod.authentication.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReviewStatus is the result of the token authentication request.
  */
@js.native
trait TokenReviewStatus extends js.Object {
  /**
    * Audiences are audience identifiers chosen by the authenticator that are compatible with
    * both the TokenReview and token. An identifier is any identifier in the intersection of the
    * TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that
    * sets the spec.audiences field should validate that a compatible audience identifier is
    * returned in the status.audiences field to ensure that the TokenReview server is audience
    * aware. If a TokenReview returns an empty status.audience field where status.authenticated
    * is "true", the token is valid against the audience of the Kubernetes API server.
    */
  var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Authenticated indicates that the token was associated with a known user.
    */
  var authenticated: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Error indicates that the token couldn't be checked
    */
  var error: js.UndefOr[Input[String]] = js.native
  /**
    * User is the UserInfo associated with the provided token.
    */
  var user: js.UndefOr[Input[UserInfo]] = js.native
}

object TokenReviewStatus {
  @scala.inline
  def apply(): TokenReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenReviewStatus]
  }
  @scala.inline
  implicit class TokenReviewStatusOps[Self <: TokenReviewStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudiences(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudiences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticated(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: Input[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

