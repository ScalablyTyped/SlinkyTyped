package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Pull method.
  */
@js.native
trait SchemaPullRequest extends js.Object {
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning FAILED_PRECONDITION. The client may cancel the request if
    * it does not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The subscription from which a message should be pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaPullRequest {
  @scala.inline
  def apply(): SchemaPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequest]
  }
  @scala.inline
  implicit class SchemaPullRequestOps[Self <: SchemaPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

