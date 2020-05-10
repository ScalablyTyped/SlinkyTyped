package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomKeyStoresRequest extends js.Object {
  /**
    * Gets only information about the specified custom key store. Enter the key store ID. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * Gets only information about the specified custom key store. Enter the friendly name of the custom key store. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.native
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
}

object DescribeCustomKeyStoresRequest {
  @scala.inline
  def apply(): DescribeCustomKeyStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresRequest]
  }
  @scala.inline
  implicit class DescribeCustomKeyStoresRequestOps[Self <: DescribeCustomKeyStoresRequest] (val x: Self) extends AnyVal {
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
    def withCustomKeyStoreName(value: CustomKeyStoreNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: LimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

