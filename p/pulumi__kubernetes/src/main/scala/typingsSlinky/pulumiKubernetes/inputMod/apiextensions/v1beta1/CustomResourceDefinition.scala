package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.22. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
  */
@js.native
trait CustomResourceDefinition extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[apiextensionsDotk8sDotioSlashv1beta1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition]
  ] = js.native
  
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * spec describes how the user wants the resources to appear
    */
  var spec: Input[CustomResourceDefinitionSpec] = js.native
  
  /**
    * status indicates the actual state of the CustomResourceDefinition
    */
  var status: js.UndefOr[Input[CustomResourceDefinitionStatus]] = js.native
}
object CustomResourceDefinition {
  
  @scala.inline
  def apply(spec: Input[CustomResourceDefinitionSpec]): CustomResourceDefinition = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinition]
  }
  
  @scala.inline
  implicit class CustomResourceDefinitionOps[Self <: CustomResourceDefinition] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: Input[CustomResourceDefinitionSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: Input[apiextensionsDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[CustomResourceDefinitionStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
