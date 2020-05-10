package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelEndpointDataBlob extends js.Object {
  /**
    * The byte buffer of the Amazon SageMaker model endpoint input data blob.
    */
  var byteBuffer: js.UndefOr[blob] = js.native
  /**
    * The content type of the Amazon SageMaker model endpoint input data blob. 
    */
  var contentType: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.contentType] = js.native
}

object ModelEndpointDataBlob {
  @scala.inline
  def apply(): ModelEndpointDataBlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEndpointDataBlob]
  }
  @scala.inline
  implicit class ModelEndpointDataBlobOps[Self <: ModelEndpointDataBlob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteBufferUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteBuffer(value: blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: contentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
  }
  
}

