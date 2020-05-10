package typingsSlinky.pulumiKubernetes.inputMod.admissionregistration.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
  * accept or reject and object without changing it. Deprecated in v1.16, planned for removal in
  * v1.19. Use admissionregistration.k8s.io/v1 ValidatingWebhookConfiguration instead.
  */
@js.native
trait ValidatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
    ]
  ] = js.native
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  var webhooks: js.UndefOr[Input[js.Array[Input[ValidatingWebhook]]]] = js.native
}

object ValidatingWebhookConfiguration {
  @scala.inline
  def apply(): ValidatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatingWebhookConfiguration]
  }
  @scala.inline
  implicit class ValidatingWebhookConfigurationOps[Self <: ValidatingWebhookConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1beta1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(
      value: Input[
          typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Input[ObjectMeta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhooks(value: Input[js.Array[Input[ValidatingWebhook]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(js.undefined)
        ret
    }
  }
  
}

