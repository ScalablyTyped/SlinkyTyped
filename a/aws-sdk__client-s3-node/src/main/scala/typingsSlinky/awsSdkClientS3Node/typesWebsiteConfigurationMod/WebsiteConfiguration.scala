package typingsSlinky.awsSdkClientS3Node.typesWebsiteConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument
import typingsSlinky.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument
import typingsSlinky.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Node.typesRoutingRuleMod.RoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteConfiguration extends js.Object {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[
    typingsSlinky.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
  ] = js.undefined
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[RoutingRule] | js.Iterable[RoutingRule]] = js.undefined
}

object WebsiteConfiguration {
  @scala.inline
  def apply(
    ErrorDocument: ErrorDocument = null,
    IndexDocument: IndexDocument = null,
    RedirectAllRequestsTo: RedirectAllRequestsTo = null,
    RoutingRules: js.Array[RoutingRule] | js.Iterable[RoutingRule] = null
  ): WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument.asInstanceOf[js.Any])
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument.asInstanceOf[js.Any])
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo.asInstanceOf[js.Any])
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteConfiguration]
  }
}

