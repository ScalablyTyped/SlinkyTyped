package typingsSlinky.mangopay2NodejsSdk.mod.bankAccount

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USDetails extends CreationDetails {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String = js.native
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String = js.native
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  var Type: US = js.native
}

object USDetails {
  @scala.inline
  def apply(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, Type: US): USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[USDetails]
  }
  @scala.inline
  implicit class USDetailsOps[Self <: USDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ABA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: US): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepositAccountType(value: DepositAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DepositAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepositAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DepositAccountType")(js.undefined)
        ret
    }
  }
  
}

