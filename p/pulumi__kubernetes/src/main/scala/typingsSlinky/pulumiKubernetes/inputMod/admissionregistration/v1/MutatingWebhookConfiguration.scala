package typingsSlinky.pulumiKubernetes.inputMod.admissionregistration.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
  */
@js.native
trait MutatingWebhookConfiguration extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration
    ]
  ] = js.native
  
  /**
    * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  var webhooks: js.UndefOr[Input[js.Array[Input[MutatingWebhook]]]] = js.native
}
object MutatingWebhookConfiguration {
  
  @scala.inline
  def apply(): MutatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutatingWebhookConfiguration]
  }
  
  @scala.inline
  implicit class MutatingWebhookConfigurationOps[Self <: MutatingWebhookConfiguration] (val x: Self) extends AnyVal {
    
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
          typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration
        ]
    ): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setWebhooksVarargs(value: Input[MutatingWebhook]*): Self = this.set("webhooks", js.Array(value :_*))
    
    @scala.inline
    def setWebhooks(value: Input[js.Array[Input[MutatingWebhook]]]): Self = this.set("webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhooks: Self = this.set("webhooks", js.undefined)
  }
}
