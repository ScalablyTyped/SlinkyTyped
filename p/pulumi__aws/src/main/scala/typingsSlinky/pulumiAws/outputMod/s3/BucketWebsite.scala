package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketWebsite extends js.Object {
  /**
    * An absolute path to the document to return in case of a 4XX error.
    */
  var errorDocument: js.UndefOr[String] = js.native
  /**
    * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
    */
  var indexDocument: js.UndefOr[String] = js.native
  /**
    * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var redirectAllRequestsTo: js.UndefOr[String] = js.native
  /**
    * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
    * describing redirect behavior and when redirects are applied.
    */
  var routingRules: js.UndefOr[String] = js.native
}

object BucketWebsite {
  @scala.inline
  def apply(): BucketWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketWebsite]
  }
  @scala.inline
  implicit class BucketWebsiteOps[Self <: BucketWebsite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectAllRequestsTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectAllRequestsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectAllRequestsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectAllRequestsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingRules")(js.undefined)
        ret
    }
  }
  
}

