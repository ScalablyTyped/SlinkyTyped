package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisconnectCustomKeyStoreRequest extends js.Object {
  /**
    * Enter the ID of the custom key store you want to disconnect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType = js.native
}

object DisconnectCustomKeyStoreRequest {
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType): DisconnectCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectCustomKeyStoreRequest]
  }
  @scala.inline
  implicit class DisconnectCustomKeyStoreRequestOps[Self <: DisconnectCustomKeyStoreRequest] (val x: Self) extends AnyVal {
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
  }
  
}

