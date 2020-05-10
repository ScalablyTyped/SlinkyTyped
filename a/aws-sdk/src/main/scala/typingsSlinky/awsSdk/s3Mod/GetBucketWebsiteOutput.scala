package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketWebsiteOutput extends js.Object {
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ErrorDocument] = js.native
  /**
    * The name of the index document for the website.
    */
  var IndexDocument: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IndexDocument] = js.native
  /**
    * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
    */
  var RedirectAllRequestsTo: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RedirectAllRequestsTo] = js.native
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RoutingRules] = js.native
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply(): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
  @scala.inline
  implicit class GetBucketWebsiteOutputOps[Self <: GetBucketWebsiteOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDocument(value: ErrorDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexDocument(value: IndexDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectAllRequestsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectAllRequestsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectAllRequestsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingRules(value: RoutingRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingRules")(js.undefined)
        ret
    }
  }
  
}

