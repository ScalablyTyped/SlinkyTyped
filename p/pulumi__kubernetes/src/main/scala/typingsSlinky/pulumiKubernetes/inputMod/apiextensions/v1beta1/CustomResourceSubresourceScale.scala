package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
  */
@js.native
trait CustomResourceSubresourceScale extends js.Object {
  
  /**
    * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
    */
  var labelSelectorPath: js.UndefOr[Input[String]] = js.native
  
  /**
    * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
    */
  var specReplicasPath: Input[String] = js.native
  
  /**
    * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
    */
  var statusReplicasPath: Input[String] = js.native
}
object CustomResourceSubresourceScale {
  
  @scala.inline
  def apply(specReplicasPath: Input[String], statusReplicasPath: Input[String]): CustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal(specReplicasPath = specReplicasPath.asInstanceOf[js.Any], statusReplicasPath = statusReplicasPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresourceScale]
  }
  
  @scala.inline
  implicit class CustomResourceSubresourceScaleOps[Self <: CustomResourceSubresourceScale] (val x: Self) extends AnyVal {
    
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
    def setSpecReplicasPath(value: Input[String]): Self = this.set("specReplicasPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReplicasPath(value: Input[String]): Self = this.set("statusReplicasPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSelectorPath(value: Input[String]): Self = this.set("labelSelectorPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSelectorPath: Self = this.set("labelSelectorPath", js.undefined)
  }
}
