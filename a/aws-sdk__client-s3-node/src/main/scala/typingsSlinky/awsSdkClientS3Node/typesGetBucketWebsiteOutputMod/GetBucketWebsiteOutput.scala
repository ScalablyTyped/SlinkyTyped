package typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsSlinky.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsSlinky.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketWebsiteOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.native
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.native
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
  @scala.inline
  implicit class GetBucketWebsiteOutputOps[Self <: GetBucketWebsiteOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDocument(value: UnmarshalledErrorDocument): Self = {
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
    def withIndexDocument(value: UnmarshalledIndexDocument): Self = {
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
    def withRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = {
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
    def withRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = {
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

