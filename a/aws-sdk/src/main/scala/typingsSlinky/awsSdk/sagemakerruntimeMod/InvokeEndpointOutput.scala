package typingsSlinky.awsSdk.sagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeEndpointOutput extends js.Object {
  /**
    * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats—Inference.
    */
  var Body: BodyBlob = js.native
  /**
    * The MIME type of the inference returned in the response body.
    */
  var ContentType: js.UndefOr[Header] = js.native
  /**
    * Provides additional information in the response about the inference returned by a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to return an ID received in the CustomAttributes header of a request or other metadata that a service endpoint was programmed to produce. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). If the customer wants the custom attribute returned, the model must set the custom attribute to be included on the way back.  This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.native
  /**
    * Identifies the production variant that was invoked.
    */
  var InvokedProductionVariant: js.UndefOr[Header] = js.native
}

object InvokeEndpointOutput {
  @scala.inline
  def apply(Body: BodyBlob): InvokeEndpointOutput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointOutput]
  }
  @scala.inline
  implicit class InvokeEndpointOutputOps[Self <: InvokeEndpointOutput] (val x: Self) extends AnyVal {
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
    def withInvokedProductionVariant(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvokedProductionVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokedProductionVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvokedProductionVariant")(js.undefined)
        ret
    }
  }
  
}

