package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    *  An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.   For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    *  A timestamp that indicates the last time a repository's secret token was modified. 
    */
  var lastModifiedSecret: js.UndefOr[js.Date] = js.native
  /**
    *  The AWS CodeBuild endpoint where webhook events are sent.
    */
  var payloadUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The secret token of the associated repository.    A Bitbucket webhook does not support secret.  
    */
  var secret: js.UndefOr[NonEmptyString] = js.native
  /**
    * The URL to the webhook.
    */
  var url: js.UndefOr[NonEmptyString] = js.native
}

object Webhook {
  @scala.inline
  def apply(): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterGroups(value: FilterGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedSecret(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

