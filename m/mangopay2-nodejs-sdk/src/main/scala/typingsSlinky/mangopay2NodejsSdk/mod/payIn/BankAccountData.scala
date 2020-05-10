package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import typingsSlinky.mangopay2NodejsSdk.mod.IBankAccountType
import typingsSlinky.mangopay2NodejsSdk.typesMod.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankAccountData extends js.Object {
  /**
    * The BIC of the bank account
    */
  var BIC: String = js.native
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: String = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  /**
    * The type of bank account
    */
  var Type: ValueOf[IBankAccountType] = js.native
}

object BankAccountData {
  @scala.inline
  def apply(
    BIC: String,
    IBAN: String,
    OwnerAddress: String,
    OwnerName: String,
    Type: ValueOf[IBankAccountType]
  ): BankAccountData = {
    val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountData]
  }
  @scala.inline
  implicit class BankAccountDataOps[Self <: BankAccountData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBIC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIBAN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IBAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAddress(value: String): Self = {
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
    def withType(value: ValueOf[IBankAccountType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

