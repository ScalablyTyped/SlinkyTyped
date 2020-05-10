package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
@js.native
trait CustomResourceConversion extends js.Object {
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
    * Webhook expects. The API server will use the first version in the list which it supports.
    * If none of the versions specified in this list are supported by API server, conversion will
    * fail for the custom resource. If a persisted Webhook configuration specifies allowed
    * versions and does not include any versions known to the API Server, calls to the webhook
    * will fail. Defaults to `["v1beta1"]`.
    */
  var conversionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are:
    * - `None`: The converter only change the apiVersion and would not touch any other field in
    * the custom resource. - `Webhook`: API Server will call to an external webhook to do the
    * conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and
    * spec.conversion.webhookClientConfig to be set.
    */
  var strategy: Input[String] = js.native
  /**
    * webhookClientConfig is the instructions for how to call the webhook if strategy is
    * `Webhook`. Required when `strategy` is set to `Webhook`.
    */
  var webhookClientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.native
}

object CustomResourceConversion {
  @scala.inline
  def apply(strategy: Input[String]): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  @scala.inline
  implicit class CustomResourceConversionOps[Self <: CustomResourceConversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrategy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversionReviewVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionReviewVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionReviewVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionReviewVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookClientConfig(value: Input[WebhookClientConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookClientConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookClientConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookClientConfig")(js.undefined)
        ret
    }
  }
  
}

