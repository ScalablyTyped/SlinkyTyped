package typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationMod

import typingsSlinky.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhook
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatingWebhookConfigurationArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[
    Input[
      typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
    ]
  ] = js.native
  
  /**
    * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  val webhooks: js.UndefOr[Input[js.Array[Input[ValidatingWebhook]]]] = js.native
}
object ValidatingWebhookConfigurationArgs {
  
  @scala.inline
  def apply(): ValidatingWebhookConfigurationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatingWebhookConfigurationArgs]
  }
  
  @scala.inline
  implicit class ValidatingWebhookConfigurationArgsOps[Self <: ValidatingWebhookConfigurationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(
      value: Input[
          typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
        ]
    ): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setWebhooksVarargs(value: Input[ValidatingWebhook]*): Self = this.set("webhooks", js.Array(value :_*))
    
    @scala.inline
    def setWebhooks(value: Input[js.Array[Input[ValidatingWebhook]]]): Self = this.set("webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhooks: Self = this.set("webhooks", js.undefined)
  }
}
