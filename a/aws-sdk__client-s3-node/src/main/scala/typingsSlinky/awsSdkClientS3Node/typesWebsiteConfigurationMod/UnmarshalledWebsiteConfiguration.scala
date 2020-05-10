package typingsSlinky.awsSdkClientS3Node.typesWebsiteConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsSlinky.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsSlinky.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWebsiteConfiguration extends WebsiteConfiguration {
  /**
    * _ErrorDocument shape
    */
  @JSName("ErrorDocument")
  var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.native
  /**
    * _IndexDocument shape
    */
  @JSName("IndexDocument")
  var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.native
  /**
    * _RedirectAllRequestsTo shape
    */
  @JSName("RedirectAllRequestsTo")
  var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
  /**
    * _RoutingRules shape
    */
  @JSName("RoutingRules")
  var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
}

object UnmarshalledWebsiteConfiguration {
  @scala.inline
  def apply(): UnmarshalledWebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledWebsiteConfigurationOps[Self <: UnmarshalledWebsiteConfiguration] (val x: Self) extends AnyVal {
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

