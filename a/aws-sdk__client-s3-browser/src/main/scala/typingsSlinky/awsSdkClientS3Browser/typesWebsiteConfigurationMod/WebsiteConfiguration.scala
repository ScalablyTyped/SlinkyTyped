package typingsSlinky.awsSdkClientS3Browser.typesWebsiteConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument
import typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument
import typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Browser.typesRoutingRuleMod.RoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteConfiguration extends js.Object {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument] = js.native
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument] = js.native
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
  ] = js.native
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[RoutingRule] | js.Iterable[RoutingRule]] = js.native
}

object WebsiteConfiguration {
  @scala.inline
  def apply(): WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteConfiguration]
  }
  @scala.inline
  implicit class WebsiteConfigurationOps[Self <: WebsiteConfiguration] (val x: Self) extends AnyVal {
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
    def withRoutingRulesIterable(value: js.Iterable[RoutingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingRules(value: js.Array[RoutingRule] | js.Iterable[RoutingRule]): Self = {
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

