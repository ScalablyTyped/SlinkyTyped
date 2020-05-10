package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCustomKeyStoreRequest extends js.Object {
  /**
    * Associates the custom key store with a related AWS CloudHSM cluster.  Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster must fulfill the requirements for a cluster associated with a custom key store. To view the cluster certificate of a cluster, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.native
  /**
    * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType = js.native
  /**
    * Enter the current password of the kmsuser crypto user (CU) in the AWS CloudHSM cluster that is associated with the custom key store. This parameter tells AWS KMS the current password of the kmsuser crypto user (CU). It does not set or change the password of any users in the AWS CloudHSM cluster.
    */
  var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.native
  /**
    * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must be unique in the AWS account.
    */
  var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.native
}

object UpdateCustomKeyStoreRequest {
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType): UpdateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
  }
  @scala.inline
  implicit class UpdateCustomKeyStoreRequestOps[Self <: UpdateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
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
    def withCloudHsmClusterId(value: CloudHsmClusterIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudHsmClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudHsmClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudHsmClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyStorePassword(value: KeyStorePasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyStorePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyStorePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyStorePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withNewCustomKeyStoreName(value: CustomKeyStoreNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewCustomKeyStoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewCustomKeyStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewCustomKeyStoreName")(js.undefined)
        ret
    }
  }
  
}

