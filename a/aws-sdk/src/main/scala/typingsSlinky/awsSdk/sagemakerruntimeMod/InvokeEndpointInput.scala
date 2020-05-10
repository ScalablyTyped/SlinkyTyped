package typingsSlinky.awsSdk.sagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeEndpointInput extends js.Object {
  /**
    * The desired MIME type of the inference in the response.
    */
  var Accept: js.UndefOr[Header] = js.native
  /**
    * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats—Inference.
    */
  var Body: BodyBlob = js.native
  /**
    * The MIME type of the input data in the request body.
    */
  var ContentType: js.UndefOr[Header] = js.native
  /**
    * Provides additional information about a request for an inference submitted to a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to provide an ID that you can use to track a request or to provide other metadata that a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.native
  /**
    * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerruntimeMod.EndpointName = js.native
  /**
    * Specifies the model to be requested for an inference when invoking a multi-model endpoint. 
    */
  var TargetModel: js.UndefOr[TargetModelHeader] = js.native
}

object InvokeEndpointInput {
  @scala.inline
  def apply(Body: BodyBlob, EndpointName: EndpointName): InvokeEndpointInput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointInput]
  }
  @scala.inline
  implicit class InvokeEndpointInputOps[Self <: InvokeEndpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: BodyBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccept(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: CustomAttributesHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetModel(value: TargetModelHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetModel")(js.undefined)
        ret
    }
  }
  
}

