package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceSpecification extends js.Object {
  /**
    * The Amazon ECR registry path of the Docker image that contains the inference code.
    */
  var Containers: ModelPackageContainerDefinitionList = js.native
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: ContentTypes = js.native
  /**
    * A list of the instance types that are used to generate inferences in real-time.
    */
  var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes = js.native
  /**
    * The supported MIME types for the output data.
    */
  var SupportedResponseMIMETypes: ResponseMIMETypes = js.native
  /**
    * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
    */
  var SupportedTransformInstanceTypes: TransformInstanceTypes = js.native
}

object InferenceSpecification {
  @scala.inline
  def apply(
    Containers: ModelPackageContainerDefinitionList,
    SupportedContentTypes: ContentTypes,
    SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes,
    SupportedResponseMIMETypes: ResponseMIMETypes,
    SupportedTransformInstanceTypes: TransformInstanceTypes
  ): InferenceSpecification = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedRealtimeInferenceInstanceTypes = SupportedRealtimeInferenceInstanceTypes.asInstanceOf[js.Any], SupportedResponseMIMETypes = SupportedResponseMIMETypes.asInstanceOf[js.Any], SupportedTransformInstanceTypes = SupportedTransformInstanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceSpecification]
  }
  @scala.inline
  implicit class InferenceSpecificationOps[Self <: InferenceSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: ModelPackageContainerDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedContentTypes(value: ContentTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedRealtimeInferenceInstanceTypes(value: RealtimeInferenceInstanceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedRealtimeInferenceInstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedResponseMIMETypes(value: ResponseMIMETypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedResponseMIMETypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedTransformInstanceTypes(value: TransformInstanceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedTransformInstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

