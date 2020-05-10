package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateRandomRequest extends js.Object {
  /**
    * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * The length of the byte string.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.native
}

object GenerateRandomRequest {
  @scala.inline
  def apply(): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomRequest]
  }
  @scala.inline
  implicit class GenerateRandomRequestOps[Self <: GenerateRandomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomKeyStoreId(value: CustomKeyStoreIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBytes(value: NumberOfBytesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBytes")(js.undefined)
        ret
    }
  }
  
}

